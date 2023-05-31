<%-- 
    Document   : deporte
    Created on : Apr 30, 2023, 1:40:12 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--<link rel="stylesheet" href="crearEvnt.css">
        --><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Deportes</title>
    </head>
    <body>
        <h1>Deportes</h1>
        <s:form action="deporte">
            <s:iterator value="especializaciones" var="e">
                <details>
                    <summary>Deporte <s:property value="#e.nombre"/></summary>
                    <li>Cátering: <s:property value="#e.catering"/></li>
                    <li>Música: <s:property value="#e.musica"/></li>
                    <li>Decoración: <s:property value="#e.decoracion"/></li>
                    <li>Audiovisuales: <s:property value="#e.audiovisuales"/></li>
                    <li>Religión: <s:property value="#e.religion"/></li>
                    <li>Precio estándar: <s:property value="#e.precio"/></li>
                </details>
                <s:radio id="radio" name="elegirDeporte" list="#e.getNombre()"/>
            </s:iterator>
            <s:submit name="deporteTrigger" value="Especificar detalles"/>
        </s:form>
    </body>
</html>
