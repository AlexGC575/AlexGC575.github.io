<%-- 
    Document   : boda
    Created on : Apr 29, 2023, 10:27:39 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="eventos.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bodas</title>
    </head>
    <body>
        <div class="tabla">
     
             
        <s:form action="boda">
            <h2>Bodas</h2>
            <s:iterator value="especializaciones" var="e">
            
                <details class="styled">
                   
                    <summary>Boda <s:property value="#e.nombre"/></summary>
                    <div >
                    <li>Cátering: <s:property value="#e.catering"/></li>
                    <li>Música: <s:property value="#e.musica"/></li>
                    <li>Decoración: <s:property value="#e.decoracion"/></li>
                    <li>Audiovisuales: <s:property value="#e.audiovisuales"/></li>
                    <li>Religión: <s:property value="#e.religion"/></li>
                    <li>Precio estándar: <s:property value="#e.precio"/></li>
                    </div>
                </details>
              
                
                <s:radio id="radio" name="elegirBoda" list="#e.getNombre()"/>
            </s:iterator>
            <s:submit cssClass="login" name="bodaTrigger" value="Especificar detalles"/>
        </s:form>
        

    </div>
    </body>
</html>
