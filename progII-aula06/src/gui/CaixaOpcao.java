package gui;

import javax.swing.JOptionPane;

/**
 * @author prof-salu
 */
public class CaixaOpcao {
    public static void main(String[] args) {
        String [] opcoes = {"Voltar", "Repetir", "Avançar"};
        
        int opcao = JOptionPane.showOptionDialog(   null, 
                                        "O que você deseja fazer agora?", 
                                        "Opções", 
                                        0, 
                                        JOptionPane.QUESTION_MESSAGE, 
                                        null, 
                                        opcoes, 
                                        opcoes[2]);
        
        switch(opcao){
            case 0:
                JOptionPane.showMessageDialog(null, "Você voltou!");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Você repetiu!");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Você avançou!");
                break;             
        }
    }
}