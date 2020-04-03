package interfaces;


import java.util.List;
import modelo.Produto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author saluo
 */
public interface IDAO {
    public void adiciona(Produto produto);
    public void altera(Produto produto);
    public void apaga(Produto produto);
    public Produto getProduto(int codigo);
    public List<Produto> getProdutos();
}

