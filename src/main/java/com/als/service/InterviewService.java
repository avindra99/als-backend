package com.als.service;

import com.als.entity.Employee;
import com.als.entity.Interview;
import com.als.exception.EmployeeNotFoundException;
import com.als.exception.InterviewNotFoundException;
import com.als.repository.EmployeeRepository;
import com.als.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class InterviewService {
    private InterviewRepository interviewRepository;
    private EmployeeRepository employeeRepository;
    @Autowired
    public InterviewService(InterviewRepository interviewRepository, EmployeeRepository employeeRepository) {
        this.interviewRepository = interviewRepository;
        this.employeeRepository = employeeRepository;
    }

    public List<Interview> getAllInterviews(){
        return interviewRepository.findAll();
    }

    public Optional<Interview> getInterviewByID(long interviewId){
        return interviewRepository.findById(interviewId);
    }

    public List<Interview> getInterviewsByDate(LocalDate date) {
        return interviewRepository.findByDate(date);
    }

    public Interview createInterview(Interview interview) {
        // Fetch the employee from the database using the provided employeeId
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found with id: " + employeeId));

        Interview createInterview = new Interview();
        interview.setVendorName(interview.getVendorName());
        interview.setVendorEmail(interview.getVendorEmail());
        interview.setVendorPhoneNumber(interview.getVendorPhoneNumber());
        interview.setStartTime(interview.getStartTime());
        interview.setEndTime(interview.getEndTime());
        interview.setComments(interview.getComments());
        interview.setEmployee(employee);

        return interviewRepository.save(createInterview);
    }

    public Interview updateInterview(long id, Interview updatedInterview) {
        Interview existingInterview = interviewRepository.findById(id)
                .orElseThrow(() -> new InterviewNotFoundException("Interview not found with id: " + id));

        existingInterview.setVendorName(updatedInterview.getVendorName());
        existingInterview.setVendorEmail(updatedInterview.getVendorEmail());
        existingInterview.setVendorPhoneNumber(updatedInterview.getVendorPhoneNumber());
        existingInterview.setStartTime(updatedInterview.getStartTime());
        existingInterview.setEndTime(updatedInterview.getEndTime());
        existingInterview.setComments(updatedInterview.getComments());
        existingInterview.setEmployee(updatedInterview.getEmployee());

        return interviewRepository.save(existingInterview);
    }

    public void deleteInterview(long id) {
        interviewRepository.deleteById(id);
    }
}
