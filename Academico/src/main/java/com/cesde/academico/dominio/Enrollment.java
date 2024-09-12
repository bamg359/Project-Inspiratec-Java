package com.cesde.academico.dominio;

import java.util.Date;

public class Enrollment {

    private int enrollmentId;
    private Date enrollmentDate;
    private Course course;
    private Student student;
    private String status;

    public  Enrollment(){


    }

    public Enrollment(int enrollmentId, Date enrollmentDate, Course course, Student student, String status) {
        this.enrollmentId = enrollmentId;
        this.enrollmentDate = enrollmentDate;
        this.course = course;
        this.student = student;
        this.status = status;
    }

    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
