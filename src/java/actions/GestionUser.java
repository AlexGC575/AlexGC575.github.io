/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.validator.annotations.DateRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.EmailValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.StringLengthFieldValidator;
import evento.Almacen;
import evento.Usuario;
import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author juanl
 */
public class GestionUser extends ActionSupport implements SessionAware{
    private SessionMap<String,Object> sessionMap;
    private String usuario;
    private String password;
  

    public SessionMap<String, Object> getSessionMap() {
        return sessionMap;
    }

    public void setSessionMap(SessionMap<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

 

    public String getUsuario() {
        return usuario;
    }
    
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Logger getLOG() {
        return LOG;
    }

    public static void setLOG(Logger LOG) {
        ActionSupport.LOG = LOG;
    }
    
    public GestionUser() {
    }
    
    public String execute() throws Exception {
   
        Almacen alm=new Almacen();
       Usuario user=alm.compruebaUser(this.getUsuario(),this.getPassword());
        if(user!=null){
            sessionMap.put("Usuario", user);
            
            return SUCCESS;
        }
        
    
    else return ERROR;
    }
    
    
   public String unlog()throws Exception{
       HttpSession session=ServletActionContext.getRequest().getSession(false);
        sessionMap.clear();
        session.invalidate();
        
        return SUCCESS;
   } 
   
    public String yaLogueado() throws Exception{
        return SUCCESS;
    }

    @Override
    public void setSession(Map<String, Object> map) {
    this.sessionMap=(SessionMap)map;
    }
    
}
