import java.util.Scanner;
public class Ejercicio13{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int num = entrada.nextInt();

        if(num % 2 == 0 && num % 3 == 0 && num % 5 == 0){
            System.out.print("Numero es divisible por 2, 3 y 5");
        }else{
            System.out.print("Numero no es divisible o por 2 o por 3 o por 5");
        }
    }
}