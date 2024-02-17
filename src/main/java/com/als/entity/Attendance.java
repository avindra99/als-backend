package com.als.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "Attendance")
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long attendanceId;
    private Long timestamp;
    private String reason;
    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;

    public Attendance() {
    }

    public Attendance(long attendanceId, Long timestamp, String reason, Employee employee) {
        this.attendanceId = attendanceId;
        this.timestamp = timestamp;
        this.reason = reason;
        this.employee = employee;
    }

    public long getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(long attendanceId) {
        this.attendanceId = attendanceId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

