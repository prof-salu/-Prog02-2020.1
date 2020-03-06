
package anotacoes;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Mario", 3000);
        f1.sexo = Sexo.MASCULINO;
        
        f1.exibeSalario();
        f1.imprimeSalario();
    }
}