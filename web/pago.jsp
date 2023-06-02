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
        <title>Registrarse - UParty</title>
    </head>
    <body>
        
        
         <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="pago" theme="simple">
            <h2>Pago</h2>
            
            <div class="inputbox">
                <ion-icon name="journal-outline"></ion-icon>
               
              <s:textfield name="tCredito"/>
            
            <label for=""><s:fielderror fieldName="tCredito"/> Tarjeta de Crédito</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-number-outline"></ion-icon>
               <s:textfield name="fechaC"/>
           
            <label for=""><s:fielderror fieldName="fechaC"/>Fecha de Caducidad:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetags-outline"></ion-icon>
               <s:textfield name="pin"/>
            
            <label for=""><s:fielderror fieldName="pin"/>Numero secreto:</label>
            </div>
           
           
            
            
            <s:submit cssClass="login"  name="pagoTrigger" value="Pagar"/>
           
        </s:form>
                    
                </div>
            </div>
            <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
            <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
        </section> 
    </body>
</html>
