package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
@Getter
@Setter
@Entity
public class Teacher extends Person{
    @Id
    private int id;
    private String teacherName;

    public Teacher() {
    }
}
