package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.ClienteDAO;
import visao.VisaoCliente;

/**
 * @author prof-salu
 */
public class ControleCliente {

    private Cliente modelo;
    private VisaoCliente visao;

    public ControleCliente() {
        modelo = new Cliente();
        visao = new VisaoCliente();

        initControle();
    }

    private void initControle() {
        visao.init();

        visao.getBtnGravar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClienteDAO dao = new ClienteDAO();
                
                modelo.setId(Integer.parseInt(visao.getTxtId().getText()));
                modelo.setNome(visao.getTxtNome().getText());
                modelo.setEmail(visao.getTxtEmail().getText());
                modelo.setSexo(visao.getComboSexo().getSelectedItem().toString());
                
                if(dao.inserir(modelo)){
                    JOptionPane.showMessageDialog(visao, "Cliente gravado com sucesso!");
                    limparFormulario();
                }else{
                    JOptionPane.showMessageDialog(visao, "Ocorreu um erro.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }            
        });
        
        visao.getBtnLimpar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparFormulario();
            }
        });
        
        visao.getBtnConsultar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = JOptionPane.showInputDialog(visao, "Informe o email do cliente: ");
                
                if(email == null || email.equals("")){
                    return;
                }
                
                ClienteDAO dao = new ClienteDAO();
                
                modelo = dao.getClientePorEmail(email);
                
                if(modelo == null){
                    JOptionPane.showMessageDialog(visao, "Cliente não encontrado", "Email não encontrado", JOptionPane.QUESTION_MESSAGE);
                }else{
                    preencherFormulario();
                }
            }
        });
        
        visao.getBtnAtualizar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClienteDAO dao = new ClienteDAO();
                
                capturarFormulario();
                
                if(dao.atualizar(modelo)){
                    JOptionPane.showMessageDialog(visao, "Cliente atualizado com sucesso!");
                    limparFormulario();
                }else{
                    JOptionPane.showMessageDialog(visao, "Ocorreu um erro.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        visao.getBtnApagar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ClienteDAO dao = new ClienteDAO();
                
                capturarFormulario();
                
                if(dao.apagar(modelo)){
                    JOptionPane.showMessageDialog(visao, "CLiente apagado com sucesso!");
                    limparFormulario();
                }else{
                    JOptionPane.showMessageDialog(visao, "Ocorreu um erro!", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    
    private void limparFormulario(){
        visao.getTxtId().setText("");
        visao.getTxtNome().setText("");
        visao.getTxtEmail().setText("");
        visao.getComboSexo().setSelectedIndex(0);
    }
    
    private void preencherFormulario(){
        visao.getTxtId().setText(Integer.toString(modelo.getId()));
        visao.getTxtNome().setText(modelo.getNome());
        visao.getTxtEmail().setText(modelo.getEmail());
        
        if(modelo.getSexo().equals("Masculino")){
            visao.getComboSexo().setSelectedIndex(1);
        }else{
            visao.getComboSexo().setSelectedIndex(2);
        }
    }
    
    private void capturarFormulario(){
        modelo.setId(Integer.parseInt(visao.getTxtId().getText()));
        modelo.setNome(visao.getTxtNome().getText());
        modelo.setEmail(visao.getTxtEmail().getText());
        modelo.setSexo(visao.getComboSexo().getSelectedItem().toString());
    }
}
