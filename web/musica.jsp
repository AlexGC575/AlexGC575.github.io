<%-- 
    Document   : Musica
    Created on : Mar 26, 2023, 9:04:04 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Música para eventos</title>
</head>
<body>
	<header >
		
		<nav class="naveg">
                    <h1 class="logo">U<span>party</span> </h1>
			<ul class="navbar">
				<li><a href="eventos.jsp">Eventos</a></li>
				<li><a href="decoracion.jsp">Decoración</a></li>
				<li><a href="musica.jsp">Música</a></li>
				<li><a href="catering.jsp">Catering</a></li>
				<li><a href="audiovisuales.jsp">Audiovisuales</a></li>
				<li><a href="empresas.jsp">Empresas</a></li>
                                 <%= session.getAttribute("Usuario") %>
<s:form action="unlog" theme="simple" >
                                <s:submit cssClass="login" name="unlog" value="Cerrar Sesion"/>
                                </s:form>
			</ul>
		</nav>
	</header>
<main>
	<section id="banner">
		<h2>Servicio de música para eventos</h2>
		<p>En nuestra empresa ofrecemos un servicio de música completo para todo tipo de eventos. Desde bodas y cumpleaños hasta eventos corporativos y ferias, tenemos el artista perfecto para tu ocasión especial.</p>
		<a href="#contacto">Solicita información</a>
	</section>
	
    <section id="main">
                <p>
	Contamos con una amplia variedad de opciones musicales para adaptarnos a todos los estilos y gustos. Nuestro talentoso equipo de músicos y artistas está formado por profesionales apasionados que dominan diversos géneros, desde bandas en vivo y solistas hasta DJ experimentados y grupos de música especializados.

Ya sea que desees una banda de jazz elegante para una recepción sofisticada, un DJ que haga que todos se levanten y bailen en una fiesta animada o un conjunto de música clásica para un ambiente refinado, tenemos la solución musical perfecta para tu evento.

Nos aseguramos de que la música se adapte a la temática y al ambiente general de tu evento. Trabajaremos contigo para entender tus preferencias y seleccionar el repertorio adecuado que elevará la atmósfera y mantendrá a tus invitados entretenidos y emocionados.

Además, nos encargamos de todos los aspectos técnicos relacionados con el sonido y la producción musical. Contamos con equipos de alta calidad que garantizan una calidad de sonido excepcional y una experiencia auditiva envolvente para todos los asistentes.

Si tienes necesidades especiales, como la incorporación de músicos adicionales, la creación de una lista de reproducción personalizada o la coordinación de actuaciones especiales, nuestro equipo estará encantado de ayudarte. Nos aseguraremos de que cada detalle musical esté cuidadosamente planificado y ejecutado para crear una experiencia musical inolvidable.

En resumen, en nuestra empresa de organización de eventos, la música es una parte integral de la experiencia. Desde la selección de artistas talentosos hasta la producción de sonido impecable, nos ocupamos de todo para que puedas disfrutar de un evento memorable y lleno de melodía.
    </p>
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
