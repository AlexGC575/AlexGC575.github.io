package actions;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author Victor
 */
public class loginCheck extends ActionSupport implements SessionAware {
    
    private String username;
    private String password;
    private SessionMap<String,Object> sessionMap;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public loginCheck() {
    }
    
    public String execute() throws Exception {
        HttpSession session = ServletActionContext.getRequest().getSession(true);
		if (this.getUsername() != null) {

			if (this.getUsername().equals(this.getPassword())) {
				// add the attribute in session				
				sessionMap.put("username", this.getUsername());

				return SUCCESS;
			} else {
				
				return ERROR;
			}
		} else {

			String getSessionAttr = (String) session.getAttribute("username");
			
			if (getSessionAttr != null) {

				return SUCCESS;

			} else {
				return ERROR;
			}
		}
    }
    
    public String logout() throws Exception{
        if(sessionMap!=null){  
        sessionMap.invalidate();  
    }  
        return "OK";
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.sessionMap=(SessionMap)map;
    }
    
}
