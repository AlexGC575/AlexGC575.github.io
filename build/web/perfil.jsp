<%-- 
    Document   : perfil
    Created on : Jun 1, 2023, 4:33:29 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%

    if (session.getAttribute("Usuario") == null) {
        response.sendRedirect("login.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="eventos.css"/>
        <link rel="stylesheet" href="style.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Perfil</title>
    </head>
    <body>
        <div class="eventos">
	<header >
		
		<nav class="naveg">
                    <h1 class="logo">U<span>party</span> </h1>
			<ul class="navbar">
				<li><a href="eventos.jsp">Eventos</a></li>
				<li><a href="decoracion.jsp">Decoración</a></li>
				<li><a href="musica.jsp">Música</a></li>
				<li><a href="catering.jsp">Catering</a></li>
				<li><a href="audiovisuales.jsp">Audiovisuales</a></li>
				<s:form action="consultarEmpresas" theme="simple" >
                                <s:submit cssClass="login" name="irEmpresa" value="Empresas"/>
                            </s:form>
                                
                                <s:if test="#session.Usuario!=null">         
                                <s:form action="unlog" theme="simple" >
                                <s:submit cssClass="login" name="irperfil" value="Cerrar Sesion"/>
                            </s:form>
                                </s:if>
                                <s:else >
                                <s:form action="irLogin" theme="simple" >
                                <s:submit cssClass="login" name="irlogin" value="Iniciar Sesión"/>
                            </s:form>
                                </s:else>
			</ul>
		</nav>
	</header>
       <div class="perfil">
            <h2>Perfil</h2>
            <br>
            <div style="display:flex; justify-content: center; align-items: center;">
            <details class="styled">
                 <summary>Usuario</summary>
                 <div >
                    <li>Usuario: <s:property value="usuario"/></li>
                        <li>Contraseña: <s:property value="password"/></li>
                        <li>Apellidos: <s:property value="apellidos"/></li>
                        <li>Fecha de Nacimiento: <s:property value="fechaNac"/></li>
                        <li>Telefono: <s:property value="telefono"/></li>
                    </div>
                 
            </details>
                    <br>
       </div>
                    <div style="display:flex; justify-content: center; align-items: center;">
                    <details class="styled">
                 <summary>Mensajes </summary>
                  <s:iterator value="mensajes" var="m">
                       
                 <div >
                   <li> <s:property value="#m.id"/></li>
                   <li> <s:property value="#m.contenido"/></li>
                    </div>
                    </s:iterator>
            </details>
                <br>
       </div>
                <div style="display:flex; justify-content: center; align-items: center;">

                  <s:iterator value="direcciones" var="d">
                      <details class="styled">
                 <summary>Direccion <s:property value="#d.direccionPK.id"/></summary>
                  <div>
                      <li>  <s:property value="#d.provincia"/></li>
                         <li>       <s:property value="#d.codigoPostal"/></li>
                        <li>       <s:property value="#d.calle"/></li>
                        <li>        <s:property value="#d.numero"/></li>
                  </div>
                 </details>
                        </s:iterator>
            
                  <br>
       </div>
                  <div style="display:flex; justify-content: center; align-items: center;">
                
                      <s:form action="resenya">
                  
               
                  <s:iterator value="eventos" var="e">
                   <details class="styled">
                 <summary>Evento <s:property value="#e.id"/></summary>
                 <div>
                                    
                                   <li> <s:property value="#e.tipo.nombre"/></li>
                                   <li> <s:property value="#e.lugar.nombre"/></li>
                                   <li> <s:property value="#e.patrocinador.nombre"/></li>
                                   </div> 
                 </details>
                   <s:radio id="radio" name="evento" list="#e.id"/>
                   
                        </s:iterator>
                      
            
                          
                        
                    <s:submit cssClass="login" value="Resenya"/>
                </s:form>
                           
            </div>

        </div>
    </body>
</html>