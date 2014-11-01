/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fer.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "ServeltCliente", urlPatterns = {"/ServeltCliente"})
public class ServeltCliente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void DoPush(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
            SessionFactory factory=HibernateUtilidades.getSessionFactory();
        org.hibernate.Session sesion=factory.openSession();
    Transaction tranza=sesion.beginTransaction();
    
    sesion.save(new Cliente ("david","8.4"));
    tranza.commit();
    sesion.close();
    
    
        
}
}
