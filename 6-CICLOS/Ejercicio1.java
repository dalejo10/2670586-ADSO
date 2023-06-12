import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

         System.out.print("Que cantidad de notas va a ingresar?: ");
         int cantidad = entrada.nextInt();

         float suma = 0;
         float promedio = 0;

        for(int i = 1; i<=cantidad; i=i+1 ){
            System.out.print("Ingrese el valor de la nota "+i+ ": ");
            float nota = entrada.nextFloat();

            suma = suma + nota;
            promedio = suma  / cantidad;

        }
        System.out.print("El promedio de nota obtenida es: "+promedio);
    }
}