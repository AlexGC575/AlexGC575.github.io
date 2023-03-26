<%-- 
    Document   : decoracion
    Created on : Mar 26, 2023, 9:04:50 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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