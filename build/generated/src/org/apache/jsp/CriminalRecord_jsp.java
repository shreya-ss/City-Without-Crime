package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class CriminalRecord_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style1 {font-family: \"Times New Roman\", Times, serif}\r\n");
      out.write(".style5 {font-family: Arial, Helvetica, serif;}\r\n");
      out.write("-->\r\n");
      out.write("        </style>\r\n");
      out.write("</head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <p align=\"right\" valign=\"top\">Logged In as <b>");
out.println(session.getAttribute("pid"));
      out.write("</b></p>\r\n");
      out.write("        <p>\r\n");
      out.write("          <center>\r\n");
      out.write("            <span class=\"style2\">\r\n");
      out.write("            ");

            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Police","root","password");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from criminal");
      out.write("\r\n");
      out.write("              \r\n");
      out.write("            </span>\r\n");
      out.write("          </center>\r\n");
      out.write("        </p>\r\n");
      out.write("        <center>\r\n");
      out.write("          ");
      //  h:form
      org.apache.struts.taglib.html.FormTag _jspx_th_h_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_h_form_action.get(org.apache.struts.taglib.html.FormTag.class);
      _jspx_th_h_form_0.setPageContext(_jspx_page_context);
      _jspx_th_h_form_0.setParent(null);
      _jspx_th_h_form_0.setAction("/searcrim");
      int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
      if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <h2 class=\"style5\"><u>Criminal Record</u></h2>\r\n");
          out.write("            <p><br>\r\n");
          out.write("              <!--Criminal Id:<input type=\"text\" name=\"cid\"/>\r\n");
          out.write("                Name :<input type=\"text\" name=\"cname\"/>\r\n");
          out.write("                Gender:<input type=\"text\" name=\"gen\"/>\r\n");
          out.write("                PStation Id :<input type=\"text\" name=\"p_id\"/><br><br>\r\n");
          out.write("                Crime Level:<input type=\"text\" name=\"cll\"/>\r\n");
          out.write("                Status :<input type=\"text\" name=\"sts\"/><br><br>\r\n");
          out.write("                <input type=\"submit\" value=\"Submit\"/>-->\r\n");
          out.write("              <span class=\"style1\">Criminal ID:\r\n");
          out.write("              <input type=\"text\" name=\"cid\" value=\"");
if(request.getAttribute("rcid")!=null){
                    out.println((String)request.getAttribute("rcid"));    }
          out.write("\">\r\n");
          out.write("              Name:\r\n");
          out.write("              <input type=\"text\" name=\"cname\" value=\"");
if(request.getAttribute("rcname")!=null){
                    out.println((String)request.getAttribute("rcname"));    }
          out.write("\">\r\n");
          out.write("              Gender:\r\n");
          out.write("              <input type=\"text\" name=\"gen\" value=\"");
if(request.getAttribute("rgen")!=null){
                    out.println((String)request.getAttribute("rgen"));    }
          out.write("\">\r\n");
          out.write("              <br>\r\n");
          out.write("              <br>\r\n");
          out.write("              PStation ID:\r\n");
          out.write("              <input type=\"text\" name=\"p_id\" value=\"");
if(request.getAttribute("rpid")!=null){
                    out.println((String)request.getAttribute("rpid"));    }
          out.write("\">\r\n");
          out.write("              CrimeLevel:\r\n");
          out.write("              <input type=\"text\" name=\"cll\" value=\"");
if(request.getAttribute("rcll")!=null){
                    out.println((String)request.getAttribute("rcll"));    }
          out.write("\">\r\n");
          out.write("              Status:\r\n");
          out.write("              <input type=\"text\" name=\"sts\" value=\"");
if(request.getAttribute("rsts")!=null){
                    out.println((String)request.getAttribute("rsts"));    }
          out.write("\">\r\n");
          out.write("                </span><br>\r\n");
          out.write("              <br>\r\n");
          out.write("              <input type=\"submit\" value=\"SUBMIT\"/>\r\n");
          out.write("            </p>\r\n");
          out.write("          ");
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
      out.write("        </center>\r\n");
      out.write("        <p>\r\n");
      out.write("          <center>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            ");

            ResultSet rst=(ResultSet)request.getAttribute("rset");
            //out.println((String)request.getAttribute("que"));
            //out.println((String)request.getAttribute("rset"));
            
            if(rst!=null){
                rs=rst;
            }
            if(rs==null){
                out.println("NO RECORDS FOUND");
            }
            else{
            
      out.write("\r\n");
      out.write("          </center>\r\n");
      out.write("        </p>\r\n");
      out.write("        <center>\r\n");
      out.write("          <table border=\"1\">\r\n");
      out.write("            <tr>\r\n");
      out.write("              <th>Criminal ID</th>\r\n");
      out.write("                <th>Criminal Name</th>\r\n");
      out.write("                <th>Gender</th>\r\n");
      out.write("                <th>Height</th>\r\n");
      out.write("                <th>Weight</th>\r\n");
      out.write("                <th>PStation ID</th>\r\n");
      out.write("                <th>Crimelevel</th>\r\n");
      out.write("                <th>Status</th>\r\n");
      out.write("              </tr>\r\n");
      out.write("            ");

            while(rs.next())  
            {
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <br>\r\n");
      out.write("            <tr>\r\n");
      out.write("              <td>");
out.println(rs.getString(1));
      out.write("</td>\r\n");
      out.write("                <td>");
out.println(rs.getString(2));
      out.write("</td>\r\n");
      out.write("                <td>");
out.println(rs.getString(3));
      out.write("</td>\r\n");
      out.write("                <td>");
out.println(rs.getString(4));
      out.write("</td>\r\n");
      out.write("                <td>");
out.println(rs.getString(5));
      out.write("</td>\r\n");
      out.write("                <td>");
out.println(rs.getString(6));
      out.write("</td>\r\n");
      out.write("                <td>");
out.println(rs.getString(7));
      out.write("</td>\r\n");
      out.write("                <td>");
out.println(rs.getString(8));
      out.write("</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            <br>\r\n");
      out.write("            ");

            }  
            
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        </center>\r\n");
      out.write("        <p>\r\n");
      out.write("          <center>\r\n");
      out.write("            <br>\r\n");
      out.write("            <br>\r\n");
      out.write("            ");

            }
            }
            catch(Exception e){
                out.println(e);
                out.println(e.getMessage());
            }
        
      out.write("\r\n");
      out.write("              </center>\r\n");
      out.write("        </p>\r\n");
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
