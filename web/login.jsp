<%-- 
    Document   : login.jsp
    Created on : 13-mar-2023, 18:37:17
    Author     : juanl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html><head>
        <link rel="stylesheet" href="style.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login - UParty</title>
    </head>
    <body >
        <s:if test="#session.Usuario != null">
            <s:action name="yaLog" executeResult="true"/>
            
        </s:if>
        <section class="loginsec">
            <div class="form-box">
                <div class="form-value">
                    <s:form action="loginCheck" theme="simple" validate="false">
            <h2>Login</h2>
            <div class="inputbox">
                <ion-icon name="person-outline"></ion-icon>
               
           <s:textfield name="usuario"/>
           
            <label for=""><s:fielderror fieldName="usuario"/> Usuario: </label>
            
            </div>
            <div class="inputbox">
                <ion-icon name="lock-closed-outline"></ion-icon>
               
           <s:password name="password"  />
            <ion-icon name="lock-closed-outline"></ion-icon>
             <label for=""><s:fielderror fieldName="password"/>Contraseña: </label>
             
            </div>
             <s:submit cssClass="login" name="login" value="Login"/>
         
           
        </s:form>
                    <div class="register">
                        <p>¿No tienes cuenta? <a href="register.jsp">Registrate</a></p>
                    </div>
                </div>
            </div>
            <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
            <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
        </section> 

</body></html>
