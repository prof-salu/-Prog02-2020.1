
package genericos;

public class Produto<T> {
    T codigo;
    String nome;
    double preco;

    public Produto(T codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + '}';
    }
    
    
}
