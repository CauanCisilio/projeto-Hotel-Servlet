package mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author cauan
 */
public class Login {
    public boolean verificaLogin(String nome, String senha){
        
       //criando variavel booleana para retornar um valor verdadeiro caso o bloco try seja executado
       boolean loginSucesso = false;
       try {
           Connection conn = new ConexaoDAO().conectaBD();
           String sql = "SELECT * FROM usuarios_sistema WHERE usuario = ? AND senha = ?";
           PreparedStatement pstm = conn.prepareStatement(sql);
          
           //passando os parametros desse metodo para o objeto pstm
           pstm.setString(1, nome);
           pstm.setString(2, senha);
           
           //Retorna linhas de registros da tabela sql
           ResultSet rs = pstm.executeQuery();
           if(rs.next()){
               loginSucesso = true;
           } 
           
           rs.close();
           pstm.close();
           
           System.out.println("login efetuado com sucesso!");
       } catch (SQLException e) {
           e.printStackTrace();
           System.out.println("Erro ao efetuar login"+e.getMessage());
       }
       return loginSucesso;
   }
}
