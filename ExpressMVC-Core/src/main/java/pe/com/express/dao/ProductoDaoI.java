
package pe.com.express.dao;

import java.util.List;
import pe.com.express.modelo.Producto;

public interface ProductoDaoI {
    public List<Producto> listarEntidad();
    public List<Producto> listarEntidadDato(String dato);
    public Producto buscarEntidadId(int id);
    public void guardarEntidad(Producto producto);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Producto producto);
}