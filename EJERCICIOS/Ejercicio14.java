import java.util.Scanner;
public class Ejercicio14{
    public static void main(String[] args){
        Scanner ponderado = new Scanner(System.in);

        float nota1, nota2, nota3, total, pondera;
        int credito1, credito2, credito3;


            System.out.println("Ingrese el valor de la primer nota: ");
            nota1 = ponderado.nextFloat();

            System.out.println("Ingrese el valor de la segunda nota: ");
            nota2 = ponderado.nextFloat();

            System.out.println("Ingrese el valor de la tercera nota: ");
            nota3 = ponderado.nextFloat();

            System.out.println("----------------------------------------");

            System.out.println("Ingrese el valor del credito 1 ");
            credito1 = ponderado.nextInt();

            System.out.println("Ingrese el valor del credito 2 ");
            credito2 = ponderado.nextInt();

            System.out.println("Ingrese el valor del credito 3 ");
            credito3 = ponderado.nextInt();

            total = (nota1*credito1) + (nota2*credito2) + (nota3*credito3);
            pondera = total / (credito1 + credito2 + credito3) ;

            System.out.println("El ponderado final es: "+pondera);





            



        

        

    }
}