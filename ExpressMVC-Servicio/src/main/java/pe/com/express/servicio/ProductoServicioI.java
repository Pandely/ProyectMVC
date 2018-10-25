/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.express.servicio;

import java.util.List;
import pe.com.express.modelo.Producto;

/**
 *
 * @author LAB_SOFTWARE-DTI
 */
public interface ProductoServicioI {
    public List<Producto> listarEntidad();
    public List<Producto> listarEntidadDato(String dato);
    public Producto buscarEntidadId(int id);
    public void guardarEntidad(Producto producto);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Producto producto);    
}
