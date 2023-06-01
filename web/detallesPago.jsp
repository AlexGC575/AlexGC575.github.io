<%-- 
    Document   : detallesPago
    Created on : Apr 30, 2023, 1:35:49 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalles pago</title>
    </head>
    <body>
        Generar pdf con detalles del evento
        <s:form action="pInicio">
            <s:submit name="inicioTrigger" value="Volver página inicio"/>
        </s:form>
    </body>
</html>