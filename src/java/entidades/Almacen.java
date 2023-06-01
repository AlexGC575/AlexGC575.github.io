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
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.ws.rs.core.GenericType;
import org.hibernate.Transaction;

/**
 *
 * @author adrii_gil99
 */
public class Almacen {
    
    Session session = null;
    
    public Almacen(){
        
    }
    
    public Usuario compruebaUser(String user, String pass){
        ClienteUsuario client=new ClienteUsuario();
     GenericType<Usuario> genericType=new GenericType<Usuario>(){};
       return (Usuario)client.find_XML(genericType, user);
    }
    
    public List<String> consultaTipos() throws SQLException{
         ClienteTipo client=new ClienteTipo();
       GenericType<List<Tipo>> genericType=new GenericType<List<Tipo>>(){};
     List<Tipo> lc=new ArrayList<Tipo>();
       lc=(List<Tipo>) client.findAll_XML(genericType);
       List<String> l=new ArrayList<String>();
       
        Iterator <Tipo>i = lc.iterator();
         while(i.hasNext()){
             l.add(i.next().getNombre());         
         }
         return l;
     }
    
    public List<Especializacion> consultaEspecializaciones (String tipo)throws SQLException {
       ClienteEspecializacion client=new ClienteEspecializacion();
       GenericType<List<Especializacion>> genericType=new GenericType<List<Especializacion>>(){};
       List<Especializacion> especializacion=client.findAll_XML(genericType);
       List<Especializacion> le=new ArrayList<Especializacion>();
       for(Especializacion esp: especializacion){
           if(esp.getTipo().getNombre().equals(tipo)){
               le.add(esp);
           }
       }
       return le;
    }
    
    public Especializacion consultaEspecializacion (String nombre)throws SQLException {
       ClienteEspecializacion client=new ClienteEspecializacion();
       GenericType<Especializacion> genericType=new GenericType<Especializacion>(){};
 
       return (Especializacion)client.find_XML(genericType, nombre);
    }
    
    public void altaUser(Usuario user) {
       ClienteUsuario client=new ClienteUsuario();
     client.create_XML(client);
     
    }

    public void altaUser(String email, String passregister, String nombre, String apellidos, Date fecha, int tlfn) {
    ClienteUsuario client=new ClienteUsuario();
     Usuario user=new Usuario(email,passregister,nombre,apellidos,fecha,tlfn);
       client.create_XML(user);
    }
}
