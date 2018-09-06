

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/procesaForm")
public class procesaForm extends HttpServlet
{
   protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
   {
       // obtengo los parametros     
      String usr = request.getParameter("usr");
      String pwd = request.getParameter("pwd");
      String otro = request.getParameter("otroParam");
       // genero la pagina		
      PrintWriter out=response.getWriter();
      out.println("<html><body>");
      out.println("-- Recibi estos parametros -- <br>");
      out.println("usr = "+usr+"<br>");
      out.println("pwd = "+pwd+"<br>");
      out.println("otroParam = "+otro+"<br>");
      out.println("</body></html>");
      out.close();
   }

   protected void doGet(HttpServletRequest request ,HttpServletResponse response) throws ServletException,IOException
   {
       // si recibo un request via GET no lo acepto :O(    
      PrintWriter out=response.getWriter();
      out.println("<html><body>");
      out.println("Solo por POST, amigo...");
      out.println("</body></html>");
      out.close();
   }
}
