package exemplo3;

/**
 * @author prof-salu
 */
public class GerarRelatorio {

    public static void main(String[] args) {
        GeradorPDF pdf = new GeradorPDF();
        BarraDeProgresso barra = new BarraDeProgresso();

        pdf.start();
        barra.start();
    }
}
