package modelo;

import conexao.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author prof-salu
 */
public class FuncionarioDAO {

    private Connection con;

    public FuncionarioDAO() {
        con = new ConnectionFactory().getConnection();
    }

    public void adiciona(Funcionario funcionario) {
        String sql = "INSERT INTO funcionarios (matricula, nome, email, senha) VALUES (?,?,?,?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setInt(1, funcionario.getMatricula());
            stmt.setString(2, funcionario.getNome());
            stmt.setString(3, funcionario.getEmail());
            stmt.setString(4, funcionario.getSenha());

            stmt.execute();

            stmt.close();
            con.close();

            System.out.println("Funcionario gravado com sucesso!");
        } catch (SQLException e) {
            System.out.println("ERROR:" + e.getMessage());
        }
    }

    public List<Funcionario> getFuncionarios() {
        List<Funcionario> lista = new ArrayList<>();
        String sql = "SELECT * FROM funcionarios";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario f = new Funcionario();
                f.setMatricula(rs.getInt("matricula"));
                f.setNome(rs.getString("nome"));
                f.setEmail(rs.getString("email"));
                f.setSenha(rs.getString("senha"));

                lista.add(f);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        return lista;
    }
}
