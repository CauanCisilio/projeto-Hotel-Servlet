package mvc.viewhelper;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.model.Cadastra;
import mvc.model.ConexaoDAO;

public class CadastroVH {

    public void renderForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Aqui você pode gerar o formulário HTML e enviá-lo como resposta (renderizar o formulário).
        // Por exemplo:
        request.getRequestDispatcher("formularioCadastro.jsp").forward(request, response);
    }

    public void processForm(HttpServletRequest request) {
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");

        if (!nome.isEmpty() && !cpf.isEmpty()) {
            ConexaoDAO conexao = new ConexaoDAO();
            Cadastra cadastra = new Cadastra();
            conexao.setNome(nome);
            conexao.setCpf(cpf);

            // Agora você pode chamar o método cadastrar e passar o objeto conexao
            cadastra.Cadastrar(conexao);
        }
        // Não é necessário redirecionar a partir daqui, pois isso será tratado na Servlet de Cadastro.
    }
}
