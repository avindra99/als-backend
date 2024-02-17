package com.als.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Submission")
public class Submission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long submissionId;
    @ManyToOne
    @JoinColumn(name = "employeeId", referencedColumnName = "employeeId")
    private Employee employee;
    private String recruiterId;
    private Long createdTimestamp;
    private Long lastUpdatedTimestamp;
    private String vendorName;
    private String vendorEmail;
    private String endClientName;
    private Double payRate;
    private String submissionStatus;
    private String submittedBy;
    private String jobDescription;
    @ElementCollection
    private List<String> technicalSkillsRequired;

    @ElementCollection
    private List<String> interviewRounds;

    @ElementCollection
    private List<String> expenses;

    // Constructors
    public Submission() {
    }

    public Submission(long submissionId, Employee employee, String recruiterId, Long createdTimestamp, Long lastUpdatedTimestamp, String vendorName, String vendorEmail, String endClientName, Double payRate, String submissionStatus, String submittedBy, String jobDescription, List<String> technicalSkillsRequired, List<String> interviewRounds, List<String> expenses) {
        this.submissionId = submissionId;
        this.employee = employee;
        this.recruiterId = recruiterId;
        this.createdTimestamp = createdTimestamp;
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
        this.vendorName = vendorName;
        this.vendorEmail = vendorEmail;
        this.endClientName = endClientName;
        this.payRate = payRate;
        this.submissionStatus = submissionStatus;
        this.submittedBy = submittedBy;
        this.jobDescription = jobDescription;
        this.technicalSkillsRequired = technicalSkillsRequired;
        this.interviewRounds = interviewRounds;
        this.expenses = expenses;
    }

    public long getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(long submissionId) {
        this.submissionId = submissionId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getRecruiterId() {
        return recruiterId;
    }

    public void setRecruiterId(String recruiterId) {
        this.recruiterId = recruiterId;
    }

    public Long getCreatedTimestamp() {
        return createdTimestamp;
    }

    public void setCreatedTimestamp(Long createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    public Long getLastUpdatedTimestamp() {
        return lastUpdatedTimestamp;
    }

    public void setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getEndClientName() {
        return endClientName;
    }

    public void setEndClientName(String endClientName) {
        this.endClientName = endClientName;
    }

    public Double getPayRate() {
        return payRate;
    }

    public void setPayRate(Double payRate) {
        this.payRate = payRate;
    }

    public String getSubmissionStatus() {
        return submissionStatus;
    }

    public void setSubmissionStatus(String submissionStatus) {
        this.submissionStatus = submissionStatus;
    }

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public List<String> getTechnicalSkillsRequired() {
        return technicalSkillsRequired;
    }

    public void setTechnicalSkillsRequired(List<String> technicalSkillsRequired) {
        this.technicalSkillsRequired = technicalSkillsRequired;
    }

    public List<String> getInterviewRounds() {
        return interviewRounds;
    }

    public void setInterviewRounds(List<String> interviewRounds) {
        this.interviewRounds = interviewRounds;
    }

    public List<String> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<String> expenses) {
        this.expenses = expenses;
    }
}

