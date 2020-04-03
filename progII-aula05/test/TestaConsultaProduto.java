
import dao.ProdutoDAO;
import modelo.Produto;

/**
 * @author prof-salu
 */
public class TestaConsultaProduto {
    public static void main(String[] args) {
        ProdutoDAO dao = new ProdutoDAO();
        
        Produto p = dao.getProduto(1);
        System.out.println(p);
    }
}
