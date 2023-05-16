import java.util.Scanner;
public class Ejercicio07{
    public static void main(String[] args){
        Scanner descuento = new Scanner(System.in);

        int num1;
        float totalpagar, porcentaje, desc;
        

        System.out.println("Ingrese precio del producto: ");
        num1 = descuento.nextInt();

        System.out.println("Ingrese porcentaje del descuento ");
        desc = descuento.nextFloat();

        porcentaje = (desc / 100);
        porcentaje = (num1 * porcentaje);
        totalpagar = (num1 - porcentaje);


        System.out.println("El precio final con el descuento es: "+totalpagar);


    }
}