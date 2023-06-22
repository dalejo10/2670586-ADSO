import java.util.Scanner;
public class Ejercicio9{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero N: ");
        int numero = entrada.nextInt();

        int auxiliar = numero;
        int invertido = 0;
        int invertido1 = 0;
        int invertido2 = 0;
        int invertido3 = 0;
        int invertido4 = 0;
        int invertido5 = 0;
        int invertido6 = 0;
        
        System.out.println();
        System.out.println("Raiz digital:");
        while( numero > 0 ) {
            int resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero = numero / 10;
            
        }

        while(invertido > 0){
            
            invertido1 = invertido % 10;
            System.out.print(invertido1+"+");
            invertido = invertido / 10;
            invertido2 = invertido2 + invertido1;
        }
       
        System.out.println("="+invertido2);



        while( invertido2 > 0 ) {
            int resto1 = invertido2 % 10;
            invertido3 = invertido3 * 10 + resto1;
            invertido2 = invertido2 / 10;
            
        }


        while(invertido3 > 0){
            
            invertido4 = invertido3 % 10;
            System.out.print(invertido4+"+");
            invertido3 = invertido3 / 10;
            invertido5 = invertido5 + invertido4;
        }
        System.out.println("="+invertido5);
        System.out.println("La Raiz digital de "+auxiliar+" es: "+invertido5);
    }
}