package testes;

import modelo.Funcionario;
import modelo.FuncionarioDAO;

/**
 * @author prof-salu
 */
public class TesteAdicionaFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setMatricula(9999);
        f.setNome("Zenom");
        f.setEmail("zenom@email.com");
        f.setSenha("1234");
        FuncionarioDAO dao = new FuncionarioDAO();
        
        dao.adiciona(f);
    }
}