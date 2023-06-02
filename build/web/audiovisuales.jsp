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
	<header >
		
		<nav class="naveg">
                    <h1 class="logo">U<span>party</span> </h1>
			<ul class="navbar">
				<li><a href="/eventos.jsp">Eventos</a></li>
				<li><a href="/decoracion.jsp">Decoración</a></li>
				<li><a href="/musica.jsp">Música</a></li>
				<li><a href="catering.jsp">Catering</a></li>
				<li><a href="/audiovisuales.jsp">Audiovisuales</a></li>
				<li><a href="/empresas.jsp">Empresas</a></li>
                                 <%= session.getAttribute("Usuario") %>
<s:form action="unlog" theme="simple" >
                                <s:submit cssClass="login" name="unlog" value="Cerrar Sesion"/>
                                </s:form>
			</ul>
		</nav>
	</header>
<main>
	<section id="banner">
		<h2>Servicio de audiovisuales para eventos</h2>
		<p>En nuestra empresa ofrecemos un servicio de audiovisuales completo para todo tipo de eventos. Desde conferencias y presentaciones hasta conciertos y espectáculos, contamos con el equipo técnico y humano para hacer de tu evento un éxito.</p>
		<a href="#contacto">Solicita información</a>
	</section>
	
	Nuestro equipo de empresas profesionales en tecnología audiovisual está altamente capacitado y cuenta con una amplia experiencia en la industria. Trabajaremos estrechamente contigo para comprender tus necesidades y objetivos, y diseñaremos una solución audiovisual personalizada que se adapte perfectamente a tu evento.

Desde pantallas LED de alta definición y sistemas de sonido envolvente hasta iluminación espectacular y proyecciones audiovisuales impactantes, ofrecemos una amplia gama de equipos y servicios para cubrir todos los aspectos audiovisuales de tu evento. Nos aseguraremos de que cada detalle técnico esté cuidadosamente planificado y ejecutado, garantizando una calidad de sonido e imagen excepcionales.

Además, nuestro equipo técnico estará presente durante todo el evento para supervisar la configuración y asegurarse de que todo funcione sin problemas. Ya sea que necesites transmitir presentaciones, reproducir videos, coordinar efectos especiales o crear ambientes de iluminación impresionantes, nos encargaremos de que todo salga a la perfección.

Nuestra pasión por la innovación y la tecnología nos impulsa a estar al tanto de las últimas tendencias y avances en la industria audiovisual. Esto nos permite ofrecerte opciones vanguardistas y creativas, como mapping 3D, realidad virtual, sistemas interactivos y mucho más, para hacer de tu evento una experiencia verdaderamente única.

En  Uparty, entendemos la importancia de la puntualidad y la confiabilidad. Nos aseguraremos de que todos los equipos estén instalados y funcionando correctamente antes del inicio de tu evento, y nos mantendremos disponibles para brindar asistencia técnica en todo momento.
	
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