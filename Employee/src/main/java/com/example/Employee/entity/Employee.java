package com.example.Employee.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="emp")
@Data

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "empName")
    private String name;
    private  String address;
    private Long phoneNo;
}
