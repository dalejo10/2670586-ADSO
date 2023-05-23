import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){

       Scanner edad = new Scanner(System.in);

        int numero; 
        
        System.out.print("Hola sujeto, por favor digite su edad: ");
        numero = edad.nextInt();

        if(numero >100){
            System.out.print("Edad no valida");
        }else{
            if(numero <18){
                System.out.print("Usted recibe un auxilio de $800.000");
            }else{
                System.out.print("Usted paga un impuesto de $200.000, bienvenido a Colombia");
            }
        }


    }

}