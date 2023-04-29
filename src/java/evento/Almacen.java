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

/**
 *
 * @author adrii_gil99
 */
public class Almacen {
    
    Session session = null;
    
    public Almacen(){
        
    }
    
    public List<String> consultaTipos() throws SQLException{
        session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        List<Tipo> lc = new ArrayList();
        List<String> l = new ArrayList();
        Tipo t = null;
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
}
