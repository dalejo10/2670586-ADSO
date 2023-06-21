import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero N: ");
        int numero = entrada.nextInt();

        int resultado = 1;
        int i;
        
        System.out.println("Factorial: ");

        for(i = 1; i <= numero - 1; i++){
           System.out.print(i+" x ");
           resultado = resultado * i; 
        }
        System.out.print(i+" = "+resultado * i);
         
    }

}