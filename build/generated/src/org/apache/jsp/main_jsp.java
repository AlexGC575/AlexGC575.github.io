package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_theme_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_name_cssClass_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_form_theme_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_name_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_form_theme_action.release();
    _jspx_tagPool_s_form_action.release();
    _jspx_tagPool_s_submit_value_name_cssClass_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<title>Organización de eventos</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<header >\n");
      out.write("\t\t\n");
      out.write("\t\t<nav class=\"naveg\">\n");
      out.write("                    <h1 class=\"logo\">U<span>party</span> </h1>\n");
      out.write("\t\t\t<ul class=\"navbar\">\n");
      out.write("\t\t\t\t<li><a href=\"#eventos\">Eventos</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#decoracion\">Decoración</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#musica\">Música</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#catering\">Catering</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#audiovisuales\">Audiovisuales</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#empresas\">Empresas</a></li>\n");
      out.write("                                ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</nav>\n");
      out.write("\t</header>\n");
      out.write("\n");
      out.write("    <main>\n");
      out.write("\t<section  class=\"banner\" id=\"banner\">\n");
      out.write("\t\t<h2>Bienvenidos a nuestra web de organización de eventos</h2>\n");
      out.write("\t\t<p>Somos una empresa especializada en la organización de eventos para todo tipo de ocasiones. Desde bodas y cumpleaños hasta eventos corporativos y ferias, estamos aquí para ayudarte a hacer que tu evento sea un éxito.</p>\n");
      out.write("\t\t<a href=\"#contacto\">Contáctanos</a>\n");
      out.write("                ");
      if (_jspx_meth_s_form_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t</section>\n");
      out.write("\t<div class=\"princ\">\n");
      out.write("\t\n");
      out.write("            <h2 class=\"menu\">Menú principal</h2>\n");
      out.write("            <div class=\"princbox\">\n");
      out.write("                <section id=\"evento\">\n");
      out.write("\t\t<h3>Eventos</h3>\n");
      out.write("\t\t<p>En esta sección encontrarás información sobre nuestros servicios de organización de eventos.</p>\n");
      out.write("\t\t<a href=\"#contacto\">Contáctanos</a>\n");
      out.write("                <\n");
      out.write("                </section>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<section id=\"decoracion\">\n");
      out.write("\t\t<h3>Decoración</h3>\n");
      out.write("\t\t<p>En esta sección encontrarás información sobre nuestros servicios de decoración para eventos.</p>\n");
      out.write("\t\t<a href=\"#contacto\">Contáctanos</a>\n");
      out.write("\t</section>\n");
      out.write("\t\n");
      out.write("\t<section id=\"musica\">\n");
      out.write("\t\t<h3>Música</h3>\n");
      out.write("\t\t<p>En esta sección encontrarás información sobre nuestros servicios de música para eventos.</p>\n");
      out.write("\t\t<a href=\"#contacto\">Contáctanos</a>\n");
      out.write("\t</section>\n");
      out.write("\t\n");
      out.write("\t<section id=\"catering\">\n");
      out.write("\t\t<h3>Catering</h3>\n");
      out.write("\t\t<p>En esta sección encontrarás información sobre nuestros servicios de catering para eventos.</p>\n");
      out.write("\t\t<a href=\"#contacto\">Contáctanos</a>\n");
      out.write("\t</section>\n");
      out.write("\t\n");
      out.write("\t<section id=\"audiovisuales\">\n");
      out.write("\t\t<h3>Audiovisual</h3>\n");
      out.write("\t\t<p>En esta sección encontrarás información sobre nuestros servicios de audiovisuales para eventos.</p>\n");
      out.write("\t\t<a href=\"#contacto\">Contáctanos</a>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<section id=\"empresas\">\n");
      out.write("\t\t<h3>Empresas</h3>\n");
      out.write("\t\t<p>En esta sección encontrarás información sobre nuestros servicios de organización de eventos para empresas.</p>\n");
      out.write("\t\t<a href=\"#contacto\">Contáctanos</a>\n");
      out.write("\t</section>\n");
      out.write("\t</div>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("\t<section id=\"contacto\">\n");
      out.write("            <div class=\"form-box\">\n");
      out.write("                <div class=\"form-value\">\n");
      out.write("\t\t<form>\n");
      out.write("                    <h2>Contacto</h2>\n");
      out.write("\t\t<div class=\"inputbox\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<input type=\"text\" id=\"nombre\" name=\"nombre\">\n");
      out.write("                        <label for=\"nombre\">Nombre:</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputbox\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<input type=\"email\" id=\"email\" name=\"email\">\n");
      out.write("                        <label for=\"email\">Email:</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"inputbox\">\n");
      out.write("                       \n");
      out.write("                        <input type=\"text\" id=\"mensaje\" name=\"mensaje\">\n");
      out.write("                        <label for=\"mensaje\">Mensaje:</label>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        </footer>\n");
      out.write("    </main>\n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_theme_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("unlog");
    _jspx_th_s_form_0.setTheme("simple");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_theme_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_theme_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_name_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setCssClass("login");
    _jspx_th_s_submit_0.setName("unlog");
    _jspx_th_s_submit_0.setValue("Cerrar Sesion");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_name_cssClass_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_name_cssClass_nobody.reuse(_jspx_th_s_submit_0);
    return false;
  }

  private boolean _jspx_meth_s_form_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_1 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_1.setPageContext(_jspx_page_context);
    _jspx_th_s_form_1.setParent(null);
    _jspx_th_s_form_1.setAction("eventos");
    int _jspx_eval_s_form_1 = _jspx_th_s_form_1.doStartTag();
    if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_s_submit_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_s_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_1);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_1);
    return false;
  }

  private boolean _jspx_meth_s_submit_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_1 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_name_cssClass_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_1.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_submit_1.setCssClass("login");
    _jspx_th_s_submit_1.setName("evntTrigger");
    _jspx_th_s_submit_1.setValue("Organice su evento");
    int _jspx_eval_s_submit_1 = _jspx_th_s_submit_1.doStartTag();
    if (_jspx_th_s_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_name_cssClass_nobody.reuse(_jspx_th_s_submit_1);
      return true;
    }
    _jspx_tagPool_s_submit_value_name_cssClass_nobody.reuse(_jspx_th_s_submit_1);
    return false;
  }
}
