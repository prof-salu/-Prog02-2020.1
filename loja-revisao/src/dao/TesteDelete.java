package dao;

import modelo.Produto;

/**
 * @author prof-salu
 */
public class TesteDelete {
public static void main(String[] args) {
        Produto p = new Produto();
        p.setId(2);
        
        ProdutoDAO dao = new ProdutoDAO();
        
        dao.apaga(p);
    }
}
