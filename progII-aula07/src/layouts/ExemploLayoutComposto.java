package layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


// CORRIGIR IMPORTS --> (SHIFT + CTRL + I)
/**
 * @author prof-salu
 */
public class ExemploLayoutComposto extends JFrame{
    
    public ExemploLayoutComposto(){
        super("Layout composto");
    }
    
    public void init(){
        setBounds(50, 100, 300, 300);
        
        BorderLayout borderLayout = new BorderLayout();
        FlowLayout flowLayout = new FlowLayout();
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        
        JButton btn1 = new JButton("B1 - painel1");
        JButton btn2 = new JButton("B2 - painel1");
        JButton btn3 = new JButton("B1 - painel2");
        JButton btn4 = new JButton("B2 - painel2");
        JButton btn5 = new JButton("CENTRO");
        
        panel1.setLayout(flowLayout);
        panel2.setLayout(borderLayout);
        
        panel1.add(btn1);
        panel1.add(btn2);
        
        panel2.add(btn3, BorderLayout.WEST);
        panel2.add(btn4, BorderLayout.EAST);
        
        getContentPane().add(panel1, BorderLayout.NORTH);
        getContentPane().add(panel2, BorderLayout.SOUTH);
        getContentPane().add(btn5, BorderLayout.CENTER);
        
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        ExemploLayoutComposto frame = new ExemploLayoutComposto();
        
        frame.init();
    }

}
