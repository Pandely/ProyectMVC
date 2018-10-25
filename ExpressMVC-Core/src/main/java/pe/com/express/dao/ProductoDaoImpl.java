
package pe.com.express.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import pe.com.express.SysDataAccess;
import pe.com.express.modelo.Producto;


@Repository
public class ProductoDaoImpl extends SysDataAccess<Integer, Producto> implements ProductoDaoI{
    
    @SuppressWarnings("unchecked")
    
    @Override
    public List<Producto> listarEntidad(){ return getListAll();}    
        
    
    @Override
    public List<Producto> listarEntidadDato(String dato){
        return (List<Producto>)sessionFactory.getCurrentSession()
                .createQuery("SELECT p from Producto p WHERE p.nombreProducto LIKE ? ")
                .setString(0, "%"+dato+"%")
                .list();                
                }
    
    @Override
    public Producto buscarEntidadId(int id){ return getById(id);}
    
    @Override
    public void guardarEntidad(Producto producto){savev(producto);}
    @Override
    public void eliminarEntidad(int id){delete(id);}
    @Override
    public void modificarEntidad(Producto producto){update(producto);}

}
