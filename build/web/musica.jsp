<%-- 
    Document   : Musica
    Created on : Mar 26, 2023, 9:04:04 AM
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
	<title>Música para eventos</title>
</head>
<body>
	<header>
<<<<<<< Updated upstream
		<h1>Música para eventos</h1>
		<nav>
			<ul>
				<li><a href="/">Inicio</a></li>
				<li><a href="#servicios">Servicios</a></li>
				<li><a href="#artistas">Artistas</a></li>
				<li><a href="#galeria">Galería</a></li>
				<li><a href="#contacto">Contacto</a></li>
			</ul>
		</nav>
	</header>
php
Copy code
=======
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
<main>
	<section id="banner">
		<h2>Servicio de música para eventos</h2>
		<p>En nuestra empresa ofrecemos un servicio de música completo para todo tipo de eventos. Desde bodas y cumpleaños hasta eventos corporativos y ferias, tenemos el artista perfecto para tu ocasión especial.</p>
		<a href="#contacto">Solicita información</a>
	</section>
	
	<section id="servicios">
		<h2>Nuestros servicios</h2>
		<p>Ofrecemos un servicio de música completo para todo tipo de eventos. Algunos de nuestros servicios incluyen:</p>
		<ul>
			<li>Artistas en vivo para cualquier tipo de evento</li>
			<li>DJ profesionales con equipo de sonido de alta calidad</li>
			<li>Iluminación especial para crear el ambiente perfecto</li>
			<li>Asesoramiento personalizado para elegir la mejor opción de música para tu evento</li>
		</ul>
		<a href="#contacto">Solicita información</a>
	</section>
	
	<section id="artistas">
		<h2>Nuestros artistas</h2>
		<p>Ofrecemos una amplia selección de artistas para adaptarse a cualquier tipo de evento. Algunos de nuestros artistas más populares incluyen:</p>
		<ul>
			<li>Bandas de música en vivo: rock, pop, jazz, música latina, etc.</li>
			<li>Cantantes solistas: pop, jazz, blues, música clásica, etc.</li>
			<li>DJs: música electrónica, pop, rock, etc.</li>
			<li>Grupos de baile: salsa, hip hop, flamenco, etc.</li>
		</ul>
		<a href="#contacto">Solicita información</a>
	</section>
	
	<section id="galeria">
		<h2>Galería de imágenes</h2>
		<p>En esta sección encontrarás imágenes de algunos de nuestros eventos anteriores. </p>
		<img src="img1.jpg" alt="Imagen de evento">
		<img src="img2.jpg" alt="Imagen de evento">
		<img src="img3.jpg" alt="Imagen de evento">
		<a href="#contacto">Solicita información</a>
	</section>
    </body>
</html>
