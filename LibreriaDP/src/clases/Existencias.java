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
public class Existencias {
        conexion conn=new conexion();

    
    public int Existe(String telefono){
         PreparedStatement ps=null;
         ResultSet rs=null;
         Connection con = conn.connx();
         String sql =" select count(id_proveedor) from proveedor where telefono=?";
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
    public int ExisteUser(String nombre){
         PreparedStatement ps=null;
         ResultSet rs=null;
         Connection con = conn.connx();
         String sql =" select count(id_usuario) from usuario where nombre_usuario=?";
         try{
                ps=con.prepareStatement(sql);
                ps.setString(1,nombre);
                rs=ps.executeQuery();
                if (rs.next()) {
                        return rs.getInt(1);
             }
                return 1;
         } catch(Exception e){
             return 1;
         }
    }
    public int ExistCategoria(String categoria){
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con = conn.connx();
        String sql ="select count(id_cargo) from usuario where nombre_cargo=?";
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1,categoria);
            rs=ps.executeQuery();
            if (rs.next()){
                return rs.getInt(1);
            }
            return 1;
        }catch(Exception e){
            return 1;
        }
    }
     public int ExistCategori(String categoria){
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con = conn.connx();
        String sql ="select count(id_categoria) from categoria where nombre_categoria=?";
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1,categoria);
            rs=ps.executeQuery();
            if (rs.next()){
                return rs.getInt(1);
            }
            return 1;
        }catch(Exception e){
            return 1;
        }
     }
     public int ExistCode(String code){
        PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con = conn.connx();
        String sql ="select count(id_ingreso) from ingreso where codigo=?";
        try{
            ps=con.prepareStatement(sql);
            ps.setString(1,code);
            rs=ps.executeQuery();
            if (rs.next()){
                return rs.getInt(1);
            }
            return 1;
        }catch(Exception e){
            return 1;
        }
     }
}
