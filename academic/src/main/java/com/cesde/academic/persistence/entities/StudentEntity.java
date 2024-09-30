package com.cesde.academic.persistence.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity(name="students")
@Data
public class StudentEntity {

    @Id
    private Integer idUser;
    private String userName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private String studentType;
    private String status;


    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
