<%-- 
    Document   : miEvento
    Created on : Apr 29, 2023, 10:27:54 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <!--<link rel="stylesheet" href="crearEvnt.css">
        --><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Evento Personalizado</title>
    </head>
    <body>
        <header >
		
		<nav class="naveg">
                    <h1 class="logo">U<span>party</span> </h1>
			<ul class="navbar">
				<li><a href="#eventos">Eventos</a></li>
				<li><a href="#decoracion">Decoración</a></li>
				<li><a href="#musica">Música</a></li>
				<li><a href="#catering">Catering</a></li>
				<li><a href="#audiovisuales">Audiovisuales</a></li>
				<li><a href="#empresas">Empresas</a></li>
<s:form action="unlog" theme="simple" >
                                <s:submit cssClass="login" name="unlog" value="Cerrar Sesion"/>
                                </s:form>
			</ul>
		</nav>
	</header>
        <h1>Eventos</h1>

        <label>Personaliza tu evento:</label>
        <s:form action="eventoP">
                Evento: <s:select name="eventos" id="eventos" list="%{tipos}"/>
                Cátering: <s:select name="eCat" id="eCat" list="%{empresasC.{nombre}}"/>
                <label>Música:</label> <s:select name="eMus" id="eMus" list="%{empresasM.{nombre}}"/>
                Decoración: <s:select name="eDec" id="eDec" list="%{empresasD.{nombre}}"/>
                Audiovisuales: <s:select name="eAud" id="eAud" list="%{empresasA.{nombre}}"/>
                Precio estándar: <s:property value="%{precio}"/>
                <s:hidden name="precio" value="%{precio}"/>
            <s:submit name="eventoPTrigger" value="Especificar detalles"/>
        </s:form>
    </body>
</html>
