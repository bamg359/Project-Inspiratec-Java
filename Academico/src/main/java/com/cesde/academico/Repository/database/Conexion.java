package com.cesde.academico.Repository.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {


    public Connection getConn(){

        Connection conn = null;

        try{

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/academico_cesde", "root", "");

            if(conn != null){
                System.out.println("La conexión ha sido exitosa");
            }


        }catch(Exception e){

            System.out.println(e);

        }

            return conn;


    }













}
