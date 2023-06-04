/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entidades.Almacen;
import entidades.Lugar;

/**
 *
 * @author juanl
 */
public class LugarAction extends ActionSupport {

    private String nombre;
    private String provincia;
    private int codigoPostal;
    private String calle;
    private int numero;
    private int aforo;
    private String nombrem;
    private String provinciam;
    private int codigoPostalm;
    private String callem;
    private int numerom;
    private int aforom;
    private String nombreb;

    public String getNombrem() {
        return nombrem;
    }

    public void setNombrem(String nombrem) {
        this.nombrem = nombrem;
    }

    public String getProvinciam() {
        return provinciam;
    }

    public void setProvinciam(String provinciam) {
        this.provinciam = provinciam;
    }

    public int getCodigoPostalm() {
        return codigoPostalm;
    }

    public void setCodigoPostalm(int codigoPostalm) {
        this.codigoPostalm = codigoPostalm;
    }

    public String getCallem() {
        return callem;
    }

    public void setCallem(String callem) {
        this.callem = callem;
    }

    public int getNumerom() {
        return numerom;
    }

    public void setNumerom(int numerom) {
        this.numerom = numerom;
    }

    public int getAforom() {
        return aforom;
    }

    public void setAforom(int aforom) {
        this.aforom = aforom;
    }

    public String getNombreb() {
        return nombreb;
    }

    public void setNombreb(String nombreb) {
        this.nombreb = nombreb;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public LugarAction() {
    }

    @Override//Metodo por defecto del action LugarAction
    public String execute() throws Exception {//alta lugar
        Almacen al = new Almacen();
        Lugar l = new Lugar(this.getNombre(), this.getProvincia(), this.getCodigoPostal(), this.getCalle(), this.getNumero(), this.getAforo());

        al.altaLugar(l);
        return SUCCESS;
    }

    public String borrar() throws Exception {//borrar lugar
        Almacen al = new Almacen();
        al.bajaLugar(this.getNombreb());
        return SUCCESS;
    }

    public String modificar() throws Exception {//modificar lugar
        Almacen al = new Almacen();
        Lugar l = new Lugar(this.getNombrem(), this.getProvinciam(), this.getCodigoPostalm(), this.getCallem(), this.getNumerom(), this.getAforom());

        al.modLugar(l, nombrem);
        return SUCCESS;
    }

}
