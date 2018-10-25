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
import pe.com.express.modelo.Usuario;
import pe.com.express.dao.UsuarioDaoI;

/**
 *
 * @author LAB_SOFTWARE-DTI
 */
@Service
@Transactional
public class UsuarioServicioImpl implements UsuarioServicioI{
 
    @Autowired
    public UsuarioDaoI dao;
    
    @Override
    public List<Usuario> listarEntidad(){ return dao.listarEntidad();}
    @Override
    public List<Usuario> listarEntidadDato(String dato){ return dao.listarEntidadDato(dato);}
    @Override
    public Usuario buscarEntidadId(int id){return dao.buscarEntidadId(id);}
    @Override
    public void guardarEntidad(Usuario usuario){dao.guardarEntidad(usuario);}
    @Override
    public void eliminarEntidad(int id){dao.eliminarEntidad(id);}
    @Override
    public void modificarEntidad(Usuario usuario){dao.modificarEntidad(usuario);}
}
