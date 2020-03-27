
package testes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        //DriverManager.getConnection(stringConexao, usuario, senha);
        Connection conexao = DriverManager.getConnection
                                                    ("jdbc:postgresql://localhost:5432/agenda", "postgres", "");
        
        System.out.println("Conexao  aberta!");
        
        conexao.close();
        
        System.out.println("Conexão fechada!");
    }
}
