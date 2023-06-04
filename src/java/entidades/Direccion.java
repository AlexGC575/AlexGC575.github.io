/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "direccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direccion.findAll", query = "SELECT d FROM Direccion d")
    , @NamedQuery(name = "Direccion.findById", query = "SELECT d FROM Direccion d WHERE d.direccionPK.id = :id")
    , @NamedQuery(name = "Direccion.findByProvincia", query = "SELECT d FROM Direccion d WHERE d.provincia = :provincia")
    , @NamedQuery(name = "Direccion.findByCodigoPostal", query = "SELECT d FROM Direccion d WHERE d.codigoPostal = :codigoPostal")
    , @NamedQuery(name = "Direccion.findByCalle", query = "SELECT d FROM Direccion d WHERE d.calle = :calle")
    , @NamedQuery(name = "Direccion.findByNumero", query = "SELECT d FROM Direccion d WHERE d.numero = :numero")
    , @NamedQuery(name = "Direccion.findByUsuario", query = "SELECT d FROM Direccion d WHERE d.direccionPK.usuario = :usuario")})
public class Direccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DireccionPK direccionPK;
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
    @JoinColumn(name = "usuario", referencedColumnName = "email", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario1;

    public Direccion() {
    }

    public Direccion(DireccionPK direccionPK) {
        this.direccionPK = direccionPK;
    }

    public Direccion(DireccionPK direccionPK, String provincia, int codigoPostal, String calle, int numero) {
        this.direccionPK = direccionPK;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.calle = calle;
        this.numero = numero;
    }

    public Direccion(int id, String usuario) {
        this.direccionPK = new DireccionPK(id, usuario);
    }

    public DireccionPK getDireccionPK() {
        return direccionPK;
    }

    public void setDireccionPK(DireccionPK direccionPK) {
        this.direccionPK = direccionPK;
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

    public Usuario getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(Usuario usuario1) {
        this.usuario1 = usuario1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (direccionPK != null ? direccionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direccion)) {
            return false;
        }
        Direccion other = (Direccion) object;
        if ((this.direccionPK == null && other.direccionPK != null) || (this.direccionPK != null && !this.direccionPK.equals(other.direccionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Direccion[ direccionPK=" + direccionPK + " ]";
    }
    
}
