<%-- 
    Document   : pago
    Created on : Apr 30, 2023, 1:17:02 AM
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
        <title>RedSys</title>
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
        <s:iterator value="pago" var="p">
            Tarjeta de Crédito: <s:property value="#p.id.tarjetoCredito"/><br/>
            Fecha de Caducidad: <s:property value="#p.caducidad"/><br/>
        </s:iterator>
>>>>>>> Stashed changes
        <s:form action="pago">
            <s:textfield name="tCredito" label="Tarjeta de crédito"/><br/>
            <s:textfield name="fechaC" label="Fecha de caducidad"/><br/>
            <s:textfield name="pin" label="Número secreto"/><br/>
            <s:submit name="pagoTrigger" value="Pagar"/>
        </s:form>
    </body>
</html>
