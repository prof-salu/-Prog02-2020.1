
package colecoes;

public class Aluno {
    private String nome;
    private float nota;

    public Aluno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", nota=" + nota + '}';
    }
    
    
}
