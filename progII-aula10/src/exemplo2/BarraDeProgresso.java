package exemplo2;

/**
 * @author prof-salu
 */
public class BarraDeProgresso implements Runnable {

    public void executa() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Carregando: " + i);
        }
    }

    @Override
    public void run() {
        executa();
    }
}
