package com.evotingplatform.datainput.services.impl;

import com.evotingplatform.datainput.dto.passport.PassportRequestDTO;
import com.evotingplatform.datainput.dto.passport.PassportResponseDTO;
import com.evotingplatform.datainput.entity.Passport;
import com.evotingplatform.datainput.repo.PassportRepository;
import com.evotingplatform.datainput.services.PassportService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@RequiredArgsConstructor
@Slf4j
public class PassportServiceImpl implements PassportService
{

    private final PassportRepository passportRepository;
    private final Random random = new Random();
    private final ModelMapper modelMapper;

    @Override
    public PassportResponseDTO savePassport(PassportRequestDTO passportResponseDTO) {
        log.info("Saving passport for {} {}", passportResponseDTO.getFirstName(), passportResponseDTO.getLastName());
        Passport passport = modelMapper.map(passportResponseDTO, Passport.class);
        passport.setPassportNumber(generateUniquePassportNumber());
        PassportResponseDTO saved = modelMapper.map(passportRepository.save(passport),PassportResponseDTO.class);
        log.info("Saved passport with number {}", saved.getPassportNumber());
        return saved;
    }

    @Override
    public Optional<PassportResponseDTO> findByPassportNumber(String passportNumber) {
        log.info("Finding passport with number {}", passportNumber);
        return Optional.ofNullable(modelMapper.map(passportRepository.findByPassportNumber(passportNumber), PassportResponseDTO.class));
    }

    private String generateUniquePassportNumber() {
        String passportNumber;
        do {
            long number = 100_000_000_00L + (long)(random.nextDouble() * 900_000_000_00L); // 11 digits
            passportNumber = "P" + number;
        } while (passportRepository.existsByPassportNumber(passportNumber));
        return passportNumber;
    }
}
