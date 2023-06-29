import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad total financiada: ");
        float cantidad_financiada = entrada.nextFloat();

        System.out.print("Ingrese la cantidad de cuotas pagadas: ");
        float cuota_pagada = entrada.nextFloat();

        System.out.print("Ingrese el valor de cada cuota: ");
        float valor_cuota = entrada.nextFloat();

        float interes_pagado = (cuota_pagada * valor_cuota) - cantidad_financiada;
        float total_interes_pagado = (interes_pagado / cantidad_financiada) * 100;

        System.out.print("El interes total pagado es: "+total_interes_pagado+"%");
    }
}