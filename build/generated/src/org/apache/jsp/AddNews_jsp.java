package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class AddNews_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_form_action.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            h1{\n");
      out.write("                letter-spacing: 1px;\n");
      out.write("                font-family: serif;\n");
      out.write("                color: #003366;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"s\">\n");
      out.write("        <p align=\"right\">Logged In as <b>");
out.println(session.getAttribute("pid"));
      out.write("</b></p>\n");
      out.write("        <br><br><br>\n");
      out.write("    <center>\n");
      out.write("        ");
      if (_jspx_meth_h_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            <br><br><hr>\n");
      out.write("            ");
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Police","root","password");
            PreparedStatement pst=con.prepareStatement("select * from emergency where PStationID=?");
            pst.setString(1, (String)request.getSession().getAttribute("pid"));
            ResultSet rs=pst.executeQuery();
            if(!rs.isBeforeFirst()){
                
      out.write("<pre style=\"font-family: fantasy;letter-spacing: 1px\">");
out.println("NO  ANY  NEWS  IN  THIS  AREA");
      out.write("</pre>");

            }
            else{
      out.write("\n");
      out.write("            <h1 style=\"letter-spacing: 1px\">NEWS</h1><hr><br><br>\n");

                while(rs.next()){
      out.write("\n");
      out.write("                <ol type=\"square\">\n");
      out.write("                    <li style=\"text-align: left;font-family: serif;font-size: x-large\">");
out.println(rs.getString(2));
      out.write("</li>\n");
      out.write("                </ol>\n");
      out.write("\n");
      out.write("                ");
}
            }
        }
                catch(Exception e){
                        out.println("NO ANY NEWS IN THIS AREA !!");
                        }
         
      out.write("\n");
      out.write("         <br><br>\n");
      out.write("    </center>\n");
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

  private boolean _jspx_meth_h_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    org.apache.struts.taglib.html.FormTag _jspx_th_h_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_h_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_h_form_0.setPageContext(_jspx_page_context);
    _jspx_th_h_form_0.setParent(null);
    _jspx_th_h_form_0.setAction("/addnews");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <h1>ADD NEWS</h1>\n");
        out.write("            <hr><br>\n");
        out.write("            <h3 style=\"text-align: left;margin-left: 220px\">News</h3>\n");
        out.write("            <textarea name=\"news\" rows=\"8\" cols=\"75\">Enter text here...</textarea><br><br>\n");
        out.write("            <input type=\"submit\" value=\"Add News\"/>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form_action.reuse(_jspx_th_h_form_0);
      return true;
    }
    _jspx_tagPool_h_form_action.reuse(_jspx_th_h_form_0);
    return false;
  }
}
