import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);



        System.out.print("Ingrese un numero entero maximo de seis digitos: ");
        int numero = entrada.nextInt();


        int contador = 1;
        int invertido = 0;

       if(numero >0 && numero <=999999){

        while( numero > 0 ) {
            int resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero = numero / 10;
       }
       

         while(invertido > 0){
           System.out.println("Digito "+contador+ " es: "+invertido % 10);
            invertido = invertido / 10;
            contador = contador + 1;
             
        }


       }else{
        System.out.print("Numero no es de 6 digitos");
       }
       
       






       
        
     
        
    }
}



