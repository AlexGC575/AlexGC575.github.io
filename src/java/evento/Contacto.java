package evento;
// Generated Apr 28, 2023 8:10:23 AM by Hibernate Tools 4.3.1



/**
 * Contacto generated by hbm2java
 */
public class Contacto  implements java.io.Serializable {


     private ContactoId id;
     private Empresa empresa;
     private String provincia;
     private String calle;
     private int numero;
     private int telefono;

    public Contacto() {
    }

    public Contacto(ContactoId id, Empresa empresa, String provincia, String calle, int numero, int telefono) {
       this.id = id;
       this.empresa = empresa;
       this.provincia = provincia;
       this.calle = calle;
       this.numero = numero;
       this.telefono = telefono;
    }
   
    public ContactoId getId() {
        return this.id;
    }
    
    public void setId(ContactoId id) {
        this.id = id;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getProvincia() {
        return this.provincia;
    }
    
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getCalle() {
        return this.calle;
    }
    
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }




}


