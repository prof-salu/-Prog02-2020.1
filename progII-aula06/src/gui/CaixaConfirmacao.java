package gui;

import javax.swing.JOptionPane;

/**
 * @author prof-salu
 */
public class CaixaConfirmacao {
    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(  null, 
                                        "Você concorda com os termos?", 
                                        "Confirmação", 
                                        JOptionPane.YES_NO_CANCEL_OPTION, 
                                        JOptionPane.INFORMATION_MESSAGE);
        switch(opcao){
            case 0:
                JOptionPane.showMessageDialog(null, "Você concordou com os termos");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Você NÃO concordou com os termos");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Você fechou a janela de confirmação");
                break;             
        }
                
    }
}
