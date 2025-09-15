package com.evotingplatform.datainput.services;

import com.evotingplatform.datainput.dto.passport.PassportRequestDTO;
import com.evotingplatform.datainput.dto.passport.PassportResponseDTO;

import java.util.Optional;

public interface PassportService {
    PassportResponseDTO savePassport(PassportRequestDTO passport);
    Optional<PassportResponseDTO> findByPassportNumber(String passportNumber);
}
