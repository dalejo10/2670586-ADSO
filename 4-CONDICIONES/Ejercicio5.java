import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner nume_ascen = new Scanner(System.in);

        int num1, num2, num3 ;

        System.out.print("Ingrese primer numero entero: ");
        num1 =nume_ascen.nextInt();

        System.out.print("Ingrese segundo numero entero: ");
        num2 =nume_ascen.nextInt();

        System.out.print("Ingrese tercer numero entero: ");
        num3 =nume_ascen.nextInt();

        if(num1<num2 & num2<num3){
            System.out.print("Numeros ingresaron en Orden Ascendente");
        }else{
            System.out.print("Numeros no ingresaron en Orden Ascendente");
        }


    }
}