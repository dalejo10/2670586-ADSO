import java.util.Scanner;
public class Ejercicio20{
    public static void main(String[] args){
        Scanner sum_digit = new Scanner(System.in);

        int num;
        int resultado = 0;

        System.out.println("Ingrese un numero entero de 5 digitos: ");
        num = sum_digit.nextInt();


        if (num < 100000){
            while(num > 0){

            resultado = resultado + (num % 10);
            num = num / 10;
        }

        System.out.println("La suma de los digitos es: "+resultado);
        
        }

        else{
            System.out.println("El numero tiene mas de 5 digitos, vuelva a intentarlo");
        }

       

        

    }
}