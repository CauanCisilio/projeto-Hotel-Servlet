package mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Locale;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.model.Cadastra;
import mvc.model.ConexaoDAO;

@WebServlet("/ServleCadastro")
public class ServletCadastro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String nome = request.getParameter("nome");
            String cpf = request.getParameter("cpf");
          //String data = request.getParameter("data");
            
            if(!nome.isEmpty() && !cpf.isEmpty()){
                ConexaoDAO conexao = new ConexaoDAO();
                Cadastra cadastra = new Cadastra();
                conexao.setNome(nome);
                conexao.setCpf(cpf);
                //conexao.setData(data);
                
                /*objeto da classe cadastra chama o metodo cadastrar e passa o objeto conexao
                  junto das váriaveis que foram acessadas através do método set
                */
                cadastra.Cadastrar(conexao);
                 request.getRequestDispatcher("listaClientes.jsp").forward(request, response);
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
