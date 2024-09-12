package com.cesde.academico.dominio;

public class Course {

    private int courseId;
    private String courseName;
    private String schedule;
    private Teacher teacher;
    private String classRoom;
    private String program;



    // Construtors

    public Course(){

    }

    public Course(int courseId, String courseName, String schedule, Teacher teacher, String classRoom, String program) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.schedule = schedule;
        this.teacher = teacher;
        this.classRoom = classRoom;
        this.program = program;
    }


    //Getter and Setter


    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}
