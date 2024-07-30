package org.example.dockerpractice.controller;

import org.example.dockerpractice.dto.StatusResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class DockerPracticeController {

    @GetMapping("/status")
    public StatusResponse getApplicationStatus(){
        return StatusResponse.builder()
                .appStatus("Healthy")
                .timeStamp(LocalDateTime.now())
                .build();
    }
}
