import java.util.Scanner;
public class Ejercicio03{
    public static void main(String[] args){
        Scanner intercambio = new Scanner(System.in);

        int num1;
        int num2;
        int aux;

        System.out.println("Ingrese valor A: ");
        num1 = intercambio.nextInt();

        System.out.println("Ingrese valor B: ");
        num2 = intercambio.nextInt();

        aux = num1;
        num1 = num2;
        num2 = aux;

        System.out.println("El valor de A en el intercambio es: "+num1);
        System.out.println("El valor de B en el intercambio es: "+num2);
    }
}