package testes;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author prof-salu
 */
public class TestaData {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate niver = LocalDate.of(1987, 12, 27);
        
        System.out.println("Data de hoje: " + hoje);
        System.out.println("Meu aniversário: " + niver);
        
        System.out.println("Data formatada:  "  +  hoje.format(DateTimeFormatter.ofPattern("d/MM/yyyy")));
        System.out.println("Data formatada:  "  +  hoje.format(DateTimeFormatter.ofPattern("d/MMM/yyyy")));
        System.out.println("Data formatada:  "  +  hoje.format(DateTimeFormatter.ofPattern("d/MMMM/yyyy")));
    }
}