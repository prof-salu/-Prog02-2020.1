package modelo;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author prof-salu
 * http://dontpad.com/progII-aula09
 */
public class ClienteDAO {
    private Connection con;
    
    public ClienteDAO(){
        con = new ConnectionFactory().getConnection();
    }
    
    public boolean inserir(Cliente cliente){
        String sql = "INSERT INTO cliente VALUES (?,?,?,?);";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, cliente.getId());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getEmail());
            stmt.setString(4, cliente.getSexo());
            
            stmt.execute();
            
            stmt.close();
            con.close();
            
            System.out.println("Cliente gravado com sucesso!");
            return true;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        }
        return false;
    }
    
    public boolean atualizar(Cliente cliente){
        String sql = "UPDATE cliente SET nome=?, email=?, sexo=? WHERE id=?";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getSexo());
            stmt.setInt(4, cliente.getId());
            
            stmt.execute();
            
            stmt.close();
            con.close();
            
            System.out.println("Cliente atualizado com sucesso!");
            return true;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        }
        return false;
    }
    
    public boolean apagar(Cliente cliente){
        String sql = "DELETE FROM cliente WHERE id=?";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, cliente.getId());
            
            stmt.execute();
            
            stmt.close();
            con.close();
            
            System.out.println("Cliente apagado com sucesso!");
            return true;
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        }
        return false;
    }
    
    public Cliente getClientePorEmail(String email){
        Cliente cliente = null;
        
        String sql = "SELECT * FROM cliente WHERE email=?;";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, email);
            
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setEmail(rs.getString("email"));
                cliente.setSexo(rs.getString("sexo"));
            }else{
                System.out.println("Nenhum registro encontrado.");
            }

            rs.close();
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex);
        }
        
        return cliente;
    }
}
