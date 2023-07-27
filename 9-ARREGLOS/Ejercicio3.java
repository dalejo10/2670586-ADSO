import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        int[] arreglo = new int[numero];

        for (int i = 0; i < numero; i++) {
            System.out.print("Ingrese el valor para la posición " + (i) + ": ");
            arreglo[i] = entrada.nextInt();
        }

        System.out.print("Ingrese la posición para imprimir el arreglo en sentido antihorario: ");
        int posicion = entrada.nextInt();

        System.out.print("Arreglo: [");
        for (int i = 0; i < numero; i++) {
            System.out.print(arreglo[i]);
            if (i < numero - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Anti horario: ");
        for (int i = 0; i < numero; i++) {
            int indice = (posicion - i - 1 + numero) % numero;
            System.out.print(arreglo[indice]);
            if (i < numero - 1) {
                System.out.print(" - ");
            }
        }

    }
}