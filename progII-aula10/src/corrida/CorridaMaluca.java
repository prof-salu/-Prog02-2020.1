package corrida;

/**
 * @author prof-salu
 */
public class CorridaMaluca {
    public static void main(String[] args) {
        int tamanhoCircuito = 50;
        Piloto p1 = new Piloto("Maira", 1.1, tamanhoCircuito);
        Piloto p2 = new Piloto("Rafael", 0.9, tamanhoCircuito);
        Piloto p3 = new Piloto("Emanoel", 1.3, tamanhoCircuito);
        Piloto p4 = new Piloto("Carlos", 1.4, tamanhoCircuito);
        Piloto p5 = new Piloto("Caio", 0.7, tamanhoCircuito);
        
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);
        Thread t4 = new Thread(p4);
        Thread t5 = new Thread(p5);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();      
    }
}
