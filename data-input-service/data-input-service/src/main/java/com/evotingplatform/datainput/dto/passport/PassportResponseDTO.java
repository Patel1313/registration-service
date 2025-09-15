package com.evotingplatform.datainput.dto.passport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PassportResponseDTO {

    private UUID id;

    private String passportNumber;

    private String firstName;

    private String lastName;

    private String fatherName;

    private String motherName;

    private LocalDate dateOfBirth;

    private String placeOfBirth;

    private String nationality;

    private LocalDate issueDate;

    private LocalDate expiryDate;

    private String gender;

    private String placeOfIssue;
}
