package com.evotingplatform.datainput.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "passport")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Passport
{

    @Id
    private UUID id = UUID.randomUUID();

    private String passportNumber; // e.g., P123456789

    private String firstName;

    private String lastName;

    private String fatherName;

    private String motherName;

    private Date dateOfBirth;

    private String placeOfBirth;

    private String nationality;

    private Date issueDate;

    private Date expiryDate;

    private String gender;

    private String placeOfIssue;
}
