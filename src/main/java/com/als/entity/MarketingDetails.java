package com.als.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "MarketingDetails")
public class MarketingDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String recruiterId;
    private String marketingStartDate;
    private String technology;
    private String marketingChannel;

    @ManyToOne
    @JoinColumn(name = "employeeId", referencedColumnName = "employeeId")
    private Employee employee;

    public MarketingDetails() {
    }

    public MarketingDetails(long id,  String recruiterId, String marketingStartDate, String technology, String marketingChannel, Employee employee) {
        this.id = id;
        this.recruiterId = recruiterId;
        this.marketingStartDate = marketingStartDate;
        this.technology = technology;
        this.marketingChannel = marketingChannel;
        this.employee = employee;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRecruiterId() {
        return recruiterId;
    }

    public void setRecruiterId(String recruiterId) {
        this.recruiterId = recruiterId;
    }

    public String getMarketingStartDate() {
        return marketingStartDate;
    }

    public void setMarketingStartDate(String marketingStartDate) {
        this.marketingStartDate = marketingStartDate;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getMarketingChannel() {
        return marketingChannel;
    }

    public void setMarketingChannel(String marketingChannel) {
        this.marketingChannel = marketingChannel;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

