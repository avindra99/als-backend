package com.als.entity;

import jakarta.persistence.*;
@Entity
@Table(name="EmployeeExpenses")
public class EmployeeExpenses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long expenseId;
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    private Long timestamp;
    private String description;
    private String addedBy;
    private String category;

    public EmployeeExpenses() {
    }

    public EmployeeExpenses(long expenseId, Long timestamp, String description, String addedBy, String category, Employee employee) {
        this.expenseId = expenseId;
        this.timestamp = timestamp;
        this.description = description;
        this.addedBy = addedBy;
        this.category = category;
        this.employee = employee;
    }

    public long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(long expenseId) {
        this.expenseId = expenseId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

