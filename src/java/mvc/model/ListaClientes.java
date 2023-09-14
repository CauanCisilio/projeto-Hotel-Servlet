
package mvc.model;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ListaClientes {
    public ArrayList<ConexaoDAO>Lista(){
        ArrayList<ConexaoDAO> lista = new ArrayList<>();
        Connection conn = new ConexaoDAO().conectaBD();
        try {
            String sql = "SELECT * FROM clientes";
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
             
            System.out.print("Listando");
            while(rs.next()){
                ConexaoDAO cliente = new ConexaoDAO();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                
                lista.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
   public ArrayList<ConexaoDAO> ListaContendo(String nome) {
    ArrayList<ConexaoDAO> lista = new ArrayList<>();
    Connection conn = new ConexaoDAO().conectaBD();
    try {
        String sql = "SELECT * FROM clientes WHERE nome LIKE ?"; // Correção SQL
        PreparedStatement pstm = conn.prepareStatement(sql);
        
        // Adicione o caractere '%' antes e depois do valor de nome para a pesquisa "contém"
        pstm.setString(1, "%" + nome + "%"); // Correção do parâmetro
        
        ResultSet rs = pstm.executeQuery();
        
        System.out.print("Listando");
        while (rs.next()) {
            ConexaoDAO cliente = new ConexaoDAO();
            cliente.setId(rs.getInt("id"));
            cliente.setNome(rs.getString("nome"));
            cliente.setCpf(rs.getString("cpf"));
            
            lista.add(cliente);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return lista;
}
}
