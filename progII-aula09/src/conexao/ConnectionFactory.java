package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author prof-salu
 */
public class ConnectionFactory {
    public Connection getConnection(){
        try{
            String url = "jdbc:postgresql://localhost:5432/empresa";
            String user = "postgres";
            String pass = "";
            
            return DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            throw new RuntimeException();
        }
    }
}
