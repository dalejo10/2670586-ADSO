import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[] args){
        Scanner rectangulo = new Scanner(System.in);

        float num1, num2, area;

        System.out.println("Ingrese el valor de la altura del rectangulo en metros: ");
        num1 = rectangulo.nextFloat();

        System.out.println("Ingrese el valor de la base del rectangulo en metros: ");
        num2 = rectangulo.nextFloat();

        area = num1 * num2;

        System.out.println("---------------------------------");

        System.out.println("El area del rectangulo es : " + area + " m2 ");
    }

}