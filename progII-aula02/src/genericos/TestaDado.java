
package genericos;

import anotacoes.Funcionario;

public class TestaDado {
    public static void main(String[] args) {
        Dado d1 = new Dado("Azul");
        //Dado d2 = new Dado(4.5f);
        DadoGenerico<String> d3 = new DadoGenerico<>("Vermelho");
        DadoGenerico<Float> d4 = new DadoGenerico<>(4.5f);
        Funcionario f1 = new Funcionario("Bob", 3500);
        DadoGenerico<Funcionario> d5 = new DadoGenerico<>(f1);
        
        System.out.println(d1.getDado());
        System.out.println(d3.getDado());
        System.out.println(d4.getDado());
        System.out.println(d5.getDado());
    }
}
