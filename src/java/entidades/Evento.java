/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "evento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evento.findAll", query = "SELECT e FROM Evento e")
    , @NamedQuery(name = "Evento.findById", query = "SELECT e FROM Evento e WHERE e.id = :id")
    , @NamedQuery(name = "Evento.findByFecha", query = "SELECT e FROM Evento e WHERE e.fecha = :fecha")
    , @NamedQuery(name = "Evento.findByHoraInicio", query = "SELECT e FROM Evento e WHERE e.horaInicio = :horaInicio")
    , @NamedQuery(name = "Evento.findByHoraFin", query = "SELECT e FROM Evento e WHERE e.horaFin = :horaFin")
    , @NamedQuery(name = "Evento.findByCatering", query = "SELECT e FROM Evento e WHERE e.catering = :catering")
    , @NamedQuery(name = "Evento.findByMusica", query = "SELECT e FROM Evento e WHERE e.musica = :musica")
    , @NamedQuery(name = "Evento.findByDecoracion", query = "SELECT e FROM Evento e WHERE e.decoracion = :decoracion")
    , @NamedQuery(name = "Evento.findByAudiovisuales", query = "SELECT e FROM Evento e WHERE e.audiovisuales = :audiovisuales")
    , @NamedQuery(name = "Evento.findByReligion", query = "SELECT e FROM Evento e WHERE e.religion = :religion")
    , @NamedQuery(name = "Evento.findByPrecio", query = "SELECT e FROM Evento e WHERE e.precio = :precio")
    , @NamedQuery(name = "Evento.findByPagado", query = "SELECT e FROM Evento e WHERE e.pagado = :pagado")})
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "horaInicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaInicio;
    @Column(name = "horaFin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaFin;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "pagado")
    private boolean pagado;
    @ManyToMany(mappedBy = "eventoCollection")
    private Collection<Empresa> empresaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "evento")
    private Collection<Asistente> asistenteCollection;
    @JoinColumn(name = "resenya", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Resenya resenya;
    @JoinColumn(name = "usuario", referencedColumnName = "email")
    @ManyToOne(optional = false)
    private Usuario usuario;
    @JoinColumn(name = "patrocinador", referencedColumnName = "nombre")
    @ManyToOne(optional = false)
    private Patrocinador patrocinador;
    @JoinColumn(name = "lugar", referencedColumnName = "nombre")
    @ManyToOne(optional = false)
    private Lugar lugar;
    @JoinColumn(name = "tipo", referencedColumnName = "nombre")
    @ManyToOne(optional = false)
    private Tipo tipo;

    public Evento() {
    }

    public Evento(Integer id) {
        this.id = id;
    }

    public Evento(Integer id, Date fecha, Date horaInicio, String catering, String musica, String decoracion, String audiovisuales, String religion, float precio, boolean pagado) {
        this.id = id;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.catering = catering;
        this.musica = musica;
        this.decoracion = decoracion;
        this.audiovisuales = audiovisuales;
        this.religion = religion;
        this.precio = precio;
        this.pagado = pagado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
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

    public boolean getPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    @XmlTransient
    public Collection<Empresa> getEmpresaCollection() {
        return empresaCollection;
    }

    public void setEmpresaCollection(Collection<Empresa> empresaCollection) {
        this.empresaCollection = empresaCollection;
    }

    @XmlTransient
    public Collection<Asistente> getAsistenteCollection() {
        return asistenteCollection;
    }

    public void setAsistenteCollection(Collection<Asistente> asistenteCollection) {
        this.asistenteCollection = asistenteCollection;
    }

    public Resenya getResenya() {
        return resenya;
    }

    public void setResenya(Resenya resenya) {
        this.resenya = resenya;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Patrocinador getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(Patrocinador patrocinador) {
        this.patrocinador = patrocinador;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evento)) {
            return false;
        }
        Evento other = (Evento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Evento[ id=" + id + " ]";
    }
    
}
