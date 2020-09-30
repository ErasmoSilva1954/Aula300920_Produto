/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Erasmo
 */
public class TesteProduto {
    public static void main(String[] args) {
        
        Produto produto = new Produto();
        
        
        produto.setCodigo(307);
        produto.setDescricao("Descricao biscooito Mabel");
        produto.setSetor('M');
        produto.setPreco(2.0);
        produto.setDisponivel(true);
        
        System.out.println("\n\t\t\t   produto  \n");
        produto.imprimirProduto();
        
        
        produto.calcularDesconto();
        
        
       System.out.println("\n\t\t\t   produto 10%% Desconto  \n");
        produto.imprimirProduto(); 

        System.out.printf("O Preco %.2f está com 10%%.\n, produto.preco");        
       
    }
    
}
