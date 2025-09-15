package com.evotingplatform.datainput.entity;

import com.evotingplatform.datainput.constant.AppConstants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "aadhar")
public class Aadhaar {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id = UUID.randomUUID();

    @Column(name = "aadhaar_number", unique = true, nullable = false, length = 12)
    private String aadhaarNumber;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "address")
    private String address;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "photo_url")
    private String photoUrl = AppConstants.DEFAULT_DP;

    @Column(name = "qr_code")
    private String qrCode;
}
