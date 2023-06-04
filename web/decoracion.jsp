
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
	<title>Decoración para eventos</title>
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
		<h2>Decoración personalizada para eventos</h2>
		<p>En nuestra empresa ofrecemos un servicio de decoración completo para todo tipo de eventos. Desde bodas y cumpleaños hasta eventos corporativos y ferias, tenemos la decoración perfecta para tu ocasión especial.</p>
		<a href="main.jsp">Crea tu evento</a><br>
                
                <p style="background-color: black; border-radius:6px ">Nuestro equipo de empresas diseñadoras de eventos es apasionado y creativo, y se dedica a convertir tus ideas en realidades visuales impresionantes. Desde elegantes bodas hasta sofisticadas galas corporativas y eventos temáticos extravagantes, tenemos la experiencia y la visión para llevar tu evento al siguiente nivel.

Trabajaremos estrechamente contigo para comprender tus gustos, preferencias y objetivos para el evento. Ya sea que busques una estética clásica y atemporal, una ambientación moderna y vanguardista o un enfoque temático único, nos aseguraremos de capturar tu visión y plasmarla en cada detalle decorativo.

Nos enorgullece ofrecer una amplia gama de servicios de decoración que incluyen la selección de mobiliario elegante, la creación de arreglos florales deslumbrantes, la iluminación cautivadora, la instalación de cortinas y telas decorativas, y mucho más. Cada elemento se selecciona cuidadosamente para complementar la temática y crear una atmósfera envolvente que impresionará a tus invitados.

Además, nos mantenemos al tanto de las últimas tendencias y tecnologías en decoración de eventos para ofrecerte opciones innovadoras y sorprendentes. Ya sea que desees incorporar proyecciones audiovisuales, juegos de luces interactivos o elementos decorativos inusuales, estamos preparados para hacerlo realidad.

Nuestro objetivo es crear una experiencia visualmente impactante y cohesiva que refleje tu estilo y personalidad. Nos encargaremos de todos los aspectos logísticos, desde la planificación y la instalación hasta el desmontaje después del evento, para que puedas disfrutar de la belleza de tu evento sin preocupaciones.
                </p>
	</section>
	
		
	
</main>

<footer>
	<p>Derechos reservados &copy; 2023 Audiovisuales para eventos S.A.</p>
</footer>
         </div>
</body>
</html>