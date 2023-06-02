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
        <link rel="stylesheet" href="register.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detalles (nombre evento)</title>
    </head>

        
       <body>
        
     
         <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="detallesEvento" theme="simple">
            <h2>Detalles</h2>
            
            <div class="inputbox">
                <ion-icon name="business-outline"></ion-icon>
               
              <s:textfield name="lugar"/>
            
            <label for=""><s:fielderror fieldName="lugar"/> Lugar:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
               <s:textfield name="fecha"/>
           
            <label for=""><s:fielderror fieldName="fecha"/>Fecha:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="alarm-outline"></ion-icon>
               <s:textfield name="horaI"/>
            
            <label for=""><s:fielderror fieldName="horaI"/>Hora Inicio:</label>
            </div>
            <div class="inputbox">
                
                <ion-icon name="alarm-outline"></ion-icon>
                
                <s:textfield name="horaF"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="horaF"/>Hora Fin:</label>
            </div>
           
            <div class="inputbox">
                <ion-icon name="accessibility-outline"></ion-icon>
               <s:textfield name="patrocinador"/>
          
            <label for=""><s:fielderror fieldName="patrocinador"/>Patrocinador:</label>
            </div>
            <div class="inputbox">
                
                <ion-icon name="journal-outline"></ion-icon>
               <s:textfield name="precio"/>
            <ion-icon name="lock-closed-outline"></ion-icon>
             <label for=""><s:fielderror fieldName="precio"/>Precio:</label>
            </div>
            
            <s:submit cssClass="login" name="bodaTrigger" value="Especificar Detalles"/>
           
        </s:form>
                  
                </div>
            </div>
            <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
            <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
        </section> 
    </body>
    
</html>
