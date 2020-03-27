package testes;

import dao.ContatoDAO;
import java.sql.SQLException;
import java.util.List;
import modelo.Contato;

/**
 * @author prof-salu
 */
public class TesteSelect {
    public static void main(String[] args) throws SQLException {
        ContatoDAO dao = new ContatoDAO();
        List<Contato> lista = dao.consulta();
        
        for(Contato contato : lista){
            System.out.println(contato);
        }
        
    }
}
