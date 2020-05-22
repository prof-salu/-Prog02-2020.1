package testes;

import java.util.ArrayList;
import java.util.List;
import modelo.Funcionario;
import modelo.FuncionarioDAO;

/**
 * @author prof-salu
 */
public class TesteGetFuncionarios {
    public static void main(String[] args) {
        List<Funcionario> lista = new ArrayList<>();
        FuncionarioDAO dao = new FuncionarioDAO();
        
        lista = dao.getFuncionarios();
        
        for(Funcionario funcionario : lista){
            System.out.println(funcionario);
        }
    }
}
