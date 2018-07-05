package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_link_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_link_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_link_action.release();
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("\n");
      out.write("    #header {\n");
      out.write("        margin:0;\n");
      out.write("        padding:0;\n");
      out.write("        font: bold 11px/1.5em Verdana;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2 {\n");
      out.write("        font: bold 14px Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("        color: #000;\n");
      out.write("        margin: 0px;\n");
      out.write("        padding: 0px 0px 0px 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("img {\n");
      out.write("border: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    #tabs3 {\n");
      out.write("      float:left;\n");
      out.write("      width:100%;\n");
      out.write("      background:#E4E6EB;\n");
      out.write("      font-size:93%;\n");
      out.write("      line-height:normal;\n");
      out.write("      }\n");
      out.write("    #tabs3 ul {\n");
      out.write("          margin:0;\n");
      out.write("          padding:10px 10px 0 50px;\n");
      out.write("          list-style:none;\n");
      out.write("      }\n");
      out.write("    #tabs3 li {\n");
      out.write("      display:inline;\n");
      out.write("      margin:0;\n");
      out.write("      padding:0;\n");
      out.write("      }\n");
      out.write("    #tabs3 a {\n");
      out.write("      float:left;\n");
      out.write("      background:url(\"tableft3.gif\") no-repeat left top;\n");
      out.write("      margin:0;\n");
      out.write("      padding:0 0 0 4px;\n");
      out.write("      text-decoration:none;\n");
      out.write("      }\n");
      out.write("    #tabs3 a span {\n");
      out.write("      float:left;\n");
      out.write("      display:block;\n");
      out.write("      background:url(\"tabright3.gif\") no-repeat right top;\n");
      out.write("      padding:5px 15px 4px 6px;\n");
      out.write("      color:#FFF;\n");
      out.write("      }\n");
      out.write("    /* Commented Backslash Hack hides rule from IE5-Mac \\*/\n");
      out.write("    #tabs3 a span {float:none;}\n");
      out.write("    /* End IE5-Mac hack */\n");
      out.write("    #tabs3 a:hover span {\n");
      out.write("      color:#FFF;\n");
      out.write("      }\n");
      out.write("    #tabs3 a:hover {\n");
      out.write("      background-position:0% -42px;\n");
      out.write("      }\n");
      out.write("    #tabs3 a:hover span {\n");
      out.write("      background-position:100% -42px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      #tabs3 #current a {\n");
      out.write("              background-position:0% -42px;\n");
      out.write("      }\n");
      out.write("      #tabs3 #current a span {\n");
      out.write("              background-position:100% -42px;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("#menu {\n");
      out.write("        font-family: Verdana, Arial, Helvetica, sans-serif;\n");
      out.write("        margin: 0;\n");
      out.write("        font-size: 80%;\n");
      out.write("        font-weight: bold;\n");
      out.write("        background: #F3FAFF;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("        list-style: none;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("#menu2 {\n");
      out.write("        width: 200px;\n");
      out.write("        border-style: solid solid none solid;\n");
      out.write("        border-color: #677D92;\n");
      out.write("        border-size: 1px;\n");
      out.write("        border-width: 1px;\n");
      out.write("        margin: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("#menu2 li a {\n");
      out.write("        height: 32px;\n");
      out.write("          voice-family: \"\\\"}\\\"\";\n");
      out.write("          voice-family: inherit;\n");
      out.write("          height: 24px;\n");
      out.write("        text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("#menu2 li a:link, #menu2 li a:visited {\n");
      out.write("        color: #fff;\n");
      out.write("        display: block;\n");
      out.write("        background: url(menu2.gif);\n");
      out.write("        padding: 8px 0 0 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("#menu2 li a:hover, #menu2 li #current {\n");
      out.write("        color: #283A50;\n");
      out.write("        background: url(menu2.gif) 0 -32px;\n");
      out.write("        padding: 8px 0 0 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("#menu2 li a:active {\n");
      out.write("        color: #283A50;\n");
      out.write("        background: url(menu2.gif) 0 -64px;\n");
      out.write("        padding: 8px 0 0 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"header\">\n");
      out.write("            <h3>CITY WITHOUT CRIME</h3>\n");
      out.write("                <div id=\"tabs3\" align=\"right\">\n");
      out.write("                        <ul>\n");
      out.write("                                <!-- CSS Tabs -->\n");
      out.write("<li id=\"current\"><a href=\"Home.html\"><span>Home</span></a></li>\n");
      out.write("<li><a href=\"Products.html\"><span>Products</span></a></li>\n");
      out.write("<li><a href=\"Services.html\"><span>Services</span></a></li>\n");
      out.write("<li><a href=\"Support.html\"><span>Support</span></a></li>\n");
      out.write("<li><a href=\"Order.html\"><span>Order</span></a></li>\n");
      out.write("<li><a href=\"News.html\"><span>News</span></a></li>\n");
      out.write("<li><a href=\"About.html\"><span>About</span></a></li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                </div>\n");
      out.write("  <c id=\"menu\">          \n");
      out.write("            <div id=\"menu2\">\n");
      out.write("                        <ul>\n");
      out.write("\n");
      out.write("<li>");
      if (_jspx_meth_h_link_0(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("<li>");
      if (_jspx_meth_h_link_1(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("<li>");
      if (_jspx_meth_h_link_2(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("<li>");
      if (_jspx_meth_h_link_3(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("<li>");
      if (_jspx_meth_h_link_4(_jspx_page_context))
        return;
      out.write("</li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                </div>\n");
      out.write("  </c>\n");
      out.write("        </body>\n");
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

  private boolean _jspx_meth_h_link_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_h_link_0 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_h_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_h_link_0.setPageContext(_jspx_page_context);
    _jspx_th_h_link_0.setParent(null);
    _jspx_th_h_link_0.setAction("/log1");
    int _jspx_eval_h_link_0 = _jspx_th_h_link_0.doStartTag();
    if (_jspx_eval_h_link_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_link_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_link_0.doInitBody();
      }
      do {
        out.write("Home");
        int evalDoAfterBody = _jspx_th_h_link_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_link_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_link_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_link_action.reuse(_jspx_th_h_link_0);
      return true;
    }
    _jspx_tagPool_h_link_action.reuse(_jspx_th_h_link_0);
    return false;
  }

  private boolean _jspx_meth_h_link_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_h_link_1 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_h_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_h_link_1.setPageContext(_jspx_page_context);
    _jspx_th_h_link_1.setParent(null);
    _jspx_th_h_link_1.setAction("/log2");
    int _jspx_eval_h_link_1 = _jspx_th_h_link_1.doStartTag();
    if (_jspx_eval_h_link_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_link_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_link_1.doInitBody();
      }
      do {
        out.write("Criminal_records");
        int evalDoAfterBody = _jspx_th_h_link_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_link_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_link_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_link_action.reuse(_jspx_th_h_link_1);
      return true;
    }
    _jspx_tagPool_h_link_action.reuse(_jspx_th_h_link_1);
    return false;
  }

  private boolean _jspx_meth_h_link_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_h_link_2 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_h_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_h_link_2.setPageContext(_jspx_page_context);
    _jspx_th_h_link_2.setParent(null);
    _jspx_th_h_link_2.setAction("/log3");
    int _jspx_eval_h_link_2 = _jspx_th_h_link_2.doStartTag();
    if (_jspx_eval_h_link_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_link_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_link_2.doInitBody();
      }
      do {
        out.write("Add_News");
        int evalDoAfterBody = _jspx_th_h_link_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_link_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_link_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_link_action.reuse(_jspx_th_h_link_2);
      return true;
    }
    _jspx_tagPool_h_link_action.reuse(_jspx_th_h_link_2);
    return false;
  }

  private boolean _jspx_meth_h_link_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_h_link_3 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_h_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_h_link_3.setPageContext(_jspx_page_context);
    _jspx_th_h_link_3.setParent(null);
    _jspx_th_h_link_3.setAction("/log4");
    int _jspx_eval_h_link_3 = _jspx_th_h_link_3.doStartTag();
    if (_jspx_eval_h_link_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_link_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_link_3.doInitBody();
      }
      do {
        out.write("UpdateProfile");
        int evalDoAfterBody = _jspx_th_h_link_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_link_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_link_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_link_action.reuse(_jspx_th_h_link_3);
      return true;
    }
    _jspx_tagPool_h_link_action.reuse(_jspx_th_h_link_3);
    return false;
  }

  private boolean _jspx_meth_h_link_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:link
    org.apache.struts.taglib.html.LinkTag _jspx_th_h_link_4 = (org.apache.struts.taglib.html.LinkTag) _jspx_tagPool_h_link_action.get(org.apache.struts.taglib.html.LinkTag.class);
    _jspx_th_h_link_4.setPageContext(_jspx_page_context);
    _jspx_th_h_link_4.setParent(null);
    _jspx_th_h_link_4.setAction("/log5");
    int _jspx_eval_h_link_4 = _jspx_th_h_link_4.doStartTag();
    if (_jspx_eval_h_link_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_link_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_link_4.doInitBody();
      }
      do {
        out.write("Logout");
        int evalDoAfterBody = _jspx_th_h_link_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_link_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_link_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_link_action.reuse(_jspx_th_h_link_4);
      return true;
    }
    _jspx_tagPool_h_link_action.reuse(_jspx_th_h_link_4);
    return false;
  }
}
