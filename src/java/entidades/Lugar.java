/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "lugar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lugar.findAll", query = "SELECT l FROM Lugar l")
    , @NamedQuery(name = "Lugar.findByNombre", query = "SELECT l FROM Lugar l WHERE l.nombre = :nombre")
    , @NamedQuery(name = "Lugar.findByProvincia", query = "SELECT l FROM Lugar l WHERE l.provincia = :provincia")
    , @NamedQuery(name = "Lugar.findByCodigoPostal", query = "SELECT l FROM Lugar l WHERE l.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "Lugar.findByCalle", query = "SELECT l FROM Lugar l WHERE l.calle = :calle")
    , @NamedQuery(name = "Lugar.findByNumero", query = "SELECT l FROM Lugar l WHERE l.numero = :numero")
    , @NamedQuery(name = "Lugar.findByAforo", query = "SELECT l FROM Lugar l WHERE l.aforo = :aforo")})
public class Lugar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "provincia")
    private String provincia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigoPostal")
    private int codigoPostal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "calle")
    private String calle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero")
    private int numero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aforo")
    private int aforo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lugar")
    private Collection<Evento> eventoCollection;

    public Lugar() {
    }

    public Lugar(String nombre) {
        this.nombre = nombre;
    }

    public Lugar(String nombre, String provincia, int codigoPostal, String calle, int numero, int aforo) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.calle = calle;
        this.numero = numero;
        this.aforo = aforo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    @XmlTransient
    public Collection<Evento> getEventoCollection() {
        return eventoCollection;
    }

    public void setEventoCollection(Collection<Evento> eventoCollection) {
        this.eventoCollection = eventoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombre != null ? nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lugar)) {
            return false;
        }
        Lugar other = (Lugar) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Lugar[ nombre=" + nombre + " ]";
    }
    
}
