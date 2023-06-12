import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero positivo mayor a 2 y menor a 93: ");
        long numero = entrada.nextInt();

        long num1 = 0;
        long num2 = 1;
        long suma;

        if(numero >=2 && numero <=93){

            System.out.print("La sucesiòn Fibonacci es: "+num1+", "+num2);

            for(int i = 3; i <= numero; i=i+1){

            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        
            System.out.print(", "+suma);
            
        }

        }else{
            System.out.print("Numero incorrecto");
        }
    }
}