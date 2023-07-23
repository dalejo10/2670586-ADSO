import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = entrada.nextInt();

        int arreglo [] = new int [numero];
        int diferente = 0;
        int contador = 1;

        
        for(int l=1; contador<=numero; l++){

            diferente = (int)(Math.random()*1000);
            
            int auxiliar = 0;

            for(int i = 1; i <= diferente; i++){
                if(diferente % i == 0){
                    auxiliar = auxiliar +1;
                }  
            }

            if(auxiliar==2){ 
               arreglo[contador - 1] = diferente;
               contador = contador + 1;
            }
        } 
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Valor posiciòn "+ i + " es primo: "+arreglo[i]);
            
        }  

    }
}
