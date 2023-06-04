import java.util.Scanner;
public class Ejercicio07{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero solo de cinco digitos: ");
        int num = entrada.nextInt();

        int n1 = num % 10;
        int n2 = (num % 100) / 10;  
        int n3 = (num % 1000) / 100;  
        int n4 = (num % 10000) / 1000;
        int n5 = num / 10000;


       if(num < 99999 && num > 10000){
         if(n1 == n5 && n2 == n4){
            System.out.print("Numero es palindromo");
        }else{
            System.out.print("Numero no es palindromo");
        }
       }else{
            System.out.print("Numero no es de cinco digitos");
       }




       



    }
}