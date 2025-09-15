package com.evotingplatform.datainput.services.impl;

import com.evotingplatform.datainput.dto.aadhar.AadhaarRequestDto;
import com.evotingplatform.datainput.dto.aadhar.AadhaarResponseDto;
import com.evotingplatform.datainput.entity.Aadhaar;
import com.evotingplatform.datainput.exception.ResourceFoundException;
import com.evotingplatform.datainput.exception.ResourceNotFoundException;
import com.evotingplatform.datainput.repo.AadhaarRepository;
import com.evotingplatform.datainput.services.AadhaarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
@Slf4j
public class AadhaarServiceImpl
        implements AadhaarService
{

    private final AadhaarRepository repository;
    private final ModelMapper modelMapper;
    private static final Random random = new Random();

    @Override
    public AadhaarResponseDto createAadhaar(AadhaarRequestDto dto)
    {
        log.info("Creating Aadhaar record for {}", dto.getName());
        Aadhaar entity = modelMapper.map(dto, Aadhaar.class);
        String aadharNumber = generate12DigitNumber();
        if(repository.existsByAadhaarNumber(aadharNumber))
            throw new ResourceFoundException("AADHAR NUMBER ALREADY THERE");
        entity.setAadhaarNumber(aadharNumber);
        Aadhaar saved = repository.save(entity);
        log.info("Created Aadhaar with ID {}", saved.getId());
        return modelMapper.map(saved, AadhaarResponseDto.class);
    }

    @Override
    public AadhaarResponseDto getAadhaarByNumber(String number)
    {
        log.info("Fetching Aadhaar with ID {}", number);
        Aadhaar entity = repository.findByAadhaarNumber(number)
                .orElseThrow(() -> new ResourceNotFoundException("Aadhaar not found: " + number));
        return modelMapper.map(entity, AadhaarResponseDto.class);
    }

    public static String generate12DigitNumber() {
        long number = 100_000_000_000L + (long) (random.nextDouble() * 900_000_000_000L);
        return String.valueOf(number);
    }
}