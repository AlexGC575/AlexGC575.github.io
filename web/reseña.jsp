<%-- 
    Document   : reseña
    Created on : 03-jun-2023, 17:44:17
    Author     : Victor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%

    if (session.getAttribute("Usuario") == null) {
        response.sendRedirect("login.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
    
        <link rel="stylesheet" href="register.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reseña</title>
    </head>
    <body>
       
  
             
        
             <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="crearResenya" theme="simple">
                        <h2>Alta Reseña <s:property value="evento"/></h2>
            
            <div class="inputbox">
                
                <ion-icon name="mail-outline"></ion-icon>
               
              <s:textfield name="calificacion"/>
            
            <label for=""><s:fielderror fieldName="calificacion"/> Calificacion:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetag-outline"></ion-icon>
               <s:textfield name="titulo"/>
           
            <label for=""><s:fielderror fieldName="titulo"/>Titulo:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetags-outline"></ion-icon>
               <s:textfield name="opinion"/>
            
            <label for=""><s:fielderror fieldName="opinion"/>Opinion:</label>
            </div>
            <s:hidden name="evento" value="%{evento}"/>
                    <s:hidden name="usuario" value="%{#session.Usuario}"/>
           
            
            <s:submit cssClass="login"  name="altaEmp" value="Publicar"/>
           
        </s:form>
                    
                </div>
            </div>
          
        </section> 
    </body>
</html>