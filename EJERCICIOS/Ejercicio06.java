import java.util.Scanner;
public class Ejercicio06{
    public static void main(String[] args){
        Scanner promedio = new Scanner(System.in);

        float num1, num2, num3, num4, num5, resultado;

        System.out.println("Ingrese primer numero");
        num1 = promedio.nextFloat();

        System.out.println("Ingrese segundo numero");
        num2 = promedio.nextFloat();

        System.out.println("Ingrese tercer numero");
        num3 = promedio.nextFloat();

        System.out.println("Ingrese cuarto numero");
        num4 = promedio.nextFloat();

        System.out.println("Ingrese quinto numero");
        num5 = promedio.nextFloat();

        resultado = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.println("El promedio es de: "+resultado);
    }
}