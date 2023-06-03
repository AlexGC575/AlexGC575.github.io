package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class audiovisuales_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<title>Audiovisuales para eventos</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t <div class=\"all\">\r\n");
      out.write("\t<header >\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<nav class=\"naveg\">\r\n");
      out.write("                    <h1 class=\"logo\">U<span>party</span> </h1>\r\n");
      out.write("\t\t\t<ul class=\"navbar\">\r\n");
      out.write("\t\t\t\t<li><a href=\"eventos.jsp\">Eventos</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"decoracion.jsp\">Decoración</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"musica.jsp\">Música</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"catering.jsp\">Catering</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"audiovisuales.jsp\">Audiovisuales</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"empresas.jsp\">Empresas</a></li>\r\n");
      out.write("                                <s:if test=\"#session.Usuario!=null\">         \r\n");
      out.write("                                <s:form action=\"irPerfil\" theme=\"simple\" >\r\n");
      out.write("                                <s:submit cssClass=\"login\" name=\"irperfil\" value=\"Ver Perfil\"/>\r\n");
      out.write("                            </s:form>\r\n");
      out.write("                                </s:if>\r\n");
      out.write("                                <s:else >\r\n");
      out.write("                                <s:form action=\"irLogin\" theme=\"simple\" >\r\n");
      out.write("                                <s:submit cssClass=\"login\" name=\"irlogin\" value=\"Iniciar Sesión\"/>\r\n");
      out.write("                            </s:form>\r\n");
      out.write("                                </s:else>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("<main>\r\n");
      out.write("\t<section class=\"banner\" id=\"banner\">\r\n");
      out.write("\t\t<h2>Servicio de audiovisuales para eventos</h2>\r\n");
      out.write("\t\t<p>En nuestra empresa ofrecemos un servicio de audiovisuales completo para todo tipo de eventos. Desde conferencias y presentaciones hasta conciertos y espectáculos, contamos con el equipo técnico y humano para hacer de tu evento un éxito.</p>\r\n");
      out.write("                <a href=\"main.jsp\">Crea tu evento</a><br>\r\n");
      out.write("                <p>Nuestro equipo de empresas profesionales en tecnología audiovisual está altamente capacitado y cuenta con una amplia experiencia en la industria. Trabajaremos estrechamente contigo para comprender tus necesidades y objetivos, y diseñaremos una solución audiovisual personalizada que se adapte perfectamente a tu evento.\r\n");
      out.write("\r\n");
      out.write("Desde pantallas LED de alta definición y sistemas de sonido envolvente hasta iluminación espectacular y proyecciones audiovisuales impactantes, ofrecemos una amplia gama de equipos y servicios para cubrir todos los aspectos audiovisuales de tu evento. Nos aseguraremos de que cada detalle técnico esté cuidadosamente planificado y ejecutado, garantizando una calidad de sonido e imagen excepcionales.\r\n");
      out.write("\r\n");
      out.write("Además, nuestro equipo técnico estará presente durante todo el evento para supervisar la configuración y asegurarse de que todo funcione sin problemas. Ya sea que necesites transmitir presentaciones, reproducir videos, coordinar efectos especiales o crear ambientes de iluminación impresionantes, nos encargaremos de que todo salga a la perfección.\r\n");
      out.write("\r\n");
      out.write("Nuestra pasión por la innovación y la tecnología nos impulsa a estar al tanto de las últimas tendencias y avances en la industria audiovisual. Esto nos permite ofrecerte opciones vanguardistas y creativas, como mapping 3D, realidad virtual, sistemas interactivos y mucho más, para hacer de tu evento una experiencia verdaderamente única.\r\n");
      out.write("\r\n");
      out.write("En  Uparty, entendemos la importancia de la puntualidad y la confiabilidad. Nos aseguraremos de que todos los equipos estén instalados y funcionando correctamente antes del inicio de tu evento, y nos mantendremos disponibles para brindar asistencia técnica en todo momento.\r\n");
      out.write("</p>\r\n");
      out.write("\t</section>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      out.write("<footer>\r\n");
      out.write("\t<p>Derechos reservados &copy; 2023 Audiovisuales para eventos S.A.</p>\r\n");
      out.write("</footer>\r\n");
      out.write("         </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
