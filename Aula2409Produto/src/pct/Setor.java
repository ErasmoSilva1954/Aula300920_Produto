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
public class Setor {
    MATINAIS('M', "mat", "matinais"),
    AÇOUGUE ('A',"aço","açougue"),
    BEBIDAS ('B',"beb","bebidas"),
    FRIOS   ('F',"fri","frios" ),
    PADARIA ('P',"pad","padaria");
    
    private char ref;
    private String codigo;
    private String descricao;
    
    public char getRef(){
      return ref;
    }
    public String getCodigo(){
      return codigo;    
    }
    public String getDescricao(){
      return descricao;  
    }
    
private Setor(char ref, String codigo, String descricao){
    this.ref = ref;
    this.codigo = codigo;
    this.descricao = descricao;
}

    String getRef() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
