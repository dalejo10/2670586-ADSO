import java.util.Scanner;
public class Ejercicio16{
    public static void main(String[] args){
        Scanner intercompues = new Scanner(System.in);


        int peri, inv_inic;
        double interes, monto_final ;
        
        System.out.println("Ingrese el monto de la inversion inicial: ");
        inv_inic = intercompues.nextInt();

        System.out.println("Ingrese la tasa de interès");
        interes = intercompues.nextDouble();

        System.out.println("Ingrese el periodo");
        peri = intercompues.nextInt();


        interes = interes / 100;
        monto_final = inv_inic * Math.pow(1+interes,peri);
        

        System.out.println("El monto final es de: "+monto_final);



    }
}