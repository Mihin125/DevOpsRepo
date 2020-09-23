package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class User
{   @Id
    @GeneratedValue
    @Column(name = "Id")
    private int id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Country")
    private String country;


    public User() {
    }
    public void ha (){

    }


}
