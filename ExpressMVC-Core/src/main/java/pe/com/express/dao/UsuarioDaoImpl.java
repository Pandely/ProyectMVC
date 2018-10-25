
package pe.com.express.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.com.express.SysDataAccess;
import pe.com.express.modelo.Usuario;


@Repository
public class UsuarioDaoImpl extends SysDataAccess<Integer, Usuario> implements UsuarioDaoI{
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Usuario> listarEntidad(){ return getListAll();}    
        
    
    @Override
    public List<Usuario> listarEntidadDato(String dato){
        return (List<Usuario>)sessionFactory.getCurrentSession()
                .createQuery("SELECT p from Usuario p WHERE p.nombreUsuario LIKE ? ")
                .setString(0, "%"+dato+"%")
                .list();                
                }
    
    @Override
    public Usuario buscarEntidadId(int id){ 
        return getById(id);}
    
    @Override
    public void guardarEntidad(Usuario producto){savev(producto);}
    @Override
    public void eliminarEntidad(int id){delete(id);}
    @Override
    public void modificarEntidad(Usuario producto){update(producto);}

}
