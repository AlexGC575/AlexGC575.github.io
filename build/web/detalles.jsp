<%-- 
    Document   : patrocinador
    Created on : Apr 30, 2023, 12:24:27 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>        
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="eventos.css"/>
        <link rel="stylesheet" href="style.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalles (nombre evento)</title>
        <script src="jquery-1.12.4.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            <s:property value="%{especializacion}"/>;
            function checkPlace() {
                var lugar = document.getElementById("lugar").value;
                var list = [];
            <s:iterator value="lugares" var="l">
                list.push("<s:property value="#l.nombre"/>");
            </s:iterator>
                if (lugar !== '') {
                    for (var i = 0; i < list.length; i++) {
                        document.getElementById("elegirLugar").setAttribute('disabled', true);
                    }
                } else {
                    for (var i = 0; i < list.length; i++) {
                        document.getElementById("elegirLugar").removeAttribute('disabled');
                    }
                }
            }
            function checkPatron() {
            <s:iterator value="patrocinadores" var="p">
                if (document.getElementById("inv").value >= <s:property value="#p.NInvitados"/>) {
                        document.getElementById("radio2" + "<s:property value="#p.nombre"/>").removeAttribute('disabled');
                } else {
                        document.getElementById("radio2" + "<s:property value="#p.nombre"/>").setAttribute('disabled', true);
                }
            </s:iterator>
            }
            function checkPrice() {
                document.getElementById("precio").textContent="<s:property value="especializacion.precio"/>";
                var radio;
                <s:iterator value="patrocinadores" var="p">
                    if(document.getElementById("radio2" + "<s:property value="#p.nombre"/>").checked){
                        radio=document.getElementById("radio2" + "<s:property value="#p.nombre"/>").value;
                    }
                </s:iterator> 
                var p = document.getElementById("precio").textContent;
                if (radio !== ""){
                    <s:iterator value="patrocinadores" var="p">
                    if("<s:property value="#p.nombre"/>" === radio){
                        p = p - (p*"<s:property value="#p.descuento"/>"/100);
                    }
                    </s:iterator>   
                    document.getElementById("precio").textContent=p;          
                }            
            }

        </script>
    </head>
    <body>
       		<div class="eventos">
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
<div class="tabla">
            <s:form action="detallesEvento" theme="simple" >
            <h3>Lugares</h3>
            <s:iterator value="lugares" var="l">
                <details class="styled">
                    <summary><s:property value="#l.nombre"/></summary>
                    <div >
                    <li>Provincia: <s:property value="#l.provincia"/></li>
                    <li>Código Postal: <s:property value="#l.codigoPostal"/></li>
                    <li>Calle: <s:property value="#l.calle"/></li>
                    <li>Número: <s:property value="#l.numero"/></li>
                    <li>Aforo: <s:property value="#l.aforo"/></li>
                    </div>
                </details>
            </s:iterator> 
            <s:select name="elegirLugar" id="elegirLugar" list="%{lugares.{nombre}}"/>
            <p>Si no le convence ninguno de nuestros sitios reservados introduzca el suyo propio.</p>
            <p style="color:white">Lugar <s:textfield id="lugar" name="lugar"  onchange='checkPlace()'/></p><br/>
            <p style="color:white">Fecha <s:textfield name="fecha" /></p><br/>
            <p style="color:white">Hora Inicio: <s:textfield name="horaI" /></p><br/>
            <p style="color:white">Hora Final:<s:textfield name="horaF"/></p><br/>

          <p style="color:white;margin-top: 6px;">Invitados:<s:textfield  id="inv" name="invitados" onchange='checkPatron()'/></p><br/>
           
            <s:iterator value="patrocinadores" var="p">
                <details class="styled">
                    <summary><s:property value="#p.nombre"/></summary>
                    <div >
                    <li>Descuento: <s:property value="#p.descuento"/>%</li>
                    <li>Invitados necesarios: <s:property value="#p.NInvitados"/></li>
                    <li>Email: <s:property value="#p.email"/></li>
                    </div >
                </details>
                <s:radio id="radio2" name="elegirPatrocinador" list="#p.getNombre()" disabled="true" onclick="checkPrice()"/>
            </s:iterator> 
            
         <s:hidden name="espT" value="%{especializacion.tipo.nombre}"/>
            <s:hidden name="espA" value="%{especializacion.audiovisuales}"/>
            <s:hidden name="espC" value="%{especializacion.catering}"/>
            <s:hidden name="espM" value="%{especializacion.musica}"/>
            <s:hidden name="espD" value="%{especializacion.decoracion}"/>
            <s:hidden name="session" value="%{#session.Usuario}"/>
            
            <s:hidden name="precio" value="%{especializacion.precio}"/>
            
            <p>Precio: <s:property value="%{especializacion.precio}"/></p><br/>
            <s:submit cssClass="login" name="bodaTrigger" value="Confirmar evento"/>
       
</div></s:form>
                    <p style="color:white">Se le enviará un correo a: <s:property value="#evento.usuario.email"/> para que indique los invitados de la fiesta.</p>
           
            <footer>
	<p>Derechos reservados &copy; 2023 Uparty</p>
</footer>
                </div>
    </body>
</html>
