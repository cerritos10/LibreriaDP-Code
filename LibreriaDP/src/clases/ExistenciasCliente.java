/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author cerritos
 */
public class ExistenciasCliente {
        conexion conn=new conexion();

    
    public int Existe(String telefono){
         PreparedStatement ps=null;
         ResultSet rs=null;
         Connection con = conn.connx();
         String sql =" select count(id_cliente) from cliente where telefono=?";
         try{
                ps=con.prepareStatement(sql);
                ps.setString(1,telefono);
                rs=ps.executeQuery();
                if (rs.next()) {
                        return rs.getInt(1);
             }
                return 1;
         } catch(Exception e){
             return 1;
         }
     }
}
