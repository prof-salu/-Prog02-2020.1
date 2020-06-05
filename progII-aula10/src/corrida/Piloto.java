package corrida;

/**
 * @author prof-salu
 */
public class Piloto implements Runnable {

    private String nome;
    private double velocidade;
    private double distanciaCircuito;
    private double distanciaPercorrida;

    public Piloto(String nome, double velocidade, double distanciaCircuito) {
        this.nome = nome;
        this.velocidade = velocidade;
        this.distanciaCircuito = distanciaCircuito;
        this.distanciaPercorrida = 0;
    }

    public void acelerar() {
        while (distanciaPercorrida < distanciaCircuito) {
            distanciaPercorrida += velocidade;
            System.out.printf(nome + " esta no KM %.2f\n", distanciaPercorrida);
        }

        System.out.println(nome + "**********TERMINOU**********");
    }

    @Override
    public void run() {
        acelerar();
    }
}
