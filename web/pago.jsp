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
        <s:iterator value="pago" var="p">
<<<<<<< HEAD
            Tarjeta de Crédito: <s:property value="#p.id.tarjetoCredito"/><br/>
=======
            Tarjeta de Crédito: <s:property value="#p.pagoPK.tarjetoCredito"/><br/>
>>>>>>> Juan
            Fecha de Caducidad: <s:property value="#p.caducidad"/><br/>
        </s:iterator>
        <s:form action="pago">
            <s:textfield name="pin" label="Número secreto"/><br/>
            <s:submit name="pagoTrigger" value="Pagar"/>
        </s:form>
    </body>
</html>
