package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ComplaintUpdateFail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <style>\n");
      out.write("            #a1{\n");
      out.write("                font-family: fantasy;\n");
      out.write("                font-size: large;\n");
      out.write("            }\n");
      out.write("            #a2{\n");
      out.write("                font-family: sans-serif;\n");
      out.write("                font-size: large;\n");
      out.write("                color: #333333;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("        \n");
      out.write("    <body>\n");
      out.write("        <p align=\"right\">Logged In as <strong>");
out.println(session.getAttribute("pid"));
      out.write("</strong></p><br><br>\n");
      out.write("         <center>");

            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Police","root","password");
            PreparedStatement pst=con.prepareStatement("select id,description,status from complaint where p_id=?");
            pst.setString(1, (String)request.getSession().getAttribute("pid"));
            ResultSet rs=pst.executeQuery();
            if(!rs.isBeforeFirst() && rs.isBeforeFirst()){
                
      out.write("<pre style=\"font-family: fantasy;letter-spacing: 1px\">");
out.println("NO  ANY  COMPLAINT  IN  THIS  AREA");
      out.write("</pre>");

            }
            else{
         
      out.write("\n");
      out.write("         <h1 style=\"letter-spacing: 1px\">Complaints</h1><br><br>\n");
      out.write("         <p>Enter Id to update status of Complaint</p>\n");
      out.write("         ");
      if (_jspx_meth_h_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("             <br>\n");
      out.write("             <p style=\"color: #C00\">   \n");
      out.write("        ");
 
           if(request.getAttribute("compupdate")=="failed")
               out.println(request.getAttribute("message"));
            
      out.write("</p>\n");
      out.write("             \n");
      out.write("             <br><br>\n");
      out.write("        <table border=\"1\" style=\"font-family: serif;color: #333333;\"><tr>\n");
      out.write("                <th id=\"a2\">ID</th><th id=\"a2\">Description</th><th id=\"a2\">Status</th></tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td id=\"a1\"><span style=\"margin-left: 10px;margin-right: 10px;letter-spacing: 1px\">");
while(rs.next()){
                out.println(rs.getString(1));
      out.write("</span></td><td>\n");
      out.write("                    \n");
      out.write("        <ol>\n");
      out.write("            <li id=\"a1\" style=\"margin: 15px\"><span style=\"margin-left: 10px;letter-spacing: 1px\">");
 out.println(rs.getString(2));
      out.write("</span></li>\n");
      out.write("        </ol></td>\n");
      out.write("        \n");
      out.write("        <td id=\"a1\">\n");
      out.write("            <span style=\"margin-left: 10px;margin-right: 10px;letter-spacing: 1px\">");
out.println(rs.getString(3));}
      out.write("</span>\n");
      out.write("        </td>\n");
      out.write("            \n");
      out.write("            </tr>\n");
      out.write("        </table>");

            }
            }
            catch(Exception e){
                out.println(e.getMessage());
            }
        
      out.write("</center>\n");
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
    _jspx_th_h_form_0.setAction("/cmplntup");
    int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
    if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("             ID <input type=\"text\" name=\"cid\">\n");
        out.write("             Status<input type=\"text\" name=\"status\">\n");
        out.write("             <input type=\"submit\" value=\"Update\">\n");
        out.write("                          \n");
        out.write("         ");
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
