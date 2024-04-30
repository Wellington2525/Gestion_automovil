/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package control;
import java.util.List;
/**
 *
 * @author GH-WP
 */
public interface CRUD {
    public List listarMarca(String marca);
    public List listarModelo(String Modelo);
    public List listar();
    public int add(Object[] o);
    public int actualizar(Object[] o);
    public void eliminar(int id);
    
}
