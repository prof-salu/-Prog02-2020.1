
import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author prof-salu
 */
public class TestaConexao {
    public static void main(String[] args) {
        Connection con = new ConnectionFactory().getConnection();
        System.out.println("Conexao aberta!");
        
        try {
            con.close();
            System.out.println("Conexao fechada!");
        } catch (SQLException ex) {
            System.out.println("Falha na conexao com o banco de dados...");
        }
    }
}