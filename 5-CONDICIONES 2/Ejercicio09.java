import java.util.Scanner;
public class Ejercicio09{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese horas trabajadas: ");
        double hora = entrada.nextDouble();

        System.out.print("Ingrese tarifa por hora: ");
        double tarifa = entrada.nextDouble();

        double salario_semanal = hora * tarifa;
        double precio_extra = 0.5 * tarifa;
        double hora_extra = hora - 40; 


        if(hora <= 40){
            System.out.print("Su salario semanal es de: "+salario_semanal);

        }else if( hora > 40){
            hora_extra = hora_extra * precio_extra;
            salario_semanal = salario_semanal + hora_extra;

            System.out.print("Su salario semanal con las horas extras es de: $"+salario_semanal);
        }
        
    }
}