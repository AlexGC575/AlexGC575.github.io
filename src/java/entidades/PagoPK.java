/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author juanl
 */
@Embeddable
public class PagoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "tarjetoCredito")
    private long tarjetoCredito;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "usuario")
    private String usuario;

    public PagoPK() {
    }

    public PagoPK(long tarjetoCredito, String usuario) {
        this.tarjetoCredito = tarjetoCredito;
        this.usuario = usuario;
    }

    public long getTarjetoCredito() {
        return tarjetoCredito;
    }

    public void setTarjetoCredito(long tarjetoCredito) {
        this.tarjetoCredito = tarjetoCredito;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) tarjetoCredito;
        hash += (usuario != null ? usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PagoPK)) {
            return false;
        }
        PagoPK other = (PagoPK) object;
        if (this.tarjetoCredito != other.tarjetoCredito) {
            return false;
        }
        if ((this.usuario == null && other.usuario != null) || (this.usuario != null && !this.usuario.equals(other.usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.PagoPK[ tarjetoCredito=" + tarjetoCredito + ", usuario=" + usuario + " ]";
    }
    
}
