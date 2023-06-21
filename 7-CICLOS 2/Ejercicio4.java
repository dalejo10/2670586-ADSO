import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero no mayor a seis digitos: ");
        int numero = entrada.nextInt();



        int contador = 1;
        int invertido = 0;
        int numero1 = numero;

       if(numero >0 && numero <=999999){


        while( numero > 0 ) {
            int resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero = numero / 10;
       }

       if(numero1 == invertido){
            System.out.print("El numero ingresado es palindromo");
       }else{
            System.out.print("EL numero ingresado no es palindromo");
       }

       }else{
        System.out.print("Numero no es de 6 digitos");
       }
    }
}