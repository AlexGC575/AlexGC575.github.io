<%-- 
    Document   : miEvento
    Created on : Apr 29, 2023, 10:27:54 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<script src="jquery-1.12.4.min.js" type="text/javascript"></script>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="eventos.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Evento Personalizado</title>
        <script>
    function checkPrice() {
                var p = Math.round(Math.random()*2000+500);

                document.getElementById("precio").textContent="Precio: "+p;                     
            }
</script>
    </head>
    <body>
        
        <div class="eventos">
            
        <s:form action="eventoP" theme="simple">
            <div class="eventos">
                <h2>Evento</h2>
      <table class="tablaEmp">

        <tr class="encabezado"><th></th><th></th></tr>
            <tr><td>Evento</td><td><s:select name="eventos" id="eventos" list="%{tipos}" onchange="checkPrice()"/></td></tr>
               <tr><td>Catering</td><td><s:select name="eCat" id="eCat" list="%{empresasC.{nombre}}" onchange="checkPrice()"/></td></tr>
               <tr><td>Musica</td><td><s:select name="eMus" id="eMus" list="%{empresasM.{nombre}}" onchange="checkPrice()"/></td></tr>
               <tr><td>Decoracion</td><td><s:select name="eDec" id="eDec" list="%{empresasD.{nombre}}" onchange="checkPrice()"/></td></tr>
               <tr><td>audiovisuales</td><td><s:select name="eAud" id="eAud" list="%{empresasA.{nombre}}" onchange="checkPrice()"/></td></tr>
                <tr><td><s:property value="%{precio}"/></td></tr>
                </table>
        </div>
                <s:hidden name="precio" value="%{precio}"/>
                <s:submit cssClass="login" cssStyle="margin: auto;" name="eventoPTrigger" value="Especificar detalles"/>
        </s:form>
        </div>
        
    </body>
</div>
</html>
