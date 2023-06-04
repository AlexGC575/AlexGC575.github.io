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
        <link rel="stylesheet" href="register.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RedSys</title>
    </head>
    <body>
        <section>
            <div class="form-box">
                <div class="form-value">
                    <table  style="color:white; boder: 3px solid white;">
        <s:iterator value="pago" var="p">
            <tr>
                <td>Tarjeta de Crédito</td><td><s:property value="#p.pagoPK.tarjetoCredito"/></td>
            </tr>
               <tr>
                <td>Fecha de Caducidad</td><td><s:property value="#p.caducidad"/></td>
            </tr> 
   
        </s:iterator>
                    </table>
            <div class="form-box">
                <div class="form-value">
                    
        <s:form action="pago" theme="simple">
            <div class="inputbox">
                <ion-icon name="pricetags-outline"></ion-icon>
               <s:textfield name="pin"/>
            
            <label for=""><s:fielderror fieldName="pin"/>Numero secreto:</label>
            </div>
            <s:submit cssClass="login"  name="pagoTrigger" value="Pagar"/>
        </s:form>
                </div>
            </div>
            
        </section>
    </body>
</html>
