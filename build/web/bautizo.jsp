<%-- 
    Document   : bautizo
    Created on : Apr 29, 2023, 12:09:28 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="eventos.css"/>
        <link rel="stylesheet" href="style.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bautizos</title>
    </head>
    <body>
        <div class="eventos">
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

                                <s:form action="irPerfil" theme="simple" >
                                <s:submit cssClass="login" name="irperfil" value="Ver Perfil"/>
                                </s:form>
			</ul>
		</nav>
	</header>
        <div class="tabla">
        
        <s:form action="bautizo">
            <h2>Bautizos</h2>
            <s:iterator value="especializaciones" var="e">
                 <details class="styled">
                   
                    <summary>Boda <s:property value="#e.nombre"/></summary>
                    <div >
                    <li>Cátering: <s:property value="#e.catering"/></li>
                    <li>Música: <s:property value="#e.musica"/></li>
                    <li>Decoración: <s:property value="#e.decoracion"/></li>
                    <li>Audiovisuales: <s:property value="#e.audiovisuales"/></li>
                    <li>Religión: <s:property value="#e.religion"/></li>
                    <li>Precio estándar: <s:property value="#e.precio"/></li>
                    </div>
                </details>
                <s:radio id="radio" name="elegirBautizo" list="#e.getNombre()"/>
            </s:iterator>
            <s:submit cssClass="login" name="bautizoTrigger" value="Especificar detalles"/>
        </s:form>
            </div>
           </div> 
    </body>
</html>
