
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author prof-salu
 */
public class ControleEventoBotao implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Botão clicado!");
    }
}