import java.util.Scanner;
public class Ejercicio09{
    public static void main(String[] args){

        Scanner parimpar = new Scanner(System.in);
        
        int num;

        System.out.println("Ingrese un numero entero: ");
        num = parimpar.nextInt();

        if (num % 2 == 0){
            System.out.println("Numero es par");  
        }

        else {
            System.out.println("Numero es impar");
        }
    }
}