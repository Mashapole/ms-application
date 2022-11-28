package com.enfint.application.controller;


import com.enfint.application.dto.LoanApplicationRequestDTO;
import com.enfint.application.dto.LoanOfferDTO;
import com.enfint.application.service.ApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ApplicationController {

    @Autowired
    protected ApplicationService applicationService;

    @PostMapping("/application")
    public List<LoanOfferDTO> possibleCalculation(@RequestBody LoanApplicationRequestDTO loanApplicationRequestDTO)
    {
        log.info("-----------------------------------------------------------");
        log.info("CALCULATION OF POSSIBLE LOAN CONDITION");
        return applicationService.possibleCalculation(loanApplicationRequestDTO);
    }

    @PutMapping("/application/offer")
    public void selectOffer(@RequestBody LoanOfferDTO loanOfferDTO)
    {
        log.info("-----------------------------------------------------------");
        log.info("SELECTING ONE OF THE OFFERS");
        applicationService.selectingOffer(loanOfferDTO);
    }
}
