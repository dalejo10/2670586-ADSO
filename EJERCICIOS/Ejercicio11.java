import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[] args){
        Scanner periarea = new Scanner(System.in);

        double num1, perimetro, area;

        System.out.println("Digite el radio del circulo: ");
        num1 = periarea.nextDouble();

        perimetro = 2 * Math.PI * num1;
        area = Math.PI * Math.pow(num1, 2);

        System.out.println("---------------------------------");

        System.out.println("El perimetro del circulo es: "+perimetro);
        System.out.println("El area del circulo es: "+area);


    }
}