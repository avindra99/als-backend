package com.als.controller;

import com.als.entity.Employee;
import com.als.entity.Interview;
import com.als.exception.EmployeeNotFoundException;
import com.als.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @PostMapping("/create")
    public ResponseEntity<Interview> createInterview(@RequestBody Interview interview) {
        Interview newInterview = interviewService.createInterview(interview);
        return new ResponseEntity<>(newInterview, HttpStatus.CREATED);
    }
}
