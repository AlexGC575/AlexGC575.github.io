package evento;
// Generated Apr 28, 2023 8:10:23 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Pago generated by hbm2java
 */
public class Pago  implements java.io.Serializable {


     private int tarjetaCredito;
     private Usuario usuario;
     private Date caducidad;
     private int evento;

    public Pago() {
    }

    public Pago(int tarjetaCredito, Usuario usuario, Date caducidad, int evento) {
       this.tarjetaCredito = tarjetaCredito;
       this.usuario = usuario;
       this.caducidad = caducidad;
       this.evento = evento;
    }
   
    public int getTarjetaCredito() {
        return this.tarjetaCredito;
    }
    
    public void setTarjetaCredito(int tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Date getCaducidad() {
        return this.caducidad;
    }
    
    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
    }
    public int getEvento() {
        return this.evento;
    }
    
    public void setEvento(int evento) {
        this.evento = evento;
    }




}


