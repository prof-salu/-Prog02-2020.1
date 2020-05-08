
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author prof-salu
 */
public class EventosDeAcao extends JFrame{
    ControleEventoBotao evento = new ControleEventoBotao();
    
    public EventosDeAcao(){
        super("Eventos de ação");
    }
    
    public void init(){
        setSize(400, 100);
        JPanel painel = new JPanel();
        JButton btn_1 = new JButton("Clique aqui!");
        
        getContentPane().add(painel);
        
        //btn_1.addActionListener(evento);
        
        //Classe anonima ==> ALT + ENTER 
        btn_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão clicado!");
            }
        });
        
        painel.add(btn_1);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        EventosDeAcao frame = new EventosDeAcao();
        frame.init();
    }    
}
