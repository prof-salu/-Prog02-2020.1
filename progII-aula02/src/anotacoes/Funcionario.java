
package anotacoes;

public class Funcionario {
    private String nome;
    private double salario;
    public Sexo sexo;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    @Deprecated  
    public void exibeSalario(){
        System.out.println("Salario: " + salario);
    }
    
    public void imprimeSalario(){
        System.out.printf("Salario: R$%.2f\n", salario);
    }
    
    @SuppressWarnings (value = { "unused" })
    public double calculaDesconto(){
        double taxaDesconto = 0.2;
        
        return salario * 0.2;
    }
    
    @EmDesenvolvimento (value = "Calculo deve ser baseado no percentual de vendas", 
                        importancia = EmDesenvolvimento.Importancia.CRITICO)
    public double calculaBonificacao(){
        return 0;
    }
    
}
