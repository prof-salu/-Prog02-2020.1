package testes;

import dao.ContatoDAO;
import java.sql.SQLException;
import modelo.Contato;

/**
 * @author prof-salu
 */
public class TesteDelete {
    public static void main(String[] args) throws SQLException {
        Contato c1 = new Contato();
        c1.setId(1);
        
        ContatoDAO dao = new ContatoDAO();
        
        dao.apaga(c1);
        
    }
}
