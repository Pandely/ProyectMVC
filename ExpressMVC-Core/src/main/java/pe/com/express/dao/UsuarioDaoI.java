
package pe.com.express.dao;

import java.util.List;
import pe.com.express.modelo.Usuario;

public interface UsuarioDaoI {
    public List<Usuario> listarEntidad();
    public List<Usuario> listarEntidadDato(String dato);
    public Usuario buscarEntidadId(int id);
    public void guardarEntidad(Usuario producto);
    public void eliminarEntidad(int id);
    public void modificarEntidad(Usuario producto);
}