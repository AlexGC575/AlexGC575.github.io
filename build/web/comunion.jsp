<%-- 
    Document   : comunion
    Created on : Apr 29, 2023, 12:08:37 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!--<link rel="stylesheet" href="crearEvnt.css">
        --><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comuniones</title>
    </head>
    <body>
        <h1>Comuniones</h1>
        <s:form action="comunion">
            <s:iterator value="especializaciones" var="e">
                <details>
                    <summary>Comunion <s:property value="#e.nombre"/></summary>
                    <li>Cátering: <s:property value="#e.catering"/></li>
                    <li>Música: <s:property value="#e.musica"/></li>
                    <li>Decoración: <s:property value="#e.decoracion"/></li>
                    <li>Audiovisuales: <s:property value="#e.audiovisuales"/></li>
                    <li>Religión: <s:property value="#e.religion"/></li>
                    <li>Precio estándar: <s:property value="#e.precio"/></li>
                </details>
                <s:radio id="radio" name="elegirComunion" list="#e.getNombre()"/>
            </s:iterator>
            <s:submit name="comunionTrigger" value="Especificar detalles"/>
        </s:form>
    </body>
</html>
