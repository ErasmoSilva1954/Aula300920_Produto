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
public class Nivel {
    //Listar niveis profissional
    TREINEE(1,'T',"Tre","Treinee"), 
    JUNIOR (2,'J',"Jr","Junior"),     
    PLENA  (3,'P',"Ple","Pleno"),
    SENIOR (4,'S',"Sen","Senior"),
    
    //Listar Atributos
    private int numnivel;
    private char ref;
    private String cod;
    private String descricao;
    
    //Getters
    public int getnumNivel(){
        return numnivel;
    }
    public char getRef(){
        return ref;
    }
    public String getCod(){
        return cod;
    }
    public String getDescicao(){
        return descricao;
    }
    //Cponstruir
    private Nivel(int numnivel, char ref, String cod, String descricao){
        this.numnivel = numnivel;
        this.ref = ref;
        this.cod = cod;
        this.descricao = descricao;
    }
    
}
