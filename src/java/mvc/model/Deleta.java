
package mvc.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deleta {
    public void deletar(int id){
        try {
            Connection conn = new ConexaoDAO().conectaBD();
            String sql = "DELETE FROM clientes WHERE id= ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1,id);
            
            int rowsAffected = pstm.executeUpdate();
            if(rowsAffected>0){
                System.out.println("Deletado com sucesso");
            }else{
                System.out.println("não foi possível deletar");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao deletar cliente no banco de dados");
        }
    }
}
