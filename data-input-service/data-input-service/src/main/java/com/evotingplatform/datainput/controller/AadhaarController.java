package com.evotingplatform.datainput.controller;

import com.evotingplatform.datainput.dto.aadhar.AadhaarRequestDto;
import com.evotingplatform.datainput.dto.aadhar.AadhaarResponseDto;
import com.evotingplatform.datainput.services.AadhaarService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/aadhaars")
@RequiredArgsConstructor
@Slf4j
public class AadhaarController {

    private final AadhaarService service;

    @PostMapping
    public ResponseEntity<AadhaarResponseDto> create(@Valid @RequestBody AadhaarRequestDto dto) {
        log.info("Received request to create Aadhaar: {}", dto.getName());
        return ResponseEntity.status(201).body(service.createAadhaar(dto));
    }

    @GetMapping("/{number}")
    public ResponseEntity<AadhaarResponseDto> getByNumber(@PathVariable String number) {
        log.info("Received request to fetch Aadhaar number: {}", number);
        return ResponseEntity.ok(service.getAadhaarByNumber(number));
    }
}
