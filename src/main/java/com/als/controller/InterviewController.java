package com.als.controller;

import com.als.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interview")
public class InterviewController {

    private InterviewService interviewService;
    @Autowired
    public InterviewController(InterviewService interviewService) {
        this.interviewService = interviewService;
    }
}
