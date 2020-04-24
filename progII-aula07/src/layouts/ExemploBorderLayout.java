package layouts;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author prof-salu
 */
public class ExemploBorderLayout extends JFrame{
    
    public ExemploBorderLayout(){
        super("BorderLayout");
    }
    
    public void init(){
        setBounds(50, 100, 400, 150);
        BorderLayout layout = new BorderLayout();
        
        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(layout);
        
        JButton btnNorte = new JButton("Norte");
        JButton btnSul = new JButton("Sul");
        JButton btnLeste = new JButton("Leste");
        JButton btnOeste = new JButton("Oeste");
        JButton btnCentro = new JButton("Centro");
        
        panel.add(btnNorte, BorderLayout.NORTH);
        panel.add(btnSul, BorderLayout.SOUTH);
        panel.add(btnLeste, BorderLayout.EAST);
        panel.add(btnOeste, BorderLayout.WEST);
        panel.add(btnCentro, BorderLayout.CENTER);        
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
        ExemploBorderLayout frame = new ExemploBorderLayout();
        
        frame.init();
    }
}
