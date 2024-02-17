package com.als.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "Interview")
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long interviewId;
    private String vendorName;
    private String vendorEmail;
    private String vendorPhoneNumber;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String comments;
    @ManyToOne
    @JoinColumn(name = "employeeId", referencedColumnName = "employeeId", nullable = false)
    private Employee employee;

    public Interview() {
    }

    public Interview(long interviewId, String vendorName, String vendorEmail, String vendorPhoneNumber,
                     LocalDateTime startTime, LocalDateTime endTime, String comments, Employee employee) {
        this.interviewId = interviewId;
        this.vendorName = vendorName;
        this.vendorEmail = vendorEmail;
        this.vendorPhoneNumber = vendorPhoneNumber;
        this.startTime = startTime;
        this.endTime = endTime;
        this.comments = comments;
        this.employee = employee;
    }

    public long getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(long interviewId) {
        this.interviewId = interviewId;
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

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
