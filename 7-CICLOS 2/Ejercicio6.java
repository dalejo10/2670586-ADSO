import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero N: ");
        int numero = entrada.nextInt();

        System.out.print("Ingrese un numero entero M: ");
        int numero2 = entrada.nextInt();

        int resultado = 1;
        int resultado2 = 1;
        int resultado3 = 1;
        int i, l;
        int contador = 0;
        
        System.out.println();
        System.out.println("Factorial de "+numero+" ("+numero+"!):");

        for(i = 1; i <= numero - 1; i++){
            System.out.print(i+" x ");
            resultado = resultado * i; 
        }
        resultado = resultado * i;
        System.out.print(i+" = "+resultado);
        
        System.out.println();
        System.out.println();

        
        for(l=numero+1; l <= numero2-1; l++){
            contador = contador + 1;
            System.out.println("Factorial de "+(numero+contador)+" ("+(numero+contador)+"!):");

            resultado3 = 1;
            for(i = 1; i <= (numero+contador)-1 ; i++){
                System.out.print(i+" x ");
                resultado3 = resultado3  * i;  
            }
            resultado3 = resultado3 * i;
            System.out.println(i+" = "+resultado3);
            System.out.println();
        }
        

        System.out.println("Factorial de "+numero2+" ("+numero2+"!):");

        for(i = 1; i <= numero2 - 1; i++){
            System.out.print(i+" x ");
            resultado2 = resultado2 * i; 
        }
        resultado2 = resultado2 * i;
        System.out.print(i+" = "+resultado2);
    }
}