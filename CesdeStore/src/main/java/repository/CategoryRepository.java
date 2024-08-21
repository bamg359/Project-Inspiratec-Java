package repository;

import repository.database.Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoryRepository {

    Conexion conexion = new Conexion();
    public void createCategory(){

        try(Connection connect = conexion.get_connect() ){

            PreparedStatement ps = null;

            try{

                String query = "INSERT INTO category(category_id, category_name) VALUES (?,?)";
                ps = connect.prepareStatement(query);
                
            }catch(SQLException e){
                System.out.println(e);
            }


        }catch(SQLException e){
            System.out.println(e);
        }
    }

    }





}
