<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Organización de eventos</title>
</head>
<body>
	<header >
		Welcome, <s:property value="#session.username"/>
                <s:if test="%{#session['username']!=null">
                        This is String 1
                    </s:if>
		<nav class="naveg">
                    <h1 class="logo">U<span>party</span> </h1>
			<ul class="navbar">
				<li><a href="#eventos">Eventos</a></li>
				<li><a href="#decoracion">Decoración</a></li>
				<li><a href="#musica">Música</a></li>
				<li><a href="#catering">Catering</a></li>
				<li><a href="#audiovisuales">Audiovisuales</a></li>
				<li><a href="#empresas">Empresas</a></li>
			</ul>
		</nav>
	</header>

    <main>
	<section  class="banner" id="banner">
		<h2>Bienvenidos a nuestra web de organización de eventos</h2>
		<p>Somos una empresa especializada en la organización de eventos para todo tipo de ocasiones. Desde bodas y cumpleaños hasta eventos corporativos y ferias, estamos aquí para ayudarte a hacer que tu evento sea un éxito.</p>
		<a href="#contacto">Contáctanos</a>
	</section>
	<div class="princ">
	
            <h2 class="menu">Menú principal</h2>
            <div class="princbox">
                <section id="evento">
		<h3>Eventos</h3>
		<p>En esta sección encontrarás información sobre nuestros servicios de organización de eventos.</p>
		<a href="#contacto">Contáctanos</a>
                </section>
	
	
	<section id="decoracion">
		<h3>Decoración</h3>
		<p>En esta sección encontrarás información sobre nuestros servicios de decoración para eventos.</p>
		<a href="#contacto">Contáctanos</a>
	</section>
	
	<section id="musica">
		<h3>Música</h3>
		<p>En esta sección encontrarás información sobre nuestros servicios de música para eventos.</p>
		<a href="#contacto">Contáctanos</a>
	</section>
	
	<section id="catering">
		<h3>Catering</h3>
		<p>En esta sección encontrarás información sobre nuestros servicios de catering para eventos.</p>
		<a href="#contacto">Contáctanos</a>
	</section>
	
	<section id="audiovisuales">
		<h3>Audiovisual</h3>
		<p>En esta sección encontrarás información sobre nuestros servicios de audiovisuales para eventos.</p>
		<a href="#contacto">Contáctanos</a>
	</section>

	
	<section id="empresas">
		<h3>Empresas</h3>
		<p>En esta sección encontrarás información sobre nuestros servicios de organización de eventos para empresas.</p>
		<a href="#contacto">Contáctanos</a>
	</section>
	</div>
        </div>
        <footer>
	<section id="contacto">
            <div class="form-box">
                <div class="form-value">
		<form>
                    <h2>Contacto</h2>
		<div class="inputbox">
			
			<input type="text" id="nombre" name="nombre">
                        <label for="nombre">Nombre:</label>
                </div>
                <div class="inputbox">
			
			<input type="email" id="email" name="email">
                        <label for="email">Email:</label>
                </div>
                <div class="inputbox">
                       
                        <input type="text" id="mensaje" name="mensaje">
                        <label for="mensaje">Mensaje:</label>
                </div>
            </form>
                </div>
            </div>
        </section>
        </footer>
    </main>
    </body>
</html>