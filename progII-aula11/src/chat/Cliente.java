package chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author prof-salu
 */
public class Cliente {
    public static void main(String[] args) throws IOException {
        Cliente cliente = new Cliente("127.0.0.1", 12345, "win10");
        cliente.executa();
    }
    
    private String host;
    private int porta;
    private String usuario;
    
    public Cliente(String host, int porta, String usuario){
        this.host = host;
        this.porta = porta;
        this.usuario = usuario;
    }
    
    public void executa() throws IOException{
        Socket cliente = new Socket(host, porta);
        System.out.println(usuario + " conectado!");
        
        RecebeMensagem rm = new RecebeMensagem(cliente.getInputStream());
        Thread novaThread = new Thread(rm);
        novaThread.start();
        
        Scanner sc = new Scanner(System.in);
        PrintStream saida= new PrintStream(cliente.getOutputStream());
        
        while(sc.hasNextLine()){
            String msg = sc.nextLine();
            
            if(msg.equalsIgnoreCase("sair")){
                System.out.println("Voce desconectou ...");
                break;
            }
            
            saida.println(usuario + " falou --> " + msg);
        }
        
        saida.println(usuario + " desconectou");
        
        saida.close();
        sc.close();
        cliente.close();
    }
}