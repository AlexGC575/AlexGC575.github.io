<%-- 
    Document   : detallesPago
    Created on : Apr 30, 2023, 1:35:49 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalles pago</title>
    </head>
    <body>
         	<header >
		
		<nav class="naveg">
                    <h1 class="logo">U<span>party</span> </h1>
			<ul class="navbar">
				<li><a href="/eventos.jsp">Eventos</a></li>
				<li><a href="/decoracion.jsp">Decoración</a></li>
				<li><a href="/musica.jsp">Música</a></li>
				<li><a href="catering.jsp">Catering</a></li>
				<li><a href="/audiovisuales.jsp">Audiovisuales</a></li>
				<li><a href="/empresas.jsp">Empresas</a></li>
<s:form action="unlog" theme="simple" >
                                <s:submit cssClass="login" name="unlog" value="Cerrar Sesion"/>
                                </s:form>
			</ul>
		</nav>
	</header>
    Resumen de su evento:
            <s:property value="#evento.tipo"/>
            <s:property value="#evento.lugar"/>
            <s:property value="#evento.fecha"/>
            <s:property value="#evento.horaInicio"/>
            <s:property value="#evento.horaFin"/>
            <s:property value="#evento.catering"/>
            <s:property value="#evento.musica"/>
            <s:property value="#evento.decoracion"/>
            <s:property value="#evento.audiovisuales"/>
            <s:property value="#evento.religion"/>
            <s:property value="#evento.precio"/>
    Se le enviará un correo a: <s:property value="#evento.usuario.email"/> para que indique los invitados de la fiesta.
    
    Muchas gracias por confiar en nuestros servicios.
        <s:form action="pInicio">
            <s:submit name="inicioTrigger" value="Volver página inicio"/>
        </s:form>
    <footer>
	<p>Derechos reservados &copy; 2023 Uparty</p>
</footer>
    </body>
</html>