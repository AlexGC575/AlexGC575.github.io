package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class musica_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\t<title>Música para eventos</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<header>\n");
      out.write("\t\t<h1>Música para eventos</h1>\n");
      out.write("\t\t<nav>\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li><a href=\"/\">Inicio</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#servicios\">Servicios</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#artistas\">Artistas</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#galeria\">Galería</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#contacto\">Contacto</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("php\n");
      out.write("Copy code\n");
      out.write("<main>\n");
      out.write("\t<section id=\"banner\">\n");
      out.write("\t\t<h2>Servicio de música para eventos</h2>\n");
      out.write("\t\t<p>En nuestra empresa ofrecemos un servicio de música completo para todo tipo de eventos. Desde bodas y cumpleaños hasta eventos corporativos y ferias, tenemos el artista perfecto para tu ocasión especial.</p>\n");
      out.write("\t\t<a href=\"#contacto\">Solicita información</a>\n");
      out.write("\t</section>\n");
      out.write("\t\n");
      out.write("\t<section id=\"servicios\">\n");
      out.write("\t\t<h2>Nuestros servicios</h2>\n");
      out.write("\t\t<p>Ofrecemos un servicio de música completo para todo tipo de eventos. Algunos de nuestros servicios incluyen:</p>\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li>Artistas en vivo para cualquier tipo de evento</li>\n");
      out.write("\t\t\t<li>DJ profesionales con equipo de sonido de alta calidad</li>\n");
      out.write("\t\t\t<li>Iluminación especial para crear el ambiente perfecto</li>\n");
      out.write("\t\t\t<li>Asesoramiento personalizado para elegir la mejor opción de música para tu evento</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<a href=\"#contacto\">Solicita información</a>\n");
      out.write("\t</section>\n");
      out.write("\t\n");
      out.write("\t<section id=\"artistas\">\n");
      out.write("\t\t<h2>Nuestros artistas</h2>\n");
      out.write("\t\t<p>Ofrecemos una amplia selección de artistas para adaptarse a cualquier tipo de evento. Algunos de nuestros artistas más populares incluyen:</p>\n");
      out.write("\t\t<ul>\n");
      out.write("\t\t\t<li>Bandas de música en vivo: rock, pop, jazz, música latina, etc.</li>\n");
      out.write("\t\t\t<li>Cantantes solistas: pop, jazz, blues, música clásica, etc.</li>\n");
      out.write("\t\t\t<li>DJs: música electrónica, pop, rock, etc.</li>\n");
      out.write("\t\t\t<li>Grupos de baile: salsa, hip hop, flamenco, etc.</li>\n");
      out.write("\t\t</ul>\n");
      out.write("\t\t<a href=\"#contacto\">Solicita información</a>\n");
      out.write("\t</section>\n");
      out.write("\t\n");
      out.write("\t<section id=\"galeria\">\n");
      out.write("\t\t<h2>Galería de imágenes</h2>\n");
      out.write("\t\t<p>En esta sección encontrarás imágenes de algunos de nuestros eventos anteriores. </p>\n");
      out.write("\t\t<img src=\"img1.jpg\" alt=\"Imagen de evento\">\n");
      out.write("\t\t<img src=\"img2.jpg\" alt=\"Imagen de evento\">\n");
      out.write("\t\t<img src=\"img3.jpg\" alt=\"Imagen de evento\">\n");
      out.write("\t\t<a href=\"#contacto\">Solicita información</a>\n");
      out.write("\t</section>\n");
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
