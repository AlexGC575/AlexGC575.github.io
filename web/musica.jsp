

<%-- 
    Document   : audiovisuales
    Created on : Mar 26, 2023, 9:06:19 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Música para eventos</title>
</head>
<body>
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
				<s:form action="consultarEmpresas" theme="simple" >
                                <s:submit cssClass="login" name="irEmpresa" value="Empresas"/>
                            </s:form>
                                
                                <s:if test="#session.Usuario!=null">         
                                <s:form action="irPerfil" theme="simple" >
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
	<section class="banner" id="banner">
		<h2>Servicio de música para eventos</h2>
		<p>En nuestra empresa ofrecemos un servicio de música completo para todo tipo de eventos. Desde bodas y cumpleaños hasta eventos corporativos y ferias, tenemos el artista perfecto para tu ocasión especial.</p>
		<a href="main.jsp">Crea tu evento</a><br>
                <p style="background-color: black; border-radius:6px ">Contamos con una amplia variedad de opciones musicales para adaptarnos a todos los estilos y gustos. Nuestro talentoso equipo de músicos y artistas está formado por profesionales apasionados que dominan diversos géneros, desde bandas en vivo y solistas hasta DJ experimentados y grupos de música especializados.

Ya sea que desees una banda de jazz elegante para una recepción sofisticada, un DJ que haga que todos se levanten y bailen en una fiesta animada o un conjunto de música clásica para un ambiente refinado, tenemos la solución musical perfecta para tu evento.

Nos aseguramos de que la música se adapte a la temática y al ambiente general de tu evento. Trabajaremos contigo para entender tus preferencias y seleccionar el repertorio adecuado que elevará la atmósfera y mantendrá a tus invitados entretenidos y emocionados.

Además, nos encargamos de todos los aspectos técnicos relacionados con el sonido y la producción musical. Contamos con equipos de alta calidad que garantizan una calidad de sonido excepcional y una experiencia auditiva envolvente para todos los asistentes.

Si tienes necesidades especiales, como la incorporación de músicos adicionales, la creación de una lista de reproducción personalizada o la coordinación de actuaciones especiales, nuestro equipo estará encantado de ayudarte. Nos aseguraremos de que cada detalle musical esté cuidadosamente planificado y ejecutado para crear una experiencia musical inolvidable.

En resumen, en nuestra empresa de organización de eventos, la música es una parte integral de la experiencia. Desde la selección de artistas talentosos hasta la producción de sonido impecable, nos ocupamos de todo para que puedas disfrutar de un evento memorable y lleno de melodía.
   </p>
	</section>
	
		
	
</main>

<footer>
	<p>Derechos reservados &copy; 2023 Audiovisuales para eventos S.A.</p>
</footer>
         </div>
</body>
</html>