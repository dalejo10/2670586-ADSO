import java.util.Scanner;
public class Ejercicio19{
    public static void main(String[] args){
        Scanner regis_emple = new Scanner(System.in);

        String nombre;
        int edad;
        int salario;

        System.out.println("Ingrese su nombre: ");
        nombre = regis_emple.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = regis_emple.nextInt();

        System.out.println("Ingrese su salario: ");
        salario = regis_emple.nextInt();

        System.out.println("----------------------");

        System.out.println("Los datos ingresados fueron: ");

        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Salario: "+salario);
        

    }
}
