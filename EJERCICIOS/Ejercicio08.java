import java.util.Scanner;
public class Ejercicio08{
    public static void main(String[] args){
        Scanner palabr = new Scanner(System.in);

        String tex1, tex2, textounido;

        System.out.println("Ingrese una primer palabra o texto: ");
        tex1 = palabr.nextLine();

        System.out.println("Ingrese una segunda palabra o texto: ");
        tex2 = palabr.nextLine();

        textounido = tex1 + " " + tex2;

        System.out.println("-------------------------------");
        System.out.println("Las dos palabras o textos unificados son: "+textounido);


    }
}