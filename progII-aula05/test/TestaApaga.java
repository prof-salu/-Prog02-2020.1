
import dao.ProdutoDAO;
import modelo.Produto;

/**
 * @author prof-salu
 */
public class TestaApaga {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setCodigo(4);
        
        ProdutoDAO dao = new ProdutoDAO();
        
        dao.apaga(p1);
    }
}