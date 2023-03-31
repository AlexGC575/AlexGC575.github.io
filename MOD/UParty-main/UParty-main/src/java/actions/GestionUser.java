/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author juanl
 */
public class GestionUser extends ActionSupport {
    private String usuario;
    private String password;
    private String email;
    private String nombre;
    private String apellidos;
    private Date fecha;
    private String tlfn;
    private String passregister;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTlfn() {
        return tlfn;
    }

    public void setTlfn(String tlfn) {
        this.tlfn = tlfn;
    }

    public String getPassregister() {
        return passregister;
    }

    public void setPassregister(String passregister) {
        this.passregister = passregister;
    }
    
    public GestionUser() {
    }
    
    public String execute() throws Exception {
        
    return SUCCESS;
    
    }
  //  public void validate(){
    //    String patron="^(,+)@(.+)$";
      //  Pattern p = Pattern.compile(patron);
        //Matcher matcher = p.matcher(this.getEmail());
       // if(this.getUsuario().equals("")){
        //    addFieldError("usuario","El usuario tiene que estar relleno");
        // }
       //  else if(this.getUsuario().length()<4){
       //      addFieldError("usuario","El usuario tiene que ser mas largo");
       //  }
      //  if(!matcher.matches()){
       //      addFieldError("usuario","El email no es correcto");
       //  }
        //if Pattern.matches("\\d+",this.getEdad());
   //  }
   

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
