package dao;

import conexao.ConnectionFactory;
import interfaces.IDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Produto;

/**
 * @author prof-salu
 */
public class ProdutoDAO implements IDAO {

    private Connection con;

    public ProdutoDAO() {
        con = new ConnectionFactory().getConnection();
    }

    @Override
    public void adiciona(Produto produto) {
        //CONSULTA PARAMETRIZADA
        String sql = "INSERT INTO PRODUTOS VALUES (?,?,?,?)";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, produto.getCodigo());
            stmt.setString(2, produto.getDescricao());
            stmt.setInt(3, produto.getQuantidade());
            stmt.setDouble(4, produto.getPreco());

            stmt.execute();
            stmt.close();
            con.close();
            System.out.println("Produto gravado!");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void altera(Produto produto) {
        String sql = "UPDATE PRODUTOS SET DESCRICAO = ?, QUANTIDADE = ?, PRECO = ? WHERE CODIGO = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setDouble(3, produto.getPreco());
            stmt.setLong(4, produto.getCodigo());

            stmt.execute();
            stmt.close();
            con.close();
            System.out.println("Produto alterado!");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void apaga(Produto produto) {
        String sql = "DELETE FROM PRODUTOS WHERE CODIGO = ?";

        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, produto.getCodigo());
            stmt.execute();
            stmt.close();
            con.close();
            System.out.println("Produto apagado!");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public Produto getProduto(int codigo) {
        Produto produto = new Produto();
        String sql = "SELECT * FROM PRODUTOS WHERE CODIGO = ?";
        try{
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setLong(1, codigo);
            
            ResultSet rs = stmt.executeQuery();
            
            rs.next();
            
            produto.setCodigo(rs.getLong("codigo"));
            produto.setDescricao(rs.getString("descricao"));
            produto.setQuantidade(rs.getInt("quantidade"));
            produto.setPreco(rs.getDouble("preco"));
            
            rs.close();
            stmt.close();
            con.close();
            
        }catch(SQLException ex){
            System.out.println(ex);
        }
        
        return produto;
    }

    @Override
    public List<Produto> getProdutos() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM PRODUTOS";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next() == true){
                Produto produto = new Produto();
                produto.setCodigo(rs.getLong("codigo"));
                produto.setDescricao(rs.getString("descricao"));
                produto.setQuantidade(rs.getInt("quantidade"));
                produto.setPreco(rs.getDouble("preco"));
                
                produtos.add(produto);
            }
            
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return produtos;
    }
}