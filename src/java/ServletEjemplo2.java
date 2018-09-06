/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jorge
 */
@WebServlet(urlPatterns = {"/ServletEjemplo2"})
public class ServletEjemplo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {     
        //http://localhost:8080/ServletEjemplo1/ServletEjemplo2?nombre=Jorge
        String nombre = request.getParameter("nombre");   
        // Aqui va el formato de respuesta
        PrintWriter salida = response.getWriter();
        // Generamos respuesta de peticion....
        salida.println("<html><body>");
        salida.println("<h1 style='text-aligne'>Prueba Servlet de : " + nombre + "<h1>");
        salida.println(" ");
        salida.println(" ");
        salida.println("La Fecha Hora actual: " + new Date());
        salida.println("</body></html>");    
        salida.close();
    }
}
