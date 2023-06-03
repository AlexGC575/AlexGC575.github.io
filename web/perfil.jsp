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
        <link rel="stylesheet" href="style.css">
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
        <main>
            <div class="princ">
                <table border="2">
                    <tr>
                        <th>Usuario</th>
                        <th>Contraseña</th>
                        <th>Apellidos</th>
                        <th>F.Nacimiento</th>
                        <th>Telefono</th>
                        <th>Mensajes</th>
                    </tr>
                    <tr>
                        <td><s:property value="usuario"/></td>
                        <td><s:property value="password"/></td>
                        <td><s:property value="apellidos"/></td>
                        <td><s:property value="fechaNac"/></td>
                        <td><s:property value="telefono"/></td>
                    </tr>
                </table>
                <table border="2">
                    <tr>
                        <th>Mensajes</th>
                    </tr>
                    <s:iterator value="mensajes" var="m">
                        <tr>
                            <td>
                                <s:property value="#m.id"/><br/>
                                <s:property value="#m.contenido"/><br/>
                            </td>
                        </tr>
                    </s:iterator>
                </table>

                <table border="2">
                    <tr>
                        <th>Direcciones</th>
                    </tr>
                    <tr>
                        <s:iterator value="direcciones" var="d">
                            <td>
                                <s:property value="#d.provincia"/><br/>
                                <s:property value="#d.codigoPostal"/><br/>
                                <s:property value="#d.calle"/><br/>
                                <s:property value="#d.numero"/><br/>
                            </td>
                        </s:iterator>
                    </tr>
                </table>
            </div>

        </main>
    </body>
</html>
