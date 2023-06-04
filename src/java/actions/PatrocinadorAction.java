/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entidades.Almacen;
import entidades.Patrocinador;

/**
 *
 * @author juanl
 */
public class PatrocinadorAction extends ActionSupport {
    private String nombre;
    private String descripcion;
    private int nInvitados;
    private int descuento;
    private int tlfn;
    private String email;
     private String nombrem;
    private String descripcionm;
    private int nInvitadosm;
    private int descuentom;
    private int tlfnm;
    private String emailm;
    private String nombreb;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getnInvitados() {
        return nInvitados;
    }

    public void setnInvitados(int nInvitados) {
        this.nInvitados = nInvitados;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getTlfn() {
        return tlfn;
    }

    public void setTlfn(int tlfn) {
        this.tlfn = tlfn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombrem() {
        return nombrem;
    }

    public void setNombrem(String nombrem) {
        this.nombrem = nombrem;
    }

    public String getDescripcionm() {
        return descripcionm;
    }

    public void setDescripcionm(String descripcionm) {
        this.descripcionm = descripcionm;
    }

    public int getnInvitadosm() {
        return nInvitadosm;
    }

    public void setnInvitadosm(int nInvitadosm) {
        this.nInvitadosm = nInvitadosm;
    }

    public int getDescuentom() {
        return descuentom;
    }

    public void setDescuentom(int descuentom) {
        this.descuentom = descuentom;
    }

    public int getTlfnm() {
        return tlfnm;
    }

    public void setTlfnm(int tlfnm) {
        this.tlfnm = tlfnm;
    }

    public String getEmailm() {
        return emailm;
    }

    public void setEmailm(String emailm) {
        this.emailm = emailm;
    }

    public String getNombreb() {
        return nombreb;
    }

    public void setNombreb(String nombreb) {
        this.nombreb = nombreb;
    }
    
    public PatrocinadorAction() {
    }
    
    @Override//Metodo por defecto del action PatrocinadorAction
     public String execute() throws Exception { //alta de Patrocinador
        Almacen al=new Almacen();
        Patrocinador p=new Patrocinador(this.getNombre(),this.getDescripcion(),this.getnInvitados(),this.getDescuento(),this.getTlfn(),this.getEmail());
     
        al.altaPatrocinador(p);
        return SUCCESS;
    }
    public String borrar() throws Exception{ //borrar  Patrocinador
        Almacen al=new Almacen();
        al.bajaPatrocinador(this.getNombreb());
        return SUCCESS;
    }
    public String modificar() throws Exception{//modificar  Patrocinador
        Almacen al=new Almacen();
        Patrocinador p=new Patrocinador(this.getNombrem(),this.getDescripcionm(),this.getnInvitadosm(),this.getDescuentom(),this.getTlfnm(),this.getEmailm());
     
        al.modPatrocinador(p, nombrem);
        return SUCCESS;
    }
    
}
