
package mvc.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deleta {
    public void deletar(String cpf){
        try {
            Connection conn = new ConexaoDAO().conectaBD();
            String sql = "DELETE FROM clientes WHERE cpf= ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,cpf);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
