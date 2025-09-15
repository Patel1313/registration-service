package com.evotingplatform.datainput.services;

import com.evotingplatform.datainput.dto.aadhar.AadhaarRequestDto;
import com.evotingplatform.datainput.dto.aadhar.AadhaarResponseDto;

public interface AadhaarService {
    AadhaarResponseDto createAadhaar(AadhaarRequestDto dto);
    AadhaarResponseDto getAadhaarByNumber(String number);
}
