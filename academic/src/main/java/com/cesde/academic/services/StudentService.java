package com.cesde.academic.services;

import com.cesde.academic.domain.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getStudent();

    public List<Student> getStudentById(Integer studentId);

    public void createStudent(Student student);

    public List<Student> updateStudent(Student student);

    public List<Student> deleteStudent(Integer idStudent);

}
