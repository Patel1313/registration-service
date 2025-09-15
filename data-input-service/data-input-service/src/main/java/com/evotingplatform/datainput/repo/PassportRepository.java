package com.evotingplatform.datainput.repo;

import com.evotingplatform.datainput.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PassportRepository extends JpaRepository<Passport, UUID> {
    Optional<Passport> findByPassportNumber(String passportNumber);
    boolean existsByPassportNumber(String passportNumber);
}
