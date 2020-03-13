
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        //DriverManager.getConnection(stringConexao, usuario, senha);
        Connection conexao = DriverManager.getConnection
                                                    ("jdbc:postgresql://localhost:5432/agenda", "postgres", "");
    }
}
