
import com.sun.java.swing.plaf.windows.WindowsBorders;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 * @author prof-salu
 */
public class AspectosVisuais extends JFrame {

    private JPanel painel = new JPanel();
    private JLabel lbl_texto = new JLabel("Texto");
    private JButton btn_1 = new JButton("Botao 1");
    private JButton btn_2 = new JButton("Botao 2");
    private Cursor mao = new Cursor(Cursor.HAND_CURSOR);
    private Font arialFonte = new Font("Arial", Font.BOLD, 14);
    private Font timesFonte = new Font("Times New Roman", Font.PLAIN, 60);
    private Border borda = new LineBorder(Color.YELLOW, 3);
    private Border borda2 = new WindowsBorders.DashedBorder(Color.BLUE, 4);
        
    public AspectosVisuais() {
        super("Modificando as pectos visuais");
    }

    public void init() {
        setBounds(50, 100, 400, 150);
        
        //Associa um JPanel ao JFrame
        getContentPane().add(painel);
        
        //Associa os componentes ao JPanel
        painel.add(btn_1);
        painel.add(btn_2);
        painel.add(lbl_texto);        
        
        //Alterando os componentes
        
        //painel.setBackground(new Color(150, 150, 150));
        //painel.setBackground(Color.ORANGE);
        painel.setBackground(new Color(244, 164, 96));
        painel.setBorder(borda);
        
        //mouse over
        btn_1.setCursor(mao);
        //Cor de fundo
        btn_1.setBackground(Color.PINK);
        //Cor da fonte
        btn_1.setForeground(Color.BLUE);
        btn_1.setFont(arialFonte);
        
        btn_2.setCursor(mao);
        //Desativar o botao
        btn_2.setEnabled(false);
        btn_2.setFont(arialFonte);
        
        lbl_texto.setToolTipText("Eu sou um label informativo");
        lbl_texto.setFont(timesFonte);
        lbl_texto.setBorder(borda2);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        AspectosVisuais frame = new AspectosVisuais();

        frame.init();
    }
}
