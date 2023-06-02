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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <nav class="naveg">
                <h1 class="logo">U<span>party</span> </h1>
                <ul class="navbar">
                    <li><a href="eventos.jsp">Eventos</a></li>
                    <li><a href="decoracion.jsp">Decoración</a></li>
                    <li><a href="musica.jsp">Música</a></li>
                    <li><a href="catering.jsp">Catering</a></li>
                    <li><a href="audiovisuales.jsp">Audiovisuales</a></li>
                    <li><a href="empresas.jsp">Empresas</a></li>
                        <s:form action="unlog" theme="simple" >
                            <s:submit cssClass="login" name="unlog" value="Cerrar Sesion"/>
                        </s:form>
                </ul>
            </nav>
        </header>
    </body>
</html>
