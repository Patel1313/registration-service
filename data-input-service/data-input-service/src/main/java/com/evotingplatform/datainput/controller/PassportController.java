package com.evotingplatform.datainput.controller;

import com.evotingplatform.datainput.dto.passport.PassportRequestDTO;
import com.evotingplatform.datainput.dto.passport.PassportResponseDTO;
import com.evotingplatform.datainput.services.PassportService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/passports")
public class PassportController {

    private final PassportService passportService;

    @PostMapping
    public ResponseEntity<PassportResponseDTO> savePassport(@RequestBody PassportRequestDTO passport) {
        log.info("Request received to save passport for {} {}", passport.getFirstName(), passport.getLastName());
        PassportResponseDTO savedPassportResponseDTO = passportService.savePassport(passport);
        return ResponseEntity.ok(savedPassportResponseDTO);
    }

    @GetMapping("/{passportNumber}")
    public ResponseEntity<PassportResponseDTO> getPassportByNumber(@PathVariable String passportNumber) {
        log.info("Request received to find passport with number {}", passportNumber);
        Optional<PassportResponseDTO> passportOpt = passportService.findByPassportNumber(passportNumber);
        return passportOpt.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
