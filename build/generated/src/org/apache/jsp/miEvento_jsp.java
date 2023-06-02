package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class miEvento_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_theme_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_label_value_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_submit_value_name_cssClass_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_label_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_hidden_value_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_select_onchange_name_list_id_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_submit_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_theme_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_label_value_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_submit_value_name_cssClass_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_label_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_hidden_value_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_select_onchange_name_list_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_submit_value_name_nobody.release();
    _jspx_tagPool_s_form_theme_action.release();
    _jspx_tagPool_s_form_action.release();
    _jspx_tagPool_s_label_value_name_id_nobody.release();
    _jspx_tagPool_s_submit_value_name_cssClass_nobody.release();
    _jspx_tagPool_s_label_value_name_nobody.release();
    _jspx_tagPool_s_hidden_value_name_nobody.release();
    _jspx_tagPool_s_select_onchange_name_list_id_nobody.release();
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
      out.write("<script src=\"jquery-1.12.4.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"crearEvnt.css\">\r\n");
      out.write("        --><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Evento Personalizado</title>\r\n");
      out.write("        <script>\r\n");
      out.write("    function checkPrice() {\r\n");
      out.write("                var p = Math.round(Math.random()*2000+500);\r\n");
      out.write("\r\n");
      out.write("                document.getElementById(\"precio\").textContent=p;                     \r\n");
      out.write("            }\r\n");
      out.write("</script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header >\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<nav class=\"naveg\">\r\n");
      out.write("                    <h1 class=\"logo\">U<span>party</span> </h1>\r\n");
      out.write("\t\t\t<ul class=\"navbar\">\r\n");
      out.write("\t\t\t\t<li><a href=\"#eventos\">Eventos</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#decoracion\">Decoración</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#musica\">Música</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#catering\">Catering</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#audiovisuales\">Audiovisuales</a></li>\r\n");
      out.write("\t\t\t\t<li><a href=\"#empresas\">Empresas</a></li>\r\n");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</header>\r\n");
      out.write("        <h1>Eventos</h1>\r\n");
      out.write("\r\n");
      out.write("        <label>Personaliza tu evento:</label>\r\n");
      out.write("        ");
      if (_jspx_meth_s_form_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </body>\r\n");
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
        out.write("\r\n");
        out.write("                                ");
        if (_jspx_meth_s_submit_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\r\n");
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
    _jspx_th_s_form_1.setAction("eventoP");
    int _jspx_eval_s_form_1 = _jspx_th_s_form_1.doStartTag();
    if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_s_label_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_s_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_s_label_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_s_select_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_s_label_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_s_select_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_s_label_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_s_select_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_s_label_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_s_select_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_s_label_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("                ");
        if (_jspx_meth_s_hidden_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
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

  private boolean _jspx_meth_s_label_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_0 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_name_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_0.setPageContext(_jspx_page_context);
    _jspx_th_s_label_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_label_0.setName("evento");
    _jspx_th_s_label_0.setValue("Evento:");
    int _jspx_eval_s_label_0 = _jspx_th_s_label_0.doStartTag();
    if (_jspx_th_s_label_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_name_nobody.reuse(_jspx_th_s_label_0);
      return true;
    }
    _jspx_tagPool_s_label_value_name_nobody.reuse(_jspx_th_s_label_0);
    return false;
  }

  private boolean _jspx_meth_s_select_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_0 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_onchange_name_list_id_nobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_0.setPageContext(_jspx_page_context);
    _jspx_th_s_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_select_0.setName("eventos");
    _jspx_th_s_select_0.setId("eventos");
    _jspx_th_s_select_0.setList("%{tipos}");
    _jspx_th_s_select_0.setOnchange("checkPrice()");
    int _jspx_eval_s_select_0 = _jspx_th_s_select_0.doStartTag();
    if (_jspx_th_s_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_onchange_name_list_id_nobody.reuse(_jspx_th_s_select_0);
      return true;
    }
    _jspx_tagPool_s_select_onchange_name_list_id_nobody.reuse(_jspx_th_s_select_0);
    return false;
  }

  private boolean _jspx_meth_s_label_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_1 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_name_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_1.setPageContext(_jspx_page_context);
    _jspx_th_s_label_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_label_1.setName("catering");
    _jspx_th_s_label_1.setValue("Cátering:");
    int _jspx_eval_s_label_1 = _jspx_th_s_label_1.doStartTag();
    if (_jspx_th_s_label_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_name_nobody.reuse(_jspx_th_s_label_1);
      return true;
    }
    _jspx_tagPool_s_label_value_name_nobody.reuse(_jspx_th_s_label_1);
    return false;
  }

  private boolean _jspx_meth_s_select_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_1 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_onchange_name_list_id_nobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_1.setPageContext(_jspx_page_context);
    _jspx_th_s_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_select_1.setName("eCat");
    _jspx_th_s_select_1.setId("eCat");
    _jspx_th_s_select_1.setList("%{empresasC.{nombre}}");
    _jspx_th_s_select_1.setOnchange("checkPrice()");
    int _jspx_eval_s_select_1 = _jspx_th_s_select_1.doStartTag();
    if (_jspx_th_s_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_onchange_name_list_id_nobody.reuse(_jspx_th_s_select_1);
      return true;
    }
    _jspx_tagPool_s_select_onchange_name_list_id_nobody.reuse(_jspx_th_s_select_1);
    return false;
  }

  private boolean _jspx_meth_s_label_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_2 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_name_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_2.setPageContext(_jspx_page_context);
    _jspx_th_s_label_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_label_2.setName("musica");
    _jspx_th_s_label_2.setValue("Música:");
    int _jspx_eval_s_label_2 = _jspx_th_s_label_2.doStartTag();
    if (_jspx_th_s_label_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_name_nobody.reuse(_jspx_th_s_label_2);
      return true;
    }
    _jspx_tagPool_s_label_value_name_nobody.reuse(_jspx_th_s_label_2);
    return false;
  }

  private boolean _jspx_meth_s_select_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_2 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_onchange_name_list_id_nobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_2.setPageContext(_jspx_page_context);
    _jspx_th_s_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_select_2.setName("eMus");
    _jspx_th_s_select_2.setId("eMus");
    _jspx_th_s_select_2.setList("%{empresasM.{nombre}}");
    _jspx_th_s_select_2.setOnchange("checkPrice()");
    int _jspx_eval_s_select_2 = _jspx_th_s_select_2.doStartTag();
    if (_jspx_th_s_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_onchange_name_list_id_nobody.reuse(_jspx_th_s_select_2);
      return true;
    }
    _jspx_tagPool_s_select_onchange_name_list_id_nobody.reuse(_jspx_th_s_select_2);
    return false;
  }

  private boolean _jspx_meth_s_label_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_3 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_name_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_3.setPageContext(_jspx_page_context);
    _jspx_th_s_label_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_label_3.setName("decoracion");
    _jspx_th_s_label_3.setValue("Decoración:");
    int _jspx_eval_s_label_3 = _jspx_th_s_label_3.doStartTag();
    if (_jspx_th_s_label_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_name_nobody.reuse(_jspx_th_s_label_3);
      return true;
    }
    _jspx_tagPool_s_label_value_name_nobody.reuse(_jspx_th_s_label_3);
    return false;
  }

  private boolean _jspx_meth_s_select_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_3 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_onchange_name_list_id_nobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_3.setPageContext(_jspx_page_context);
    _jspx_th_s_select_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_select_3.setName("eDec");
    _jspx_th_s_select_3.setId("eDec");
    _jspx_th_s_select_3.setList("%{empresasD.{nombre}}");
    _jspx_th_s_select_3.setOnchange("checkPrice()");
    int _jspx_eval_s_select_3 = _jspx_th_s_select_3.doStartTag();
    if (_jspx_th_s_select_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_onchange_name_list_id_nobody.reuse(_jspx_th_s_select_3);
      return true;
    }
    _jspx_tagPool_s_select_onchange_name_list_id_nobody.reuse(_jspx_th_s_select_3);
    return false;
  }

  private boolean _jspx_meth_s_label_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_4 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_name_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_4.setPageContext(_jspx_page_context);
    _jspx_th_s_label_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_label_4.setName("audiovisuales");
    _jspx_th_s_label_4.setValue("Audiovisuales:");
    int _jspx_eval_s_label_4 = _jspx_th_s_label_4.doStartTag();
    if (_jspx_th_s_label_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_name_nobody.reuse(_jspx_th_s_label_4);
      return true;
    }
    _jspx_tagPool_s_label_value_name_nobody.reuse(_jspx_th_s_label_4);
    return false;
  }

  private boolean _jspx_meth_s_select_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:select
    org.apache.struts2.views.jsp.ui.SelectTag _jspx_th_s_select_4 = (org.apache.struts2.views.jsp.ui.SelectTag) _jspx_tagPool_s_select_onchange_name_list_id_nobody.get(org.apache.struts2.views.jsp.ui.SelectTag.class);
    _jspx_th_s_select_4.setPageContext(_jspx_page_context);
    _jspx_th_s_select_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_select_4.setName("eAud");
    _jspx_th_s_select_4.setId("eAud");
    _jspx_th_s_select_4.setList("%{empresasA.{nombre}}");
    _jspx_th_s_select_4.setOnchange("checkPrice()");
    int _jspx_eval_s_select_4 = _jspx_th_s_select_4.doStartTag();
    if (_jspx_th_s_select_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_select_onchange_name_list_id_nobody.reuse(_jspx_th_s_select_4);
      return true;
    }
    _jspx_tagPool_s_select_onchange_name_list_id_nobody.reuse(_jspx_th_s_select_4);
    return false;
  }

  private boolean _jspx_meth_s_label_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:label
    org.apache.struts2.views.jsp.ui.LabelTag _jspx_th_s_label_5 = (org.apache.struts2.views.jsp.ui.LabelTag) _jspx_tagPool_s_label_value_name_id_nobody.get(org.apache.struts2.views.jsp.ui.LabelTag.class);
    _jspx_th_s_label_5.setPageContext(_jspx_page_context);
    _jspx_th_s_label_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_label_5.setName("precio");
    _jspx_th_s_label_5.setId("precio");
    _jspx_th_s_label_5.setValue("Precio: %{precio}");
    int _jspx_eval_s_label_5 = _jspx_th_s_label_5.doStartTag();
    if (_jspx_th_s_label_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_label_value_name_id_nobody.reuse(_jspx_th_s_label_5);
      return true;
    }
    _jspx_tagPool_s_label_value_name_id_nobody.reuse(_jspx_th_s_label_5);
    return false;
  }

  private boolean _jspx_meth_s_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:hidden
    org.apache.struts2.views.jsp.ui.HiddenTag _jspx_th_s_hidden_0 = (org.apache.struts2.views.jsp.ui.HiddenTag) _jspx_tagPool_s_hidden_value_name_nobody.get(org.apache.struts2.views.jsp.ui.HiddenTag.class);
    _jspx_th_s_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_s_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_hidden_0.setName("precio");
    _jspx_th_s_hidden_0.setValue("%{precio}");
    int _jspx_eval_s_hidden_0 = _jspx_th_s_hidden_0.doStartTag();
    if (_jspx_th_s_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_hidden_value_name_nobody.reuse(_jspx_th_s_hidden_0);
      return true;
    }
    _jspx_tagPool_s_hidden_value_name_nobody.reuse(_jspx_th_s_hidden_0);
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
    _jspx_th_s_submit_1.setName("eventoPTrigger");
    _jspx_th_s_submit_1.setValue("Especificar detalles");
    int _jspx_eval_s_submit_1 = _jspx_th_s_submit_1.doStartTag();
    if (_jspx_th_s_submit_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_submit_value_name_nobody.reuse(_jspx_th_s_submit_1);
      return true;
    }
    _jspx_tagPool_s_submit_value_name_nobody.reuse(_jspx_th_s_submit_1);
    return false;
  }
}
