package com.enfint.application.feign;

import com.enfint.application.dto.LoanApplicationRequestDTO;
import com.enfint.application.dto.LoanOfferDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "msDeal", url = "http://localhost:8086/deal")
public interface FeignImplementation {

    @PostMapping("/application")
    List<LoanOfferDTO> possibleCalculation(@RequestBody LoanApplicationRequestDTO loanApplicationRequestDTO);

    @PostMapping("/offer")
    void selectingOffer(@RequestBody LoanOfferDTO loanOfferDTO);

}
