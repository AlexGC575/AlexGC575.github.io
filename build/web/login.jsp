<%-- 
    Document   : login.jsp
    Created on : 13-mar-2023, 18:37:17
    Author     : juanl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
        <link rel="stylesheet" href="style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login - Citas</title>
    </head>
    <body >
<<<<<<< Updated upstream
        <%
         if(session.getAttribute("usuario")==null){
        if(session.getAttribute("fallo")!=null){
            %>
            <%=session.getAttribute("fallo")%>
            <%
        }
        %>
        <section class="loginsec">
            <div class="form-box">
                <div class="form-value">
        <form action="VetServlet">
            <h2>Login</h2>
            <div class="inputbox">
                <ion-icon name="person-outline"></ion-icon>
               
            <input type="text" name="usuario" > 
            <label for="">Usuario:</label>
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
=======
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
>>>>>>> Stashed changes
                    <div class="register">
                        <p>¿No tienes cuenta? <a href="main.jsp">Registrate</a></p>
                    </div>
                </div>
            </div>
            <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
            <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
        </section> 
                
    <%
    }
else{
if(session.getAttribute("rol").equals("V")){
%>
<jsp:forward page="gestionCitas.jsp"></jsp:forward>
<%
}
else{
%>
<jsp:forward page="misCitas.jsp"></jsp:forward>
<%
}

<<<<<<< Updated upstream

}
    %>
</body></html>
=======
    </body></html>
>>>>>>> Stashed changes
