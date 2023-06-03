<%-- 
    Document   : empresas
    Created on : 03-jun-2023, 3:25:15
    Author     : juanl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="all">
	<header >
		
		<nav class="naveg">
                    <h1 class="logo">U<span>party</span> </h1>
			<ul class="navbar">
				<li><a href="eventos.jsp">Eventos</a></li>
				<li><a href="decoracion.jsp">Decoración</a></li>
				<li><a href="musica.jsp">Música</a></li>
				<li><a href="catering.jsp">Catering</a></li>
				<li><a href="audiovisuales.jsp">Audiovisuales</a></li>
                                <li><a href="gestion.jsp">Gestión</a></li>
				<s:form action="consultarEmpresas" theme="simple" >
                                <s:submit cssClass="login" name="irEmpresa" value="Empresas"/>
                            </s:form>
                                
                                <s:if test="#session.Usuario!=null">         
                                <s:form action="irPerfil" theme="simple" >
                                <s:submit cssClass="login" name="irperfil" value="Ver Perfil"/>
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

        <table class="tablaEmp">
            
            <tr class="encabezado"><th>Nombre</th><th>Categoria</th><th>Descripción</th><th>Valoración</th></tr>
            <s:iterator value="empresas" var="e">
                <tr>
                    <td><s:property value="#e.nombre"/></td>
                    <td><s:property value="#e.categoria"/></td>
                    <td><s:property value="#e.descripcion"/></td>
                    <td><s:property value="#e.valoracion"/></td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>
