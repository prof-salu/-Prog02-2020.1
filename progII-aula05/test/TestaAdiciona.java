
import dao.ProdutoDAO;
import modelo.Produto;

/**
 * @author prof-salu
 */
public class TestaAdiciona {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setCodigo(1);
        p1.setDescricao("Monitor");
        p1.setQuantidade(79);
        p1.setPreco(450.90);
        
        Produto p2 = new Produto();
        p2.setCodigo(2);
        p2.setDescricao("Notebook");
        p2.setQuantidade(43);
        p2.setPreco(4550.90);
        
        Produto p3 = new Produto();
        p3.setCodigo(4);
        p3.setDescricao("Mouse");
        p3.setQuantidade(201);
        p3.setPreco(39.90);
        
        ProdutoDAO dao = new ProdutoDAO();
        
        //dao.adiciona(p1);
        //dao.adiciona(p2);
        dao.adiciona(p3);
    }
}
