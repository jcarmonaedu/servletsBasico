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
@WebServlet(urlPatterns = {"/ServletEjemplo1"})
public class ServletEjemplo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Aqui va el formato de respuesta
        PrintWriter salida = response.getWriter();
        // Generamos respuesta de peticion
        salida.println("<html><body>");
        salida.println("<h1 style='text-aligne'>Prueba Servlet</h1> ");
        salida.println(" ");
        salida.println(" ");
        salida.println("La Fecha Hora actual: " + new Date());
        salida.println("</body></html>");
    }
}
