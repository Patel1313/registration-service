package com.evotingplatform.datainput.dto.aadhar;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
@RequiredArgsConstructor
public class AadhaarRequestDto {
    private String name;
    private String gender;
    private Date dateOfBirth;
    private String address;
    private String motherName;
    private String fatherName;
}
