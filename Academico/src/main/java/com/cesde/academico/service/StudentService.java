package com.cesde.academico.service;

import com.cesde.academico.Repository.StudentRepository;
import com.cesde.academico.dominio.Course;
import com.cesde.academico.dominio.Student;

import java.util.List;

public interface StudentService {



    public List<Student> createStudent();
    public List<Student> listStudents(Course coure);
    public int listStudentById(int sudentId);
    



}
