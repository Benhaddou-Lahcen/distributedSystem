package Servelets;
import jakarta.ejb.EJB;

import EJB.BonjourInt;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/bonjour")
public class BonjourServelet extends HttpServlet {
    @EJB
    private BonjourInt bonjour;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println(">>> Appel de la servlet Bonjour par: Lahcen");
        String message = bonjour.Bonjour("lahcen");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>" + message + "</h2>");
    }
}
