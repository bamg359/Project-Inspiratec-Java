package com.cesde.academico.Repository.database;

import java.sql.Connection;

public class TestConn {


    public static void main(String[] args) {

        Conexion conexion = new Conexion();
        try(Connection conn = conexion.getConn()){


        }catch(Exception e ){

            System.out.println(e);
        }



    }
}
