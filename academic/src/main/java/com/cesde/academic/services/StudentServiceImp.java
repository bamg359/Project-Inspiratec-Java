package com.cesde.academic.services;

import com.cesde.academic.domain.Student;
import com.cesde.academic.perisitence.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {


    @Autowired
    private StudentRepository studentRepository;


    @Override
    public List<Student> createStudent(Student student) {
        return null;
    }

    @Override
    public List<Student> getStudent() {
        return null;
    }

    @Override
    public List<Student> getStudentById(Integer studentId) {
        return null;
    }

    @Override
    public List<Student> updateStudent(Student student) {
        return null;
    }


    @Override
    public List<Student> deleteStudent(Integer idStudent) {
        return null;
    }
}
