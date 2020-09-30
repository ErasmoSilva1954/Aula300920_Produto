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
public class Funcionario {
    // Atributos
    private boolean afastado;
    private int numRegistro;
    private double salario;
    private String nome;   
    private Nivel nivel;   // 0.Treining,  1.Junior,  2.Pleno,  3.Senhor;
    
    
 // Metodo
    public void apresentarFuncionario(){
        System.out.println(isAfastado()?"Afastado:Sim":"Afastado:Nao");
        System.out.println("Num.Registro.."+getnumRegistro());
        System.out.println("Salario......."+getSalario());
        System.out.println("Nome.........."+getnome());        
        System.out.println("Nivel........."+getnivel(nivel));   
             
    }
    
    
    public boolean isAfastado(){
        return afastado;
    }
    public void setAfastado(boolean afastado){
        this.afastado = afastado;
    }
    
    
    public int getnumRegistrto(){
        return numRegistro;
    }
    public void setnumRegistro(int numRegistro){
        this.numRegistro = numRegistro;
    }
    
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public String getnome(){
        return nome;        
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Nivel getnivel(Nivel nivel){
        return nivel;        
    }
    public void setnivel(Nivel nivel){
        this.nivel = nivel;
    }
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public Funcionario(){
        this.nome ="Nao definido";
        this.salario = 0.00;
    }
    public Funcionario(int numRegistro, String nome, double salario, Nivel nivel, boolean afastado){
    this.numRegistro = numRegistro;
    this.nome = nome;
    this.salario = salario;
    this.nivel = nivel;
    this.afastado = afastado;
 }

    private String getnumRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNivel(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


