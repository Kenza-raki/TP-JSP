package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entities.Machine;
import service.MachineService;

public final class machines_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"MachineController\" method=\"GET\">\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Informations machine</legend>\n");
      out.write("                <table border=\"0\">\n");
      out.write("                   \n");
      out.write("                        <tr>\n");
      out.write("                            <td>Référence : </td>\n");
      out.write("                            <td><input type=\"text\" name=\"ref\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Matque : </td>\n");
      out.write("                            <td><input type=\"text\" name=\"matque\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Prix :</td>\n");
      out.write("                            <td><input type=\"text\" name=\"prix\" value=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td><input type=\"submit\" value=\"Ajouter\" /><input type=\"reset\" value=\"Annuler\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("        </fieldset>\n");
      out.write("        </form>\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>Liste des machines</legend>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>ID</th>\n");
      out.write("                        <th>Réference</th>\n");
      out.write("                        <th>Marque</th>\n");
      out.write("                        <th>Prix</th>\n");
      out.write("                        <th>Ajouter</th>\n");
      out.write("                        <th>Supprimer</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>1</td>\n");
      out.write("                        <td>Machine1</td>\n");
      out.write("                        <td>HP</td>\n");
      out.write("                        <td>50000</td>\n");
      out.write("                        <td>Ajouter</td>\n");
      out.write("                        <td>Supprimer</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>2</td>\n");
      out.write("                        <td>Machine2</td>\n");
      out.write("                        <td>DELL</td>\n");
      out.write("                        <td>90000</td>\n");
      out.write("                        <td>Ajouter</td>\n");
      out.write("                        <td>Supprimer</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>3</td>\n");
      out.write("                        <td>Machine3</td>\n");
      out.write("                        <td>MAC</td>\n");
      out.write("                        <td>70000</td>\n");
      out.write("                        <td>Ajouter</td>\n");
      out.write("                        <td>Supprimer</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>4</td>\n");
      out.write("                        <td>Machine4</td>\n");
      out.write("                        <td>IOS</td>\n");
      out.write("                        <td>6000</td>\n");
      out.write("                        <td>Ajouter</td>\n");
      out.write("                        <td>Supprimer</td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </fieldset>\n");
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