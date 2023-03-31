package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"register.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <section>\n");
      out.write("            <div class=\"form-box\">\n");
      out.write("                <div class=\"form-value\">\n");
      out.write("        <form action=\"main.jsp\" autocomplete=\"off\">\n");
      out.write("            <h2>Registrarse</h2>\n");
      out.write("            \n");
      out.write("            <div class=\"inputbox\">\n");
      out.write("                <ion-icon name=\"mail-outline\"></ion-icon>\n");
      out.write("               \n");
      out.write("            <input type=\"text\" name=\"email\" > \n");
      out.write("            <label for=\"\">Email:</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"inputbox\">\n");
      out.write("                <ion-icon name=\"pricetag-outline\"></ion-icon>\n");
      out.write("               \n");
      out.write("            <input type=\"text\" name=\"nombre\" > \n");
      out.write("            <label for=\"\">Nombre:</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"inputbox\">\n");
      out.write("                <ion-icon name=\"pricetags-outline\"></ion-icon>\n");
      out.write("               \n");
      out.write("            <input type=\"text\" name=\"apellidos\" > \n");
      out.write("            <label for=\"\">Apellidos:</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"inputbox\">\n");
      out.write("                <ion-icon name=\"calendar-outline\"></ion-icon>\n");
      out.write("               \n");
      out.write("            <input type=\"date\" name=\"fecha\" value=\"\" > \n");
      out.write("            <label for=\"\">Fecha de nacimiento:</label>\n");
      out.write("            </div>\n");
      out.write("            <link href=\"register.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("            <div class=\"inputbox\">\n");
      out.write("                <ion-icon name=\"call-outline\"></ion-icon>\n");
      out.write("               \n");
      out.write("            <input type=\"text\" name=\"tlfn\" > \n");
      out.write("            <label for=\"\">Telefono:</label>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"inputbox\">\n");
      out.write("                \n");
      out.write("                <ion-icon name=\"lock-closed-outline\"></ion-icon>\n");
      out.write("               \n");
      out.write("            <input  type=\"password\" name=\"password\">\n");
      out.write("            <ion-icon name=\"lock-closed-outline\"></ion-icon>\n");
      out.write("             <label for=\"\">Contraseña:</label>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"hidden\" name=\"accion\" value=\"Log in\">\n");
      out.write("            <input class=\"login\" type=\"submit\" name=\"login\" value=\"Registrarse\">\n");
      out.write("           \n");
      out.write("        </form>\n");
      out.write("                    <div class=\"register\">\n");
      out.write("                        <p>¿Ya tienes cuenta? <a href=\"login.jsp\">Logueate</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("            <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("        </section> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
