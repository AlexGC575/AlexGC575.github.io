<%-- 
    Document   : creadorEvento
    Created on : Apr 28, 2023, 8:20:00 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="img.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuestros eventos</title>
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
                        <li><a href="empresas.jsp">Empresas</a></li>
                            <s:form action="irPerfil" theme="simple" >
                                <s:submit cssClass="login" name="irperfil" value="Ver Perfil"/>
                            </s:form>
                    </ul>
                </nav>
            </header>

            <h1>Seleccione el tipo de evento que quiere organizar</h1>

            <div class="wrap">

                <s:form action="elegirEvento">
                    <div id="container">
                        <div class="container">
                            <div class="carrusel">
                                <img id="boda" src="https://th.bing.com/th/id/R.388f33829746d29257852592588c40cb?rik=KkSilhM%2f9lkqbw&pid=ImgRaw&r=0" alt="Boda"/>


                                <img src="https://th.bing.com/th/id/OIP.nxdQ7qTcOBii-ZVmdNAaeQHaHa?pid=ImgDet&rs=1" alt="Cumpleaños"/>

                                <img src="https://joyeriacoral.com/wp-content/uploads/2020/10/madrina-bautizo.jpg" alt="Bautizo"/>
                                <img src="https://th.bing.com/th/id/R.abe2cf155f5d1e89fc4fa7d08b7251b0?rik=Tz8ChYr9dFYFTQ&pid=ImgRaw&r=0" alt="Cine"/>
                                <img src="https://th.bing.com/th/id/R.17764304cf7ef9020b506960d52d2471?rik=NQouPpwX1%2bVVOA&pid=ImgRaw&r=0" alt="Concierto"/>
                                <img src="https://th.bing.com/th/id/R.3064c3f795b378b33beb49aa040ee811?rik=rFC7CTBH5IR98Q&pid=ImgRaw&r=0" alt="Circo"/>
                                <img src="https://th.bing.com/th/id/R.a35128bc7c14ee1f6e1914eb2aa48d15?rik=pyg1cXZSmOiIWA&pid=ImgRaw&r=0" alt="Fiesta"/>
                                <img src="https://img.europapress.es/fotoweb/fotonoticia_20200826101834_1024.jpg" alt="Deporte"/>
                            </div>
                        </div>
                    </div>

                    <div id="pers">
                        <s:radio id="radio" name="elegirEvento" list="tipos" theme="simple" />
                    </div>

                    <s:submit cssClass="login" name="elegitEvntTrigger" value="Ver evento"/>
                </div>

            </s:form>


            <h2>Si no encuentra lo que busca...</h2>
            <div id="pers">
                <s:form action="crearEvento">
                    <s:submit cssClass="login" name="crearEvntTrigger" value="Personalizar"/>
                </s:form>
            </div>
        </div>

    </body>
</html>