import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero para la altura de piramide: ");
        int altura = entrada.nextInt();

        
         for(int num_filas = 1; num_filas<=altura; num_filas++){
            
            for(int blancos = 1; blancos <= altura-num_filas; blancos++){
                System.out.print(" ");
            }
 
            
            for(int asteriscos=1; asteriscos<=(num_filas*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}