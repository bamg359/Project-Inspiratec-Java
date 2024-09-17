package com.cesde.academic.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course {


    private int courseId;
    private String courseName;
    private String schedule;
    private Teacher teacher;
    private String classRoom;
    private String program;
}
