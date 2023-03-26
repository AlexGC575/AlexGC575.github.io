<%-- 
    Document   : register
    Created on : 26-mar-2023, 19:45:56
    Author     : juanl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="register.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <section>
            <div class="form-box">
                <div class="form-value">
        <form action="VetServlet">
            <h2>Registrarse</h2>
            
            <div class="inputbox">
                <ion-icon name="mail-outline"></ion-icon>
               
            <input type="text" name="email" > 
            <label for="">Email:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetag-outline"></ion-icon>
               
            <input type="text" name="nombre" > 
            <label for="">Nombre:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetags-outline"></ion-icon>
               
            <input type="text" name="apellidos" > 
            <label for="">Apellidos:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
               
            <input type="date" name="fecha" value="" > 
            <label for="">Fecha de nacimiento:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="call-outline"></ion-icon>
               
            <input type="text" name="tlfn" > 
            <label for="">Telefono:</label>
            </div>
            <div class="inputbox">
                
                <ion-icon name="lock-closed-outline"></ion-icon>
               
            <input  type="password" name="password">
            <ion-icon name="lock-closed-outline"></ion-icon>
             <label for="">Contraseña:</label>
            </div>
            <input type="hidden" name="accion" value="Log in">
            <input class="login" type="submit" name="login" value="Login">
           
        </form>
                    <div class="register">
                        <p>¿No tienes cuenta? <a href="#">Registrate</a></p>
                    </div>
                </div>
            </div>
            <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
            <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
        </section> 
    </body>
</html>
