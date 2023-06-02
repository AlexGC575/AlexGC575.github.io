/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import static com.opensymphony.xwork2.Action.ERROR;
import com.opensymphony.xwork2.ActionSupport;
import evento.Almacen;
import evento.Especializacion;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class eventoGeneralAction extends ActionSupport {
    private String elegirBoda;
    private String elegirBautizo;
    private String elegirCine;
    private String elegirComunion;
    private String elegirConcierto;
    private String elegirCumpleaños;
    private String elegirDeporte;
    private String elegirFiesta;
    private String elegirEventoP;
    private Especializacion especializacion;

    public String getElegirBoda() {
        return elegirBoda;
    }

    public void setElegirBoda(String elegirBoda) {
        this.elegirBoda = elegirBoda;
    }

    public String getElegirBautizo() {
        return elegirBautizo;
    }

    public void setElegirBautizo(String elegirBautizo) {
        this.elegirBautizo = elegirBautizo;
    }

    public String getElegirCine() {
        return elegirCine;
    }

    public void setElegirCine(String elegirCine) {
        this.elegirCine = elegirCine;
    }

    public String getElegirComunion() {
        return elegirComunion;
    }

    public void setElegirComunion(String elegirComunion) {
        this.elegirComunion = elegirComunion;
    }

    public String getElegirConcierto() {
        return elegirConcierto;
    }

    public void setElegirConcierto(String elegirConcierto) {
        this.elegirConcierto = elegirConcierto;
    }

    public String getElegirCumpleaños() {
        return elegirCumpleaños;
    }

    public void setElegirCumpleaños(String elegirCumpleaños) {
        this.elegirCumpleaños = elegirCumpleaños;
    }

    public String getElegirDeporte() {
        return elegirDeporte;
    }

    public void setElegirDeporte(String elegirDeporte) {
        this.elegirDeporte = elegirDeporte;
    }

    public String getElegirFiesta() {
        return elegirFiesta;
    }

    public void setElegirFiesta(String elegirFiesta) {
        this.elegirFiesta = elegirFiesta;
    }

    public String getElegirEventoP() {
        return elegirEventoP;
    }

    public void setElegirEventoP(String elegirEventoP) {
        this.elegirEventoP = elegirEventoP;
    }

<<<<<<< Updated upstream
=======
    public List<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }

    public List<Patrocinador> getPatrocinadores() {
        return patrocinadores;
    }

    public void setPatrocinadores(List<Patrocinador> patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

>>>>>>> Stashed changes
    public Especializacion getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(Especializacion especializacion) {
        this.especializacion = especializacion;
    }
    
    public eventoGeneralAction() {
    }
    
    public String boda() throws SQLException{
        Almacen a = new Almacen();
        
        if(this.getElegirBoda().equals("al aire libre") || this.getElegirBoda().equals("religiosa") || this.getElegirBoda().equals("minimalista") || this.getElegirBoda().equals("civil")){
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirBoda()));
            return SUCCESS;
        }
        return ERROR;
    }
<<<<<<< Updated upstream
    
    public String bautizo() throws SQLException{
        Almacen a = new Almacen();
        
        if(this.getElegirBautizo().equals("en las aguas") || this.getElegirBautizo().equals("con el Espiritu Santo") || this.getElegirBautizo().equals("de fuego")){
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirBautizo()));
=======

    public String bautizo() throws SQLException {
        Almacen a = new Almacen();

        if (this.getElegirBautizo().equals("en las aguas") || this.getElegirBautizo().equals("con el Espíritu Santo") || this.getElegirBautizo().equals("de fuego")) {
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirBautizo()));
            this.setLugares(a.consultaLugares());
            this.setPatrocinadores(a.consultaPatrocinadores());
>>>>>>> Stashed changes
            return SUCCESS;
        }
        return ERROR;
    }
<<<<<<< Updated upstream
    
    public String cine() throws SQLException{
        Almacen a = new Almacen();
        
        if(this.getElegirCine().equals("al aire libre") || this.getElegirCine().equals("de verano") || this.getElegirCine().equals("en aparcamiento") || this.getElegirCine().equals("en centro comercial")){
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirCine()));
=======

    public String cine() throws SQLException {
        Almacen a = new Almacen();

        if (this.getElegirCine().equals("de verano") || this.getElegirCine().equals("en aparcamiento") || this.getElegirCine().equals("en centro comercial")) {
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirCine()));
            this.setLugares(a.consultaLugares());
            this.setPatrocinadores(a.consultaPatrocinadores());
>>>>>>> Stashed changes
            return SUCCESS;
        }
        return ERROR;
    }
<<<<<<< Updated upstream
    
    public String comunion() throws SQLException{
        Almacen a = new Almacen();
        
        if(this.getElegirComunion().equals("colectiva") || this.getElegirComunion().equals("uniformada") || this.getElegirComunion().equals("domiciliaria") || this.getElegirComunion().equals("simbolica")){
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirComunion()));
=======

    public String comunion() throws SQLException {
        Almacen a = new Almacen();

        if (this.getElegirComunion().equals("colectiva") || this.getElegirComunion().equals("uniformada") || this.getElegirComunion().equals("domiciliaria") || this.getElegirComunion().equals("simbólica")) {
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirComunion()));
            this.setLugares(a.consultaLugares());
            this.setPatrocinadores(a.consultaPatrocinadores());
>>>>>>> Stashed changes
            return SUCCESS;
        }
        return ERROR;
    }
<<<<<<< Updated upstream
    
    public String concierto() throws SQLException{
        Almacen a = new Almacen();
        
        if(this.getElegirConcierto().equals("benefico") || this.getElegirConcierto().equals("clasico") || this.getElegirConcierto().equals("intimo")){
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirConcierto()));
=======

    public String concierto() throws SQLException {
        Almacen a = new Almacen();

        if (this.getElegirConcierto().equals("benéfico") || this.getElegirConcierto().equals("clásico") || this.getElegirConcierto().equals("íntimo")) {
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirConcierto()));
            this.setLugares(a.consultaLugares());
            this.setPatrocinadores(a.consultaPatrocinadores());
>>>>>>> Stashed changes
            return SUCCESS;
        }
        return ERROR;
    }
<<<<<<< Updated upstream
    
    public String cumpleaños() throws SQLException{
        Almacen a = new Almacen();
        
        if(this.getElegirCumpleaños().equals("escape room") || this.getElegirCumpleaños().equals("paintball") || this.getElegirCumpleaños().equals("tematica") || this.getElegirCumpleaños().equals("disfraces")){
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirCumpleaños()));
            return SUCCESS;
        }
        return ERROR;
    }
    
    public String deporte() throws SQLException{
        Almacen a = new Almacen();
        
        if(this.getElegirDeporte().equals("al aire libre") || this.getElegirDeporte().equals("religiosa") || this.getElegirDeporte().equals("minimalista") || this.getElegirDeporte().equals("civil")){
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirDeporte()));
            return SUCCESS;
        }
        return ERROR;
    }
    
    public String fiesta() throws SQLException{
        Almacen a = new Almacen();
        
        if(this.getElegirFiesta().equals("religiosa") || this.getElegirFiesta().equals("social") || this.getElegirFiesta().equals("infantil")){
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirFiesta()));
=======

    public String cumpleaños() throws SQLException {
        Almacen a = new Almacen();

        if (this.getElegirFiesta().equals("escape room") || this.getElegirFiesta().equals("paintball") || this.getElegirFiesta().equals("disfraces") || this.getElegirFiesta().equals("temática")) {
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirFiesta()));
            this.setLugares(a.consultaLugares());
            this.setPatrocinadores(a.consultaPatrocinadores());
>>>>>>> Stashed changes
            return SUCCESS;
        }
        return ERROR;
    }
<<<<<<< Updated upstream
    
    public String eventoP() throws SQLException{
        Almacen a = new Almacen();
        
        return SUCCESS;
    }
    
=======

    public String deporte() throws SQLException {
        Almacen a = new Almacen();

        if (this.getElegirDeporte().equals("halterofilia") || this.getElegirDeporte().equals("campeonato") || this.getElegirDeporte().equals("pachanga")) {
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirDeporte()));
            this.setLugares(a.consultaLugares());
            this.setPatrocinadores(a.consultaPatrocinadores());
            return SUCCESS;
        }
        return ERROR;
    }

    public String fiesta() throws SQLException {
        Almacen a = new Almacen();

        if (this.getElegirFiesta().equals("\"legal\"") || this.getElegirFiesta().equals("social") || this.getElegirFiesta().equals("infantil")) {
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirFiesta()));
            this.setLugares(a.consultaLugares());
            this.setPatrocinadores(a.consultaPatrocinadores());
            return SUCCESS;
        }
        return ERROR;
    }

    public String eventoP() throws SQLException {
        Almacen a = new Almacen();
        Especializacion e = new Especializacion();

        e.setTipo(a.consultaTipo(this.getEventos()));
        e.setAudiovisuales(this.geteAud());
        e.setCatering(this.geteCat());
        e.setMusica(this.geteMus());
        e.setDecoracion(this.geteDec());
        this.setEspecializacion(e);
        this.setLugares(a.consultaLugares());
        this.setPatrocinadores(a.consultaPatrocinadores());
        return SUCCESS;
    }

>>>>>>> Stashed changes
    public String execute() throws Exception {
        return SUCCESS;
    }
    
}
