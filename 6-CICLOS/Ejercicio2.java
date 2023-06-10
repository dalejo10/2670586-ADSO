import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Que cantidad de materias va a ingresar?: ");
         int cantidad = entrada.nextInt();

         float suma_credito = 0;
         float promedio = 0;
         float suma_promedio = 0;
         float resultado = 0;

         for(int i = 1; i<=cantidad; i=i+1){
            System.out.print("Ingrese el valor de la nota "+i+ ": ");
            float nota = entrada.nextFloat();

            System.out.print("Ingrese el valor del credito "+i+ ": ");
            float credito = entrada.nextFloat();

            suma_credito = suma_credito + credito;
            promedio = nota * credito;
            suma_promedio = suma_promedio + promedio;
            
         }
         resultado = suma_promedio / suma_credito  ;
         System.out.println(suma_credito);
         System.out.println(resultado);
    }
}