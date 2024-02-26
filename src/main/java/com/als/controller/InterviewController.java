package com.als.controller;

import com.als.entity.Employee;
import com.als.entity.Interview;
import com.als.exception.EmployeeNotFoundException;
import com.als.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        Interview addInterview = interviewService.createInterview(interview);
        return new ResponseEntity<>(addInterview, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Interview> updateInterview(@PathVariable("id") long id, @RequestBody Interview updatedInterview) {
        Interview interview = interviewService.updateInterview(id, updatedInterview);
        return ResponseEntity.ok(interview);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInterview(@PathVariable("id") long id) {
        interviewService.deleteInterviewById(id);
        return ResponseEntity.noContent().build();
    }
}
