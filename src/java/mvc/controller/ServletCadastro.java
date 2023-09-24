package mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.viewhelper.CadastroVH;

@WebServlet("/ServletCadastro")
public class ServletCadastro extends HttpServlet {
    private CadastroVH cadastroVH;

    @Override
    public void init() throws ServletException {
        cadastroVH = new CadastroVH();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        cadastroVH.renderForm(request, response); // Uso do View Helper para renderizar o formulário
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
            // Processar os dados do formulário usando a classe CadastroVH
        if(!nome.isEmpty() && !cpf.isEmpty()){
            cadastroVH.processForm(request);      
            // Redirecionar para outra página após o processamento do formulário
            response.sendRedirect("listaClientes.jsp");
        }else{
            response.setContentType("text/html"); 
                Calendar c = Calendar.getInstance();
                
                PrintWriter out = response.getWriter();
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Minha Página HTML</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Necessário preencher todos os campos</h1>");
                out.println("<p>Não foi possível cadastrar usuário</p>");
                out.println("<p>"+c.getTime()+"</p>");
                out.println("</body>");
                out.println("</html>");
        }
        
    }
}
