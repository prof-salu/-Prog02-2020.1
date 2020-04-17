package gui;

import javax.swing.JFrame;

public class MeuPrimeiroFrame extends JFrame {

    public MeuPrimeiroFrame() {
        super("Minha janela");
    }
    
    public void init(){
        //Define as dimenssões da janela
        setBounds(50, 100, 400, 150);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MeuPrimeiroFrame frame = new MeuPrimeiroFrame();
        frame.init();
    }
}