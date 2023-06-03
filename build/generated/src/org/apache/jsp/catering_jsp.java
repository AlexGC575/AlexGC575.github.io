package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class catering_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
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
      out.write("\t\t<h2>Servicio de catering para eventos</h2>\r\n");
      out.write("\t\t<p>En nuestra empresa de organización de eventos, entendemos que cada detalle importa cuando se trata de crear una experiencia excepcional para tus invitados. Es por eso que ofrecemos servicios de catering de primera calidad que deleitarán a tus asistentes y elevarán tu evento a un nivel superior.</p>\r\n");
      out.write("                 <a href=\"main.jsp\">Crea tu evento</a><br>\r\n");
      out.write("                <p>Nuestro equipo de empresas expertas culinarias se enorgullece de ofrecer una variedad de opciones gastronómicas exquisitas y personalizadas para satisfacer los gustos y necesidades de cada ocasión.\r\n");
      out.write("                    \r\n");
      out.write("                    Ya sea que estés planeando una elegante recepción corporativa, una conferencia de alto nivel o una celebración privada, nuestro catering está diseñado para impresionar. \r\n");
      out.write("                    \r\n");
      out.write("                    Desde deliciosos aperitivos y platos principales hasta exquisitos postres, cada bocado está cuidadosamente elaborado con ingredientes frescos y de alta calidad. \r\n");
      out.write("                    \r\n");
      out.write("                    Nuestros talentosos chefs combinan sabores innovadores con técnicas culinarias excepcionales para crear platos visualmente impactantes y deliciosos. \r\n");
      out.write("                    \r\n");
      out.write("                    Además de la extraordinaria comida, nos aseguramos de que cada aspecto del servicio de catering sea impecable. Nuestro equipo de profesionales altamente capacitados y amables se encargará de todos los detalles logísticos, desde la presentación elegante hasta la atención personalizada a tus invitados. \r\n");
      out.write("                    \r\n");
      out.write("                    Entendemos la importancia de la presentación y la ambientación en un evento exitoso. Por eso, trabajamos en estrecha colaboración contigo para crear una decoración y una atmósfera que complementen tu visión. Ya sea que desees un estilo clásico y sofisticado o una temática temeraria y vanguardista, nuestro equipo de diseño de eventos puede hacerlo realidad. \r\n");
      out.write("                </p>\r\n");
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
