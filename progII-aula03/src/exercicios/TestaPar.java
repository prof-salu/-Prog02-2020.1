
package exercicios;

public class TestaPar {
    public static void main(String[] args) {
        Par<Integer, Integer> ponto = new Par<>(5,8);
        Par<String, Double> nota = new Par<>("Pedro", 7.0);
        Par<Double, Double> coordenadas = new Par<>(4.3576, 98.34568);
        Par<Integer,String> funcionario = new Par<>(6589235, "Mario");
        
        System.out.println(ponto);
        System.out.println(nota);
        System.out.println(coordenadas);
        System.out.println(funcionario);
    }
}
