package dao;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Produto;

/**
 * @author prof-salu
 */
//DAO --> Data Acess Object
public class ProdutoDAO {
    private Connection con;
    
    public ProdutoDAO(){
        con = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Produto produto){
        String sql = "INSERT INTO produto values (?,?,?,?);";
        
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, produto.getId());
            stmt.setString(2, produto.getDescricao());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setDouble(4, produto.getPreco());
            
            stmt.execute();
            
            stmt.close();
            con.close();
            
            System.out.println("Produto gravado com sucesso!");
            
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void altera(Produto produto){
        String sql = "UPDATE produto SET descricao=?, quantidade=?,preco=? WHERE id=?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, produto.getDescricao());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setDouble(3, produto.getPreco());
            stmt.setInt(4, produto.getId());
            
            stmt.execute();
            
            stmt.close();
            con.close();
            
            System.out.println("Produto atualizado com sucesso!");
            
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void apaga(Produto produto){
        String sql = "DELETE FROM produto WHERE id=?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, produto.getId());
            
            stmt.execute();
            
            stmt.close();
            con.close();
            
            System.out.println("Produto apagado com sucesso!");
            
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public List<Produto> getProdutos(){
        List<Produto> produtos = new ArrayList();
        String sql = "SELECT * FROM produto";
        
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setDescricao(rs.getString("descricao"));
                p.setQuantidade(rs.getInt("quantidade"));
                p.setPreco(rs.getDouble("preco"));
                
                produtos.add(p);                
            }
            
            rs.close();
            stmt.close();
            con.close();           
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return produtos;
    }
}