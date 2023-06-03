package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gestion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_textfield_name_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_theme_action;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_fielderror_fieldName_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_textfield_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_form_theme_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_s_fielderror_fieldName_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_textfield_name_nobody.release();
    _jspx_tagPool_s_form_theme_action.release();
    _jspx_tagPool_s_fielderror_fieldName_nobody.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"register.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Gestion - UParty</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("         <section>\n");
      out.write("            <div class=\"form-box\">\n");
      out.write("                <div class=\"form-value\">\n");
      out.write("                    ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("          \n");
      out.write("        </section> \n");
      out.write("        <section>\n");
      out.write("            <div class=\"form-box\">\n");
      out.write("                <div class=\"form-value\">\n");
      out.write("                    ");
      if (_jspx_meth_s_form_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </section> \n");
      out.write("        <section>\n");
      out.write("            <div class=\"form-box\">\n");
      out.write("                <div class=\"form-value\">\n");
      out.write("                    ");
      if (_jspx_meth_s_form_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <script type=\"module\" src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js\"></script>\n");
      out.write("            <script nomodule src=\"https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js\"></script>\n");
      out.write("        </section>\n");
      out.write("            \n");
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

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_0 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_theme_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("altaEmpresa");
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
        out.write("                        <h2>Alta Empresa</h2>\n");
        out.write("            \n");
        out.write("            <div class=\"inputbox\">\n");
        out.write("                \n");
        out.write("                <ion-icon name=\"mail-outline\"></ion-icon>\n");
        out.write("               \n");
        out.write("              ");
        if (_jspx_meth_s_textfield_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            \n");
        out.write("            <label for=\"\">");
        if (_jspx_meth_s_fielderror_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write(" Nombre:</label>\n");
        out.write("            </div>\n");
        out.write("            <div class=\"inputbox\">\n");
        out.write("                <ion-icon name=\"pricetag-outline\"></ion-icon>\n");
        out.write("               ");
        if (_jspx_meth_s_textfield_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("           \n");
        out.write("            <label for=\"\">");
        if (_jspx_meth_s_fielderror_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("Categoria:</label>\n");
        out.write("            </div>\n");
        out.write("            <div class=\"inputbox\">\n");
        out.write("                <ion-icon name=\"pricetags-outline\"></ion-icon>\n");
        out.write("               ");
        if (_jspx_meth_s_textfield_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            \n");
        out.write("            <label for=\"\">");
        if (_jspx_meth_s_fielderror_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("Descripcion:</label>\n");
        out.write("            </div>\n");
        out.write("            <div class=\"inputbox\">\n");
        out.write("                <ion-icon name=\"calendar-outline\"></ion-icon>\n");
        out.write("                \n");
        out.write("                ");
        if (_jspx_meth_s_textfield_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("           <!-- <input type=\"date\" name=\"fecha\"/> -->\n");
        out.write("            <label for=\"\">");
        if (_jspx_meth_s_fielderror_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_0, _jspx_page_context))
          return true;
        out.write("Valoracion:</label>\n");
        out.write("            </div>\n");
        out.write("           \n");
        out.write("            \n");
        out.write("            <input class=\"login\" type=\"submit\" name=\"altaEmp\" value=\"Crear\">\n");
        out.write("           \n");
        out.write("        ");
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

  private boolean _jspx_meth_s_textfield_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_0 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_0.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_0.setName("nombre");
    int _jspx_eval_s_textfield_0 = _jspx_th_s_textfield_0.doStartTag();
    if (_jspx_th_s_textfield_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_0);
      return true;
    }
    _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_0);
    return false;
  }

  private boolean _jspx_meth_s_fielderror_0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_fielderror_0 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _jspx_tagPool_s_fielderror_fieldName_nobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_fielderror_0.setPageContext(_jspx_page_context);
    _jspx_th_s_fielderror_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_fielderror_0.setFieldName("nombre");
    int _jspx_eval_s_fielderror_0 = _jspx_th_s_fielderror_0.doStartTag();
    if (_jspx_th_s_fielderror_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_0);
      return true;
    }
    _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_0);
    return false;
  }

  private boolean _jspx_meth_s_textfield_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_1 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_1.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_1.setName("categoria");
    int _jspx_eval_s_textfield_1 = _jspx_th_s_textfield_1.doStartTag();
    if (_jspx_th_s_textfield_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_1);
      return true;
    }
    _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_1);
    return false;
  }

  private boolean _jspx_meth_s_fielderror_1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_fielderror_1 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _jspx_tagPool_s_fielderror_fieldName_nobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_fielderror_1.setPageContext(_jspx_page_context);
    _jspx_th_s_fielderror_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_fielderror_1.setFieldName("categoria");
    int _jspx_eval_s_fielderror_1 = _jspx_th_s_fielderror_1.doStartTag();
    if (_jspx_th_s_fielderror_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_1);
      return true;
    }
    _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_1);
    return false;
  }

  private boolean _jspx_meth_s_textfield_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_2 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_2.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_2.setName("descripcion");
    int _jspx_eval_s_textfield_2 = _jspx_th_s_textfield_2.doStartTag();
    if (_jspx_th_s_textfield_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_2);
      return true;
    }
    _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_2);
    return false;
  }

  private boolean _jspx_meth_s_fielderror_2(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_fielderror_2 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _jspx_tagPool_s_fielderror_fieldName_nobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_fielderror_2.setPageContext(_jspx_page_context);
    _jspx_th_s_fielderror_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_fielderror_2.setFieldName("descripcion");
    int _jspx_eval_s_fielderror_2 = _jspx_th_s_fielderror_2.doStartTag();
    if (_jspx_th_s_fielderror_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_2);
      return true;
    }
    _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_2);
    return false;
  }

  private boolean _jspx_meth_s_textfield_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_3 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_3.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_textfield_3.setName("val");
    int _jspx_eval_s_textfield_3 = _jspx_th_s_textfield_3.doStartTag();
    if (_jspx_th_s_textfield_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_3);
      return true;
    }
    _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_3);
    return false;
  }

  private boolean _jspx_meth_s_fielderror_3(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_fielderror_3 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _jspx_tagPool_s_fielderror_fieldName_nobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_fielderror_3.setPageContext(_jspx_page_context);
    _jspx_th_s_fielderror_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_0);
    _jspx_th_s_fielderror_3.setFieldName("val");
    int _jspx_eval_s_fielderror_3 = _jspx_th_s_fielderror_3.doStartTag();
    if (_jspx_th_s_fielderror_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_3);
      return true;
    }
    _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_3);
    return false;
  }

  private boolean _jspx_meth_s_form_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_1 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_theme_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_1.setPageContext(_jspx_page_context);
    _jspx_th_s_form_1.setParent(null);
    _jspx_th_s_form_1.setAction("registerCheck");
    _jspx_th_s_form_1.setTheme("simple");
    int _jspx_eval_s_form_1 = _jspx_th_s_form_1.doStartTag();
    if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        <h2>Baja Empresa</h2>\n");
        out.write("            \n");
        out.write("            <div class=\"inputbox\">\n");
        out.write("                \n");
        out.write("                <ion-icon name=\"mail-outline\"></ion-icon>\n");
        out.write("               \n");
        out.write("              ");
        if (_jspx_meth_s_textfield_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            \n");
        out.write("            <label for=\"\">");
        if (_jspx_meth_s_fielderror_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_1, _jspx_page_context))
          return true;
        out.write(" Nombre:</label>\n");
        out.write("            </div>\n");
        out.write("          \n");
        out.write("           \n");
        out.write("            \n");
        out.write("            <input class=\"login\" type=\"submit\" name=\"altaEmp\" value=\"Crear\">\n");
        out.write("           \n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_theme_action.reuse(_jspx_th_s_form_1);
      return true;
    }
    _jspx_tagPool_s_form_theme_action.reuse(_jspx_th_s_form_1);
    return false;
  }

  private boolean _jspx_meth_s_textfield_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_4 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_4.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_textfield_4.setName("nombreb");
    int _jspx_eval_s_textfield_4 = _jspx_th_s_textfield_4.doStartTag();
    if (_jspx_th_s_textfield_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_4);
      return true;
    }
    _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_4);
    return false;
  }

  private boolean _jspx_meth_s_fielderror_4(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_fielderror_4 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _jspx_tagPool_s_fielderror_fieldName_nobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_fielderror_4.setPageContext(_jspx_page_context);
    _jspx_th_s_fielderror_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_1);
    _jspx_th_s_fielderror_4.setFieldName("nombreb");
    int _jspx_eval_s_fielderror_4 = _jspx_th_s_fielderror_4.doStartTag();
    if (_jspx_th_s_fielderror_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_4);
      return true;
    }
    _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_4);
    return false;
  }

  private boolean _jspx_meth_s_form_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts2.views.jsp.ui.FormTag _jspx_th_s_form_2 = (org.apache.struts2.views.jsp.ui.FormTag) _jspx_tagPool_s_form_theme_action.get(org.apache.struts2.views.jsp.ui.FormTag.class);
    _jspx_th_s_form_2.setPageContext(_jspx_page_context);
    _jspx_th_s_form_2.setParent(null);
    _jspx_th_s_form_2.setAction("registerCheck");
    _jspx_th_s_form_2.setTheme("simple");
    int _jspx_eval_s_form_2 = _jspx_th_s_form_2.doStartTag();
    if (_jspx_eval_s_form_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_s_form_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_s_form_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_s_form_2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        <h2>Alta Empresa</h2>\n");
        out.write("            \n");
        out.write("            <div class=\"inputbox\">\n");
        out.write("                \n");
        out.write("                <ion-icon name=\"mail-outline\"></ion-icon>\n");
        out.write("               \n");
        out.write("              ");
        if (_jspx_meth_s_textfield_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            \n");
        out.write("            <label for=\"\">");
        if (_jspx_meth_s_fielderror_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_2, _jspx_page_context))
          return true;
        out.write(" Nombre:</label>\n");
        out.write("            </div>\n");
        out.write("            <div class=\"inputbox\">\n");
        out.write("                <ion-icon name=\"pricetag-outline\"></ion-icon>\n");
        out.write("               ");
        if (_jspx_meth_s_textfield_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("           \n");
        out.write("            <label for=\"\">");
        if (_jspx_meth_s_fielderror_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_2, _jspx_page_context))
          return true;
        out.write("Categoria:</label>\n");
        out.write("            </div>\n");
        out.write("            <div class=\"inputbox\">\n");
        out.write("                <ion-icon name=\"pricetags-outline\"></ion-icon>\n");
        out.write("               ");
        if (_jspx_meth_s_textfield_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            \n");
        out.write("            <label for=\"\">");
        if (_jspx_meth_s_fielderror_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_2, _jspx_page_context))
          return true;
        out.write("Descripcion:</label>\n");
        out.write("            </div>\n");
        out.write("            <div class=\"inputbox\">\n");
        out.write("                <ion-icon name=\"calendar-outline\"></ion-icon>\n");
        out.write("                \n");
        out.write("                ");
        if (_jspx_meth_s_textfield_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("           <!-- <input type=\"date\" name=\"fecha\"/> -->\n");
        out.write("            <label for=\"\">");
        if (_jspx_meth_s_fielderror_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_s_form_2, _jspx_page_context))
          return true;
        out.write("Valoracion:</label>\n");
        out.write("            </div>\n");
        out.write("           \n");
        out.write("            \n");
        out.write("            <input class=\"login\" type=\"submit\" name=\"altaEmp\" value=\"Modificar\">\n");
        out.write("           \n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_s_form_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_s_form_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_s_form_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_theme_action.reuse(_jspx_th_s_form_2);
      return true;
    }
    _jspx_tagPool_s_form_theme_action.reuse(_jspx_th_s_form_2);
    return false;
  }

  private boolean _jspx_meth_s_textfield_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_5 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_5.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_2);
    _jspx_th_s_textfield_5.setName("nombre");
    int _jspx_eval_s_textfield_5 = _jspx_th_s_textfield_5.doStartTag();
    if (_jspx_th_s_textfield_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_5);
      return true;
    }
    _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_5);
    return false;
  }

  private boolean _jspx_meth_s_fielderror_5(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_fielderror_5 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _jspx_tagPool_s_fielderror_fieldName_nobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_fielderror_5.setPageContext(_jspx_page_context);
    _jspx_th_s_fielderror_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_2);
    _jspx_th_s_fielderror_5.setFieldName("nombre");
    int _jspx_eval_s_fielderror_5 = _jspx_th_s_fielderror_5.doStartTag();
    if (_jspx_th_s_fielderror_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_5);
      return true;
    }
    _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_5);
    return false;
  }

  private boolean _jspx_meth_s_textfield_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_6 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_6.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_2);
    _jspx_th_s_textfield_6.setName("categoria");
    int _jspx_eval_s_textfield_6 = _jspx_th_s_textfield_6.doStartTag();
    if (_jspx_th_s_textfield_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_6);
      return true;
    }
    _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_6);
    return false;
  }

  private boolean _jspx_meth_s_fielderror_6(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_fielderror_6 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _jspx_tagPool_s_fielderror_fieldName_nobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_fielderror_6.setPageContext(_jspx_page_context);
    _jspx_th_s_fielderror_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_2);
    _jspx_th_s_fielderror_6.setFieldName("categoria");
    int _jspx_eval_s_fielderror_6 = _jspx_th_s_fielderror_6.doStartTag();
    if (_jspx_th_s_fielderror_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_6);
      return true;
    }
    _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_6);
    return false;
  }

  private boolean _jspx_meth_s_textfield_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_7 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_7.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_2);
    _jspx_th_s_textfield_7.setName("descripcion");
    int _jspx_eval_s_textfield_7 = _jspx_th_s_textfield_7.doStartTag();
    if (_jspx_th_s_textfield_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_7);
      return true;
    }
    _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_7);
    return false;
  }

  private boolean _jspx_meth_s_fielderror_7(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_fielderror_7 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _jspx_tagPool_s_fielderror_fieldName_nobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_fielderror_7.setPageContext(_jspx_page_context);
    _jspx_th_s_fielderror_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_2);
    _jspx_th_s_fielderror_7.setFieldName("descripcion");
    int _jspx_eval_s_fielderror_7 = _jspx_th_s_fielderror_7.doStartTag();
    if (_jspx_th_s_fielderror_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_7);
      return true;
    }
    _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_7);
    return false;
  }

  private boolean _jspx_meth_s_textfield_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:textfield
    org.apache.struts2.views.jsp.ui.TextFieldTag _jspx_th_s_textfield_8 = (org.apache.struts2.views.jsp.ui.TextFieldTag) _jspx_tagPool_s_textfield_name_nobody.get(org.apache.struts2.views.jsp.ui.TextFieldTag.class);
    _jspx_th_s_textfield_8.setPageContext(_jspx_page_context);
    _jspx_th_s_textfield_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_2);
    _jspx_th_s_textfield_8.setName("val");
    int _jspx_eval_s_textfield_8 = _jspx_th_s_textfield_8.doStartTag();
    if (_jspx_th_s_textfield_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_8);
      return true;
    }
    _jspx_tagPool_s_textfield_name_nobody.reuse(_jspx_th_s_textfield_8);
    return false;
  }

  private boolean _jspx_meth_s_fielderror_8(javax.servlet.jsp.tagext.JspTag _jspx_th_s_form_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:fielderror
    org.apache.struts2.views.jsp.ui.FieldErrorTag _jspx_th_s_fielderror_8 = (org.apache.struts2.views.jsp.ui.FieldErrorTag) _jspx_tagPool_s_fielderror_fieldName_nobody.get(org.apache.struts2.views.jsp.ui.FieldErrorTag.class);
    _jspx_th_s_fielderror_8.setPageContext(_jspx_page_context);
    _jspx_th_s_fielderror_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_form_2);
    _jspx_th_s_fielderror_8.setFieldName("val");
    int _jspx_eval_s_fielderror_8 = _jspx_th_s_fielderror_8.doStartTag();
    if (_jspx_th_s_fielderror_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_8);
      return true;
    }
    _jspx_tagPool_s_fielderror_fieldName_nobody.reuse(_jspx_th_s_fielderror_8);
    return false;
  }
}
