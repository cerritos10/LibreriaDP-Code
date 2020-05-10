/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author cerritos
 */
public class conexion {
   
        Connection conn = null;

    public Connection connx() {
        String urlDatabase= "jdbc:postgresql://localhost:5432/d_providencia";
        try{
            Class.forName("org.postgresql.Driver");
            conn=DriverManager.getConnection(urlDatabase, "postgres", "123");
            
        }catch (Exception e){
            System.out.println("Error"+e.getMessage());
        }
        return conn;
    }

}
    

