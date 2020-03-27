package testes;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author prof-salu
 */
public class TesteConnectionFactory {
    public static void main(String[] args) {
        try {
            Connection con = new ConnectionFactory().getConnection();
            System.out.println("COnexao aberta!");
            con.close();
            System.out.println("Conexao fechada!");
        } catch (SQLException ex) {
            
        }
    }
}
