import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner mayor_menor = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.print("Ingrese primer numero entero: ");
        num1 = mayor_menor.nextInt();

        System.out.print("Ingrese segundo numero entero diferente al primero: ");
        num2 = mayor_menor.nextInt();

        System.out.print("Ingrese tercer numero entero diferente a los dos primeros: ");
        num3 = mayor_menor.nextInt();

        System.out.println();

        if(num1==num2 & num2==num3){
            System.out.print("Numeros son iguales");
        }

        System.out.println();

        if(num1>num2 & num1>num3){
            System.out.println("El mayor es el numero: "+num1);
        }else{
            if(num1 < num2 & num1 < num3){
                System.out.println("El menor es el numero: "+num1);
            }
        }

        System.out.println();

        if(num2>num1 & num2>num3){
            System.out.println("El mayor es el numero: "+num2);
        }else{
            if(num2<num1 & num2<num3){
                System.out.println("El menor es el numero: "+num2);
            }
        }

        System.out.println();

        if(num3>num2 & num3>num1){
            System.out.println("El mayor es el numero: "+num3);
        }else{
            if(num3<num2 & num3<num1){
                System.out.println("El menor es el numero: "+num3);
           }    
        }



    }
}