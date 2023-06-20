import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero entre 1 y 6: ");
        int numero = entrada.nextInt();

        int resultado=0;
        
        if(numero>0 && numero<7){
            for(int i = 1; i<= numero; i++){
            int aleatorio = (int)(Math.random() * 10);
            resultado =  (resultado * 10)+aleatorio;  
            
        }
        int multiplicacion = resultado *2;
        System.out.println("El numero construido es: "+resultado);
        System.out.print("El resultado del producto es: "+multiplicacion);

        }else{
            System.out.print("El numero es incorrecto");
        }

        
        
    }
}