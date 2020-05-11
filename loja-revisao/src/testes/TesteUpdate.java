package testes;

import dao.ProdutoDAO;
import modelo.Produto;

/**
 * @author prof-salu
 */
public class TesteUpdate {
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setId(2);
        p.setDescricao("Teclado");
        p.setQuantidade(197);
        p.setPreco(75.50);
        
        ProdutoDAO dao = new ProdutoDAO();
        
        dao.altera(p);
    }
}
