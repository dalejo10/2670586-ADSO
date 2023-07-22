import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        int arreglo [] = new int [numero];

        int impares = 1;
        for(int i = 0; i<arreglo.length; i++){
            arreglo[i] = impares;
            impares = impares + 2;
            
        }

        for(int i = 0; i<arreglo.length; i++){
            System.out.println("Valor pos "+ i + " es: "+arreglo[i]);
        }
    }
}
