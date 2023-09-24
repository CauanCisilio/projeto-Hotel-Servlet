import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.model.Login;

@WebFilter("/ServletLogin")
public class AuthenticationFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Inicialização do filtro (se necessário)
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        String userName = request.getParameter("usuario");
        String password = request.getParameter("senha");

        if (userName != null && !userName.isEmpty() && password != null && !password.isEmpty()) {
            Login login = new Login();
            boolean loginSucesso = login.verificaLogin(userName, password);

            if (loginSucesso) {
                // Se a autenticação for bem-sucedida, redirecione para a página de login.jsp
                httpResponse.sendRedirect("index.jsp");
                return; // Importante retornar após o redirecionamento
            } else {
                // Se a autenticação falhar, redirecione para uma página de erro
                httpResponse.sendRedirect("loginError1.jsp");
                return; // Importante retornar após o redirecionamento
            }
        } else {
            // Se userName ou password forem nulos, redirecione para uma página de erro
            httpResponse.sendRedirect("loginError2.jsp");
            return; // Importante retornar após o redirecionamento
        }
    }


    @Override
    public void destroy() {
        // Liberação de recursos (se necessário)
    }
}
