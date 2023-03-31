<%-- 
    Document   : audiovisuales
    Created on : Mar 26, 2023, 9:06:19 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Audiovisuales para eventos</title>
</head>
<body>
	<header>
		<h1>Audiovisuales para eventos</h1>
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
		<h2>Servicio de audiovisuales para eventos</h2>
		<p>En nuestra empresa ofrecemos un servicio de audiovisuales completo para todo tipo de eventos. Desde conferencias y presentaciones hasta conciertos y espectáculos, contamos con el equipo técnico y humano para hacer de tu evento un éxito.</p>
		<a href="#contacto">Solicita información</a>
	</section>
	
	<section id="servicios">
		<h2>Nuestros servicios</h2>
		<p>Ofrecemos un servicio completo de audiovisuales para todo tipo de eventos. Algunos de nuestros servicios incluyen:</p>
		<ul>
			<li>Alquiler de equipos de sonido e iluminación</li>
			<li>Pantallas y proyectores</li>
			<li>Sistemas de traducción simultánea</li>
			<li>Grabación y edición de video</li>
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
		<p>Si estás interesado en nuestro servicio de audiovisuales o tienes alguna pregunta, no dudes en ponerte en contacto con nosotros.</p>
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
	<p>Derechos reservados &copy; 2023 Audiovisuales para eventos S.A.</p>
</footer>
</body>
</html>