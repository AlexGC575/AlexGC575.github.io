<%-- 
    Document   : catering
    Created on : Mar 26, 2023, 9:05:17 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Catering para eventos</title>
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
                </form>
            </section>
    </body>
</html>
