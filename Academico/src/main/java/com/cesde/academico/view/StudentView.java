package com.cesde.academico.view;

import com.cesde.academico.dominio.Student;
import com.cesde.academico.service.StudentServiceImp;

import java.util.List;
import java.util.Scanner;

public class StudentView {



    private Student student;
    private StudentServiceImp studentServiceImp;
    Scanner sc = new Scanner(System.in);



    public void createStudent(Student student){





        System.out.println("Ingrese el id del estudiante");
        int id = sc.nextInt();
        student.setIdUser(id);
        System.out.println("Ingrese el nombre del Estudiante");
        String name = sc.nextLine();
        student.setUserName(name);
        System.out.println("Ingrese el Apellido");
        String lastName = sc.nextLine();
        student.setLastName(lastName);
        System.out.println("Ingrese el telefono");
        String phone = sc.nextLine();
        student.setPhone(phone);
        System.out.println("Ingrese el correo");
        String email= sc.nextLine();
        student.setEmail(email);
        System.out.println("Ingrese el password");
        String password = sc.nextLine();
        student.setPassword(password);
        System.out.println("Ingrese el tipo de estidiante");
        String studentTipe = " ";
        student.setStudentType(studentTipe);
        System.out.println("Indique el estatus del estudiante");
        String status = sc.nextLine();


        studentServiceImp.createStudent(student);



    }


    public void listStudents(Student student){

        List<Student> students = studentServiceImp.listStudents(student);

        for(Student student1 : students){

            System.out.println(student1);
        }


    }













}
