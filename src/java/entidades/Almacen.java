/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author User
 */
import client.*;

import java.sql.SQLException;
import org.hibernate.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.ws.rs.core.GenericType;

public class Almacen {

    Session session = null;

    public Almacen() {

    }

    //Devuelve un usuario que coincida con el email y la contraseña
    public Usuario compruebaUser(String user, String pass) {
        ClienteUsuario client = new ClienteUsuario();
        GenericType<Usuario> genericType = new GenericType<Usuario>() {
        };
        return (Usuario) client.find_XML(genericType, user);
    }

    //Devuelve el usuario que corresponda con el email introducido
    public Usuario consultaUsuario(String user) {
        ClienteUsuario client = new ClienteUsuario();
        GenericType<Usuario> genericType = new GenericType<Usuario>() {
        };
        return (Usuario) client.find_XML(genericType, user);
    }

    //Devuelve la lista de todas las empresas
    public List<Empresa> consultaEmpresas() throws SQLException {
        ClienteEmpresa client = new ClienteEmpresa();
        GenericType<List<Empresa>> genericType = new GenericType<List<Empresa>>() {
        };
        return client.findAll_XML(genericType);
    }

    //Devuelve un tipo de evento por nombre
    public Tipo consultaTipo(String tipo) throws SQLException {
        ClienteTipo client = new ClienteTipo();
        GenericType<Tipo> genericType = new GenericType<Tipo>() {
        };
        return (Tipo) client.find_XML(genericType, tipo);
    }

    //Devuelve la lista de patrocinadores
    public List<Patrocinador> consultaPatrocinadores() throws SQLException {
        ClientePatrocinador client = new ClientePatrocinador();
        GenericType<List<Patrocinador>> genericType = new GenericType<List<Patrocinador>>() {
        };
        return client.findAll_XML(genericType);
    }

    //Devuelve un patrocinador por nombre
    public Patrocinador consultaPatrocinador(String nombre) throws SQLException {
        ClientePatrocinador client = new ClientePatrocinador();
        GenericType<Patrocinador> genericType = new GenericType<Patrocinador>() {
        };
        return (Patrocinador) client.find_XML(genericType, nombre);
    }

    //Devuelve la lista de tipos
    public List<String> consultaTipos() throws SQLException {
        ClienteTipo client = new ClienteTipo();
        GenericType<List<Tipo>> genericType = new GenericType<List<Tipo>>() {
        };
        List<Tipo> lc = new ArrayList<Tipo>();
        lc = (List<Tipo>) client.findAll_XML(genericType);
        List<String> l = new ArrayList<String>();

        Iterator<Tipo> i = lc.iterator();
        while (i.hasNext()) {
            l.add(i.next().getNombre());
        }
        return l;
    }

    //Devuelve la lista de lugares
    public List<Lugar> consultaLugares() throws SQLException {
        ClienteLugar client = new ClienteLugar();
        GenericType<List<Lugar>> genericType = new GenericType<List<Lugar>>() {
        };
        return client.findAll_XML(genericType);
    }

    //Devuelve un lugar por nombre
    public Lugar consultaLugar(String nombre) throws SQLException {
        ClienteLugar client = new ClienteLugar();
        GenericType<Lugar> genericType = new GenericType<Lugar>() {
        };
        return (Lugar) client.find_XML(genericType, nombre);
    }

    //Devuelve un pago por nombre de usuario
    public Pago consultaTarjeta(String nombre) throws SQLException {
        ClientePago client = new ClientePago();
        GenericType<List<Pago>> genericType = new GenericType<List<Pago>>() {
        };

        List<Pago> pago = client.findAll_XML(genericType);
        for (Pago p : pago) {
            if (p.getPagoPK().getUsuario().equals(nombre)) {
                return p;
            }
        }
        return null;
    }

    //Crea un nuevo evento en la tabla evento
    public void altaEvento(Evento e) {
        ClienteEvento event = new ClienteEvento();
        event.create_XML(e);
    }

    //Devuelve una lista de especializaciones por tipo
    public List<Especializacion> consultaEspecializaciones(String tipo) throws SQLException {
        ClienteEspecializacion client = new ClienteEspecializacion();
        GenericType<List<Especializacion>> genericType = new GenericType<List<Especializacion>>() {
        };
        List<Especializacion> especializacion = client.findAll_XML(genericType);
        List<Especializacion> le = new ArrayList<Especializacion>();
        for (Especializacion esp : especializacion) {
            if (esp.getTipo().getNombre().equals(tipo)) {
                le.add(esp);
            }
        }
        return le;
    }

    //Devuelve una especializacion por nombre
    public Especializacion consultaEspecializacion(String nombre) throws SQLException {
        ClienteEspecializacion client = new ClienteEspecializacion();
        GenericType<Especializacion> genericType = new GenericType<Especializacion>() {
        };

        return (Especializacion) client.find_XML(genericType, nombre);
    }

    //Crea un nuevo usuario en la tabla usuario
    public void altaUser(Usuario user) {
        ClienteUsuario client = new ClienteUsuario();

        client.create_XML(user);
    }

    //Crea un nuevo pago en la tabla pago
    public void altaPago(Pago p) {
        ClientePago client = new ClientePago();
        client.create_XML(p);

    }

    //Crea una nueva empresa en la tabla empresa
    public void altaEmpresa(Empresa emp) {
        ClienteEmpresa client = new ClienteEmpresa();
        client.create_XML(emp);
    }

    //Elimina una empresa por nombre
    public void bajaEmpresa(String nombreb) {
        ClienteEmpresa client = new ClienteEmpresa();
        client.remove(nombreb);
    }

    //Modifica el nombre de una empresa
    public void modEmpresa(Empresa emp, String nombreb) {
        ClienteEmpresa client = new ClienteEmpresa();

        client.edit_XML(emp, nombreb);
    }

    //Devuelve la lista de empresas
    public List<Empresa> obtenerEmpresas() {
        ClienteEmpresa client = new ClienteEmpresa();
        GenericType<List<Empresa>> genericType = new GenericType<List<Empresa>>() {
        };
        return client.findAll_XML(genericType);
    }

    //Modifica el correo de un usuario
    public void modificarUser(Usuario user, String email) {
        ClienteUsuario client = new ClienteUsuario();

        client.edit_XML(user, email);
    }

    //Borra el usuario asociado al correo indicado
    public void borrarUser(String email) {
        ClienteUsuario client = new ClienteUsuario();

        client.remove(email);
    }

    //Crea una nueva reseña
    public void altaResenya(int id, int calificacion, String titulo, String opinion, Usuario u) {
        ClienteResenya event = new ClienteResenya();
        Resenya r = new Resenya(id, calificacion, titulo, opinion);
        r.setUsuario(u);
        event.create_XML(r);
    }

    //Devuelve una empresa por nombre
    public Empresa consultaEmpresa(String nombre) throws SQLException {
        ClienteEmpresa client = new ClienteEmpresa();
        GenericType<Empresa> genericType = new GenericType<Empresa>() {
        };

        return (Empresa) client.find_XML(genericType, nombre);
    }

    //Devuelve un evento por id
    public Evento consultaEvento(int evento) {
        ClienteEvento client = new ClienteEvento();
        GenericType<Evento> genericType = new GenericType<Evento>() {
        };
        return (Evento) client.find_XML(genericType, Integer.toString(evento));
    }

    //Crea una nueva reseña
    public void altaResenya(Resenya resenya) {
        ClienteEvento event = new ClienteEvento();

        event.create_XML(resenya);
    }

    //Devuelve una lista de mensajes asociado a un usuario
    public List<Mensaje> consultaMensajes(String usuario) {
        ClienteMensaje client = new ClienteMensaje();
        GenericType<List<Mensaje>> genericType = new GenericType<List<Mensaje>>() {
        };
        List<Mensaje> especializacion = client.findAll_XML(genericType);
        List<Mensaje> le = new ArrayList<Mensaje>();
        for (Mensaje esp : especializacion) {
            if (esp.getUsuario().getEmail().equals(usuario)) {
                le.add(esp);
            }
        }
        return le;
    }

    //Devuelve una lista de direcciones asociada al usuario
    public List<Direccion> consultaDirecciones(String usuario) {
        ClienteDireccion client = new ClienteDireccion();
        GenericType<List<Direccion>> genericType = new GenericType<List<Direccion>>() {
        };
        List<Direccion> dirs = new ArrayList<Direccion>();
        List<Direccion> dir = client.findAll_XML(genericType);
        for (Direccion p : dir) {
            if (p.getDireccionPK().getUsuario().equals(usuario)) {
                dirs.add(p);
            }
        }
        return dirs;
    }

    //Devuelve una lista de eventos asociada al usuario
    public List<Evento> consultaEventos(String usuario) {
        ClienteEvento client = new ClienteEvento();
        GenericType<List<Evento>> genericType = new GenericType<List<Evento>>() {
        };
        List<Evento> especializacion = client.findAll_XML(genericType);
        List<Evento> le = new ArrayList<Evento>();
        for (Evento esp : especializacion) {
            if (esp.getUsuario().getEmail().equals(usuario)) {
                le.add(esp);
            }
        }
        return le;
    }

    //Obtiene la lista de eventos
    public List<Evento> consultaEventos() {
        ClienteEvento client = new ClienteEvento();
        GenericType<List<Evento>> genericType = new GenericType<List<Evento>>() {
        };
        List<Evento> e = client.findAll_XML(genericType);
        return e;
    }

    //Crea un nuevo lugar
    public void altaLugar(Lugar l) {
        ClienteLugar client = new ClienteLugar();
        client.create_XML(l);
    }

    //Elimina un lugar
    public void bajaLugar(String l) {
        ClienteLugar client = new ClienteLugar();
        client.remove(l);
    }

    //Modifica el nombre de un lugar
    public void modLugar(Lugar l, String nombreb) {
        ClienteLugar client = new ClienteLugar();

        client.edit_XML(l, nombreb);
    }

    //Crea un patrocinador
    public void altaPatrocinador(Patrocinador l) {
        ClientePatrocinador client = new ClientePatrocinador();
        client.create_XML(l);
    }

    //Elimina un patrocinador
    public void bajaPatrocinador(String l) {
        ClientePatrocinador client = new ClientePatrocinador();
        client.remove(l);
    }

    //Modifica el nombre de un patrocinador
    public void modPatrocinador(Patrocinador l, String nombreb) {
        ClientePatrocinador client = new ClientePatrocinador();

        client.edit_XML(l, nombreb);
    }

    //Crea una nueva especializacion
    public void altaEspecializacion(Especializacion l) {
        ClienteEspecializacion client = new ClienteEspecializacion();
        client.create_XML(l);
    }

    //Elimina una especializacion
    public void bajaEspecializacion(String l) {
        ClienteEspecializacion client = new ClienteEspecializacion();
        client.remove(l);
    }

    //Modifica el nombre de una especializacion
    public void modEspecializacion(Especializacion l, String nombreb) {
        ClienteEspecializacion client = new ClienteEspecializacion();

        client.edit_XML(l, nombreb);
    }
}
