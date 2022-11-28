package com.enfint.application.service.implementation;

import com.enfint.application.dto.LoanApplicationRequestDTO;
import com.enfint.application.dto.LoanOfferDTO;

import java.util.List;

public interface ServiceConfig {

    List<LoanOfferDTO> possibleCalculation(LoanApplicationRequestDTO loanApplicationRequestDTO);

    void selectingOffer(LoanOfferDTO loanOfferDTO);
}
