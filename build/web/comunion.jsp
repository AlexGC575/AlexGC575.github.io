<%-- 
    Document   : comunion
    Created on : Apr 29, 2023, 12:08:37 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<<<<<<< Updated upstream
=======
<%@taglib prefix="s" uri="/struts-tags"%>
<%

    if (session.getAttribute("Usuario") == null) {
        response.sendRedirect("login.jsp");
    }
%>
>>>>>>> Stashed changes
<!DOCTYPE html>
<html>
    <head>
        <!--<link rel="stylesheet" href="crearEvnt.css">
        --><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comuniones</title>
    </head>
    <body>
<<<<<<< Updated upstream
=======
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
>>>>>>> Stashed changes
        <h1>Comuniones</h1>
        <s:form action="comunion">
            <s:iterator value="especializaciones" var="e">
                <details>
                    <summary>Comunion <s:property value="#e.nombre"/></summary>
                    <li>Cátering: <s:property value="#e.catering"/></li>
                    <li>Música: <s:property value="#e.musica"/></li>
                    <li>Decoración: <s:property value="#e.decoracion"/></li>
                    <li>Audiovisuales: <s:property value="#e.audiovisuales"/></li>
                    <li>Religión: <s:property value="#e.religion"/></li>
<<<<<<< Updated upstream
=======
                        <s:if test="%{#e.religion != ''}">
                        <li>Religión: <s:property value="#e.religion"/></li>
                        </s:if>
>>>>>>> Stashed changes
                    <li>Precio estándar: <s:property value="#e.precio"/></li>
                </details>
                <s:radio id="radio" name="elegirComunion" list="#e.getNombre()"/>
            </s:iterator>
            <s:submit name="comunionTrigger" value="Especificar detalles"/>
        </s:form>
    </body>
</html>
