package com.cesde.academico.service;

import com.cesde.academico.dominio.Course;
import com.cesde.academico.dominio.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentServiceImp implements StudentService{

//
//
//    StudentService studentService;


    private List <Student> students = new ArrayList<>(new Student(Arrays.asList( "Pepito" , "Perez", "correo@mail.com", "32145467890", "1234", "Nievo", "Activo" )));





    @Override
    public List<Student> createStudent() {
        return List.of();
    }

    @Override
    public List<Student> listStudents(Course course) {
        return List.of();
    }

    @Override
    public int listStudentById(int studentId) {
        return 0;
    }
}
