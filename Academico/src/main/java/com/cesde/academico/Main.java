package com.cesde.academico;

import com.cesde.academico.dominio.Student;
import com.cesde.academico.service.StudentServiceImp;
import com.cesde.academico.view.StudentView;

public class Main {

    public static void main(String[] args) {

        StudentServiceImp studentService;
        StudentView studentView = new StudentView();
        Student student = new Student();
        studentView.listStudents(student);
    }
}
