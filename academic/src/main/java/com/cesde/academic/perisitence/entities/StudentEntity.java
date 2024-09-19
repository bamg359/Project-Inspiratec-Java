package com.cesde.academic.perisitence.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="student")
public class StudentEntity {

    @Id
    private int idUser;
    private String userName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private String studentType;
    private String status;
}
