/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Date;

/**
 *
 * @author juanl
 */
public class GestionRegister extends ActionSupport {
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
    public GestionRegister() {
    }
    
    public String execute() throws Exception {
        System.out.println("sssjiwoqdiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiis");
    return SUCCESS;
    }
    
}
