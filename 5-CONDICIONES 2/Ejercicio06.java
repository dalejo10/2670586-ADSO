import java.util.Scanner;
public class Ejercicio06{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();

        if(edad >=18 ){
            System.out.print("Usted puede ejercer su derecho al voto");
        }else{
            System.out.print("Usted no puede ejercer aun el voto");
        }
    }
}