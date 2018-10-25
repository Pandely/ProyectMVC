
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="frm" uri="http://www.springframework.org/tags/form" %>

<!-- Content Wrapper. Contains page content -->
<div class="content-wrapper">
<!-- Main content -->
<section class="content">    
    <div class="box box-primary">
            <div class="box-header with-border">
              <h3 class="box-title">Formulario de Registro de Productos</h3>
            </div>
            <c:url var="urlsave" value="${pageContext.request.contextPath}/guardarProducto" />
    <frm:form modelAttribute="modeloProducto" method="post" action="${urlsave}" class="form-horizontal" >
            <div class="box-body">
                <frm:hidden path="idProducto" value="1"/>
                <div class="form-group">
                    <frm:label path="codigo" class="col-sm-2 control-label" >Código:</frm:label>
                    <div class="col-sm-10">
                    <frm:input path="codigo" class="form-control" />                    
                    </div>
                </div>
                <div class="form-group">
                    <frm:label path="nombreProducto" class="col-sm-2 control-label">Nombre Producto</frm:label>
                    <div class="col-sm-10"><frm:input path="nombreProducto" class="form-control"  /></div>                    
                </div>
                <div class="form-group">
                    <frm:label path="tipoProducto" class="col-sm-2 control-label">Tipo:</frm:label>
                    <div class="col-sm-10"><frm:input path="tipoProducto" class="form-control" /></div>
                </div>
                <div class="form-group" >
                    <frm:label path="precio" class="col-sm-2 control-label">Precio:</frm:label>
                    <div class="col-sm-10"><frm:input path="precio" class="form-control" /></div>
                </div>
                
                <div class="form-group" >
                    <frm:label path="idUsuario.idUsuario" class="col-sm-2 control-label">Usuario:</frm:label>
                    <div class="col-sm-10"><frm:select path="idUsuario.idUsuario" items="${ListaUsuario}" itemLabel="usuarioNombre" itemValue="idUsuario" /></div>
                </div>
                        
                            
                

                
              </div>
              <!-- /.box-body -->

              <div class="box-footer">                
                <input type="submit" value="Guardar" class="btn btn-primary pull-right" />
              </div>            
    </frm:form>
</div>

</section>        
</div>    