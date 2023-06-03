import java.util.Scanner;
public class Ejercicio01{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese numero: ");
        float num = entrada.nextFloat();

        if(num>0){
            System.out.print("Numero es positivo");
        }else if (num==0 || num==-0){
            System.out.print("Numero es neutral");
        }else{
            System.out.print("Numero es negativo");
        }
            
        
        
    }
}