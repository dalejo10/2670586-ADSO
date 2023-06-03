import java.util.Scanner;
public class Ejercicio04{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese primera nota: ");
        float num1 = entrada.nextFloat();

        System.out.print("Ingrese segunda nota: ");
        float num2 = entrada.nextFloat();

        System.out.print("Ingrese tercera nota: ");
        float num3 = entrada.nextFloat();

        float promedio = (num1 + num2 + num3) / 3;


        if(promedio >= 7){
            System.out.print("Usted aprobo");
        }else{
            System.out.print("Usted reprobo");
        }
        

    }
}