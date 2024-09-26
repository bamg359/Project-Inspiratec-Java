package com.cesde.academico.Repository;


import com.cesde.academico.Repository.database.Conexion;
import com.cesde.academico.dominio.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRepository {


    public void saveStudent(Student student){

        Conexion conexion = new Conexion();

        try(Connection conn = conexion.getConn()){


            PreparedStatement ps = null;

            try{

                String query = "INSERT INTO ";

            }catch (SQLException e){

                System.out.println(e);
            }



        }catch(Exception e ){

            System.out.println(e);
        }


    }






}
