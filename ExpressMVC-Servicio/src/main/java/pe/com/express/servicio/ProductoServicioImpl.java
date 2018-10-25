/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.express.servicio;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.com.express.modelo.Producto;
import pe.com.express.dao.ProductoDaoI;

/**
 *
 * @author LAB_SOFTWARE-DTI
 */
@Service
@Transactional
public class ProductoServicioImpl implements ProductoServicioI{
 
    @Autowired
    public ProductoDaoI dao;
    
    
    
    @Override
    public List<Producto> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public List<Producto> listarEntidadDato(String dato){ return dao.listarEntidadDato(dato);}
    @Override
    public Producto buscarEntidadId(int id){return dao.buscarEntidadId(id);}
    @Override
    public void guardarEntidad(Producto producto){dao.guardarEntidad(producto);}
    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);}
    @Override
    public void modificarEntidad(Producto producto){dao.modificarEntidad(producto);}
}
