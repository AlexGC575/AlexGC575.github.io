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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class eventoAction extends ActionSupport {

    private Evento evento;
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
    private String fecha;
    private String horaI;
    private String horaF;
    private String elegirPatrocinador;
    private Tipo tipo;
    private float precio;
    private String session;
    private List<String> tipos;
    private List<Especializacion> especializaciones;
    private Pago pago;
    private String elegirEvento;

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

    //Metodo de seleccion de especializacion de evento, redirige a la pagina correspondiente de cada evento
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
        } else if (this.getElegirEvento().equals("Fiesta")) {
            return "FT";
        } else if (this.getElegirEvento().equals("Bautizo")) {
            return "BAU";
        }
        return ERROR;
    }

    //Metodo de empresas
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

    //Recoge los datos de la creacion del evento en el formulario de detalles.jsp
    public String detalles() throws SQLException, ParseException {
        Almacen a = new Almacen();
        Evento e = new Evento();

        String dateString = "2023-05-31";
        String pattern = "dd/MM/yyyy";

        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        Date date = dateFormat.parse(this.getFecha());

        e.setFecha(date);
        
        pattern = "hh:mm:ss";
        dateFormat = new SimpleDateFormat(pattern);
        date = dateFormat.parse(this.getHoraI());
        e.setHoraInicio(date);
        
        date = dateFormat.parse(this.getHoraF());
        e.setHoraFin(date);

        if (this.getLugar().equals("")) {
            e.setLugar(a.consultaLugar(this.getElegirLugar()));
        } else {
            Lugar l = new Lugar();
            l.setNombre(this.getLugar());
            e.setLugar(l);
        }
        if (this.getElegirPatrocinador() != null) {
            e.setPatrocinador(a.consultaPatrocinador(this.getElegirPatrocinador()));
        } else {
            Patrocinador p = a.consultaPatrocinador("Ninguno");
            e.setPatrocinador(p);
        }

        e.setTipo(a.consultaTipo(this.getEspT()));
        e.setAudiovisuales(this.getEspA());
        e.setCatering(this.getEspC());
        e.setDecoracion(this.getEspD());
        e.setMusica(this.getEspM());
        e.setReligion("-");

        Date d = new Date();
        Resenya r = new Resenya(112, 5, "fsdfs", "dfdfdsasd");
        a.altaResenya(112, 5, "fsdfs", "dfdfdsasd", a.consultaUsuario(this.getSession()));
        e.setResenya(r);

        e.setPrecio(this.getPrecio());
        e.setUsuario(a.consultaUsuario(this.getSession()));

        e.setPagado(false);

        this.setPago(a.consultaTarjeta(this.getSession()));;
        
        List <Empresa> le = new ArrayList<Empresa>();
        List <Asistente> la = new ArrayList<Asistente>();
        le.add(a.consultaEmpresa(this.getEspA()));
        le.add(a.consultaEmpresa(this.getEspC()));
        le.add(a.consultaEmpresa(this.getEspD()));
        le.add(a.consultaEmpresa(this.getEspM()));

        e.setEmpresaCollection(le);
        e.setAsistenteCollection(la);
        e.setId(1);
        
        a.altaEvento(e);
        this.setEvento(e);

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
    
    @Override//Metodo por defecto del action eventoAction
    public String execute() throws Exception {
        Almacen a = new Almacen();
        this.setTipos(a.consultaTipos());
        String p;

        for (int i = 0; i < this.getTipos().size(); i++) {
            if (this.getTipos().get(i).equals("Cumpleanyos")) {
                p = this.getTipos().get(i).replace("ny", "ñ");
                this.getTipos().remove(i);
                this.getTipos().add(p);
            }
        }
        return SUCCESS;
    }

}
