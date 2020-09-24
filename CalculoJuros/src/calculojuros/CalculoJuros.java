
package calculojuros;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class CalculoJuros {

   
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
        
       /* System.out.println("Qual o valor do capiptal?");
        double valor = teclado.nextDouble();
        
        System.out.println("Qual o valor dos Juros ao mes?");
        double juros = teclado.nextDouble();
        
        System.out.println("Quantos meses para sacar?");
        int meses = teclado.nextInt();
        
        double valorfinal = ((valor*meses)/100+valor);
        double valorparc = valorfinal / meses;  
        
        System.out.println("O, Seu capital no valor de R$"+valor+"deverá render meses " +meses+ " total de R$"+valorparc+  "de juros"); */
    
       Double valor = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o vaor do capítal"));
       Double juros = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual a taxa do juro ao mes?"));
       Integer meses = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a quantidade de mese para pagar?"));
       
          Double valorfinal = ((valor*meses)/100+valor);
          Double valorparc = valorfinal / meses; 
          
          JOptionPane.showMessageDialog(null,"O, Seu capital no valor de R$" +valor+ "deverá render em" +meses+ " mese de R$ "+valorparc+"de juros");
    
    }
}
