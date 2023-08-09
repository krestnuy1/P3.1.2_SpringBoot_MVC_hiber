package com.example.p312springboot_mysql.entity;


import jakarta.persistence.*;


@Entity
@Table(name = "Allusers")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "name")
    private String name;


    @Column(name = "surname")
    private String surName;


    @Column(name = "age")
    private int age;


    @Column(name = "email")
    private String email;

    public User (){

    }

    public User(String name, String surName, int age, String email) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
