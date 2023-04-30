<%-- 
    Document   : patrocinador
    Created on : Apr 30, 2023, 12:24:27 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalles (nombre evento)</title>
    </head>
    <body>
        <s:form action="detallesEvento">
            <s:textfield name="lugar" label="Lugar"/><br/>Lista de lugares y si no introduzca su propia direccion
            <s:textfield name="fecha" label="Fecha"/><br/>
            <s:textfield name="horaI" label="Hora inicio"/><br/>
            <s:textfield name="horaF" label="Hora fin"/><br/>
            <s:textfield name="patrocinador" label="Patrocinador"/><br/>
            <s:textfield name="precio" label="Precio final"/><br/>
            <s:submit name="bodaTrigger" value="Especificar detalles"/>
        </s:form>
    </body>
</html>
