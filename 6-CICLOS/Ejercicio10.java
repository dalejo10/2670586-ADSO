import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero no mayor a 11: ");
        int numero = entrada.nextInt();


        int diferente = 2;
        int contador = 0;

        
        if(numero <= 11){
            
            System.out.println("Los primos encontrados son: ");
            for(int l=1; contador < (numero*numero); l++){
            
                int auxiliar = 0;

                for(int i = 1; i <= diferente; i++){
                    if(diferente % i == 0){
                        auxiliar = auxiliar +1;
                    }  
                }

                if(auxiliar==2){ 
                    if(diferente <100 && diferente >9){
                      System.out.print("[0");
                    }else if(diferente<9){
                        System.out.print("[00");
                    }else{
                        System.out.print("[");
                    }
                
                    System.out.print(diferente+"]");
                    contador = contador + 1;
                    diferente = diferente + 1;
                
                    if(contador % numero == 0){
                        System.out.println();
                    }
                
                }else{
                    diferente = diferente + 1;
                }
            
            }   

        }else{
            System.out.println("Numero no valido");
        }
        
    }
}