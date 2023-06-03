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

public class eventoAction extends ActionSupport {

    private List<Empresa> empresasC;
    private List<Empresa> empresasM;
    private List<Empresa> empresasD;
    private List<Empresa> empresasA;
    private String espT;
    private String espA;
    private String espM;
    private String espC;
    private String espD;
    private String lugar;
    private String elegirLugar;
    private Date fecha;
    private Date horaI;
    private Date horaF;
    private String elegirPatrocinador;
    private Tipo tipo;
    private float precio;
    private String session;
    private List<String> tipos;
    private List<Especializacion> especializaciones;
    private Pago pago;
    private String elegirEvento;

    public String getElegirEvento() {
        return elegirEvento;
    }

    public String getEspT() {
        return espT;
    }

    public void setEspT(String espT) {
        this.espT = espT;
    }

    public String getEspA() {
        return espA;
    }

    public void setEspA(String espA) {
        this.espA = espA;
    }

    public String getEspM() {
        return espM;
    }

    public void setEspM(String espM) {
        this.espM = espM;
    }

    public String getEspC() {
        return espC;
    }

    public void setEspC(String espC) {
        this.espC = espC;
    }

    public String getEspD() {
        return espD;
    }

    public void setEspD(String espD) {
        this.espD = espD;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
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

    public String eventoGeneral() throws Exception {
        Almacen a = new Almacen();

        this.setEspecializaciones(a.consultaEspecializaciones(this.getElegirEvento()));

        if (this.getElegirEvento().equals("Boda")) {
            return "B";
        } else if (this.getElegirEvento().equals("Cumpleanyos")) {
            return "CUM";
        } else if (this.getElegirEvento().equals("Cine")) {
            return "CI";
        } else if (this.getElegirEvento().equals("Comunión")) {
            return "COM";
        } else if (this.getElegirEvento().equals("Concierto")) {
            return "CON";
        } else if (this.getElegirEvento().equals("Deporte")) {
            return "D";
        } else if (this.getElegirEvento().equals("Fiesta temática")) {
            return "FT";
        } else if (this.getElegirEvento().equals("Bautizo")) {
            return "BAU";
        }
        return ERROR;
    }

    public String eventoOriginal() throws Exception {
        Almacen a = new Almacen();
        Iterator<Empresa> i;
        List<Empresa> eC = new ArrayList();
        List<Empresa> eM = new ArrayList();
        List<Empresa> eD = new ArrayList();
        List<Empresa> eA = new ArrayList();

        this.setTipos(a.consultaTipos());
        i = a.consultaEmpresas().iterator();
        Empresa e;
        while (i.hasNext()) {
            e = i.next();
            if (e.getCategoria().equals("Catering")) {
                eC.add(e);
            } else if (e.getCategoria().equals("Musica")) {
                eM.add(e);
            } else if (e.getCategoria().equals("Decoracion")) {
                eD.add(e);
            } else {
                eA.add(e);
            }
        }
        this.setEmpresasC(eC);
        this.setEmpresasM(eM);
        this.setEmpresasD(eD);
        this.setEmpresasA(eA);

        Random rand = new Random();
        this.setPrecio(Math.round(rand.nextFloat() * 2000 + 500));

        return SUCCESS;
    }

    public String detalles() throws SQLException {
        Almacen a = new Almacen();
        Evento e = new Evento();

        e.setFecha(this.getFecha());
        e.setHoraInicio(this.getHoraI());
        e.setHoraFin(this.getHoraF());

        if (this.getLugar() == null) {
            Lugar l = new Lugar();
            l.setNombre(this.getElegirLugar());
            e.setLugar(l);
        } else {
            e.setLugar(a.consultaLugar(this.getLugar()));
        }
        if (this.getElegirPatrocinador() != null) {
            e.setPatrocinador(a.consultaPatrocinador(this.getElegirPatrocinador()));
        }else{
            Patrocinador p = a.consultaPatrocinador("WWE");
            e.setPatrocinador(p);
        }

        e.setTipo(a.consultaTipo(this.getEspT()));
        e.setAudiovisuales(this.getEspA());
        e.setCatering(this.getEspC());
        e.setDecoracion(this.getEspD());
        e.setMusica(this.getEspM());
        e.setReligion("-");
            

        a.altaResenya(7,5,"dsa","dasd",a.consultaUsuario(this.getSession()));
        //e.setResenya(r);
        
        e.setPrecio(this.getPrecio());
        e.setUsuario(a.consultaUsuario(this.getSession()));        
        
        e.setPagado(false);
        this.setPago(a.consultaTarjeta(this.getSession()));;
        
        a.altaEvento(e);

        return SUCCESS;
    }

    public String inicio() {
        return SUCCESS;
    }

    public String pago() {
        //recoger especializacion de la sesion
        return SUCCESS;
    }

    public String irAPerfil() {
        //recoger especializacion de la sesion
        return SUCCESS;
    }

    public String execute() throws Exception {
        Almacen a = new Almacen();
        this.setTipos(a.consultaTipos());
        return SUCCESS;
    }

}
