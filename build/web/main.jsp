<%-- 
    Document   : main
    Created on : Mar 26, 2023, 9:02:32 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Organización de eventos</title>
</head>
<body>
	<header>
		<h1>Organización de eventos</h1>
		<nav>
			<ul>
				<li><a href="#eventos">Eventos</a></li>
				<li><a href="#decoracion">Decoración</a></li>
				<li><a href="#musica">Música</a></li>
				<li><a href="#catering">Catering</a></li>
				<li><a href="#audiovisuales">Audiovisuales</a></li>
				<li><a href="#empresas">Empresas</a></li>
			</ul>
		</nav>
	</header>
php
Copy code
<main>
	<section id="banner">
		<h2>Bienvenidos a nuestra web de organización de eventos</h2>
		<p>Somos una empresa especializada en la organización de eventos para todo tipo de ocasiones. Desde bodas y cumpleaños hasta eventos corporativos y ferias, estamos aquí para ayudarte a hacer que tu evento sea un éxito.</p>
		<a href="#contacto">Contáctanos</a>
	</section>
	
	<section id="eventos">
		<h2>Eventos</h2>
		<p>En esta sección encontrarás información sobre nuestros servicios de organización de eventos.</p>
		<a href="#contacto">Contáctanos</a>
	</section>
	
	<section id="decoracion">
		<h2>Decoración</h2>
		<p>En esta sección encontrarás información sobre nuestros servicios de decoración para eventos.</p>
		<a href="#contacto">Contáctanos</a>
	</section>
	
	<section id="musica">
		<h2>Música</h2>
		<p>En esta sección encontrarás información sobre nuestros servicios de música para eventos.</p>
		<a href="#contacto">Contáctanos</a>
	</section>
	
	<section id="catering">
		<h2>Catering</h2>
		<p>En esta sección encontrarás información sobre nuestros servicios de catering para eventos.</p>
		<a href="#contacto">Contáctanos</a>
	</section>
	
	<section id="audiovisuales">
		<h2>Audiovisuales</h2>
		<p>En esta sección encontrarás información sobre nuestros servicios de audiovisuales para eventos.</p>
		<a href="#contacto">Contáctanos</a>
	</section>
	
	<section id="empresas">
		<h2>Empresas</h2>
		<p>En esta sección encontrarás información sobre nuestros servicios de organización de eventos para empresas.</p>
		<a href="#contacto">Contáctanos</a>
	</section>
	
	<section id="contacto">
		<h2>Contacto</h2>
		<p>Si estás interesado en nuestros servicios o tienes alguna pregunta, no dudes en ponerte en contacto con nosotros.</p>
		<form>
			<label for="nombre">Nombre:</label>
			<input type="text" id="nombre" name="nombre"><br>

			<label for="email">Email:</label>
			<input type="email" id="email" name="email"><br>

                        <label for="mensaje">Mensaje:</label>
            </form>
        </section>
    </body>
</html>
