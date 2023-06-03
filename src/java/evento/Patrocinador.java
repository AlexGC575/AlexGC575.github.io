package evento;
// Generated May 30, 2023 1:23:05 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Patrocinador generated by hbm2java
 */
public class Patrocinador  implements java.io.Serializable {


     private String nombre;
     private String descripcion;
     private int ninvitados;
     private int descuento;
     private int telefono;
     private String email;
     private Set eventos = new HashSet(0);

    public Patrocinador() {
    }

	
    public Patrocinador(String nombre, String descripcion, int ninvitados, int descuento, int telefono, String email) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ninvitados = ninvitados;
        this.descuento = descuento;
        this.telefono = telefono;
        this.email = email;
    }
    public Patrocinador(String nombre, String descripcion, int ninvitados, int descuento, int telefono, String email, Set eventos) {
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.ninvitados = ninvitados;
       this.descuento = descuento;
       this.telefono = telefono;
       this.email = email;
       this.eventos = eventos;
    }
   
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getNinvitados() {
        return this.ninvitados;
    }
    
    public void setNinvitados(int ninvitados) {
        this.ninvitados = ninvitados;
    }
    public int getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getEventos() {
        return this.eventos;
    }
    
    public void setEventos(Set eventos) {
        this.eventos = eventos;
    }




}

