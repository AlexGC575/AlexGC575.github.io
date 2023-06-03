<%-- 
    Document   : catering
    Created on : Mar 26, 2023, 9:05:17 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    if (session.getAttribute("Usuario") == null) {
        response.sendRedirect("login.jsp");
    }
%>
<html>
<<<<<<< Updated upstream
<head>
	<title>Catering para eventos</title>
</head>
<body>
	<header>
		<h1>Catering para eventos</h1>
		<nav>
			<ul>
				<li><a href="/">Inicio</a></li>
				<li><a href="#servicios">Servicios</a></li>
				<li><a href="#menu">Menú</a></li>
				<li><a href="#galeria">Galería</a></li>
				<li><a href="#contacto">Contacto</a></li>
			</ul>
		</nav>
	</header>
php
Copy code
<main>
	<section id="banner">
		<h2>Servicio de catering para eventos</h2>
		<p>En nuestra empresa ofrecemos un servicio de catering completo para todo tipo de eventos. Desde bodas y cumpleaños hasta eventos corporativos y ferias, tenemos el menú perfecto para tu ocasión especial.</p>
		<a href="#contacto">Solicita información</a>
	</section>
	
	<section id="servicios">
		<h2>Nuestros servicios</h2>
		<p>Ofrecemos un servicio de catering completo para todo tipo de eventos. Algunos de nuestros servicios incluyen:</p>
		<ul>
			<li>Menús personalizados para cada ocasión</li>
			<li>Servicio de mesa y barra</li>
			<li>Decoración temática</li>
			<li>Personal especializado en atención al cliente</li>
		</ul>
		<a href="#contacto">Solicita información</a>
	</section>
	
	<section id="menu">
		<h2>Nuestro menú</h2>
		<p>Ofrecemos una gran variedad de opciones para satisfacer a todos los paladares. Algunos de nuestros platos más populares incluyen:</p>
		<ul>
			<li>Entrantes: Mini quiches, empanadas, croquetas, etc.</li>
			<li>Platos principales: Paella, pollo al horno, lomo de cerdo, etc.</li>
			<li>Postres: Tarta de chocolate, cheesecake, mousse de frutas, etc.</li>
			<li>Bebidas: Refrescos, cervezas, vinos, etc.</li>
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
		<p>Si estás interesado en nuestro servicio de catering o tienes alguna pregunta, no dudes en ponerte en contacto con nosotros.</p>
		<form>
			<label for="nombre">Nombre:</label>
			<input type="text" id="nombre" name="nombre"><br>

			<label for="email">Email:</label>
			<input type="text" id="nombre" name="email"><br>
=======
    <head>
        <title>Catering para eventos</title>
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
                <h2>Servicio de catering para eventos</h2>
                <p>En nuestra empresa de organización de eventos, entendemos que cada detalle importa cuando se trata de crear una experiencia excepcional para tus invitados. Es por eso que ofrecemos servicios de catering de primera calidad que deleitarán a tus asistentes y elevarán tu evento a un nivel superior.</p>
            </section>

            <section id="main">
                <p>
                    Nuestro equipo de empresas expertas culinarias se enorgullece de ofrecer una variedad de opciones gastronómicas exquisitas y personalizadas para satisfacer los gustos y necesidades de cada ocasión.
                    
                    Ya sea que estés planeando una elegante recepción corporativa, una conferencia de alto nivel o una celebración privada, nuestro catering está diseñado para impresionar. 
                    
                    Desde deliciosos aperitivos y platos principales hasta exquisitos postres, cada bocado está cuidadosamente elaborado con ingredientes frescos y de alta calidad. 
                    
                    Nuestros talentosos chefs combinan sabores innovadores con técnicas culinarias excepcionales para crear platos visualmente impactantes y deliciosos. 
                    
                    Además de la extraordinaria comida, nos aseguramos de que cada aspecto del servicio de catering sea impecable. Nuestro equipo de profesionales altamente capacitados y amables se encargará de todos los detalles logísticos, desde la presentación elegante hasta la atención personalizada a tus invitados. 
                    
                    Entendemos la importancia de la presentación y la ambientación en un evento exitoso. Por eso, trabajamos en estrecha colaboración contigo para crear una decoración y una atmósfera que complementen tu visión. Ya sea que desees un estilo clásico y sofisticado o una temática temeraria y vanguardista, nuestro equipo de diseño de eventos puede hacerlo realidad. 
                </p>
            </section>

            <section id="contacto">
                <h2>Contacto</h2>
                <p>Si estás interesado en nuestro servicio de catering o tienes alguna pregunta, no dudes en ponerte en contacto con nosotros.</p>
                <form>
                    <label for="nombre">Nombre:</label>
                    <input type="text" id="nombre" name="nombre"><br>

                    <label for="email">Email:</label>
                    <input type="text" id="nombre" name="email"><br>
>>>>>>> Stashed changes
                </form>
        </section>
    </body>
</html>
