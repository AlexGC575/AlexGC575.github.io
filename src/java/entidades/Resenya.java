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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "resenya")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Resenya.findAll", query = "SELECT r FROM Resenya r")
    , @NamedQuery(name = "Resenya.findById", query = "SELECT r FROM Resenya r WHERE r.id = :id")
    , @NamedQuery(name = "Resenya.findByCalificacion", query = "SELECT r FROM Resenya r WHERE r.calificacion = :calificacion")
    , @NamedQuery(name = "Resenya.findByTitulo", query = "SELECT r FROM Resenya r WHERE r.titulo = :titulo")})
public class Resenya implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "calificacion")
    private int calificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "opinion")
    private String opinion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resenya")
    private Collection<Evento> eventoCollection;
    @JoinColumn(name = "usuario", referencedColumnName = "email")
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Resenya() {
    }

    public Resenya(Integer id) {
        this.id = id;
    }

    public Resenya(Integer id, int calificacion, String titulo, String opinion) {
        this.id = id;
        this.calificacion = calificacion;
        this.titulo = titulo;
        this.opinion = opinion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    @XmlTransient
    public Collection<Evento> getEventoCollection() {
        return eventoCollection;
    }

    public void setEventoCollection(Collection<Evento> eventoCollection) {
        this.eventoCollection = eventoCollection;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Resenya)) {
            return false;
        }
        Resenya other = (Resenya) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Resenya[ id=" + id + " ]";
    }
    
}
