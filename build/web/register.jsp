<%-- 
    Document   : register
    Created on : 26-mar-2023, 19:45:56
    Author     : juanl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="register.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrarse - UParty</title>
    </head>
    <body>
        
        <s:if test="#session.Usuario != null">
            <s:action name="yaLog" executeResult="true"/>
        </s:if>
         <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="registerCheck" theme="simple">
                        <h2>Registarse</h2>
            
            <div class="inputbox">
                
                <ion-icon name="mail-outline"></ion-icon>
               
              <s:textfield name="email"/>
            
            <label for=""><s:fielderror fieldName="email"/> Email:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetag-outline"></ion-icon>
               <s:textfield name="nombre"/>
           
            <label for=""><s:fielderror fieldName="nombre"/>Nombre:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetags-outline"></ion-icon>
               <s:textfield name="apellidos"/>
            
            <label for=""><s:fielderror fieldName="apellidos"/>Apellidos:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="fecha"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="fecha"/>Fecha de nacimiento:</label>
            </div>
           
            <div class="inputbox">
                <ion-icon name="call-outline"></ion-icon>
               <s:textfield name="tlfn"/>
          
            <label for=""><s:fielderror fieldName="tlfn"/>Telefono:</label>
            </div>
            <div class="inputbox">
                
                <ion-icon name="lock-closed-outline"></ion-icon>
               <s:password name="passregister"/>
            <ion-icon name="lock-closed-outline"></ion-icon>
             <label for=""><s:fielderror fieldName="passregister"/>Contraseña:</label>
            </div>
            <div class="inputbox">
                
               
               <s:textfield name="numTarjeta"/>
            <ion-icon name="journal-outline"></ion-icon>
             <label for=""><s:fielderror fieldName="numTarjeta"/>Numero Tarjeta:</label>
            </div>
            <div class="inputbox">
                
                
               <s:textfield name="caducidad"/>
            <ion-icon name="calendar-number-outline"></ion-icon>
             <label for=""><s:fielderror fieldName="caducidad"/>Caducidad:</label>
            </div>
            
            <input class="login" type="submit" name="login" value="Registrarse">
           
        </s:form>
                    <div class="register">
                        <p>¿Ya tienes cuenta? <a href="login.jsp">Logueate</a></p>
                    </div>
                </div>
            </div>
            <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
            <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
        </section> 
    </body>
</html>
