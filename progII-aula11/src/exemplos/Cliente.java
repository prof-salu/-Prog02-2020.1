package exemplos;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author prof-salu
 */
public class Cliente {
    //ALT + ENTER ==> HELP do netbeans
    public static void main(String[] args) throws IOException {
        Socket cliente = new Socket("127.0.0.1", 12345);
        System.out.println("O cliente se conectou ao servidor!");
        
        Scanner sc = new Scanner(System.in);
        PrintStream saida = new PrintStream(cliente.getOutputStream());
        
        while(sc.hasNextLine()){
            saida.println(sc.nextLine());
        }
        
        saida.close();
        sc.close();
        cliente.close();
    }
}
