/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import entidades.Almacen;
import entidades.Empresa;
import java.util.*;

/**
 *
 * @author juanl
 */
public class empresaAction extends ActionSupport {

    private String nombre;
    private String categoria;
    private String descripcion;
    private String nombrem;
    private String categoriam;
    private String descripcionm;
    private int valm;
    private int val;
    private String nombreb;
    private List<Empresa> empresas;

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }

    public int getValm() {
        return valm;
    }

    public void setValm(int valm) {
        this.valm = valm;
    }

    public String getNombrem() {
        return nombrem;
    }

    public void setNombrem(String nombrem) {
        this.nombrem = nombrem;
    }

    public String getCategoriam() {
        return categoriam;
    }

    public void setCategoriam(String categoriam) {
        this.categoriam = categoriam;
    }

    public String getDescripcionm() {
        return descripcionm;
    }

    public void setDescripcionm(String descripcionm) {
        this.descripcionm = descripcionm;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public static void setLOG(Logger LOG) {
        ActionSupport.LOG = LOG;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public empresaAction() {

    }

    @Override//Metodo por defecto del action empresaAction
    public String execute() throws Exception {//Alta empresa
        Almacen al = new Almacen();
        Empresa emp = new Empresa(this.getNombre(), this.getCategoria(), this.getDescripcion(), this.getVal());
        al.altaEmpresa(emp);
        return SUCCESS;
    }

    //Borrar empresa
    public String borrar() throws Exception {
        Almacen al = new Almacen();
        al.bajaEmpresa(this.getNombreb());
        return SUCCESS;
    }

    //Modificar empresa
    public String modificar() throws Exception {
        Almacen al = new Almacen();
        Empresa emp = new Empresa(this.getNombrem(), this.getCategoriam(), this.getDescripcionm(), this.getValm());
        al.modEmpresa(emp, nombrem);
        return SUCCESS;
    }

    //Obtener listado de empresas
    public String consulta() {
        Almacen al = new Almacen();
        empresas = al.obtenerEmpresas();
        return SUCCESS;
    }

    public String ini() throws Exception {    //redirección a gestion.jsp
        return SUCCESS;
    }

}
