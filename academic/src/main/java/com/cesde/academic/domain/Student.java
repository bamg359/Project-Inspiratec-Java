package com.cesde.academic.domain;

public class Student extends UserAcademic{


    private String studentType;
    private String status;


    public Student(){
        super();
    }

    public Student(int idUser, String userName, String lastName, String email, String phone, String password, String studentType, String status) {
        super(idUser, userName, lastName, email, phone, password);
        this.studentType = studentType;
        this.status = status;
    }


    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
