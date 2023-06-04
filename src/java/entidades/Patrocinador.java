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
import javax.persistence.Lob;
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
 * @author juanl
 */
@Entity
@Table(name = "patrocinador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Patrocinador.findAll", query = "SELECT p FROM Patrocinador p")
    , @NamedQuery(name = "Patrocinador.findByNombre", query = "SELECT p FROM Patrocinador p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Patrocinador.findByNInvitados", query = "SELECT p FROM Patrocinador p WHERE p.nInvitados = :nInvitados")
    , @NamedQuery(name = "Patrocinador.findByDescuento", query = "SELECT p FROM Patrocinador p WHERE p.descuento = :descuento")
    , @NamedQuery(name = "Patrocinador.findByTelefono", query = "SELECT p FROM Patrocinador p WHERE p.telefono = :telefono")
    , @NamedQuery(name = "Patrocinador.findByEmail", query = "SELECT p FROM Patrocinador p WHERE p.email = :email")})
public class Patrocinador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NInvitados")
    private int nInvitados;
    @Basic(optional = false)
    @NotNull
    @Column(name = "descuento")
    private int descuento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "telefono")
    private int telefono;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Correo electrónico no válido")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "email")
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patrocinador")
    private Collection<Evento> eventoCollection;

    public Patrocinador() {
    }

    public Patrocinador(String nombre) {
        this.nombre = nombre;
    }

    public Patrocinador(String nombre, String descripcion, int nInvitados, int descuento, int telefono, String email) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nInvitados = nInvitados;
        this.descuento = descuento;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNInvitados() {
        return nInvitados;
    }

    public void setNInvitados(int nInvitados) {
        this.nInvitados = nInvitados;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof Patrocinador)) {
            return false;
        }
        Patrocinador other = (Patrocinador) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Patrocinador[ nombre=" + nombre + " ]";
    }
    
}
