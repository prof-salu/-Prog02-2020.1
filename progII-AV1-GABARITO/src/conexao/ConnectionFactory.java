package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author prof-salu
 */
public class ConnectionFactory {

    public Connection getConnection() {

        try {
            String url = "jdbc:postgresql://localhost:5432/av1";
            String user = "postgres";
            String password = "";//troque a senha caso seja diferente
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
            throw new RuntimeException();
        }
    }
}
