import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese dia de nacimiento: ");
        int dia = entrada.nextInt();

        System.out.print("Ingrese mes de nacimiento: ");
        int mes = entrada.nextInt();

        System.out.print("Ingrese año de nacimiento: ");
        int año = entrada.nextInt();

        System.out.print("Ingrese dia actual: ");
        int dia_a = entrada.nextInt();

        System.out.print("Ingrese mes actual ");
        int mes_a = entrada.nextInt();

        System.out.print("Ingrese año actual ");
        int año_a = entrada.nextInt();

        int edad_año = año_a - año ;

        if(mes > mes_a){
           edad_año = edad_año - 1;
        }else if (mes == mes_a){
            if (dia > dia_a){
                edad_año = edad_año - 1;
            }
        }
        if(edad_año >= 18){
            System.out.print("Usted es mayor de edad");
        }else{
            System.out.print("Usted es menor de edad");
        }
        




    }
}