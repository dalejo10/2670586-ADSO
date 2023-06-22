import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

       System.out.print("Ingrese un numero N: ");
        int altura = entrada.nextInt();

        int num_filas, asteriscos, blancos;
        for( num_filas = 1; num_filas<=((altura-1)/2)+1; num_filas++){
            
            for( blancos = 1; blancos <= altura-num_filas; blancos++){
                System.out.print(" ");
            }
 
            
            for( asteriscos=1; asteriscos<=(num_filas*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();

        }
         for( num_filas = (altura-1)/2 ; num_filas>= 1; num_filas--){
            
            for( blancos = 1; blancos <= altura-(num_filas); blancos++){
                System.out.print(" ");
            }
 
            
            for( asteriscos=1; asteriscos<=(2*num_filas)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}

