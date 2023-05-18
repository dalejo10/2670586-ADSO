import java.util.Scanner;
public class Ejercicio18{
    public static void main(String[] args){
        Scanner imc = new Scanner(System.in);

        double peso, imc_final, altura;


        System.out.println("Ingrese su peso actual: ");
        peso = imc.nextDouble();

        System.out.println("Ingrese su estatura en metros: ");
        altura = imc.nextDouble();

        imc_final = peso / Math.pow(altura,2);

        System.out.println("Su IMC es: "+imc_final);
    }
}