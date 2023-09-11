package mvc.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoDAO {

    public int getId() {
        return id;
    }

   
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    private int id;
    private String nome;
    private String cpf;
    private String data;
    public Connection conectaBD(){
        Connection conn = null;
        try {
            String url = "jdbc:postgresql://localhost:5432/hotel";
            String user = "postgres";
            String password = "postgres";
            
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(url,user,password);
            
            System.out.println("Conectado com sucesso");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao se conectar ao banco de dados");
            e.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("erro ao se conectar, banco não encontrado"+ex.getMessage());
            ex.printStackTrace();
        }
        return conn;
    }
}
