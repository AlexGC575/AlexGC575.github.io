/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

/**
 *
 * @author User
 */

import com.opensymphony.xwork2.ActionSupport;
import evento.Almacen;
import evento.Tipo;
import java.util.List;

public class eventoAction extends ActionSupport{
    private List<Tipo> tipos;
    
    public eventoAction() {
    }
    
    public String eventoGeneral() throws Exception{
        System.out.println(tipos);
        if(tipos.equals("Boda")){
            return "B";
        }else if(tipos.equals("Boda")){
            return "B";  
        }else if(tipos.equals("Boda")){
            return "B";  
        }else if(tipos.equals("Boda")){
            return "B";  
        }else if(tipos.equals("Boda")){
            return "B";  
        }else if(tipos.equals("Boda")){
            return "B";  
        }else if(tipos.equals("Boda")){
            return "B";  
        }else if(tipos.equals("Boda")){
            return "B";  
        }else{
            return "B";  
        }
    }
    
    public String eventoOriginal() throws Exception{
        return SUCCESS;
    }

    public String execute() throws Exception{
        Almacen a = new Almacen();
        this.tipos = a.consultaTipos();
        return SUCCESS;
    }
    
}
