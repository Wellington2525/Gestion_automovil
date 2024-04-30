/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;


import conextion_db.conexion;
import logica.Automovil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author GH-WP
 */
public class Controll_Auto implements CRUD {
       //try {}
       //catch(Exception e){}
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    //entidadUsuario usu = new entidadUsuario();
    conexion cn = new conexion();
    Connection acceso;

    @Override
    public List listarMarca(String marca) {
       List<Automovil>LisctAut = new ArrayList<>();
       String sql="SELECT * FROM  auto WHERE like '%"+marca+"%' ";
       try {
           con=cn.Conectar();
           ps=con.prepareCall(sql);
           rs=ps.executeQuery();
           while(rs.next()){
           Automovil aut = new Automovil();
           aut.setId(rs.getInt(1));
           aut.setModelo(rs.getString(2));
           aut.setMarca(rs.getString(3));
           aut.setColor(rs.getString(4));
           aut.setMotor(rs.getString(5));
           aut.setPatente(rs.getString(6));
           aut.setPatente(rs.getString(7));
           
           LisctAut.add(aut);
               
           
       
       }
       
       }
       catch(Exception e){
          System.err.println("Error al intentar buscar datos "+e.getMessage());
       }
       return LisctAut;
       
    }

    @Override
    public List listarModelo(String Modelo) {
          List<Automovil>LisctAut = new ArrayList<>();
          String sql="SELECT * FROM  auto WHERE like '%"+Modelo+"%' ";
       try {
           con=cn.Conectar();
           ps=con.prepareCall(sql);
           rs=ps.executeQuery();
           while(rs.next()){
           Automovil aut = new Automovil();
           aut.setId(rs.getInt(1));
           aut.setModelo(rs.getString(2));
           aut.setMarca(rs.getString(3));
           aut.setColor(rs.getString(4));
           aut.setMotor(rs.getString(5));
           aut.setPatente(rs.getString(6));
           aut.setPatente(rs.getString(7));
           
           LisctAut.add(aut);
               
           
       
       }
       
       }
       catch(Exception e){
          System.err.println("Error al intentar buscar datos "+e.getMessage());
       }
       return LisctAut;
    }

    @Override
    public List listar() {
          List<Automovil>LisctAut = new ArrayList<>();
          String sql="SELECT id,modelo,marca,color,motor,patente,cantPuertas FROM auto";
       try {
           con=cn.Conectar();
           ps=con.prepareCall(sql);
           rs=ps.executeQuery();
           while(rs.next()){
           Automovil aut = new Automovil();
           aut.setId(rs.getInt(1));
           aut.setModelo(rs.getString(2));
           aut.setMarca(rs.getString(3));
           aut.setColor(rs.getString(4));
           aut.setMotor(rs.getString(5));
           aut.setPatente(rs.getString(6));
           aut.setCantPuertas(rs.getInt(7));
           
           LisctAut.add(aut);
               
           
       
       }
       
       }
       catch(Exception e){
          System.err.println("Error al intentar buscar datos "+e.getMessage());
       }
       return LisctAut;
    }

    @Override
    public int add(Object[] o) {
        int resp =0;
          String sql="INSERT INTO auto(modelo,marca,motor,color,patente,cantPuertas) VALUES (?,?,?,?,?,?)";
        try {
          
          con=cn.Conectar();
          ps=con.prepareCall(sql);
          ps.setObject(1,o[0]);
          ps.setObject(2,o[1]);
          ps.setObject(3,o[2]);
          ps.setObject(4,o[3]);
          ps.setObject(5,o[4]);
          ps.setObject(6,o[5]);
          //ps.setObject(7,o[6]);
          resp = ps.executeUpdate();
          System.out.print(resp);
          
        }catch(Exception e){
          System.err.println("Error al guardar datos en la base de datos"+e.getMessage());
        }
           
        return resp;
      
    }

    @Override
    public int actualizar(Object[] o) {
          int resp =0;
          String sql="UPDATE auto SET modelo=?,marca=?,motor=?,color=?,patente=?,cantPuertas=? WHERE id=?";
        try {
          
          con=cn.Conectar();
          ps=con.prepareCall(sql);
          ps.setObject(1,o[0]);
          ps.setObject(2,o[1]);
          ps.setObject(3,o[2]);
          ps.setObject(4,o[3]);
          ps.setObject(5,o[4]);
          ps.setObject(6,o[5]);
          ps.setObject(7,o[6]);
          resp = ps.executeUpdate();
          System.out.print(resp);
          
        }catch(Exception e){
          System.err.println("Error al intentar Actualizar  datos "+e.getMessage());
        }
           
        return resp;
    }

    @Override
    public void eliminar(int id) {
         
          String sql="DELETE FROM auto WHERE id=?";
        try {
          
          con=cn.Conectar();
          ps=con.prepareCall(sql);
          ps.setInt(1, id);
           ps.executeUpdate();
          
          
        }catch(Exception e){
          System.err.println("Error al intentar eliminar  datos "+e.getMessage());
        }
    }
    
}
