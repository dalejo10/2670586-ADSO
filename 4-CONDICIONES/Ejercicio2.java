import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){

        Scanner parimpar = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero de 3 digitos: ");
        numero = parimpar.nextInt();

        if(numero >999){
            System.out.print("Numero no es de 3 digitos, ingrese un numero correcto");

        }else{
            if(numero <99){
                System.out.print("Numero no es de 3 digitos, ingrese un numero correcto");

            }else{
                if(numero % 2 == 0){
                    System.out.print("Numero es par");
                    
                }else{
                    System.out.print("Numero es impar");
                }
            }
            
        }

    }
}
