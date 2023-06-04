<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Organización de eventos</title>
</head>
<body>
    <s:property value="#session.Rol==1"/>
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
                                <s:if test="#session.Rol==1">
                                <s:form action="gestion" theme="simple" >
                                <s:submit cssClass="login" name="Gestion" value="Gestión"/>
                            </s:form>
                                </s:if>
				<s:form action="consultarEmpresas" theme="simple" >
                                <s:submit cssClass="login" name="irEmpresa" value="Empresas"/>
                            </s:form>
                                
                                <s:if test="#session.Usuario!=null">         
                                <s:form action="perfil" theme="simple" >
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

    <main>
	<section  class="banner" id="banner">
		<h2>Bienvenidos a nuestra web de organización de eventos</h2>
		<p>Somos una empresa especializada en la organización de eventos para todo tipo de ocasiones. Desde bodas y cumpleaños hasta eventos corporativos y ferias, estamos aquí para ayudarte a hacer que tu evento sea un éxito.</p>
		<a href="#contacto">Contáctanos</a>
                <s:form action="eventos">
                    <s:submit cssClass="login" name="evntTrigger" value="Organice su evento"/>
                </s:form>
	</section>
	<div class="princ">
	
            <h2 class="menu">Menú principal</h2>
            <div class="princbox">
                <section id="evento">
		<h3>Eventos</h3>
		<p>En esta sección encontrarás información sobre nuestros servicios de organización de eventos.</p>
                </section>
	
	
	<section id="decoracion">
		<h3>Decoración</h3>
		<p>En esta sección encontrarás información sobre nuestros servicios de decoración para eventos.</p>
	</section>
	
	<section id="musica">
		<h3>Música</h3>
		<p>En esta sección encontrarás información sobre nuestros servicios de música para eventos.</p>
	</section>
	
	<section id="catering">
		<h3>Catering</h3>
		<p>En esta sección encontrarás información sobre nuestros servicios de catering para eventos.</p>
	</section>
	
	<section id="audiovisuales">
		<h3>Audiovisual</h3>
		<p>En esta sección encontrarás información sobre nuestros servicios de audiovisuales para eventos.</p>
	</section>

	
	<section id="empresas">
		<h3>Empresas</h3>
		<p>En esta sección encontrarás información sobre nuestras empresas asociadas para eventos.</p>
	</section>
	</div>
        </div>
        <footer>
	<p>Derechos reservados &copy; 2023 Audiovisuales para eventos S.A.</p>
</footer>
    </main>
    </div>
    </body>
</html>