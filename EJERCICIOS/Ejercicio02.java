import java.util.Scanner;
public class Ejercicio02{
    public static void main(String[] args){
        Scanner temperatura = new Scanner(System.in);

        int c;
        int resultado;

        System.out.println("Ingrese grados Celsius");
        c = temperatura.nextInt();

        resultado = (c * 9/5) + 32;
        System.out.println("Los grados Farhrenheit son: "+resultado);
    }
}