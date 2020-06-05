package exemplo2;

/**
 * @author prof-salu
 */
public class GerarRelatorio {

    public static void main(String[] args) {
        GeradorPDF pdf = new GeradorPDF();
        BarraDeProgresso barra = new BarraDeProgresso();

        //pdf.executa();
        //barra.executa();
        Thread t1 = new Thread(pdf);
        Thread t2 = new Thread(barra);
        
        t1.start();
        t2.start();
    }
}
