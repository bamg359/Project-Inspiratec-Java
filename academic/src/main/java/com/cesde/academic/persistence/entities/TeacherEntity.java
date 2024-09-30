package com.cesde.academic.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name= "teacher")
@Data
public class TeacherEntity {

    @Id
    private int idUser;
    private String userName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private String speciality;
}
