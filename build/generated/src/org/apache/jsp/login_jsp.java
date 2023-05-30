<<<<<<< Updated upstream
=======
<<<<<<< HEAD
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html><head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"login.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login - Citas</title>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        ");

         if(session.getAttribute("usuario")==null){
        if(session.getAttribute("fallo")!=null){
            
      out.write("\n");
      out.write("            ");
      out.print(session.getAttribute("fallo"));
      out.write("\n");
      out.write("            ");

        }
        
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <div class=\"form-box\">\n");
      out.write("                <div class=\"form-value\">\n");
      out.write("        <form action=\"VetServlet\">\n");
      out.write("            <h2>Login</h2>\n");
      out.write("            <div class=\"inputbox\">\n");
      out.write("                <ion-icon name=\"person-outline\"></ion-icon>\n");
      out.write("               \n");
      out.write("            <input type=\"text\" name=\"usuario\" > \n");
      out.write("            <label for=\"\">Usuario:</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"inputbox\">\n");
      out.write("                <ion-icon name=\"lock-closed-outline\"></ion-icon>\n");
      out.write("               \n");
      out.write("            <input  type=\"password\" name=\"password\">\n");
      out.write("            <ion-icon name=\"lock-closed-outline\"></ion-icon>\n");
      out.write("             <label for=\"\">Contraseña:</label>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"hidden\" name=\"accion\" value=\"Log in\">\n");
      out.write("            <input class=\"login\" type=\"submit\" name=\"login\" value=\"Login\">\n");
      out.write("           \n");
      out.write("        </form>\n");
      out.write("                    <div class=\"register\">\n");
      out.write("                        <p>¿No tienes cuenta? <a href=\"#\">Registrate</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("            <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("        </section> \n");
      out.write("                \n");
      out.write("    ");

    }
else{
if(session.getAttribute("rol").equals("V")){

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("gestionCitas.jsp");
        return;
      }
      out.write('\n');

}
else{

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("misCitas.jsp");
        return;
      }
      out.write('\n');

}


}
    
      out.write("\n");
      out.write("</body></html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
=======
>>>>>>> Stashed changes
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html><head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"login.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login - Citas</title>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        ");

         if(session.getAttribute("usuario")==null){
        if(session.getAttribute("fallo")!=null){
            
      out.write("\n");
      out.write("            ");
      out.print(session.getAttribute("fallo"));
      out.write("\n");
      out.write("            ");

        }
        
      out.write("\n");
      out.write("        <section>\n");
      out.write("            <div class=\"form-box\">\n");
      out.write("                <div class=\"form-value\">\n");
      out.write("        <form action=\"VetServlet\">\n");
      out.write("            <h2>Login</h2>\n");
      out.write("            <div class=\"inputbox\">\n");
      out.write("                <ion-icon name=\"person-outline\"></ion-icon>\n");
      out.write("               \n");
      out.write("            <input type=\"text\" name=\"usuario\" > \n");
      out.write("            <label for=\"\">Usuario:</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"inputbox\">\n");
      out.write("                <ion-icon name=\"lock-closed-outline\"></ion-icon>\n");
      out.write("               \n");
      out.write("            <input  type=\"password\" name=\"password\">\n");
      out.write("            <ion-icon name=\"lock-closed-outline\"></ion-icon>\n");
      out.write("             <label for=\"\">Contraseña:</label>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"hidden\" name=\"accion\" value=\"Log in\">\n");
      out.write("            <input class=\"login\" type=\"submit\" name=\"login\" value=\"Login\">\n");
      out.write("           \n");
      out.write("        </form>\n");
      out.write("                    <div class=\"register\">\n");
      out.write("                        <p>¿No tienes cuenta? <a href=\"#\">Registrate</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("            <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("        </section> \n");
      out.write("                \n");
      out.write("    ");

    }
else{
if(session.getAttribute("rol").equals("V")){

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("gestionCitas.jsp");
        return;
      }
      out.write('\n');

}
else{

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("misCitas.jsp");
        return;
      }
      out.write('\n');

}


}
    
      out.write("\n");
      out.write("</body></html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
<<<<<<< Updated upstream
=======
>>>>>>> b58350bb2c966d15ba9bd44b947031aac05a7c58
>>>>>>> Stashed changes
