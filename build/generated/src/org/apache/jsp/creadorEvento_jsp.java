package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class creadorEvento_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_radio_name_list_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_radio_name_list_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_radio_name_list_id_nobody.release();
    _jspx_tagPool_s_submit_value_name_nobody.release();
    _jspx_tagPool_s_form_action.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"crearEvnt.css\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t<title>Nuestros eventos</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Seleccione el tipo de evento que quiere organizar</h1>\r\n");
      out.write("        ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        <h2>Si no encuentra lo que busca...</h2>\r\n");
      out.write("        ");
      if (_jspx_meth_s_form_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </body>\r\n");
      out.write("</html>\r\n");
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
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("elegirEvento");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            <div id=\"eventoB\">\r\n");
        out.write("            <img id=\"boda\" src=\"https://th.bing.com/th/id/R.388f33829746d29257852592588c40cb?rik=KkSilhM%2f9lkqbw&pid=ImgRaw&r=0\" alt=\"Boda\"/>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div id=\"eventoCum\">\r\n");
        out.write("            <img src=\"https://th.bing.com/th/id/OIP.nxdQ7qTcOBii-ZVmdNAaeQHaHa?pid=ImgDet&rs=1\" alt=\"Cumpleaños\"/>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div id=\"eventoBau\">\r\n");
        out.write("            <img src=\"https://joyeriacoral.com/wp-content/uploads/2020/10/madrina-bautizo.jpg\" alt=\"Bautizo\"/>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div id=\"eventoCine\">\r\n");
        out.write("            <img src=\"https://th.bing.com/th/id/R.abe2cf155f5d1e89fc4fa7d08b7251b0?rik=Tz8ChYr9dFYFTQ&pid=ImgRaw&r=0\" alt=\"Cine\"/>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div id=\"eventoCon\">\r\n");
        out.write("            <img src=\"https://th.bing.com/th/id/R.17764304cf7ef9020b506960d52d2471?rik=NQouPpwX1%2bVVOA&pid=ImgRaw&r=0\" alt=\"Concierto\"/>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div id=\"eventoCir\">\r\n");
        out.write("            <img src=\"https://th.bing.com/th/id/R.3064c3f795b378b33beb49aa040ee811?rik=rFC7CTBH5IR98Q&pid=ImgRaw&r=0\" alt=\"Circo\"/>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div id=\"eventoCom\">\r\n");
        out.write("            <img src=\"https://th.bing.com/th/id/R.ec2f1fcd13574a3e20a1f7299b0ad7cd?rik=DghkjazHRPHYrg&riu=http%3a%2f%2fsancristobal-boadilla.diocesisgetafe.es%2fwp-content%2fuploads%2f2013%2f02%2fCatequesis-primera-comuni%c3%b3n.jpg&ehk=81ZUEYZK7csypEdTJolqeMR34SAeqM0hkYLCSmftvOw%3d&risl=&pid=ImgRaw&r=0\" alt=\"Comunión\"/>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div id=\"eventoF\">\r\n");
        out.write("            <img src=\"https://th.bing.com/th/id/R.a35128bc7c14ee1f6e1914eb2aa48d15?rik=pyg1cXZSmOiIWA&pid=ImgRaw&r=0\" alt=\"Fiesta\"/>\r\n");
        out.write("            </div>\r\n");
        out.write("            <div id=\"eventoD\">\r\n");
        out.write("            <img src=\"https://img.europapress.es/fotoweb/fotonoticia_20200826101834_1024.jpg\" alt=\"Deporte\"/>\r\n");
        out.write("            ");
        if (_jspx_meth_s_radio_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("            </div>\r\n");
        out.write("            ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
    return false;
  }

  private boolean _jspx_meth_s_radio_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:radio
    org.apache.struts2.views.jsp.ui.RadioTag _jspx_th_s_radio_0 = (org.apache.struts2.views.jsp.ui.RadioTag) _jspx_tagPool_s_radio_name_list_id_nobody.get(org.apache.struts2.views.jsp.ui.RadioTag.class);
    _jspx_th_s_radio_0.setPageContext(_jspx_page_context);
    _jspx_th_s_radio_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_radio_0.setId("radio");
    _jspx_th_s_radio_0.setName("elegirEvento");
    _jspx_th_s_radio_0.setList("tipos");
    int _jspx_eval_s_radio_0 = _jspx_th_s_radio_0.doStartTag();
    if (_jspx_th_s_radio_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_radio_name_list_id_nobody.reuse(_jspx_th_s_radio_0);
      return true;
    }
    _jspx_tagPool_s_radio_name_list_id_nobody.reuse(_jspx_th_s_radio_0);
    return false;
  }

  private boolean _jspx_meth_s_submit_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:submit
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_0 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_name_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_0.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_submit_0.setName("elegitEvntTrigger");
    _jspx_th_s_submit_0.setValue("Ver evento");
    int _jspx_eval_s_submit_0 = _jspx_th_s_submit_0.doStartTag();
    if (_jspx_th_s_submit_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_name_nobody.reuse(_jspx_th_s_submit_0);
      return true;
    }
    _jspx_tagPool_s_submit_value_name_nobody.reuse(_jspx_th_s_submit_0);
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
    _jspx_th_s_form_1.setAction("crearEvento");
    int _jspx_eval_s_form_1 = _jspx_th_s_form_1.doStartTag();
    if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("            ");
        if (_jspx_meth_s_submit_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("        ");
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
    org.apache.struts2.views.jsp.ui.SubmitTag _jspx_th_s_submit_1 = (org.apache.struts2.views.jsp.ui.SubmitTag) _jspx_tagPool_s_submit_value_name_nobody.get(org.apache.struts2.views.jsp.ui.SubmitTag.class);
    _jspx_th_s_submit_1.setPageContext(_jspx_page_context);
    _jspx_th_s_submit_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_submit_1.setName("crearEvntTrigger");
    _jspx_th_s_submit_1.setValue("Cree su propio evento personalizado");
    int _jspx_eval_s_submit_1 = _jspx_th_s_submit_1.doStartTag();
    if (_jspx_th_s_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_name_nobody.reuse(_jspx_th_s_submit_1);
      return true;
    }
    _jspx_tagPool_s_submit_value_name_nobody.reuse(_jspx_th_s_submit_1);
    return false;
  }
}
