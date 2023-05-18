import java.util.Scanner;
public class Ejercicio17{
    public static void main(String[] args){
        Scanner cambio_moneda = new Scanner(System.in);

        double usd = 0.00022;
        double eur = 0.0002;
        double jpy = 0.0302;
        double gbp = 0.00018;
        int cop;
        double t1, t2, t3, t4;


        System.out.println("Ingrese una cantidad en COP: ");
        cop = cambio_moneda.nextInt();

        t1 = cop * usd;
        t2 = cop * eur;
        t3 = cop * jpy;
        t4 = cop * gbp;

        System.out.println("El COP: "+cop+" ingresado queda en:  "+t1+" USD, "+t2+" EUR, "+t3+" JPY, "+t4+" GPB");

    }
}