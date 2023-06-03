import java.util.Scanner;
public class Ejercicio03{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int num = entrada.nextInt();

        if(num % 2 == 0){
            System.out.print("El numero ingresado es par");
        }else{
            System.out.print("El numero ingresado es impar");
        }
    }
}