/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evento;

/**
 *
 * @author User
 */
import java.sql.SQLException;
import org.hibernate.Query;
import org.hibernate.Session;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
        session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx=session.beginTransaction();
        Query q=session.createQuery("From Usuario where email='"+user+"' and contrasenya='"+pass+"'");
        Usuario u = (Usuario)q.uniqueResult();
        tx.commit();
        return u;
    }
    
    public Usuario consultaUsuario(String user){
        session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx=session.beginTransaction();
        Query q=session.createQuery("From Usuario where email='"+user+"'");
        Usuario u = (Usuario)q.uniqueResult();
        tx.commit();
        return u;
    }
    
    public List<String> consultaTipos() throws SQLException{
        session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Tipo> lc = new ArrayList();
        List<String> l = new ArrayList();
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Tipo");
        lc = q.list();
        tx.commit();
        Iterator <Tipo>i = lc.iterator();
        while(i.hasNext()){
            l.add(i.next().getNombre());         
        }
        return l;
    }
    
    public List<Especializacion> consultaEspecializaciones (String tipo)throws SQLException {
       session = NewHibernateUtil.getSessionFactory().getCurrentSession();
       List<Especializacion> l = new ArrayList();
       org.hibernate.Transaction tx = session.beginTransaction();
       Query q = session.createQuery("from Especializacion where tipo = '" + tipo +"'");
       l = q.list();
       tx.commit();
       return l;
    }
    
    public List<Patrocinador> consultaPatrocinadores ()throws SQLException {
       session = NewHibernateUtil.getSessionFactory().getCurrentSession();
       List<Patrocinador> l = new ArrayList();
       org.hibernate.Transaction tx = session.beginTransaction();
       Query q = session.createQuery("from Patrocinador");
       l = q.list();
       tx.commit();
       return l;
    }
    
    public Patrocinador consultaPatrocinador (String nombre)throws SQLException {
       session = NewHibernateUtil.getSessionFactory().getCurrentSession();
       Patrocinador p = null;
       org.hibernate.Transaction tx = session.beginTransaction();
       Query q = session.createQuery("from Patrocinador where nombre = '" + nombre +"'");
       p = (Patrocinador) q.uniqueResult();
       tx.commit();
       return p;
    }
    
    public List<Lugar> consultaLugares ()throws SQLException {
       session = NewHibernateUtil.getSessionFactory().getCurrentSession();
       List<Lugar> l = new ArrayList();
       org.hibernate.Transaction tx = session.beginTransaction();
       Query q = session.createQuery("from Lugar");
       l = q.list();
       tx.commit();
       return l;
    }
    
    public Lugar consultaLugar (String nombre)throws SQLException {
       session = NewHibernateUtil.getSessionFactory().getCurrentSession();
       Lugar l = null;
       org.hibernate.Transaction tx = session.beginTransaction();
       Query q = session.createQuery("from Lugar where nombre = '" + nombre +"'");
       l = (Lugar) q.uniqueResult();
       tx.commit();
       return l;
    }
    
    public Especializacion consultaEspecializacion (String nombre)throws SQLException {
       session = NewHibernateUtil.getSessionFactory().getCurrentSession();
       Especializacion e = null;
       org.hibernate.Transaction tx = session.beginTransaction();
       Query q = session.createQuery("from Especializacion where nombre = '" + nombre +"'");
       e = (Especializacion) q.uniqueResult();
       tx.commit();
       return e;
    }
    
    public Pago consultaTarjeta (String nombre)throws SQLException {
       session = NewHibernateUtil.getSessionFactory().getCurrentSession();
       Pago p = null;
       org.hibernate.Transaction tx = session.beginTransaction();
       Query q = session.createQuery("from Pago where usuario = '" + nombre +"'");
       p = (Pago) q.uniqueResult();
       tx.commit();
       return p;
    }
    
    public void altaUser(Usuario user) {
        session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx=session.beginTransaction();
        session.save(user);
        tx.commit();
    }
    
    public void altaEvento(Evento e) {
        session=NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx=session.beginTransaction();
        session.save(e);
        tx.commit();
    }
}
