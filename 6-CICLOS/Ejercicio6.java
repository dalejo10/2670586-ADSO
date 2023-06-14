import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero positivo mayor a 2 y menor a 93: ");
        long numero = entrada.nextInt();

        long num1 = 0;
        long num2 = 1;
        long suma = 0;

        if(numero == 2){
            System.out.print("El n-esimo numero Fibonacci es: 1");
        }else if(numero >=3 && numero <=93){

            for(int i = 3; i <= numero; i=i+1){

            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
             
        }
         System.out.print("El n-esimo numero Fibonacci es: "+suma);

       

        }else{
            System.out.print("Numero incorrecto");
        }
    }
}







