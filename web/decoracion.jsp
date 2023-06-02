<%-- 
    Document   : decoracion
    Created on : Mar 26, 2023, 9:04:50 AM
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
<<<<<<< Updated upstream
<head>
	<title>Decoración para eventos</title>
</head>
<body>
	<header>
		<h1>Decoración para eventos</h1>
		<nav>
			<ul>
				<li><a href="/">Inicio</a></li>
				<li><a href="#servicios">Servicios</a></li>
				<li><a href="#galeria">Galería</a></li>
				<li><a href="#contacto">Contacto</a></li>
			</ul>
		</nav>
	</header>
php
Copy code
<main>
	<section id="banner">
		<h2>Decoración personalizada para eventos</h2>
		<p>En nuestra empresa ofrecemos un servicio de decoración completo para todo tipo de eventos. Desde bodas y cumpleaños hasta eventos corporativos y ferias, tenemos la decoración perfecta para tu ocasión especial.</p>
		<a href="#contacto">Solicita información</a>
	</section>
	
	<section id="servicios">
		<h2>Nuestros servicios</h2>
		<p>Ofrecemos un servicio de decoración completo para todo tipo de eventos. Algunos de nuestros servicios incluyen:</p>
		<ul>
			<li>Decoración temática</li>
			<li>Arreglos florales</li>
			<li>Iluminación personalizada</li>
			<li>Mobiliario y mantelería</li>
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
	
	<section id="contacto">
		<h2>Contacto</h2>
		<p>Si estás interesado en nuestro servicio de decoración o tienes alguna pregunta, no dudes en ponerte en contacto con nosotros.</p>
		<form>
			<label for="nombre">Nombre:</label>
			<input type="text" id="nombre" name="nombre"><br>
=======
    <head>
        <title>Decoración para eventos</title>
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
            <section id="banner">
                <h2>Decoración personalizada para eventos</h2>
                <p>En nuestra empresa ofrecemos un servicio de decoración completo para todo tipo de eventos. Desde bodas y cumpleaños hasta eventos corporativos y ferias, tenemos la decoración perfecta para tu ocasión especial.</p>
                <a href="#contacto">Solicita información</a>
            </section>

            <section id="main">
                <p>
                    Nuestro equipo de empresas diseñadoras de eventos es apasionado y creativo, y se dedica a convertir tus ideas en realidades visuales impresionantes. Desde elegantes bodas hasta sofisticadas galas corporativas y eventos temáticos extravagantes, tenemos la experiencia y la visión para llevar tu evento al siguiente nivel.

                    Trabajaremos estrechamente contigo para comprender tus gustos, preferencias y objetivos para el evento. Ya sea que busques una estética clásica y atemporal, una ambientación moderna y vanguardista o un enfoque temático único, nos aseguraremos de capturar tu visión y plasmarla en cada detalle decorativo.

                    Nos enorgullece ofrecer una amplia gama de servicios de decoración que incluyen la selección de mobiliario elegante, la creación de arreglos florales deslumbrantes, la iluminación cautivadora, la instalación de cortinas y telas decorativas, y mucho más. Cada elemento se selecciona cuidadosamente para complementar la temática y crear una atmósfera envolvente que impresionará a tus invitados.

                    Además, nos mantenemos al tanto de las últimas tendencias y tecnologías en decoración de eventos para ofrecerte opciones innovadoras y sorprendentes. Ya sea que desees incorporar proyecciones audiovisuales, juegos de luces interactivos o elementos decorativos inusuales, estamos preparados para hacerlo realidad.

                    Nuestro objetivo es crear una experiencia visualmente impactante y cohesiva que refleje tu estilo y personalidad. Nos encargaremos de todos los aspectos logísticos, desde la planificación y la instalación hasta el desmontaje después del evento, para que puedas disfrutar de la belleza de tu evento sin preocupaciones.
                </p>
            </section>
>>>>>>> Stashed changes

            <section id="contacto">
                <h2>Contacto</h2>
                <p>Si estás interesado en nuestro servicio de decoración o tienes alguna pregunta, no dudes en ponerte en contacto con nosotros.</p>
                <form>
                    <label for="nombre">Nombre:</label>
                    <input type="text" id="nombre" name="nombre"><br>

                    <label for="email">Email:</label>
                    <input type="email" id="email" name="email"><br>

                    <label for="mensaje">Mensaje:</label>
                    <textarea id="mensaje" name="mensaje"></textarea><br>

                    <input type="submit" value="Enviar">
                </form>
            </section>
        </main>

        <footer>
            <p>Derechos reservados &copy; 2023 Decoraciones para eventos S.A.</p>
        </footer>
    </body>
</html>