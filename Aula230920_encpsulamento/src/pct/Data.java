
package pct;


public class Data {
 //Atributo   
 private int dia;
 private int mes;
 private int ano;

 
 //Metodos
 public String imprimirData(){
     return dia + "/" + mes + "/" + ano;     
 }
 public void setDia(int dia){ 
     if(dia >= 1 && dia <= 31){    
     
   this.dia = dia;
     }else{
         this.dia = 1;
         
     }
    }
   
 public int getDia(){     
     return this.dia;
 
 }



public String imprimirMes(){
return mes + "/" + dia+ "/" + ano;
}
public void setMes(int setMes){
if (mes >= 1 && mes <=12){
this.mes = mes;
}else{
 this.mes =1;
  
 }
}

public int getMes(){
  return this.mes;    
}

public String imprimirAno(){
return ano + "/" +mes+ "/"+dia;
}
public void setAno(int setAno){
if(ano >= 1 && ano <= 2020){
this.ano = ano;
}else{
this.ano = 1;
}
}
public int getAno(){
  return this.ano;   
}
}

