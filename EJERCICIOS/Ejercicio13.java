import java.util.Scanner;
public class Ejercicio13{
     public static void main(String[] args){
        Scanner tiempo = new Scanner(System.in);

        int num, hora, minuto, segundo;

        System.out.println("Digite los segundos: ");
        num = tiempo.nextInt();

       hora = num / 3600;
       minuto = (num % 3600) / 60;
       segundo = (num % 3600) % 60;

        System.out.println("Los segundos ingresados son: "+ hora + " hora, " + minuto + " minutos, " + segundo + " segundos");
     }
}