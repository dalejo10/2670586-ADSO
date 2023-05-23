import java.util.Scanner;
public class Ejercicio06{
    public static void main(String[] args){
        Scanner promedio = new Scanner(System.in);

        int num1, num2, num3, num4, num5;
        int resultado;


        System.out.print("Ingrese el primer numero: ");
        num1 = promedio.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = promedio.nextInt();

        System.out.print("Ingrese el tercero numero: ");
        num3 = promedio.nextInt();

        System.out.print("Ingrese el cuarto numero: ");
        num4 = promedio.nextInt();

        System.out.print("Ingrese el quinto numero: ");
        num5 = promedio.nextInt();

        resultado = (num1 + num2 + num3 + num4 + num5) / 5;

        System.out.print("El promedio total es: "+resultado);


    }
}