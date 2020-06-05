package visao;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * @author prof-salu
 * http://dontpad.com/progII-aula09
 */
public class VisaoCliente extends JFrame {
    private JLabel lblId = new JLabel("ID: ");
    private JLabel lblNome = new JLabel("Nome: ");
    private JLabel lblEmail = new JLabel("E-mail: ");
    private JLabel lblSexo = new JLabel("Sexo: ");
    private JTextField txtId = new JTextField(25);
    private JTextField txtNome = new JTextField(25);
    private JTextField txtEmail = new JTextField(25);
    private String[] opcoes = {" ", "Masculino", "Feminino"};
    private JComboBox comboSexo = new JComboBox(opcoes);
    private JButton btnLimpar = new JButton("LIMPAR");
    private JButton btnGravar = new JButton("GRAVAR");
    private JButton btnConsultar = new JButton("CONSULTAR");
    private JButton btnAtualizar = new JButton("ATUALIZAR");
    private JButton btnApagar = new JButton("APAGAR");
    private JPanel painel = new JPanel(new FlowLayout(SwingConstants.LEADING));

    public VisaoCliente() {
        super("Cadastro cliente");
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(JTextField txtNome) {
        this.txtNome = txtNome;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public void setTxtEmail(JTextField txtEmail) {
        this.txtEmail = txtEmail;
    }

    public JComboBox getComboSexo() {
        return comboSexo;
    }

    public void setComboSexo(JComboBox comboSexo) {
        this.comboSexo = comboSexo;
    }

    public JButton getBtnLimpar() {
        return btnLimpar;
    }

    public void setBtnLimpar(JButton btnLimpar) {
        this.btnLimpar = btnLimpar;
    }

    public JButton getBtnGravar() {
        return btnGravar;
    }

    public void setBtnGravar(JButton btnGravar) {
        this.btnGravar = btnGravar;
    }

    public JButton getBtnConsultar() {
        return btnConsultar;
    }

    public void setBtnConsultar(JButton btnConsultar) {
        this.btnConsultar = btnConsultar;
    }

    public JButton getBtnAtualizar() {
        return btnAtualizar;
    }

    public void setBtnAtualizar(JButton btnAtualizar) {
        this.btnAtualizar = btnAtualizar;
    }

    public JButton getBtnApagar() {
        return btnApagar;
    }

    public void setBtnApagar(JButton btnApagar) {
        this.btnApagar = btnApagar;
    }
    
    public String[] getOpcoes() {
        return opcoes;
    }    
    
    public void init() {
        setBounds(50, 100, 310, 300);

        //Associa um JPanel ao JFrame
        getContentPane().add(painel);

        //Associa os componentes ao JPanel
        painel.add(lblId);
        painel.add(txtId);
        painel.add(lblNome);
        painel.add(txtNome);
        painel.add(lblEmail);
        painel.add(txtEmail);
        painel.add(lblSexo);
        comboSexo.setPreferredSize(new Dimension(280, 20));
        comboSexo.setBackground(Color.white);
        painel.add(comboSexo);

        painel.add(btnLimpar);
        painel.add(btnGravar);
        painel.add(btnConsultar);
        painel.add(btnAtualizar);
        painel.add(btnApagar);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
