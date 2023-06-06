import java.util.Scanner;
public class Ejercicio11{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        

        System.out.print("Ingrese un numero entero: ");
        String cadena = entrada.nextLine();

        int num = Integer.parseInt(cadena);
        

        if(num % 2 == 0){
            System.out.print("Numero es par");
        }else{
            System.out.print("Numero es impar");
        }
    }
}