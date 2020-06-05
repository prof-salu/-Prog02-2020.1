package exemplo3;

/**
 * @author prof-salu
 */
public class BarraDeProgresso extends Thread {

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
