
package javadoc;
/*Para acessar o javadoc em projeto no netbeans:
    NetbeansProjects/meuProjeto/dist/javadoc
*/

/**Classe utilizada para representar um produto
 * 
 * @author salu
 * @version 1.0
 */
public class Produto {
    /**
     * Propriedade que descreve um produto
     */
    public String descricao;
    /**
     * Propriedade que armazena o valor em Reais
     */
    private double preco;
    private int quantidade;
    
    /**Construtor da classe Produto
     * 
     * @param descricao descreve um produto
     * @param preco valor do produto em Reais
     * @param quantidade quantidade do produto em estoque
     */
    public Produto(String descricao, double preco, int quantidade) {
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    /**
     * Metodo utilizado para verificar o preco de um produto
     * @return retorna o preco do produto
     */
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Metodo que exibe todas as informacoes de um produto
     * @return retorna as informacoes de um produto detalhado
     */
    @Override
    public String toString() {
        return "Produto{" + "descricao=" + descricao + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
    
    
    
}
