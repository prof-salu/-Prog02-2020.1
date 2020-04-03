package gui;

import javax.swing.JOptionPane;

/**
 * @author prof-salu
 */
public class EntradaSaida {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "App para calcular média");
        
        float num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));
        float num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));
        float media = (num1 + num2) / 2;
        
        JOptionPane.showMessageDialog(null, "A média dos valores é " + media);
    }
}
