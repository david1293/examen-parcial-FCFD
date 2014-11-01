/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fer.controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T107
 */
@WebServlet(name = "ServeltExamen", urlPatterns = {"/ServeltExamen"})
public class ServeltExamen extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void DoGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
       
    SessionFactory factory=HibernateUtilidades.getSessionFactory();
        org.hibernate.Session sesion=factory.openSession();
    Transaction tranza=sesion.beginTransaction();
    
    
    String nombre= request.getParameter("nombre");
    String calificacion=request.getParameter("calificacion");
    
    //4.-
   
    //4.-generar evaluacion y crear ana y 7
    Evaluacion e = new Evaluacion();
    sesion.save("ana","7");
    e.setCalificacion(calificacion);
    e.setNombre(nombre);
    tranza.commit();
    sesion.close(); 
    
    out.print("Datos seleccionados");
    out.print("Datods guardaados");
     
    }
}
      
      
      
      
      


