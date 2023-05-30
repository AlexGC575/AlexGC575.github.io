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
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.validator.annotations.DateRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import evento.Almacen;
import evento.Especializacion;
import evento.Tipo;
import java.util.List;

public class eventoAction extends ActionSupport{
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
