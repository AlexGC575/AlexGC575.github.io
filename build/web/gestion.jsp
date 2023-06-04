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
           
            
            <s:submit cssClass="login"  name="altaEmp" value="Crear"/>
           
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
          
           
            
            <s:submit cssClass="login"  name="borEmp" value="Borrar"/>
           
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
           
            
            <s:submit cssClass="login"  name="modEmp" value="Modificar"/>
           
        </s:form>
                    
                </div>
            </div>
            <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
            <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
        </section>
            <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="modificarUser" theme="simple">
                        <h2>Modificar Usuario</h2>
            
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
            
             <s:submit cssClass="login"  name="login" value="Modificar"/>
           
        </s:form>
                   
                </div>
            </div>
            
        </section> 
          <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="borrarUser" theme="simple">
                        <h2>Baja Usuario</h2>
            
            <div class="inputbox">
                
                <ion-icon name="mail-outline"></ion-icon>
               
              <s:textfield name="email"/>
            
            <label for=""><s:fielderror fieldName="email"/> Email:</label>
            </div>
            <s:hidden name="nombre" value="a"/>
            <s:hidden name="apellidos" value="a"/>
            <s:hidden name="fecha" value="12/12/2002"/>
            <s:hidden name="tlfn" value="111111"/>
            <s:hidden name="passregister" value="aaaaaa"/>
            <s:hidden name="numTarjeta" value="1222345567899"/>
            <s:hidden name="caducidad" value="12/12/2002"/>
           
            
            <s:submit cssClass="login"  name="borUser" value="Borrar"/>
           
        </s:form>
                    
                </div>
            </div>
            
        </section> 
        <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="altaLugar" theme="simple">
                        <h2>Alta Lugar</h2>
            
            <div class="inputbox">
                
                <ion-icon name="mail-outline"></ion-icon>
               
              <s:textfield name="nombre"/>
            
            <label for=""><s:fielderror fieldName="nombre"/> Nombre:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetag-outline"></ion-icon>
               <s:textfield name="provincia"/>
           
            <label for=""><s:fielderror fieldName="Provincia"/>Provincia</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetags-outline"></ion-icon>
               <s:textfield name="codigoPostal"/>
            
            <label for=""><s:fielderror fieldName="codigoPostal"/>Codigo Postal</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="calle"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="calle"/>Calle</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="numero"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="numero"/>numero</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="aforo"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="aforo"/>Aforo:</label>
            </div>
           
            
            <s:submit cssClass="login"  name="altaEmp" value="Crear"/>
           
        </s:form>
                    
                </div>
            </div>
          
        </section> 
        <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="borrarLugar" theme="simple">
                        <h2>Baja Lugar</h2>
            
            <div class="inputbox">
                
                <ion-icon name="mail-outline"></ion-icon>
               
              <s:textfield name="nombreb"/>
            
            <label for=""><s:fielderror fieldName="nombreb"/> Nombre:</label>
            </div>
          
           
            
            <s:submit cssClass="login"  name="borEmp" value="Borrar"/>
           
        </s:form>
                    
                </div>
            </div>
            
        </section> 
        <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="modificarLugar" theme="simple">
                        <h2>Modificacion Lugar</h2>
            
            <div class="inputbox">
                
                <ion-icon name="mail-outline"></ion-icon>
               
              <s:textfield name="nombrem"/>
            
            <label for=""><s:fielderror fieldName="nombrem"/> Nombre:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetag-outline"></ion-icon>
               <s:textfield name="provinciam"/>
           
            <label for=""><s:fielderror fieldName="provinciam"/>Provincia</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetags-outline"></ion-icon>
               <s:textfield name="codigoPostalm"/>
            
            <label for=""><s:fielderror fieldName="codigoPostalm"/>Codigo Postal</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="callem"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="callem"/>Calle</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="numerom"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="numerom"/>numero</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="aforom"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="aforom"/>Aforo:</label>
            </div>
           
            
            <s:submit cssClass="login"  name="altaEmp" value="Modificar"/>
           
        </s:form>
                    
                </div>
            </div>
          
        </section>
        <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="altaPatrocinador" theme="simple">
                        <h2>Alta Patrocinador</h2>
            
            <div class="inputbox">
                
                <ion-icon name="mail-outline"></ion-icon>
               
              <s:textfield name="nombre"/>
            
            <label for=""><s:fielderror fieldName="nombre"/> Nombre:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetag-outline"></ion-icon>
               <s:textfield name="descripcion"/>
           
            <label for=""><s:fielderror fieldName="descripcion"/>Descripcion:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetags-outline"></ion-icon>
               <s:textfield name="nInvitados"/>
            
            <label for=""><s:fielderror fieldName="nInvitados"/>N Invitados:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="descuento"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="descuento"/>Descuento:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="tlfn"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="tlfn"/>Telefono</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="email"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="email"/>Email</label>
            </div>
           
            
            <s:submit cssClass="login"  name="altaEmp" value="Crear"/>
           
        </s:form>
                    
                </div>
            </div>
          
        </section> 
        <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="borrarPatrocinador" theme="simple">
                        <h2>Baja Patrocinador</h2>
            
            <div class="inputbox">
                
                <ion-icon name="mail-outline"></ion-icon>
               
              <s:textfield name="nombreb"/>
            
            <label for=""><s:fielderror fieldName="nombreb"/> Nombre:</label>
            </div>
          
           
            
            <s:submit cssClass="login"  name="borEmp" value="Borrar"/>
           
        </s:form>
                    
                </div>
            </div>
            
        </section> 
        <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="modificarPatrocinador" theme="simple">
                        <h2>Modificar Patrocinador</h2>
            
            <div class="inputbox">
                
                <ion-icon name="mail-outline"></ion-icon>
               
              <s:textfield name="nombrem"/>
            
            <label for=""><s:fielderror fieldName="nombrem"/> Nombre:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetag-outline"></ion-icon>
               <s:textfield name="descripcionm"/>
           
            <label for=""><s:fielderror fieldName="descripcionm"/>Descripcion:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetags-outline"></ion-icon>
               <s:textfield name="nInvitadosm"/>
            
            <label for=""><s:fielderror fieldName="nInvitadosm"/>N Invitados:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="descuentom"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="descuentom"/>Descuento:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="tlfnm"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="tlfnm"/>Telefono</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="emailm"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="emailm"/>Email</label>
            </div>
           
            
            <s:submit cssClass="login"  name="altaEmp" value="Modificar"/>
           
        </s:form>
                    
                </div>
            </div>
          
        </section> 
        <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="altaEspecializacion" theme="simple">
                        <h2>Alta Especializacion</h2>
            
            <div class="inputbox">
                
                <ion-icon name="mail-outline"></ion-icon>
               
              <s:textfield name="nombre"/>
            
            <label for=""><s:fielderror fieldName="nombre"/> Nombre:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetag-outline"></ion-icon>
               <s:textfield name="catering"/>
           
            <label for=""><s:fielderror fieldName="catering"/>Catering:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetags-outline"></ion-icon>
               <s:textfield name="musica"/>
            
            <label for=""><s:fielderror fieldName="musica"/>Musica:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="decoracion"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="decoracion"/>Decoracion:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="audiovisuales"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="audiovisuales"/>Audiovisuales:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="religion"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="religion"/>Religion:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="precio"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="precio"/>Precio:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="tipo"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="tipo"/>Tipo(boda,bautizo,cine,comunion,concierto,cumpleanyos,deporte,fiesta):</label>
            </div>
           
            
            <s:submit cssClass="login"  name="altaEmp" value="Crear"/>
           
        </s:form>
                    
                </div>
            </div>
          
        </section> 
        <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="borrarEspecializacion" theme="simple">
                        <h2>Baja Especializacion</h2>
            
            <div class="inputbox">
                
                <ion-icon name="mail-outline"></ion-icon>
               
              <s:textfield name="nombreb"/>
            
            <label for=""><s:fielderror fieldName="nombreb"/> Nombre:</label>
            </div>
          
           
            
            <s:submit cssClass="login"  name="borEmp" value="Borrar"/>
           
        </s:form>
                    
                </div>
            </div>
            
        </section> 
        <section>
            <div class="form-box">
                <div class="form-value">
                    <s:form action="modificarEspecializacion" theme="simple">
                        <h2>Mod Especializacion</h2>
            
            <div class="inputbox">
                
                <ion-icon name="mail-outline"></ion-icon>
               
              <s:textfield name="nombrem"/>
            
            <label for=""><s:fielderror fieldName="nombrem"/> Nombre:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetag-outline"></ion-icon>
               <s:textfield name="cateringm"/>
           
            <label for=""><s:fielderror fieldName="cateringm"/>Catering:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="pricetags-outline"></ion-icon>
               <s:textfield name="musicam"/>
            
            <label for=""><s:fielderror fieldName="musicam"/>Musica:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="decoracionm"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="decoracionm"/>Decoracion:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="audiovisualesm"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="audiovisualesm"/>Audiovisuales:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="religionm"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="religionm"/>Religion:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="preciom"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="preciom"/>Precio:</label>
            </div>
            <div class="inputbox">
                <ion-icon name="calendar-outline"></ion-icon>
                
                <s:textfield name="tipom"/>
           <!-- <input type="date" name="fecha"/> -->
            <label for=""><s:fielderror fieldName="tipom"/>Tipo(boda,bautizo,cine,comunion,concierto,cumpleanyos,deporte,fiesta):</label>
            </div>
           
            
            <s:submit cssClass="login"  name="altaEmp" value="Modificar"/>
           
        </s:form>
                    
                </div>
            </div>
          
        </section> 
    </body>
</html>
