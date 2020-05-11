package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author prof-salu
 */
public class ConnectionFactory {
    
    public Connection getConnection(){
        
        try{
            String url = "jdbc:postgresql://localhost:5432/loja";
            String user = "postgres";
            String password = "";
        
        return DriverManager.getConnection(url, user, password);
        }catch(SQLException e){
            throw new RuntimeException();
        }
    }
}