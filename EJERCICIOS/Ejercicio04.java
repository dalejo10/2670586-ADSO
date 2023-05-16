import java.util.Scanner;
public class Ejercicio04{
    public static void main(String[] args){
        Scanner intersolo = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Ingrese valor A: ");
        num1 = intersolo.nextInt();

        System.out.println("Ingrese valor B: ");
        num2 = intersolo.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("El valor de A en el intercambio es: "+num1);
        System.out.println("El valor de B en el intercambio es: "+num2); 
    }
}