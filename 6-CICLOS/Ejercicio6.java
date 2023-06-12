import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio6{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
         DecimalFormat formato = new DecimalFormat("#");

        System.out.print("Ingresar la posicion del n-esimo Fibonacci (del 2 al 79): ");
        int numero = entrada.nextInt();

        Double num1 = 0.0;
        Double num2 = 1.0;
        Double suma = 0.0;

        if(numero >=3 && numero <=79){


            for(int i = 3; i <= numero; i=i+1){

            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        
            
        }
            suma = suma % Math.pow(100, 10);
            System.out.print("El n-esimo numero Fibonacci es: "+formato.format(suma));

        }else{
            System.out.print("Numero incorrecto");
        }
        
        

        
    }
}
