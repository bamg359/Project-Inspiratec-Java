package com.cesde.academic.perisitence.repository;

import com.cesde.academic.perisitence.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {


}
