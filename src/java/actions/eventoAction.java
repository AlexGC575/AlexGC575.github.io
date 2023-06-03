/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

/**
 *
 * @author User
 */

import com.opensymphony.xwork2.ActionSupport;
import java.util.Random;
import entidades.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class eventoAction extends ActionSupport{
    private List<Empresa> empresasC;
    private List<Empresa> empresasM;
    private List<Empresa> empresasD;
    private List<Empresa> empresasA;
    private String especializacion;
    private String lugar;
    private String elegirLugar;
    private Date fecha;
    private Date horaI;
    private Date horaF;
    private String elegirPatrocinador;
    private int inv;
    private float precio;
    private Evento evento;
    private String session;
    private List<String> tipos;
    private List<Especializacion> especializaciones;
    private Pago pago;
    private String elegirEvento;

    public String getElegirEvento() {
        return elegirEvento;
    }

    public void setElegirEvento(String elegirEvento) {
        this.elegirEvento = elegirEvento;
    }

    public List<String> getTipos() {
        return tipos;
    }

    public void setTipos(List<String> tipos) {
        this.tipos = tipos;
    }
    
    public List<Especializacion> getEspecializaciones() {
        return especializaciones;
    }

    public void setEspecializaciones(List<Especializacion> especializaciones) {
        this.especializaciones = especializaciones;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public String getSession() {
        return session;
    }

        public void setSession(String session) {
        this.session = session;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getElegirLugar() {
        return elegirLugar;
    }

    public void setElegirLugar(String elegirLugar) {
        this.elegirLugar = elegirLugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraI() {
        return horaI;
    }

    public void setHoraI(Date horaI) {
        this.horaI = horaI;
    }

    public Date getHoraF() {
        return horaF;
    }

    public void setHoraF(Date horaF) {
        this.horaF = horaF;
    }

    public String getElegirPatrocinador() {
        return elegirPatrocinador;
    }

    public void setElegirPatrocinador(String elegirPatrocinador) {
        this.elegirPatrocinador = elegirPatrocinador;
    }

    public int getInv() {
        return inv;
    }

    public void setInv(int inv) {
        this.inv = inv;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public List<Empresa> getEmpresasC() {
        return empresasC;
    }

    public void setEmpresasC(List<Empresa> empresasC) {
        this.empresasC = empresasC;
    }

    public List<Empresa> getEmpresasM() {
        return empresasM;
    }

    public void setEmpresasM(List<Empresa> empresasM) {
        this.empresasM = empresasM;
    }

    public List<Empresa> getEmpresasD() {
        return empresasD;
    }

    public void setEmpresasD(List<Empresa> empresasD) {
        this.empresasD = empresasD;
    }

    public List<Empresa> getEmpresasA() {
        return empresasA;
    }

    public void setEmpresasA(List<Empresa> empresasA) {
        this.empresasA = empresasA;
    }

    public eventoAction() {
    }
    
    public String eventoGeneral() throws Exception{
        Almacen a = new Almacen();

        this.setEspecializaciones(a.consultaEspecializaciones(this.getElegirEvento()));
        
        if(this.getElegirEvento().equals("Boda")){
            return "B";
        }else if(this.getElegirEvento().equals("Cumpleanyos")){
            return "CUM";  
        }else if(this.getElegirEvento().equals("Cine")){
            return "CI";  
        }else if(this.getElegirEvento().equals("Comunión")){
            return "COM";  
        }else if(this.getElegirEvento().equals("Concierto")){
            return "CON";  
        }else if(this.getElegirEvento().equals("Deporte")){
            return "D";  
        }else if(this.getElegirEvento().equals("Fiesta")){
            return "FT";  
        }else if(this.getElegirEvento().equals("Bautizo")){
            return "BAU";  
        }
        return ERROR;
    }
    
    public String eventoOriginal() throws Exception{
        Almacen a=new Almacen();
        Iterator <Empresa>i;
        List<Empresa> eC = new ArrayList();
        List<Empresa> eM = new ArrayList();
        List<Empresa> eD = new ArrayList();
        List<Empresa> eA = new ArrayList();
        
        this.setTipos(a.consultaTipos());
        i = a.consultaEmpresas().iterator();
        Empresa e;
        while(i.hasNext()){
            e = i.next();
            if(e.getCategoria().equals("Catering")){
                eC.add(e);
            }else if(e.getCategoria().equals("Musica")){
                eM.add(e);
            }else if(e.getCategoria().equals("Decoracion")){
                eD.add(e);
            }else{
                eA.add(e);
            }
        }
        this.setEmpresasC(eC);
        this.setEmpresasM(eM);
        this.setEmpresasD(eD);
        this.setEmpresasA(eA);
        
        Random rand = new Random();
        this.setPrecio(Math.round(rand.nextFloat()*2000+500));
        
        return SUCCESS;
    }

    public String detalles() throws SQLException{
        Almacen a = new Almacen();
       /* Evento e = new Evento();  
        
        e.setFecha(this.getFecha());
        e.setHoraInicio(this.getHoraI());
        e.setHoraFin(this.getHoraF());
        if(this.getLugar().equals("")){
            e.setLugar(a.consultaLugar(this.getElegirLugar()));
        }else{
            e.setLugar(a.consultaLugar(this.getLugar()));
        }
        if(!this.getElegirPatrocinador().equals("")){
            e.setPatrocinador(a.consultaPatrocinador(this.getElegirPatrocinador()));
        }
        
            e.setTipo(this.getEspecializacion().getTipo());
            e.setAudiovisuales(this.getEspecializacion().getAudiovisuales());
            e.setCatering(this.getEspecializacion().getCatering());
            e.setDecoracion(this.getEspecializacion().getDecoracion());
            e.setMusica(this.getEspecializacion().getMusica());
        
            if(!this.getEspecializacion().getReligion().equals("")){
                e.setReligion(this.getEspecializacion().getReligion());
            }

        e.setPrecio(this.getPrecio());
        e.setUsuario(a.consultaUsuario(this.getSession()));
        e.setPagado(false);
        */

        this.setPago(a.consultaTarjeta(this.getSession()));
        //this.setEvento(e);
        
        //a.altaEvento(e);
        
        return SUCCESS;
    }
    
    public String inicio(){
        return SUCCESS;
    }
    
    public String pago(){
        //recoger especializacion de la sesion
        return SUCCESS;
    }
    
    public String irAPerfil(){
        //recoger especializacion de la sesion
        return SUCCESS;
    }
    
    public String execute() throws Exception{
        Almacen a = new Almacen();
        this.setTipos(a.consultaTipos());
        return SUCCESS;
    }
    
}