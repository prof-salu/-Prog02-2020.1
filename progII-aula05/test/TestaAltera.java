
import dao.ProdutoDAO;
import modelo.Produto;

/**
 * @author prof-salu
 */
public class TestaAltera {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setCodigo(2);
        p1.setDescricao("Notebook");
        p1.setQuantidade(43);
        p1.setPreco(3999.90);      
        
        ProdutoDAO dao = new ProdutoDAO();
        dao.altera(p1);
    }
}
