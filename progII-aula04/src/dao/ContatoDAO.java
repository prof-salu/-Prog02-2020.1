package dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import modelo.Contato;

/**
 * @author prof-salu
 */
public class ContatoDAO {
    //Organiza os IMPORTS --> CTRL + SHIFT + I
    private Connection con;
    
    public ContatoDAO() throws SQLException{
        con = new ConnectionFactory().getConnection();
    }
    
    //CRUD
        // CREATE
        // READ
        // UPDATE
        // DELETE
    
    public void adiciona(Contato contato){
        //SQL Injection
        
//        String sql = "insert into contatos (id, nome, email, endereco, dataNascimento) values ("    + contato.getId() + ", " 
//                                                                                                    + contato.getNome() + ", "
//                                                                                                    + contato.getEmail() + ", "
//                                                                                                    + contato.getEndereco() + ","
//                                                                                                    + contato.getDataNascimento() + ")";

    
        String sql = "insert into contatos (id, nome, email, endereco, dataNascimento) values (?,?,?,?,?)";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, contato.getId());
            stmt.setString(2, contato.getNome());
            stmt.setString(3, contato.getEmail());
            stmt.setString(4, contato.getEndereco());
            stmt.setObject(5, contato.getDataNascimento());
            
            stmt.execute();
            stmt.close();
            con.close();
            
            System.out.println("Contato gravado com sucesso");
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
    
    public void altera(Contato contato){
        String sql = "update contatos set nome = ?, email = ?, endereco = ?, dataNascimento = ? where id = ?";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, contato.getNome());
            stmt.setString(2, contato.getEmail());
            stmt.setString(3, contato.getEndereco());
            stmt.setObject(4, contato.getDataNascimento());
            stmt.setInt(5, contato.getId());
            
            stmt.execute();
            stmt.close();
            con.close();
            
            System.out.println("Contato atualizado");
        } catch (SQLException ex) {
            ex.getMessage();
        }
    }
    
    public void apaga(Contato contato){
        String sql = "delete from contatos where id = ?";
        
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, contato.getId());
            
            stmt.execute();
            stmt.close();
            con.close();
            System.out.println("Contato apagado");
        }catch (SQLException ex){
            ex.getMessage();
        }
    }
    
    public List<Contato> consulta(){
        List<Contato> contatos = new ArrayList<>();
        String sql = "select * from contatos";
        
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Contato contato = new Contato();
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setEndereco(rs.getString("endereco"));
                contato.setEmail(rs.getString("email"));
                contato.setDataNascimento(rs.getObject("dataNascimento", LocalDate.class));
                
                contatos.add(contato);
            }
            
            rs.close();
            stmt.close();
            con.close();
            
        } catch (SQLException ex) {
            ex.getMessage();
        }
        
        return contatos;
    }
}
