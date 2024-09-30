package com.cesde.academic.persistence.repository;

import com.cesde.academic.persistence.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {


}
