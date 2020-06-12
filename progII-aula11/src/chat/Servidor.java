package chat;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/**
 * @author prof-salu
 */
public class Servidor {
    public static void main(String[] args) throws IOException {
        Servidor servidor = new Servidor(12345);
        servidor.executa();
    }
    
    private int porta;
    private List<PrintStream> clientes;
    
    public Servidor(int porta){
        this.porta = porta;
        clientes = new ArrayList<>();
    }
    
    public void executa() throws IOException{
        ServerSocket servidor = new ServerSocket(porta);
        System.out.println("Porta " + porta + " aberta!");
        
        while(true){
            Socket cliente = servidor.accept();
            
            System.out.println("Nova conexão com o cliente " + 
                    cliente.getInetAddress().getHostAddress());
            
            PrintStream ps = new PrintStream(cliente.getOutputStream());
            clientes.add(ps);
            
            TrataCliente tc = new TrataCliente(cliente.getInputStream(), this);
            Thread novaThread = new Thread(tc);
            novaThread.start();
        }
    }
    
    public void distribuiMensagem(String msg){
        for(PrintStream cliente : clientes){
            cliente.println(msg);
        }
    }
}
