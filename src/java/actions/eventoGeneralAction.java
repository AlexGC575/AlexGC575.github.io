/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import static com.opensymphony.xwork2.Action.ERROR;
import com.opensymphony.xwork2.ActionSupport;
import evento.Almacen;
import evento.Especializacion;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class eventoGeneralAction extends ActionSupport {
    private String elegirBoda;
    private Especializacion especializacion;

    public String getElegirBoda() {
        return elegirBoda;
    }

    public void setElegirBoda(String elegirBoda) {
        this.elegirBoda = elegirBoda;
    }

    public Especializacion getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(Especializacion especializacion) {
        this.especializacion = especializacion;
    }
    
    public eventoGeneralAction() {
    }
    
    public String boda() throws SQLException{
        Almacen a = new Almacen();
        
        if(this.getElegirBoda().equals("al aire libre") || this.getElegirBoda().equals("religiosa") || this.getElegirBoda().equals("minimalista") || this.getElegirBoda().equals("civil")){
            this.setEspecializacion(a.consultaEspecializacion(this.getElegirBoda()));
            return SUCCESS;
        }
        return ERROR;
    }
    
    public String execute() throws Exception {
        return SUCCESS;
    }
    
}
