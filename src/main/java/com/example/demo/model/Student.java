package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Student extends Person{
    @Id
    private int id;
    private String studentName;

    public Student() {
    }
}
