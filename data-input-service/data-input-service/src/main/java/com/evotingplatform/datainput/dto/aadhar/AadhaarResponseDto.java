package com.evotingplatform.datainput.dto.aadhar;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class AadhaarResponseDto {
    private UUID id;
    private String aadhaarNumber;
    private String name;
    private String gender;
    private Date dateOfBirth;
    private String address;
    private String motherName;
    private String fatherName;
    private String photoUrl;
    private String qrCode;
}
