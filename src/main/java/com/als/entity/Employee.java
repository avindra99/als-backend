package com.als.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String emailAddress;
    private String personalEmailAddress;
    private String marketingMobileNumber;
    private String personalMobileNumber;
    private String dateOfBirth;
    private String role;
    private String accessPortal;
    private String managerId;
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Interview> interviews;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<EmployeeExpenses> expenses;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Attendance> attendances;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Submission> jobSubmissions;

    // Constructors
    public Employee() {
    }

    public Employee(long employeeId, String firstName, String middleName, String lastName, String emailAddress, String personalEmailAddress, String marketingMobileNumber, String personalMobileNumber, String dateOfBirth, String role, String accessPortal, String managerId, List<Interview> interviews, List<EmployeeExpenses> expenses, List<Attendance> attendances, List<Submission> jobSubmissions) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.personalEmailAddress = personalEmailAddress;
        this.marketingMobileNumber = marketingMobileNumber;
        this.personalMobileNumber = personalMobileNumber;
        this.dateOfBirth = dateOfBirth;
        this.role = role;
        this.accessPortal = accessPortal;
        this.managerId = managerId;
        this.interviews = interviews;
        this.expenses = expenses;
        this.attendances = attendances;
        this.jobSubmissions = jobSubmissions;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPersonalEmailAddress() {
        return personalEmailAddress;
    }

    public void setPersonalEmailAddress(String personalEmailAddress) {
        this.personalEmailAddress = personalEmailAddress;
    }

    public String getMarketingMobileNumber() {
        return marketingMobileNumber;
    }

    public void setMarketingMobileNumber(String marketingMobileNumber) {
        this.marketingMobileNumber = marketingMobileNumber;
    }

    public String getPersonalMobileNumber() {
        return personalMobileNumber;
    }

    public void setPersonalMobileNumber(String personalMobileNumber) {
        this.personalMobileNumber = personalMobileNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAccessPortal() {
        return accessPortal;
    }

    public void setAccessPortal(String accessPortal) {
        this.accessPortal = accessPortal;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public List<Interview> getInterviews() {
        return interviews;
    }

    public void setInterviews(List<Interview> interviews) {
        this.interviews = interviews;
    }

    public List<EmployeeExpenses> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<EmployeeExpenses> expenses) {
        this.expenses = expenses;
    }

    public List<Attendance> getAttendances() {
        return attendances;
    }

    public void setAttendances(List<Attendance> attendances) {
        this.attendances = attendances;
    }

    public List<Submission> getJobSubmissions() {
        return jobSubmissions;
    }

    public void setJobSubmissions(List<Submission> jobSubmissions) {
        this.jobSubmissions = jobSubmissions;
    }
}

