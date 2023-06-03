/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.validator.annotations.DateRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import evento.Almacen;
import evento.Direccion;
import evento.Mensaje;
import evento.Usuario;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author juanl
 */
public class GestionUser extends ActionSupport implements SessionAware {

    private SessionMap<String, Object> sessionMap;
    private String usuario;
    private String password;

    private String nombre;
    private String apellidos;
    private Date fechaNac;
    private int telefono;
    private List<Mensaje> mensajes;
    private List<Direccion> direcciones;

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
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

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public SessionMap<String, Object> getSessionMap() {
        return sessionMap;
    }

    public void setSessionMap(SessionMap<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    public String getUsuario() {
        return usuario;
    }

    //@RequiredStringValidator(message = "You must enter a name")
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public static void setLOG(Logger LOG) {
        ActionSupport.LOG = LOG;
    }

    public GestionUser() {
    }

    public String execute() throws Exception {

        Almacen alm = new Almacen();
        Usuario user = alm.compruebaUser(this.getUsuario(), this.getPassword());
        if (user != null) {
            sessionMap.put("Usuario", this.getUsuario());

            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    public String unlog() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        sessionMap.clear();
        session.invalidate();

        return SUCCESS;
    }

    public String yaLogueado() throws Exception {
        return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap = (SessionMap) map;
    }

    public String checkSession() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if (session.getAttribute("Usuario") == null) {
            return "logout";
        } else {
            return SUCCESS;
        }
    }

    public String mostrarPerfil() throws Exception {
        Almacen a = new Almacen();
        Usuario user = a.consultaUsuario(this.getSessionMap().get("Usuario").toString());
        this.setNombre(user.getNombre());
        this.setUsuario(user.getEmail());
        this.setPassword(user.getContrasenya());
        this.setApellidos(user.getApellidos());
        this.setFechaNac(user.getFechaNac());
        this.setTelefono(user.getTelefono());
        
        this.setMensajes(a.consultaMensajes(this.getUsuario()));
        this.setDirecciones(a.consultaDirecciones(this.getUsuario()));

        return SUCCESS;
    }

}
