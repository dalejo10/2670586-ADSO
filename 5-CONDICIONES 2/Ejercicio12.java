import java.util.Scanner;
public class Ejercicio12{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

       
        System.out.print("Ingrese precio del producto: ");
        float num1 = entrada.nextFloat();

        System.out.print("Ingrese porcentaje del descuento ");
        float desc = entrada.nextFloat();

        
        float porcentaje = (desc / 100);
              porcentaje = (num1 * porcentaje);
        float totalpagar = (num1 - porcentaje);

        if(desc <= 100 && desc >= 0){
            System.out.println("El precio final con el descuento es: "+totalpagar);
            System.out.println("Se descontaron "+porcentaje);
        }else{
            System.out.println("El descuento no es valido");
        }


        


    }
}