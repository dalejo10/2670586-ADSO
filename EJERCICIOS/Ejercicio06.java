import java.util.Scanner;
public class Ejercicio06{
    public static void main(String[] args){
        Scanner promedio = new Scanner(System.in);

        int num = 0;
        int result = 0;
        float fin;
        
        for (int i=1; i<6; i++){
            System.out.println("Ingrese el valor "+i);
            num = promedio.nextInt();

           result = result + num;
        }
          fin = result / 5;

            System.out.println("El promedio es de: "+fin);
    }
}