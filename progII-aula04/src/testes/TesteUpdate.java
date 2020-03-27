package testes;

import dao.ContatoDAO;
import java.sql.SQLException;
import java.time.LocalDate;
import modelo.Contato;

/**
 * @author prof-salu
 */
public class TesteUpdate {
    public static void main(String[] args) throws SQLException {
        Contato c1 = new Contato();
        c1.setId(1);
        c1.setNome("Augusto");
        c1.setEmail("augusto@email.com");
        c1.setDataNascimento(LocalDate.of(2001, 11, 23));
        c1.setEndereco("Rua X, 90");
        
        ContatoDAO dao = new ContatoDAO();
        
        dao.altera(c1);
    }
}
