<%-- 
    Document   : pago
    Created on : Apr 30, 2023, 1:17:02 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RedSys</title>
    </head>
    <body>
        <s:form action="pago">
            <s:textfield name="tCredito" label="Tarjeta de crédito"/><br/>
            <s:textfield name="fechaC" label="Fecha de caducidad"/><br/>
            <s:textfield name="pin" label="Número secreto"/><br/>
            <s:submit name="pagoTrigger" value="Pagar"/>
        </s:form>
    </body>
</html>
