import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        NumberFormat tipo_moneda = NumberFormat.getCurrencyInstance();
        
        System.out.print("Ingrese valor total a financiar: ");
        double valor_total = entrada.nextDouble();
        
        if(valor_total > 0){

            System.out.print("Ingrese la tasa de interes: ");
            double tasa_interes = entrada.nextDouble();

            System.out.print("Ingrese cantidad la cantidad cuotas a pagar: ");
            int cantidad_cuotas = entrada.nextInt(); 
        
            double interes = tasa_interes / 100;
            double valor_cuota = (valor_total * interes) / (1 - (Math.pow(1 +interes, - cantidad_cuotas)));
            
            System.out.println();
            System.out.println("P|ValorCuota|ValorInteres|V.A.Capital|DeudaTotal");
            System.out.println();
            
            for(int i = 1 ; i<=cantidad_cuotas; i++){

                double interes_final = valor_total * (1  + interes) - valor_total;
                double amortizacion = valor_cuota - interes_final;
                double deuda_final = valor_total - amortizacion;
                valor_total = deuda_final;

                System.out.println(i+"|"+tipo_moneda.format(valor_cuota)+"|"+tipo_moneda.format(interes_final)+"|"+tipo_moneda.format(amortizacion)+"|"+tipo_moneda.format(deuda_final));
            }

        }else{
            System.out.print("Ingrese cantidad correcta");
        }  
    }
}
