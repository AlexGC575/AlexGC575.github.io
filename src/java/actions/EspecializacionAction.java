/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import entidades.Almacen;
import entidades.Especializacion;

/**
 *
 * @author juanl
 */
public class EspecializacionAction extends ActionSupport {

    private String nombre;
    private String catering;
    private String musica;
    private String decoracion;
    private String audiovisuales;
    private String religion;
    private float precio;
    private String tipo;
    private String nombrem;
    private String cateringm;
    private String musicam;
    private String decoracionm;
    private String audiovisualesm;
    private String religionm;
    private float preciom;
    private String tipom;
    private String nombreb;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCatering() {
        return catering;
    }

    public void setCatering(String catering) {
        this.catering = catering;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }

    public String getAudiovisuales() {
        return audiovisuales;
    }

    public void setAudiovisuales(String audiovisuales) {
        this.audiovisuales = audiovisuales;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombrem() {
        return nombrem;
    }

    public void setNombrem(String nombrem) {
        this.nombrem = nombrem;
    }

    public String getCateringm() {
        return cateringm;
    }

    public void setCateringm(String cateringm) {
        this.cateringm = cateringm;
    }

    public String getMusicam() {
        return musicam;
    }

    public void setMusicam(String musicam) {
        this.musicam = musicam;
    }

    public String getDecoracionm() {
        return decoracionm;
    }

    public void setDecoracionm(String decoracionm) {
        this.decoracionm = decoracionm;
    }

    public String getAudiovisualesm() {
        return audiovisualesm;
    }

    public void setAudiovisualesm(String audiovisualesm) {
        this.audiovisualesm = audiovisualesm;
    }

    public String getReligionm() {
        return religionm;
    }

    public void setReligionm(String religionm) {
        this.religionm = religionm;
    }

    public float getPreciom() {
        return preciom;
    }

    public void setPreciom(float preciom) {
        this.preciom = preciom;
    }

    public String getTipom() {
        return tipom;
    }

    public void setTipom(String tipom) {
        this.tipom = tipom;
    }

    public String getNombreb() {
        return nombreb;
    }

    public void setNombreb(String nombreb) {
        this.nombreb = nombreb;
    }

    public EspecializacionAction() {
    }

    //Metodo por defecto del action EspecializacionAction
    public String execute() throws Exception {//alta de Especializacion
        Almacen al = new Almacen();
        Especializacion esp = new Especializacion(this.getNombre(), this.getCatering(), this.getMusica(), this.getDecoracion(), this.getAudiovisuales(), this.getReligion(), this.getPrecio());
        esp.setTipo(al.consultaTipo(this.getTipo()));
        al.altaEspecializacion(esp);
        return SUCCESS;
    }

    public String borrar() throws Exception {//Borrado de Especializacion
        Almacen al = new Almacen();
        al.bajaEspecializacion(this.getNombreb());
        return SUCCESS;
    }

    public String modificar() throws Exception {//modificacion de Especializacion
        Almacen al = new Almacen();
        Especializacion esp = new Especializacion(this.getNombrem(), this.getCateringm(), this.getMusicam(), this.getDecoracionm(), this.getAudiovisualesm(), this.getReligionm(), this.getPreciom());
        esp.setTipo(al.consultaTipo(this.getTipom()));
        al.modEspecializacion(esp, nombrem);
        return SUCCESS;
    }

}
