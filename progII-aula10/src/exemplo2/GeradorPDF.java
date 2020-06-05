package exemplo2;

/**
 * @author prof-salu
 */
public class GeradorPDF implements Runnable {

    public void executa() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Gerando relatorio: " + i);
        }
    }

    @Override
    public void run() {
        executa();
    }
}
