package testes;

import dao.ProdutoDAO;
import modelo.Produto;

/**
 * @author prof-salu
 */
public class TesteInsert {
    //PSVM + TAB
    public static void main(String[] args) {
        Produto p = new Produto();
        p.setId(2);
        p.setDescricao("Teclado");
        p.setQuantidade(320);
        p.setPreco(89.90);
        
        ProdutoDAO dao = new ProdutoDAO();
        
        dao.adiciona(p);
        
    }
}