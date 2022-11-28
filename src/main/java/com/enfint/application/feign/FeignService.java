package com.enfint.application.feign;

import com.enfint.application.dto.LoanApplicationRequestDTO;
import com.enfint.application.dto.LoanOfferDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeignService {

    /*
    Service class for feign,reason for this is to test feign if is working*/
    @Autowired
    protected FeignImplementation feignImplementation;

     public List<LoanOfferDTO> possibleCalculation(LoanApplicationRequestDTO loanApplicationRequestDTO)
     {

         return feignImplementation.possibleCalculation(loanApplicationRequestDTO);
     }

     public void selectOffer(LoanOfferDTO loanOfferDTO)
     {
         feignImplementation.selectingOffer(loanOfferDTO);
     }
}
