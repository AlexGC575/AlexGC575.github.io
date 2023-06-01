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
 * @author juanl
 */
@Entity
@Table(name = "especializacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Especializacion.findAll", query = "SELECT e FROM Especializacion e")
    , @NamedQuery(name = "Especializacion.findByNombre", query = "SELECT e FROM Especializacion e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Especializacion.findByCatering", query = "SELECT e FROM Especializacion e WHERE e.catering = :catering")
    , @NamedQuery(name = "Especializacion.findByMusica", query = "SELECT e FROM Especializacion e WHERE e.musica = :musica")
    , @NamedQuery(name = "Especializacion.findByDecoracion", query = "SELECT e FROM Especializacion e WHERE e.decoracion = :decoracion")
    , @NamedQuery(name = "Especializacion.findByAudiovisuales", query = "SELECT e FROM Especializacion e WHERE e.audiovisuales = :audiovisuales")
    , @NamedQuery(name = "Especializacion.findByReligion", query = "SELECT e FROM Especializacion e WHERE e.religion = :religion")
    , @NamedQuery(name = "Especializacion.findByPrecio", query = "SELECT e FROM Especializacion e WHERE e.precio = :precio")})
public class Especializacion implements Serializable {

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
    @Column(name = "catering")
    private String catering;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "musica")
    private String musica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "decoracion")
    private String decoracion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "audiovisuales")
    private String audiovisuales;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "religion")
    private String religion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "precio")
    private float precio;
    @JoinColumn(name = "tipo", referencedColumnName = "nombre")
    @ManyToOne(optional = false)
    private Tipo tipo;

    public Especializacion() {
    }

    public Especializacion(String nombre) {
        this.nombre = nombre;
    }

    public Especializacion(String nombre, String catering, String musica, String decoracion, String audiovisuales, String religion, float precio) {
        this.nombre = nombre;
        this.catering = catering;
        this.musica = musica;
        this.decoracion = decoracion;
        this.audiovisuales = audiovisuales;
        this.religion = religion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCatering() {
        return catering;
    }

    public void setCatering(String catering) {
        this.catering = catering;
    }

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public String getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(String decoracion) {
        this.decoracion = decoracion;
    }

    public String getAudiovisuales() {
        return audiovisuales;
    }

    public void setAudiovisuales(String audiovisuales) {
        this.audiovisuales = audiovisuales;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
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
        if (!(object instanceof Especializacion)) {
            return false;
        }
        Especializacion other = (Especializacion) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Especializacion[ nombre=" + nombre + " ]";
    }
    
}
