package dormindo;

/**
 * @author prof-salu
 */
public class TestaSoneca {
    public static void main(String[] args) {
        
        System.out.println("Threads em execucao: " + Thread.activeCount());
        Soneca sono = new Soneca();
        
        Thread t1 = new Thread(sono);
        
        t1.start();
        System.out.println("Threads em execucao: " + Thread.activeCount());
    }
}
