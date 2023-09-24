package mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.model.ConexaoDAO;
import mvc.model.Deleta;


@WebServlet("/ServletDeleta")
public class ServletDeleta extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String idParam = request.getParameter("id");
        if(!idParam.isEmpty()){
           int idCliente = Integer.parseInt(idParam);
           Deleta deletaOBJ  = new Deleta();
           
           deletaOBJ.deletar(idCliente);
        }
        // pagina listaClientes atualizada
        String redireciona = "listaClientes.jsp";
        
    }



}
