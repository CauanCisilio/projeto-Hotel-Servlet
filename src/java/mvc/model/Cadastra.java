
package mvc.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Cadastra {
    public void Cadastrar(ConexaoDAO cadastra){
        try {
            Connection conn = new ConexaoDAO().conectaBD();
            String sql = "INSERT INTO clientes(nome,cpf) VALUES (?,?)";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1,cadastra.getNome());
            pstm.setString(2,cadastra.getCpf());
            //pstm.setString(3,cadastra.getData());
            
            
            pstm.execute();
        } catch (SQLException e) {
            System.out.print("erro ao cadastrar");
            e.printStackTrace();
        }
    }
}
