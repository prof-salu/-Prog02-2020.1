package escalonador;

/**
 * @author prof-salu
 */
public class Programa implements Runnable{

    private int id;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    @Override
    public void run() {
        for(int i = 0; i< 10000; i++){
            System.out.println("programa " + getId() + " valor: " + i);
        }
    }
}
