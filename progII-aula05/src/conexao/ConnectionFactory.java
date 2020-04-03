package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author prof-salu
 */
public class ConnectionFactory {
    public Connection getConnection(){
        String url = "jdbc:postgresql://localhost/loja";
        String user = "postgres";
        String password = "";
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            throw new RuntimeException();
        }
    }
}
