package testes;

import dao.ContatoDAO;
import java.sql.SQLException;
import java.time.LocalDate;
import modelo.Contato;

/**
 * @author prof-salu
 */
public class TesteInsert {
    public static void main(String[] args) throws SQLException {
        Contato c1 = new Contato();
        
        c1.setId(3);
        c1.setNome("Max");
        c1.setEmail("max@email.com");
        c1.setEndereco("Rua M, 190");
        c1.setDataNascimento(LocalDate.now());
        
        ContatoDAO dao = new ContatoDAO();
        
        dao.adiciona(c1);
        
    }
}
