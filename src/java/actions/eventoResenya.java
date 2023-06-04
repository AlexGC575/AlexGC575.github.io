/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import entidades.*;
/**
 *
 * @author Victor
 */
public class eventoResenya extends ActionSupport {

    private Integer id;
    private int evento;
    private String usuario;
    private int calificacion;
    private String titulo;
    private String opinion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEvento() {
        return evento;
    }

    public void setEvento(int evento) {
        this.evento = evento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public eventoResenya() {
    }

    @Override//Metodo por defecto del action eventoResenya
    public String execute() throws Exception {
        return SUCCESS;
    }
    
    //Crea un nuevo registro en la tabla reseña
    public String crearResenya() throws Exception{
        Almacen a =new Almacen();

        Usuario usuario = a.consultaUsuario(this.getUsuario());
        
        
        a.altaResenya(112, this.getCalificacion(), this.getTitulo(), this.getOpinion(),usuario);
       
        
        return SUCCESS;
    }
    
}
