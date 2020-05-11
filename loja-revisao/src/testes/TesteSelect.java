package testes;

import dao.ProdutoDAO;
import java.util.List;
import modelo.Produto;

/**
 * @author prof-salu
 */
public class TesteSelect {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        
        List<Produto> lista = dao.getProdutos();
        
        for (Produto produto : lista) {
            System.out.println(produto);
        }
    }
}
