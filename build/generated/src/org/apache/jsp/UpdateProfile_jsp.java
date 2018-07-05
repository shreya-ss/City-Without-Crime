package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class UpdateProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write("h1{color:#003333;font-family: fantasy;letter-spacing: 1px}\r\n");
      out.write("#a1{font-family: serif;color: #000033;font-size: large}\r\n");
      out.write("input{width: 240px;}\r\n");
      out.write("-->\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <p align=\"right\" valign=\"top\">Logged In as <b>");
out.println(session.getAttribute("pid"));
      out.write("</b></p>\r\n");
      out.write("    <center>\r\n");
      out.write("        ");

            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Police","root","password");
            Statement pst=con.createStatement();
            //String s1="patna";
            //pst.setString(1,s1);
            ResultSet rs=pst.executeQuery("select * from station where pstation_id="+session.getAttribute("pid"));
            boolean o=rs.next();
        
      out.write("\r\n");
      out.write("        <h1><strong><u>Update your Information</u></strong></h1><br><br>\r\n");
      out.write("            <table width=\"500\" height=\"300\" border=\"1\" align=\"center\" bordercolor=\"#000000\">\r\n");
      out.write("        ");
      //  h:form
      org.apache.struts.taglib.html.FormTag _jspx_th_h_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_h_form_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_h_form_0.setPageContext(_jspx_page_context);
      _jspx_th_h_form_0.setParent(null);
      _jspx_th_h_form_0.setAction("/updatestation");
      int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <tr><td id=\"a1\">PoliceStation ID</td><td style=\"letter-spacing: 2px\">");
 out.println(rs.getString(1));
          out.write("</td></tr>\r\n");
          out.write("            <tr><td id=\"a1\">PoliceStation Name</td><td style=\"letter-spacing: 1px\">");
 out.println(rs.getString(2));
          out.write("</td></tr>\r\n");
          out.write("            <tr><td id=\"a1\">Address</td><td><input type=\"text\" name=\"addr\" width=\"200\" value=\"");
 out.println(rs.getString(3));
          out.write("\"></td></tr>\r\n");
          out.write("            <tr><td id=\"a1\">Phone Number</td><td><input type=\"text\" name=\"phno\"value=\"");
 out.println(rs.getString(4));
          out.write("\"></td></tr>\r\n");
          out.write("            <tr><td id=\"a1\">PoliceStation Head</td><td><input name=\"phed\" type=\"text\" value=\"");
 out.println(rs.getString(5));
          out.write("\"></td></tr>\r\n");
          out.write("            <tr><td id=\"a1\">Password</td><td><input type=\"password\" name=\"pass\" value=\"");
 out.println(rs.getString(6));
          out.write("\"></td></tr>\r\n");
          out.write("            <tr><td id=\"a1\">Retype Password</td><td><input type=\"password\" name=\"rpas\" value=\"");
 out.println(rs.getString(6));
          out.write("\"></td></tr>\r\n");
          out.write("      </table>\r\n");
          out.write("            <input type=\"submit\" value=\"Update Details\"/> \r\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_h_form_action.reuse(_jspx_th_h_form_0);
        return;
      }
      _jspx_tagPool_h_form_action.reuse(_jspx_th_h_form_0);
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            ");
 
            }
            catch(Exception e){
            }
            
      out.write("\r\n");
      out.write("    </center> \r\n");
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
}
