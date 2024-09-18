package com.cesde.academic.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Enrrollment {


    private int enrollmentId;
    private Date enrollmentDate;
    private Course course;
    private Student student;
    private String status;






}
