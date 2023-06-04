/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import entidades.*;

import java.util.Date;
import java.util.List;
import java.util.Map;
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
    private List<Evento> eventos;

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

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
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

    @Override//Metodo por defecto del action GestionUser
    public String execute() throws Exception {//Guarda los datos del usuario en una sesion->Usuario y Rol

        Almacen alm = new Almacen();
        Usuario user = alm.compruebaUser(this.getUsuario(), this.getPassword());
        if (user != null && user.getContrasenya().equals(this.getPassword())) {
            sessionMap.put("Usuario", this.getUsuario());
            sessionMap.put("Rol", user.getRol());

            return SUCCESS;
        } else {
            return ERROR;
        }
    }

    //Cierre de sesion
    public String unlog() throws Exception {//Limpisa las variables de sesion
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        sessionMap.clear();
        session.invalidate();

        return SUCCESS;
    }

    //Comprobacion de sesion y logueo
    public String yaLogueado() throws Exception {
        return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap = (SessionMap) map;
    }

    //Comprobacion de sesion
    public String checkSession() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(false);
        if (session.getAttribute("Usuario") == null) {
            return "logout";
        } else {
            return SUCCESS;
        }
    }

    //Recoge los datos del usuario para mostrarlos en el perfil
    public String mostrarPerfil() throws Exception {
        Almacen a = new Almacen();
        Usuario user = a.consultaUsuario(this.getSessionMap().get("Usuario").toString());
        //Asignacion de atributos del usuario
        this.setNombre(user.getNombre());
        this.setUsuario(user.getEmail());
        this.setPassword(user.getContrasenya());
        this.setApellidos(user.getApellidos());
        this.setFechaNac(user.getFechaNac());
        this.setTelefono(user.getTelefono());

        //Mensajes, Direcciones y Eventos relacionados con el usuario
        this.setMensajes(a.consultaMensajes(this.getUsuario()));
        this.setDirecciones(a.consultaDirecciones(this.getUsuario()));
        this.setEventos(a.consultaEventos(this.getUsuario()));

        return SUCCESS;
    }

}
