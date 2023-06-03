import java.util.Scanner;
public class Ejercicio05{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un año: ");
        int num = entrada.nextInt();

       

        
        if ((num % 4 == 0 && num % 100 != 0) || num % 400 == 0) {
            System.out.println( num+" es un año bisiesto.");
        } else {
            System.out.println( num+" no es un año bisiesto.");
        }
       

    }
}