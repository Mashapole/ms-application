package com.enfint.application.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoanOfferDTO {

    private long applicationId;
    private BigDecimal requestAmount;
    private BigDecimal totalAmount;
    private Integer term;
    private BigDecimal monthlyPayment;
    private BigDecimal rate;
    private boolean isInsuranceEnabled;
    private boolean isSalaryClient;
}

