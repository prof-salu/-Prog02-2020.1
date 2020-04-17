package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author prof-salu
 */
public class ExemploContainer extends JFrame{
    public ExemploContainer(){
        super("Minha primeira aplicação");
    }    
    //IMPORTS --> (CTRL + SHIFT + I)
    //FORMAT --> (SHIFT + ALT + F)
    public void init(){
        setBounds(50, 100, 400, 150);
        
        //Componentes SWING
        JPanel painel = new JPanel();
        JButton botao = new JButton("Sou um botão");
        JLabel texto = new JLabel("Eu sou um label");
        
        //Add o painel ao JFRAME
        getContentPane().add(painel);
        //Add os componentes ao painel
        painel.add(botao);
        painel.add(texto);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        ExemploContainer frame = new ExemploContainer();
        frame.init();
    }
}