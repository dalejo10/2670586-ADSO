import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        NumberFormat tipo_moneda = NumberFormat.getCurrencyInstance();

        System.out.print("Ingrese un sueldo total: ");
        int numero = entrada.nextInt();

        System.out.print("Ingrese una cantidad de pagos: ");
        int numero_1 = entrada.nextInt();

        int resultado = 0;
        int resultado2 = 0;
        int resultado3 = 0;
        int resultado4 = 0;
        int resultado5 = 0;
        int resultado6 = 0;
        int i, l;

        System.out.println();
        if(numero>0){

            System.out.println("--------------FORMAS DE PAGO--------------");
            System.out.println();
            System.out.println("      1.Pagos de igual valor      ");
            System.out.println("      2.Primer pago diferente     ");
            System.out.println("      3.Ultimo pago diferente     ");
            System.out.println("      4.Primer y ultimo pago diferente");
            System.out.println();
            System.out.print("Ingrese forma de pago: ");
            int forma_pago = entrada.nextInt();
            System.out.println();
            System.out.println("-------------SUS PAGOS SERAN--------------");

            System.out.println();
            if(forma_pago==1){

               for(i= 1; i<=numero_1; i++){ 
                  resultado = numero / numero_1;
                  System.out.println("Mes "+i+": "+tipo_moneda.format(resultado));
                }
            }


            if(forma_pago==2){

                System.out.print("Ingrese el valor del primer pago: ");
                int primer_pago = entrada.nextInt();

                resultado2 = numero - primer_pago;
                System.out.println("Mes 1 primer pago: "+tipo_moneda.format(primer_pago));

                for(i = 2; i<=numero_1; i++){
                    resultado3 = resultado2 / (numero_1 - 1);
                    System.out.println("Mes "+i+": "+tipo_moneda.format(resultado3));
                }
            }


            if(forma_pago==3){

                System.out.print("Ingrese el valor del ultimo pago: ");
                int ultimo_pago = entrada.nextInt();

                resultado4 = numero - ultimo_pago;

                for(i = 1; i<=numero_1-1; i++){

                    resultado5 = resultado4 / (numero_1 - 1) ;
                    System.out.println("Mes "+i+": "+tipo_moneda.format(resultado5));
                }
                System.out.println("Mes "+i+" ultimo pago: "+tipo_moneda.format(ultimo_pago));
            }


            if(forma_pago==4){
                
                System.out.print("Ingrese el valor del primer pago: ");
                int primer_pago = entrada.nextInt();

                resultado2 = numero - primer_pago;
                

                System.out.print("Ingrese el valor del ultimo pago: ");
                int ultimo_pago = entrada.nextInt();

                resultado4 = resultado2 - ultimo_pago;
                

                System.out.println("Mes 1 primer pago: "+tipo_moneda.format(primer_pago));

                for(i = 2; i<=numero_1-1; i++){

                    resultado6 = resultado4 / (numero_1 - 2) ;
                    System.out.println("Mes "+i+": "+tipo_moneda.format(resultado6));
                }
                System.out.println("Mes "+i+" ultimo pago: "+tipo_moneda.format(ultimo_pago));

            }


        }


    }
}