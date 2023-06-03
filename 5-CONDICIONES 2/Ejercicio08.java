import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio08{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.00");

        System.out.print("Ingrese la base del triangulo: ");
        float base = entrada.nextFloat();

        System.out.print("Ingrese la altura del triangulo: ");
        float altura = entrada.nextFloat();

        float area = (base * altura) / 2;

        if(base >0 && altura >0){
            System.out.print("El area del triangulo es: "+formato.format(area));
        }else{
            System.out.print("Ambos o uno de los valores ingresados es o son negativos");
        }

        
    }
}