package chat;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author prof-salu
 */
public class RecebeMensagem implements Runnable{

    private InputStream servidor;
    
    public RecebeMensagem(InputStream servidor){
        this.servidor = servidor;
    }
    
    @Override
    public void run() {
        Scanner sc = new Scanner(servidor);
        
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
