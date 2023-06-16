import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese un numero: ");
        int num2 = entrada.nextInt();

        System.out.print("Ingrese un numero: ");
        int num3 = entrada.nextInt();

        int mcm = 1;
        int divisor = 2;

        while (num1 > 1 || num2 > 1 || num3 > 1) {
            if (num1 % divisor == 0 || num2 % divisor == 0 || num3 % divisor == 0) {
                mcm = mcm * divisor;

                if (num1 % divisor == 0) {
                    num1 = num1 / divisor;
                }

                if (num2 % divisor == 0) {
                    num2 = num2 / divisor;
                }

                if (num3 % divisor == 0) {
                    num3 = num3 / divisor;
                }
            }else{
                divisor = divisor + 1;
            }  
        }
        System.out.println("El minimo comun multiplo es: "+mcm);
       
    }     
}

