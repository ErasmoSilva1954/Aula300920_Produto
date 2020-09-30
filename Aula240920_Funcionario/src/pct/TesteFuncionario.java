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
public class TesteFuncionario {
    
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario(54,"Joao",4004,85,Nivel.SENIOR,false);
        
        
        funcionario.setnumRegistro(22);
        funcionario.setNome("Antonio");
        funcionario.setSalario(5450.80);
        funcionario.setNivel('J');
        funcionario.setAfastado(false);
        
        System.out.println("\n\t\t -- Funcionario 1--- \n");
        funcionario.apresentarFuncionario();
        
        Funcionario outroFuncionario = new Funcionario("Jose",4100);
        
        System.out.println("\n\t\t --- Funcionario 2 ---\n");
        outroFuncionario.apresentarFuncionario();
    }
    
    
    
}
