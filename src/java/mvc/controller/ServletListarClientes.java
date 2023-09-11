package mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.model.ConexaoDAO;
import mvc.model.ListaClientes;

@WebServlet("/ServletListarClientes")
public class ServletListarClientes extends HttpServlet { 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
          ArrayList<ConexaoDAO> clientes = new ListaClientes().Lista(); // Use a classe ListaClientes
       
        // Defina a lista de clientes como um atributo de solicitaçã
        request.setAttribute("clientes", clientes);

        request.getRequestDispatcher("listaClientes.jsp").forward(request, response);
    }
}
