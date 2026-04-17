package Analista;

public class Faixa1 {
    public String metodo1(int numero){
        if(numero <=5){
            return "O número está na faixa 1";
        }
        else{
            return metodo2(numero);
        }
   }
   public String metodo2(int numero){
        if(numero >5 && numero <=10){
            return "O número está na faixa 2";
        }
        else{
            return metodo3(numero);
        }
   }
    public String metodo3(int numero){
          if(numero >10 && numero <=15){
                return "O número está na faixa 3";
          }
          else{
                return metodo4(numero);
          }
    }
    public String metodo4(int numero){
        if(numero >15 && numero <=20){
            return "O número está na faixa 4";
        }
        else{
            return "O número não está entre 1 e 20";
        }
    }
}
