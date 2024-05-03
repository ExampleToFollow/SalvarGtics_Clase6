package com.example.clase6.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="employees")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name= "first_name")
    private String firstName;
    @Column(name= "last_name")
    private String lastName;
    @Column(name= "email")
    private String email;
    @Column(name= "password")
    private String password;
    @Column(name= "hire_date")
    private Date hireDate;
    @ManyToOne
    @JoinColumn(name= "job_id")
    private Jobs job;
    @Column(name= "salary")
    private double salary;
    @Column(name= "commission_pct")
    private double commissionPct;
    @ManyToOne
    @JoinColumn(name= "manager_id")
    private Employees manager;
    @ManyToOne
    @JoinColumn(name= "department_id")
    private Departments departments;
    @Column(name= "enabled")
    private int enabled;


}
