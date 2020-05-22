package visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import modelo.Funcionario;
import modelo.FuncionarioDAO;

/**
 * @author prof-salu
 */
public class Formulario extends JFrame {

    private JLabel lblMatricula = new JLabel("Matricula: ");
    private JLabel lblNome = new JLabel("Nome: ");
    private JLabel lblEmail = new JLabel("E-mail: ");
    private JLabel lblSenha = new JLabel("Senha: ");
    private JTextField txtMatricula = new JTextField(25);
    private JTextField txtNome = new JTextField(25);
    private JTextField txtEmail = new JTextField(25);
    private JTextField txtSenha = new JTextField(25);
    private JButton btnLimpar = new JButton("LIMPAR");
    private JButton btnGravar = new JButton("GRAVAR");
    private JPanel painel = new JPanel(new FlowLayout(SwingConstants.LEADING));
    private Font lucida = new Font("Lucida Console", Font.BOLD, 14);

    public Formulario() {
        super("Cadastro funcionario");
    }

    public void init() {
        setBounds(50, 100, 310, 260);
        
        //Alterando o formulario
        painel.setBackground(Color.CYAN);
        lblEmail.setFont(lucida);
        lblMatricula.setFont(lucida);
        lblNome.setFont(lucida);
        lblSenha.setFont(lucida);

        //Associa um JPanel ao JFrame
        getContentPane().add(painel);

        //Associa os componentes ao JPanel
        painel.add(lblMatricula);
        painel.add(txtMatricula);
        painel.add(lblNome);
        painel.add(txtNome);
        painel.add(lblEmail);
        painel.add(txtEmail);
        painel.add(lblSenha);
        painel.add(txtSenha);

        painel.add(btnLimpar);
        painel.add(btnGravar);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtMatricula.setText("");
                txtEmail.setText("");
                txtSenha.setText("");
                txtNome.setText("");
            }
        });
        
        btnGravar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Funcionario f = new Funcionario();
                f.setMatricula(Integer.parseInt(txtMatricula.getText()));
                f.setNome(txtNome.getText());
                f.setEmail(txtEmail.getText());
                f.setSenha(txtSenha.getText());
                
                System.out.println(f);
                
                FuncionarioDAO dao = new FuncionarioDAO();
                dao.adiciona(f);
            }
        });
    }
}