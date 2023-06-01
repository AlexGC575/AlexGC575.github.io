<%-- 
    Document   : bautizo
    Created on : Apr 29, 2023, 12:09:28 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <!--<link rel="stylesheet" href="crearEvnt.css">
        --><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bautizos</title>
    </head>
    <body>
        <h1>Bautizos</h1>
        <s:form action="bautizo">
            <s:iterator value="especializaciones" var="e">
                <details>
                    <summary>Bautizo <s:property value="#e.nombre"/></summary>
                    <li>Cátering: <s:property value="#e.catering"/></li>
                    <li>Música: <s:property value="#e.musica"/></li>
                    <li>Decoración: <s:property value="#e.decoracion"/></li>
                    <li>Audiovisuales: <s:property value="#e.audiovisuales"/></li>
                    <li>Religión: <s:property value="#e.religion"/></li>
                    <li>Precio estándar: <s:property value="#e.precio"/></li>
                </details>
                <s:radio id="radio" name="elegirBautizo" list="#e.getNombre()"/>
            </s:iterator>
            <s:submit name="bautizoTrigger" value="Especificar detalles"/>
        </s:form>
    </body>
</html>
