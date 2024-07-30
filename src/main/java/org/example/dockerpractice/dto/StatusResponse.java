package org.example.dockerpractice.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
public class StatusResponse {
    private String appStatus;
    private LocalDateTime timeStamp;
}
