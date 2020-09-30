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
public class Produto {
    
    private int codigo;
    private String descricao;
    private char setor = 'M';
    private double preco;
    private boolean disponivel;
    
    public void imprimirProduto(){
        System.out.println("Codigo:"+getCodigo());
        System.out.println("Descricao:"+getDescricao());
        System.out.println("Setor:"+getSetor());
        System.out.printf("Preco%2f\n, preco");
        System.out.println(isDisponivel()?" -- disponivel --  ":"  indisponival");
        
    }
    public void calcularDesconto(){
        //calcular desconto de 10% sobre o preço do produto = valor+.90
        // preco =(2.0 *.90);
        setPreco(getPreco() * .90);        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getSetor() {
        return setor;
    }

    public void setSetor(char setor) {
        this.setor = setor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
