/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.com.express.control;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import pe.com.express.modelo.Producto;
import pe.com.express.modelo.Usuario;

import pe.com.express.servicio.ProductoServicioI;
import pe.com.express.servicio.UsuarioServicioI;

/**
 *
 * @author LAB_SOFTWARE-DTI
 */
@Controller
public class ProductoControl {

    @Autowired
    private MessageSource messageSource;
    @Autowired
    ProductoServicioI productoServicioI;
    @Autowired
    UsuarioServicioI usuarioServicioI;
    
    @RequestMapping(value = "/locate", method = RequestMethod.GET)
    public String getLocatePage(){
    return "my-locale";
    }
    
    
@RequestMapping(value = {"/" }, method = RequestMethod.GET)    
public ModelAndView inicio(Locale locale, Map<String,Object> model){
    String welcome=messageSource.getMessage("welcome.message", new Object[]{"Pandely Ali"}, locale);
    List<Producto> lista = productoServicioI.listarEntidad();
    model.put("ListaProducto", lista);
    model.put("message", welcome);
    model.put("startMeeting", "09:10");
    
    return new ModelAndView("producto/mainProducto");
}


@RequestMapping(value = {"/report" }, method = RequestMethod.GET)    
public ModelAndView mainProductoReport(){    
    return new ModelAndView("producto/reporte/pru1");
}

@RequestMapping(value = {"/elim" }, method = RequestMethod.GET)
public ModelAndView eliminarProducto(HttpServletRequest r){
    int idEntidad=Integer.parseInt(r.getParameter("id"));
    productoServicioI.eliminarEntidad(idEntidad);
return new ModelAndView(new RedirectView("/"));
}
  
@RequestMapping(value = {"/buscar"}, method = RequestMethod.POST)
public  ModelAndView buscarEntidad(Locale locale, Map<String,Object> model, HttpServletRequest r){
    String welcome=messageSource.getMessage("welcome.message", new Object[]{"Pandely Ali"}, locale);
    String dato=r.getParameter("dato");
    List<Producto> lista=productoServicioI.listarEntidadDato(dato);
    model.put("ListaProdcuto", lista);
    model.put("message", welcome);
    model.put("startMeeting", "09:10");    
return new ModelAndView("producto/mainProducto");
}

@RequestMapping(value = "/formProducto", method = RequestMethod.GET)
public ModelAndView irFormulario(@ModelAttribute("modeloProducto")Producto producto,
        BindingResult result, Map<String,Object> model){
        List<Usuario> lista = usuarioServicioI.listarEntidad();
    model.put("ListaUsuario", lista);
    return new ModelAndView("producto/formProducto");
}

@RequestMapping(value = "/guardarProducto", method = RequestMethod.POST)
public ModelAndView guardarEntidad(@ModelAttribute("modeloProducto")Producto producto,
        BindingResult result){
        productoServicioI.guardarEntidad(producto);
        
    return new ModelAndView(new RedirectView("/"));
}

}
