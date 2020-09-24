
package pct;


public class TesteData {
    public static void main(String[] args) {
      //Estanciar objeto da class data
      Data data = new Data();
      Data mes  = new Data();
      Data ano  = new Data();
      
      //Construção de uma 
      //data.dia = 1; ficou absoleto
      data.setDia(1);
      //data.mes = 1;
      data.setMes(1);
      data.setAno(2020);
      
      //Imprimir data
        System.out.println("Data:"+data.imprimirData());
        //Imprimindo o dia
        System.out.println("Dia:"+data.getDia());
        //Imprimindi mes
        System.out.println("Mes:"+ data.getMes());
        //Imprimir ano
        System.out.println("Ano:"+ data.getAno());
    }
}
