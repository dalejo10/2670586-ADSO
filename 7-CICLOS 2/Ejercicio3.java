import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        int diferente = 0;
        int contador = 1;

        
        for(int l=1; contador<=numero; l++){

            diferente = (int)(Math.random()*1000);
            
            int auxiliar = 0;

            for(int i = 1; i <= diferente; i++){
                if(diferente % i == 0){
                    auxiliar = auxiliar +1;
                }  
            }

            if(auxiliar==2){ 
               
                System.out.println("Primo "+contador+" generado es: "+diferente);
                 contador = contador + 1;

            }
        }   
    }
}