/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;
import javax.ws.rs.core.GenericType;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.validator.annotations.DateRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import entidades.*;


import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author juanl
 */
public class ResgistroUser extends ActionSupport implements SessionAware{
    
    public ResgistroUser() {
    }
    
    private SessionMap<String,Object> sessionMap;

    private String email;
    private String nombre;
    private String apellidos;
    private Date fecha;
    private int tlfn;
    private String passregister;
    private String numTarjeta;
    private Date caducidad;

    public String getNumTarjeta() {
        return numTarjeta;
    }
@RequiredStringValidator(message="Introduce un valor")
    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public Date getCaducidad() {
        return caducidad;
    }
@DateRangeFieldValidator(
        min = "01/01/1980",
        max = "31/12/2010",
        dateFormat = "dd/MM/yyyy",
        message = "Debe estar entre ${min} y ${max}"
        )
    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }

    public SessionMap<String, Object> getSessionMap() {
        return sessionMap;
    }

    public void setSessionMap(SessionMap<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    public String getEmail() {
        return email;
    }

    @RequiredStringValidator(message="Introduce un valor")
    @EmailValidator(message="Introuduce un email")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }
    
    @RequiredStringValidator(message="Introduce un valor")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    @RequiredStringValidator(message="Introduce un valor")
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha() {
        return fecha;
    }
    
    @DateRangeFieldValidator(
        min = "01/01/1980",
        max = "31/12/2010",
        dateFormat = "dd/MM/yyyy",
        message = "Debe estar entre ${min} y ${max}"
        )
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTlfn() {
        return tlfn;
    }
    @RequiredFieldValidator(message="Introduce un valor")
   
    
    public void setTlfn(int tlfn) {
        this.tlfn = tlfn;
    }

    public String getPassregister() {
        return passregister;
    }
    @RequiredStringValidator(message="Introduce un valor")
    @StringLengthFieldValidator(message="Introduce una contraseña que tenga entre 5 y 15 caracteres", minLength="5", maxLength="15")
    public void setPassregister(String passregister) {
        this.passregister = passregister;
    }
    

   

    public static Logger getLOG() {
        return LOG;
    }

    public static void setLOG(Logger LOG) {
        ActionSupport.LOG = LOG;
    }
    
  
   
    
    
    
    public String execute() throws Exception {
     HttpSession session=ServletActionContext.getRequest().getSession(false);
        Almacen alm=new Almacen();
        Usuario user=new Usuario(this.getEmail(),this.getPassregister(),this.getNombre(),this.getApellidos(),this.getFecha(),this.getTlfn());
       
        PagoPK p=new PagoPK(user.getEmail(),this.getNumTarjeta());
        Pago pa=new Pago(); 
        pa.setCaducidad(this.getCaducidad());
        pa.setPagoPK(p);
        pa.setUsuario1(user);
        alm.altaUser(user);
        alm.altaPago(pa);
        
        
        sessionMap.put("Usuario", user.getEmail());
        return SUCCESS;
    
    }
   

    public void setSession(Map<String, Object> map) {
    this.sessionMap=(SessionMap)map;
    }
    
}
