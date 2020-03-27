package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author prof-salu
 */
public class ConnectionFactory {
    public Connection getConnection() throws SQLException{
        
        String url = "jdbc:postgresql://localhost:5432/agenda";
        String user  = "postgres";
        String password = "";
        
       return DriverManager.getConnection(url, user, password);
    }
}
