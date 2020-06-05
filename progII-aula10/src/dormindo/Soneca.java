package dormindo;

/**
 * @author prof-salu
 */
public class Soneca implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            
            try {
                //Dormindo por 3 segundos
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println("Error: " + ex);
            }
        }
    }
}
