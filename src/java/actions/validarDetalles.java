/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import evento.Almacen;
import evento.Lugar;
import evento.Patrocinador;
import freemarker.core.ParseException;
import java.sql.SQLException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class validarDetalles extends ActionSupport {

    private String lugar;
    private String fecha;
    private String horaI;
    private String horaF;
    private int inv;
    private List<Lugar> lugares;
    private List<Patrocinador> patrocinadores;

    public List<Patrocinador> getPatrocinadores() {
        return patrocinadores;
    }

    public void setPatrocinadores(List<Patrocinador> patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    public List<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }

    public int getInv() {
        return inv;
    }

    public void setInv(int inv) {
        this.inv = inv;
    }

    public validarDetalles() {
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHoraI() {
        return horaI;
    }

    public void setHoraI(String horaI) {
        this.horaI = horaI;
    }

    public String getHoraF() {
        return horaF;
    }

    public void setHoraF(String horaF) {
        this.horaF = horaF;
    }

    public String execute() throws Exception {
        return SUCCESS;
    }

    public String validarFormulario() throws Exception {
        Almacen a = new Almacen();
        this.setLugares(a.consultaLugares());
        return SUCCESS;
    }

    @Override
    public void validate() {
        Almacen a = new Almacen();
        try {
            this.setLugares(a.consultaLugares());
            this.setPatrocinadores(a.consultaPatrocinadores());
        } catch (SQLException ex) {
            Logger.getLogger(validarDetalles.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (this.getLugar().length() == 0) {
            addFieldError("lugar", "LUGAR REQUIRED");
        }

        if (this.getFecha() != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            try {
                dateFormat.parse(this.getFecha());
            } catch (java.text.ParseException ex) {
                addFieldError("fecha", "La fecha no tiene un formato válido[yyyy-MM-dd]");
            }
        }

        if (this.getHoraI() != null && this.getHoraF() != null) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            try {
                LocalTime inicio = LocalTime.parse(this.getHoraI(), formatter);
                LocalTime fin = LocalTime.parse(this.getHoraF(), formatter);

                if (inicio.isAfter(fin)) {
                    addFieldError("horaI", "La hora de inicio debe ser anterior a la fecha fin");
                }
            }catch(Exception e){
                addFieldError("horaI", "Hora invalida");
            }

        }

        if (this.getInv() <= 1) {
            addFieldError("inv", "Debe haber mas de un invitado");
        }
    }
}
