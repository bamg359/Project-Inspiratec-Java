package com.cesde.academico.view;

import com.cesde.academico.dominio.Student;
import com.cesde.academico.service.StudentServiceImp;

import java.util.List;

public class StudentView {



    private Student student;
    private StudentServiceImp studentServiceImp;



    public void createStudent(Student student){


        List<Student> students = studentServiceImp.createStudent(student);

        students.add(student);
    }


    public void listStudents(Student student){

        List<Student> students = studentServiceImp.listStudents(student);

        for(Student student1 : students){

            System.out.println(student1);
        }


    }













}
