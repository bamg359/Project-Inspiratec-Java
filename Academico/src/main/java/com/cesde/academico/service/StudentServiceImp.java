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


    private List<Student> students = new ArrayList<>(Arrays.asList(new Student(1,"Pepito" , "Perez", "correo@mail.com", "32145467890", "1234", "Nuevo", "Activo" ),
            new Student(2,"Juan" , "Perez", "correo@mail.com", "32145467890", "1234", "Nuevo", "Activo" ),
            new Student(3,"Maria" , "Perez", "correo@mail.com", "32145467890", "1234", "Antiguo", "Activo" ),
            new Student(4,"Laura" , "Perez", "correo@mail.com", "32145467890", "1234", "Nuevo", "Activo" )

    ));





    @Override
    public List<Student> createStudent(Student student) {

        return students;
    }

    @Override
    public List<Student> listStudents(Student student) {


        return students;
    }

    @Override
    public List<Student> listStudentById(int studentId) {

        return students;
    }

    @Override
    public List<Student> updateStudent(Student student) {
        return students;
    }

    @Override
    public List<Student> deleteStudent(int studentId) {
        return students;
    }
}
