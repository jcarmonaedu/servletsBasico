

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/muestraNumeros")
public class MuestraNumeros extends HttpServlet
{
    // http://localhost:8080/ServletEjemplo1/muestraNumeros?desde=5&hasta=10
   protected void doGet(HttpServletRequest request
                       ,HttpServletResponse response) 
                        throws ServletException,IOException
   {
       // los parametros siempre se reciben como cadenas
      String sDesde = request.getParameter("desde");
      String sHasta = request.getParameter("hasta");

       // los convertimos a enteros...
      int desde=Integer.parseInt(sDesde);
      int hasta=Integer.parseInt(sHasta);

      PrintWriter out=response.getWriter();
      out.println("<html><body>");

      for(int i=desde; i<hasta; i++)
      {
         out.println(i+"<br>");
      }
		
      out.println("</body><html>");
      out.close();   
   }
}
