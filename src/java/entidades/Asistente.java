/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author User
 */
@Entity
@Table(name = "asistente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Asistente.findAll", query = "SELECT a FROM Asistente a")
    , @NamedQuery(name = "Asistente.findByDni", query = "SELECT a FROM Asistente a WHERE a.dni = :dni")
    , @NamedQuery(name = "Asistente.findByNombre", query = "SELECT a FROM Asistente a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Asistente.findByApellidos", query = "SELECT a FROM Asistente a WHERE a.apellidos = :apellidos")})
public class Asistente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "dni")
    private Integer dni;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "apellidos")
    private String apellidos;
    @JoinColumn(name = "evento", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Evento evento;

    public Asistente() {
    }

    public Asistente(Integer dni) {
        this.dni = dni;
    }

    public Asistente(Integer dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dni != null ? dni.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Asistente)) {
            return false;
        }
        Asistente other = (Asistente) object;
        if ((this.dni == null && other.dni != null) || (this.dni != null && !this.dni.equals(other.dni))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Asistente[ dni=" + dni + " ]";
    }
    
}
