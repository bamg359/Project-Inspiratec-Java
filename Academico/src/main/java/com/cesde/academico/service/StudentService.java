package com.cesde.academico.service;

import com.cesde.academico.Repository.StudentRepository;
import com.cesde.academico.dominio.Course;
import com.cesde.academico.dominio.Student;

import java.util.List;

public interface StudentService {



    public void createStudent(Student student);
    public List<Student> listStudents(Student student);
    public List<Student> listStudentById(int studentId);
    public List<Student> updateStudent(Student student);
    public List<Student> deleteStudent(int studentId);

}
