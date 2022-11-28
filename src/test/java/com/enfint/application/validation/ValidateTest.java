package com.enfint.application.validation;

import com.enfint.application.dto.LoanApplicationRequestDTO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ValidateTest {

    protected LoanApplicationRequestDTO dto;
    @BeforeEach
    void setUp() {

        dto= new LoanApplicationRequestDTO();
        dto.setAmount(BigDecimal.valueOf(40000));
        dto.setTerm(13);
        dto.setFirstName("Smith");
        dto.setLastName("Alex");
        dto.setMiddleName("Jacob");
        dto.setEmail("ralezemoshake@gmail.com");
        dto.setBirthdate(LocalDate.parse("1998-09-19"));
        dto.setPassportSeries("2020");
        dto.setPassportNumber("191919");
    }
    @AfterEach
    void tearDown() {
    }
    @Test
    void checkAmount() {
        boolean outputTrue=Validate.checkAmount(dto.getAmount());
        assertTrue(outputTrue);
    }
    @Test
    void checkTerm() {
        boolean output=Validate.checkTerm(dto.getTerm());
        assertTrue(output);

    }
    @Test
    void checkFirstName()
    {
        boolean output=Validate.checkFirstName(dto.getFirstName());
        assertTrue(output);
    }
    @Test
    void checkLastName()
    {
        boolean output=Validate.checkLastName(dto.getLastName());
        assertTrue(output);
    }

    @Test
    void checkEmail()
    {
        boolean output=Validate.checkEmail(dto.getEmail());
        assertTrue(output);
    }
    @Test
    void checkBirthdate()
    {
        boolean output=Validate.checkBirthdate(dto.getBirthdate());
        assertTrue(output);
    }
    @Test
    void checkPassportSeries()
    {
        boolean output=Validate.checkPassportSeries(dto.getPassportSeries());
        assertTrue(output);
    }
    @Test
    void checkPassportNumber()
    {
        boolean output=Validate.checkPassportNumber(dto.getPassportNumber());
        assertTrue(output);
    }
}