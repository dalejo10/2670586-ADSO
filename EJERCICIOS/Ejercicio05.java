import java.util.Scanner;
public class Ejercicio05{
    public static void main(String[] args){
        Scanner area = new Scanner(System.in);

        float num1;
        float num2;
        float resultado;

        System.out.println("Ingrese el numero de la base del triangulo: ");
        num1 = area.nextFloat();

        System.out.println("Ingrese el numero de la altura del triangulo ");
        num2 = area.nextFloat();

        resultado = (num1 * num2) / 2;

        System.out.println("El area el triangulo es: "+resultado);
    }
}