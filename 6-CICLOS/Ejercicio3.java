import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero para la altura de piramide: ");
        int altura = entrada.nextInt();

        
        for(int i = 1; i<=altura; i=i+1){
            
            for(int blancos = altura - i; blancos > 0; blancos=blancos-1){
                System.out.print(" ");
            }
 
            
            for(int asteriscos=1; asteriscos<=(i*2)-1; asteriscos=asteriscos+1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}