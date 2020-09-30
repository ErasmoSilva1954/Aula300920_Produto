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
    private String descricao;
    private double valorunit;
    private int qtdestoq;
    private Setor  setor;
    private boolean perecivel;
    
    
    public void imprimirProduto(){
        System.out.println("Descrição do Produto:" + getDescricao());
        System.out.println("Valor Unitario: "+ getValorunit());
        System.out.println("Quantidade em Estoque: " + getqtdestoq());
        System.out.println("Setor" + getSetor(). getRef());
        System.out.println(isPerecivel()?"Perecivel: Sim":"Perecivel: Não");
    }
    public String getDescricao(){
        return descricao;
    }    
    
    public void setDescricao(String descicao){
            this.descricao = descricao;
        
    }
    public double getValorunit(){
            return valorunit;    
    }
    public void setValorunit(double valorunit){
        this.valorunit = valorunit;
    }
    
public int getQtdestoq(){
    return qtdestoq;    
}
public void setQtdestoq(int qtdestoq){
    this.qtdestoq =qtdestoq;
}

public  Setor getSetor(){
    this.setor = setor;
        return null;
}


public boolean isPerecivel(){
    return perecivel;    
}
public void setPerecivel(boolean perecivel){
    this.descricao = descricao;
    this.valorunit = valorunit;
    this.qtdestoq  = qtdestoq;
    this.setor     = setor;
    this.perecivel = perecivel;
}

public Produto(){
    this.descricao = "Não Definido";
    this.valorunit = 0.00;
}
}
