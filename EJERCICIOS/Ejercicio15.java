import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[] args){
        Scanner longitud = new Scanner(System.in);

        float centimetro = 100f;
        float pulgada = 39.37f;
        float pie = 3.281f;
        float metro = 0;

        

        System.out.println("Ingrese la medida en metros: ");
        metro = longitud.nextFloat();

        centimetro = centimetro * metro;
        pulgada = pulgada * metro;
        pie = pie * metro;

        System.out.println("La longitud "+metro+" metros, equivalen a: "+centimetro+" cm, "+pulgada+" pulgadas, "+pie+" pies");
        


    }

}