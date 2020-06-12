package exemplos;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author prof-salu
 */
public class Servidor {
    public static void main(String[] args) throws IOException {
        ServerSocket servidor = new ServerSocket(12345);
        System.out.println("Porta 12345 aberta!");
        
        Socket cliente = servidor.accept();
        System.out.println("Novo conexão com o cliente " 
                + cliente.getInetAddress().getHostAddress());
        
        Scanner sc = new Scanner(cliente.getInputStream());
        
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        
        sc.close();
        servidor.close();
        cliente.close();
    }
}