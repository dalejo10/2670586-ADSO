import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner division = new Scanner(System.in);

        int num1, num2, resul, resto;

        System.out.println("Digite un primer numero");
        num1 = division.nextInt();

        System.out.println("Digite un segundo numero");
        num2 = division.nextInt();

        resul = num1 / num2;
        resto = num1 % num2;

        System.out.println("-----------------------------------");

        System.out.println("El resultado de la division es: "+resul);
        System.out.println("El residuo de la division es: "+resto);


    }
}