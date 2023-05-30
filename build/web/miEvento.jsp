<%-- 
    Document   : miEvento
    Created on : Apr 29, 2023, 10:27:54 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="eventoOriginal">
            <s:submit name="eventoOriginalTrigger" value="Especificar detalles"/>
        </s:form>
    </body>
</html>
