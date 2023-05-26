import java.util.Scanner;
import java.text.DecimalFormat;
public class Ejercicio10{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("#.00");

        float nota1 = 0f;
        float nota2 = 0f;
        float nota3 = 0f;
        float nota4 = 0f;
        float nota5 = 0f;
        float promedio = 0f;
        float resultado_final = 0f;
        float Matematicas = 0f;
        float nota_necesaria = 0f;
        float nota_necesaria2 = 0f;
        float nota_necesaria3 = 0f;
        float nota_necesaria4 = 0f;
        float nota_necesaria5 = 0f;
        String mate = "Matematica";
        String espa = "Español";
        String ing = "Ingles";
        String cn = "Ciencias Naturales";
        String depo = "Deportes";


        System.out.print("Ingrese la nota de Matematicas: ");
        nota1 = entrada.nextFloat();

        System.out.print("Ingrese la nota de Español: ");
        nota2 = entrada.nextFloat();

        System.out.print("Ingrese la nota de Ingles: ");
        nota3 = entrada.nextFloat();

        System.out.print("Ingrese la nota de Ciencias Naturales: ");
        nota4 = entrada.nextFloat();

        System.out.print("Ingrese la nota de Deportes: ");
        nota5 = entrada.nextFloat();

        if(nota1>nota2 & nota1>nota3 & nota1>nota4 & nota1>nota5){
            System.out.println("Asignatura con mejor nota es: Matematicas ");
        }else{
            if(nota1<nota2 & nota1<nota3 & nota1<nota4 & nota1<nota5){
                System.out.println("Asignatura con menor nota es: Matematicas ");
            }
            
        }

        if(nota2>nota1 & nota2>nota3 & nota2>nota4 & nota2>nota5){
            System.out.println("Asignatura con mejor nota es: Español ");
        }else{
            if(nota2<nota1 & nota2<nota3 & nota2<nota4 & nota2<nota5){
                System.out.println("Asignatura con menor nota es: Español ");
            }
            
        }

        if(nota3>nota1 & nota3>nota2 & nota3>nota4 & nota2>nota5){
            System.out.println("Asignatura con mejor nota es: Ingles ");
        }else{
            if(nota3<nota1 & nota3<nota2 & nota3<nota4 & nota2<nota5){
                System.out.println("Asignatura con menor nota es: Ingles ");
            }
            
        }

        if(nota4>nota1 & nota4>nota2 & nota4>nota3 & nota4>nota5){
            System.out.println("Asignatura con mejor nota es: Ciencias Naturales ");
        }else{
            if(nota4<nota1 & nota4<nota2 & nota4<nota3 & nota4<nota5){
                System.out.println("Asignatura con menor nota es: Ciencias Naturales ");
            }
        }

        if(nota5>nota1 & nota5>nota2 & nota5>nota3 & nota5>nota4){
            System.out.println("Asignatura con mejor nota es: Deportes ");
        }else{
            if(nota5<nota1 & nota5<nota2 & nota5<nota3 & nota5<nota4){
                System.out.println("Asignatura con menor nota es: Deportes ");
            }
        }

        promedio = (nota1 + nota2 + nota3 + nota4 + nota5);

        resultado_final = promedio / 5; 


        System.out.println("Promedio de notas es: "+formato.format(resultado_final));

        if(resultado_final < 3 ){
            if(nota1<nota2 & nota1<nota3 & nota1<nota4 & nota1<nota5){
            
            nota_necesaria = (3 * 5) - promedio + nota1;
            System.out.println("Debio obtener una nota de "+formato.format(nota_necesaria)+ " en "+mate+" para aprobar el periodo.");
        }
        }
        if(resultado_final < 3 ){
            if(nota2<nota1 & nota2<nota3 & nota2<nota4 & nota2<nota5){
            
            nota_necesaria2 = (3 * 5) - promedio + nota2;
            System.out.println("Debio obtener una nota de "+formato.format(nota_necesaria2)+ " en "+espa+" para aprobar el periodo.");
        }
        }
        if(resultado_final < 3 ){
            if(nota3<nota1 & nota3<nota2 & nota3<nota4 & nota2<nota5){
            
            nota_necesaria3 = (3 * 5) - promedio + nota3;
            System.out.println("Debio obtener una nota de "+formato.format(nota_necesaria3)+ " en "+ing+" para aprobar el periodo.");
        }
        }
        if(resultado_final < 3 ){
            if(nota4<nota1 & nota4<nota2 & nota4<nota3 & nota4<nota5){
            
            nota_necesaria4 = (3 * 5) - promedio + nota4;
            System.out.println("Debio obtener una nota de "+formato.format(nota_necesaria4)+ " en "+cn+" para aprobar el periodo.");
        }
        }
        if(resultado_final < 3 ){
            if(nota5<nota1 & nota5<nota2 & nota5<nota3 & nota5<nota4){
            
            nota_necesaria5 = (3 * 5) - promedio + nota5;
            System.out.println("Debio obtener una nota de "+formato.format(nota_necesaria5)+ " en "+depo+" para aprobar el periodo.");
        }
        }
        







    }
}