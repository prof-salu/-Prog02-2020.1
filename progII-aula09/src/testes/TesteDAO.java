package testes;

import modelo.Cliente;
import modelo.ClienteDAO;

/**
 * @author prof-salu
 */
public class TesteDAO {
    public static void main(String[] args) {
        ClienteDAO dao = new ClienteDAO();
        Cliente cliente = new Cliente();
        
        cliente.setId(1);
        cliente.setNome("Gabi");
        cliente.setEmail("gabi@gmail.com");
        cliente.setSexo("Feminino");
        
        //dao.inserir(cliente);
        //dao.atualizar(cliente);
        //dao.apagar(cliente);
        
        cliente = dao.getClientePorEmail("gabi@gmail.com");
        
        System.out.println("Nome: " + cliente.getNome());
    }
}
