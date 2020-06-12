package chat;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author prof-salu
 */
public class TrataCliente implements Runnable{
    
    private Servidor servidor;
    private InputStream inputCliente;
    
    public TrataCliente(InputStream inputCliente, Servidor servidor){
        this.inputCliente = inputCliente;
        this.servidor = servidor;
    }
    
    @Override
    public void run() {
        Scanner sc = new Scanner(inputCliente);
        
        while(sc.hasNextLine()){
            servidor.distribuiMensagem(sc.nextLine());
        }
        
        sc.close();
    }    
}
