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
        <title>Gestion - UParty</title>
    </head>
    <body>
        
      
         <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="altaEmpresa" theme="simple">
                        <h2>Alta Empresa</h2>
            
            <div class="inputbox">
                
                <ion-icon name="mail-outline"></ion-icon>
               
              <s:textfield name="nombre"/>
            
            <label for=""><s:fielderror fieldName="nombre"/> Nombre:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetag-outline"></ion-icon>
               <s:textfield name="categoria"/>
           
            <label for=""><s:fielderror fieldName="categoria"/>Categoria:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetags-outline"></ion-icon>
               <s:textfield name="descripcion"/>
            
            <label for=""><s:fielderror fieldName="descripcion"/>Descripcion:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="val"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="val"/>Valoracion:</label>
            </div>
           
            
            <input class="login" type="submit" name="altaEmp" value="Crear">
           
        </s:form>
                    
                </div>
            </div>
          
        </section> 
        <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="borrarEmpresa" theme="simple">
                        <h2>Baja Empresa</h2>
            
            <div class="inputbox">
                
                <ion-icon name="mail-outline"></ion-icon>
               
              <s:textfield name="nombreb"/>
            
            <label for=""><s:fielderror fieldName="nombreb"/> Nombre:</label>
            </div>
          
           
            
            <input class="login" type="submit" name="altaEmp" value="Crear">
           
        </s:form>
                    
                </div>
            </div>
            
        </section> 
        <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="modEmpresa" theme="simple">
                        <h2>Modificación Empresa</h2>
            
            <div class="inputbox">
                
                <ion-icon name="mail-outline"></ion-icon>
               
              <s:textfield name="nombrem"/>
            
            <label for=""><s:fielderror fieldName="nombrem"/> Nombre:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetag-outline"></ion-icon>
               <s:textfield name="categoriam"/>
           
            <label for=""><s:fielderror fieldName="categoriam"/>Categoria:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetags-outline"></ion-icon>
               <s:textfield name="descripcionm"/>
            
            <label for=""><s:fielderror fieldName="descripcionm"/>Descripcion:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="valm"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="valm"/>Valoracion:</label>
            </div>
           
            
            <input class="login" type="submit" name="altaEmp" value="Modificar">
           
        </s:form>
                    
                </div>
            </div>
            <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
            <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
        </section>
            
    </body>
</html>
