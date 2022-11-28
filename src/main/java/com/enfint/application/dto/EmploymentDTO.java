package com.enfint.application.dto;


import com.enfint.application.dto.enumm.EmploymentStatus;
import com.enfint.application.dto.enumm.Position;
import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmploymentDTO {
    private EmploymentStatus employmentStatus;
    private String employerINN;
    private BigDecimal salary;
    private Position position;
    private Integer workExperienceTotal;
    private Integer getWorkExperienceCurrent;
}
