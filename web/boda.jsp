<%-- 
    Document   : boda
    Created on : Apr 29, 2023, 10:27:39 AM
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
        <title>Bodas</title>
    </head>
<<<<<<< HEAD
    <body>
=======
    <body >
        <div class="eventos">
>>>>>>> Juan
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
<<<<<<< HEAD
<s:form action="unlog" theme="simple" >
                                <s:submit cssClass="login" name="unlog" value="Cerrar Sesion"/>
=======

                                <s:form action="irPerfil" theme="simple" >
                                <s:submit cssClass="login" name="irperfil" value="Ver Perfil"/>
>>>>>>> Juan
                                </s:form>
			</ul>
		</nav>
	</header>
<<<<<<< HEAD
        <h1>Bodas</h1>
=======
        <div class="tabla">
     
             
>>>>>>> Juan
        <s:form action="boda">
            <h2>Bodas</h2>
            <s:iterator value="especializaciones" var="e">
            
                <details class="styled">
                   
                    <summary>Boda <s:property value="#e.nombre"/></summary>
                    <div >
                    <li>Cátering: <s:property value="#e.catering"/></li>
                    <li>Música: <s:property value="#e.musica"/></li>
                    <li>Decoración: <s:property value="#e.decoracion"/></li>
                    <li>Audiovisuales: <s:property value="#e.audiovisuales"/></li>
                    <s:if test="%{#e.religion != ''}">
                    <li>Religión: <s:property value="#e.religion"/></li>
                    </s:if>
                    <li>Precio estándar: <s:property value="#e.precio"/></li>
                    </div>
                </details>
              
                
                <s:radio id="radio" name="elegirBoda" list="#e.getNombre()"/>
            </s:iterator>
            <s:submit cssClass="login" name="bodaTrigger" value="Especificar detalles"/>
        </s:form>
        

    </div>
           </div> 
    </body>
</html>
