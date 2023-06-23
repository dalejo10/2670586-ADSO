import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        int contador = 1;
        int l;
        
        for(int i =1; i<=numero;i++){
            for(l= 1; l<=numero; l++){


                if(i==2 && contador == 0){
                    System.out.print(numero);
                }else{
                    System.out.print(contador);
                }
                
                contador = contador+1;
                
                if(contador>numero){
                    contador = 1;
                }
               
            }
        
            contador = contador - 1;
            System.out.println();
        }
    }
}
