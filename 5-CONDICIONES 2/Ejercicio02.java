import java.util.Scanner;
public class Ejercicio02{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un primer numero: ");
        float num1 = entrada.nextFloat();

        System.out.print("Ingrese un primer numero: ");
        float num2 = entrada.nextFloat(); 

        System.out.print("Ingrese un primer numero: ");
        float num3 = entrada.nextFloat();

        System.out.print("Ingrese un primer numero: ");
        float num4 = entrada.nextFloat();

        float maximo = num1;

        if(num2 > maximo){
            maximo = num2;
        }

        if(num3 > maximo){
            maximo = num3;
        }

        if(num4 > maximo){
            maximo = num4;
        }

        System.out.print("El numero maximo es: "+maximo);
    }
}