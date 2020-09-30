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
public class TesteProdutoA {
    
    private String descricao;
    private double valorunit;
    private int qtdestoq;
    private Setor setor;
    private boolean perecivel;
    
    
    public void imprimirTesteProdutoA(){
      System.out.println("Descricao do Produto:"+getDescricao());
      System.out.println("Valor da Unidade:" + getValorunit());
      System.out.println("Quantidade em estoque: "+getQtdestoq());
      System.out.println("Setor:"+ getSetor().getRef());
      System.out.println(isPerecivel()?"Perecivel: Sim":"Perecivel: Não");
    }
    public String getDescricao(){
      return descricao;  
    }
    public void setDescricao(){
      this.descricao=descricao;
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
        this.qtdestoq = qtdestoq;
    }
    
    public Setor getSetor(){
        return setor;        
    }
    public void setSetor(Setor setor){
        this.setor = setor;
    }
    
    public boolean isPerecivel(){
        return perecivel;        
    }
    public void setPerecivel(boolean perecivel){
        this.perecivel = perecivel;
    }
    
    public TesteProdutoA(String descricao, double valorunit, int qtdestoq, Setor setor, boolean perecivel){
        this.descricao = descricao;
        this.valorunit = valorunit;
        this.qtdestoq = qtdestoq;
        this.setor = setor;
        this.perecivel =perecivel;
    }
    public TesteProdutoA(){
        this.descricao = "Não Definido";
        this.valorunit = 0.00;
    }
    
}
