package com.enfint.application.service;

import com.enfint.application.dto.LoanApplicationRequestDTO;
import com.enfint.application.dto.LoanOfferDTO;
import com.enfint.application.feign.FeignImplementation;
import com.enfint.application.service.implementation.ServiceConfig;
import com.enfint.application.validation.Validate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ApplicationService implements ServiceConfig {


    protected static final String LINE="--------------------------------------------------";
    protected static final String STATUS="---------------- EXECUTED------------------------";

    @Autowired
    protected FeignImplementation feignImplementation;
    @Override
    public List<LoanOfferDTO> possibleCalculation(LoanApplicationRequestDTO loanApplicationRequestDTO)
    {
        log.info("---------------------VALIDATING DATA-------------------------------");
        validateData(loanApplicationRequestDTO);

        log.info("SENDING POST REQUEST TO deal/application in MS deal");
        log.info("DATA:{}", feignImplementation.possibleCalculation(loanApplicationRequestDTO));

        return feignImplementation.possibleCalculation(loanApplicationRequestDTO);
    }

    private void validateData(LoanApplicationRequestDTO reg) {

        if(!Validate.checkAmount(reg.getAmount())) return;

        if(!Validate.checkTerm(reg.getTerm())) return;

        if(!Validate.checkFirstName(reg.getFirstName())) return;

        if(!Validate.checkLastName(reg.getLastName())) return;

        if(!Validate.checkEmail(reg.getEmail())) return;

        if(!Validate.checkBirthdate(reg.getBirthdate())) return;

        if(!Validate.checkPassportSeries(reg.getPassportSeries())) return;

        if(!Validate.checkPassportNumber(reg.getPassportNumber())) return;
        log.info(LINE);
        log.info(STATUS);
        log.info(LINE);
    }

    @Override
    public void selectingOffer(LoanOfferDTO loanOfferDTO)
    {
        log.info("-----------------SELECTION OF OFFER-------------------------------");
        log.info("SENDING POST REQUEST TO deal/offer in MS deal");
        feignImplementation.selectingOffer(loanOfferDTO);
        log.info("DATA:{}",loanOfferDTO);
    }
}
