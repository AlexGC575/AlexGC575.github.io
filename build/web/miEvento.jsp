<%-- 
    Document   : miEvento
    Created on : Apr 29, 2023, 10:27:54 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<script src="jquery-1.12.4.min.js" type="text/javascript"></script>
<!DOCTYPE html>
<html>
    <head>
        <!--<link rel="stylesheet" href="crearEvnt.css">
        --><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Evento Personalizado</title>
        <script>
    function checkPrice() {
                var p = Math.round(Math.random()*2000+500);

                document.getElementById("precio").textContent="Precio: "+p;                     
            }
</script>
    </head>
    <body>
<<<<<<< HEAD
<<<<<<< HEAD
=======
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
>>>>>>> Juan
        <h1>Eventos</h1>

        <label>Personaliza tu evento:</label>
        <s:form action="eventoP">
<<<<<<< HEAD
            <s:iterator value="especializaciones" var="e">
                <details>
                    <summary>Evento <s:property value="#e.nombre"/></summary>
                    <li>Cátering: <s:property value="#e.catering"/></li>
                    <li>Música: <s:property value="#e.musica"/></li>
                    <li>Decoración: <s:property value="#e.decoracion"/></li>
                    <li>Audiovisuales: <s:property value="#e.audiovisuales"/></li>
                    <li>Religión: <s:property value="#e.religion"/></li>
                    <li>Precio estándar: <s:property value="#e.precio"/></li>
                </details>
                <s:radio id="radio" name="elegirEventoP" list="#e.getNombre()"/>
            </s:iterator>
=======
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
>>>>>>> Alejandro
=======
                <s:label name="evento" value="Evento:"></s:label>
                <s:select name="eventos" id="eventos" list="%{tipos}" onchange="checkPrice()"/>
                <s:label name="catering" value="Cátering:"></s:label>
                <s:select name="eCat" id="eCat" list="%{empresasC.{nombre}}" onchange="checkPrice()"/>
                <s:label name="musica" value="Música:"></s:label>
                <s:select name="eMus" id="eMus" list="%{empresasM.{nombre}}" onchange="checkPrice()"/>
                <s:label name="decoracion" value="Decoración:"></s:label>
                <s:select name="eDec" id="eDec" list="%{empresasD.{nombre}}" onchange="checkPrice()"/>
                <s:label name="audiovisuales" value="Audiovisuales:"></s:label>
                <s:select name="eAud" id="eAud" list="%{empresasA.{nombre}}" onchange="checkPrice()"/>
                <s:label name="precio" id="precio" value="Precio: %{precio}"/>
                <s:hidden name="precio" value="%{precio}"/>
>>>>>>> Juan
            <s:submit name="eventoPTrigger" value="Especificar detalles"/>
        </s:form>
    </body>
</html>
