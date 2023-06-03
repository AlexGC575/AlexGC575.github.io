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
<<<<<<< Updated upstream
=======
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import java.util.Random;
>>>>>>> Stashed changes
import evento.Almacen;
import evento.Especializacion;
import evento.Tipo;
import java.util.List;

public class eventoAction extends ActionSupport{
<<<<<<< Updated upstream
=======
    private List<Empresa> empresasC;
    private List<Empresa> empresasM;
    private List<Empresa> empresasD;
    private List<Empresa> empresasA;
    private String especializacion;
    private String elegirLugar;
    private String elegirPatrocinador;
    private int inv;
    private float precio;
    private Evento evento;
    private String session;
>>>>>>> Stashed changes
    private List<String> tipos;
    private List<Especializacion> especializaciones;
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

<<<<<<< Updated upstream
=======
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

    public String getElegirLugar() {
        return elegirLugar;
    }

    public void setElegirLugar(String elegirLugar) {
        this.elegirLugar = elegirLugar;
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

>>>>>>> Stashed changes
    public eventoAction() {
    }
    
    public String eventoGeneral() throws Exception{
        Almacen a = new Almacen();
        
        if(this.getElegirEvento().equals("Boda")){
            this.setEspecializaciones(a.consultaEspecializaciones(this.getElegirEvento()));
            return "B";
        }else if(this.getElegirEvento().equals("Cumpleaños")){
            return "CUM";  
        }else if(this.getElegirEvento().equals("Cine")){
            return "CI";  
        }else if(this.getElegirEvento().equals("Comunión")){
            return "COM";  
        }else if(this.getElegirEvento().equals("Concierto")){
            return "CON";  
        }else if(this.getElegirEvento().equals("Deporte")){
            return "D";  
        }else if(this.getElegirEvento().equals("Fiesta temática")){
            return "FT";  
        }else if(this.getElegirEvento().equals("Bautizo")){
            return "BAU";  
        }
        return ERROR;
    }
    
    public String eventoOriginal() throws Exception{
        return SUCCESS;
    }

    public String detalles(){
        return SUCCESS;
    }
    
    public String inicio(){
        return SUCCESS;
    }
    
    public String pago(){
        //recoger especializacion de la sesion
        return SUCCESS;
    }
    
    public String execute() throws Exception{
        Almacen a = new Almacen();
        this.setTipos(a.consultaTipos());
        return SUCCESS;
    }
    
}
