package com.enfint.application.dto;

import com.enfint.application.dto.enumm.ChangeType;
import com.enfint.application.model.ApplicationStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Setter
@Getter
@AllArgsConstructor
public class ApplicationStatusHistoryDTO {

    private ApplicationStatus status;
    private LocalDateTime time;
    private ChangeType changeType;
}
