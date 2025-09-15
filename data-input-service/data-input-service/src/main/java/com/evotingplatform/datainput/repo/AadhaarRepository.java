package com.evotingplatform.datainput.repo;

import com.evotingplatform.datainput.entity.Aadhaar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AadhaarRepository extends JpaRepository<Aadhaar, UUID> {
    Optional<Aadhaar> findByAadhaarNumber(String aadhaarNumber);
    boolean existsByAadhaarNumber(String number);
}
