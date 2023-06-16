import java.util.Scanner;
public class Ejercicio9{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

         System.out.print("Ingrese numero 1: ");
        int numero = entrada.nextInt();

        int contador = 0;

        for(int i = 1; i <= numero; i++){
             if(numero % i == 0){
                contador = contador +1;
             }
        }
        if(contador==2){
            System.out.print("Numero es primo ");
        }else{
            System.out.print("Numero no es primo ");
        }

        
    }
}
 