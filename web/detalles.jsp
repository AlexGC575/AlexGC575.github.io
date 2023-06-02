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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalles (nombre evento)</title>
        <script src="jquery-1.12.4.min.js" type="text/javascript"></script>
        <script type="text/javascript">
            function checkPlace() {
                var lugar = document.getElementById("lugar").value;
                var list = [];
            <s:iterator value="lugares" var="l">
                list.push("<s:property value="#l.nombre"/>");
            </s:iterator>
                if (lugar !== '') {
                    for (var i = 0; i < list.length; i++) {
                        document.getElementById("radio" + list[i]).setAttribute('disabled', true);
                    }
                } else {
                    for (var i = 0; i < list.length; i++) {
                        document.getElementById("radio" + list[i]).removeAttribute('disabled');
                    }
                }
            }
            function checkPatron() {
            <s:iterator value="patrocinadores" var="p">
                if (document.getElementById("inv").value >= <s:property value="#p.ninvitados"/>) {
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
        <header>

            <nav class="naveg">
                <h1 class="logo">U<span>party</span> </h1>
                <ul class="navbar">
                    <li><a href="#eventos">Eventos</a></li>
                    <li><a href="#decoracion">Decoración</a></li>
                    <li><a href="#musica">Música</a></li>
                    <li><a href="#catering">Catering</a></li>
                    <li><a href="#audiovisuales">Audiovisuales</a></li>
                    <li><a href="#empresas">Empresas</a></li>
                        <s:form action="unlog" theme="simple" >
                            <s:submit cssClass="login" name="unlog" value="Cerrar Sesion"/>
                        </s:form>
                </ul>
            </nav>
        </header>

        <s:form>
            <h3>Lugares</h3>
            <s:iterator value="lugares" var="l">
                <details>
                    <summary><s:property value="#l.nombre"/></summary>
                    <li>Provincia: <s:property value="#l.provincia"/></li>
                    <li>Código Postal: <s:property value="#l.codigoPostal"/></li>
                    <li>Calle: <s:property value="#l.calle"/></li>
                    <li>Número: <s:property value="#l.numero"/></li>
                    <li>Aforo: <s:property value="#l.aforo"/></li>
                </details>
                <s:radio id="radio" name="elegirLugar" list="#l.getNombre()"/>
            </s:iterator> 
            Si no le convence ninguno de nuestros sitios reservados introduzca el suyo propio.
            <s:textfield id="lugar" name="lugar" label="Lugar" onchange='checkPlace()'/><br/>
            <s:textfield name="fecha" label="Fecha"/><br/>
            <s:textfield name="horaI" label="Hora inicio"/><br/>
            <s:textfield name="horaF" label="Hora fin"/><br/>
            </s:form>
            
            <s:form action="detallesEvento">
            <s:textfield id="inv" name="inv" label="Número de invitados" onchange='checkPatron()'/><br/>
            <s:iterator value="patrocinadores" var="p">
                <details>
                    <summary><s:property value="#p.nombre"/></summary>
                    <li>Descuento: <s:property value="#p.descuento"/>%</li>
                    <li>Invitados necesarios: <s:property value="#p.ninvitados"/></li>
                    <li>Email: <s:property value="#p.email"/></li>
                </details>
                <s:radio id="radio2" name="elegirPatrocinador" list="#p.getNombre()" disabled="true" onclick="checkPrice()"/>
            </s:iterator> 
            <s:hidden name="especializacion" value="%{especializacion.nombre}"/>
            <s:hidden name="session" value="%{#session.Usuario}"/>
            <s:label name="precio" id="precio" label="Precio final" value="%{especializacion.precio}"/><br/>
            <s:submit name="bodaTrigger" value="Confirmar evento"/>
        </s:form>
    </body>
</html>
