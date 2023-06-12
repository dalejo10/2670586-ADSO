import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

       
       int opcion = 0;

       

        do{

        System.out.println();

        System.out.println("|--------Bienvenido--------|");
        System.out.println("|                          |");
        System.out.println("|  1. Docente              |");
        System.out.println("|  2. Estudiante           |");
        System.out.println("|  3. Salir                |");
        System.out.println("|--------------------------|");

        System.out.print("Solo se ejecutaran las opciones del menu, ingrese una opcion: ");
        opcion = entrada.nextInt();

        System.out.println();

          
        if(opcion == 1){

         System.out.print("Que cantidad de notas va a ingresar?: ");
         int cantidad = entrada.nextInt();

         float suma = 0;
         float promedio = 0;

         System.out.println();

         for(int i = 1; i<=cantidad; i=i+1 ){
         System.out.print("Ingrese el valor de la nota "+i+ ": ");
         float nota = entrada.nextFloat();

         suma = suma + nota;
         promedio = suma  / cantidad;

        }
         System.out.print("El promedio de nota obtenida es: "+promedio);


        }else if(opcion == 2){

         System.out.print("Que cantidad de materias va a ingresar?: ");
         int cantidad = entrada.nextInt();
        
        System.out.println();
        
         float suma_credito = 0;
         float promedio = 0;
         float suma_promedio = 0;
         float resultado = 0;

         for(int i = 1; i<=cantidad; i=i+1){
            System.out.print("Ingrese el valor de la nota "+i+ ": ");
            float nota = entrada.nextFloat();

            System.out.print("Ingrese el valor del credito "+i+ ": ");
            float credito = entrada.nextFloat();

            System.out.println();
            suma_credito = suma_credito + credito;
            promedio = nota * credito;
            suma_promedio = suma_promedio + promedio;
            
         }
         resultado = suma_promedio / suma_credito  ;
         System.out.println("El total de creditos es: "+suma_credito);
         System.out.println("EL promedio de semestre es: "+resultado);
         
        }
        System.out.println();
        
        }while(opcion >=0 && opcion <=2 || opcion >=4);

        if(opcion==3){
            System.out.println("Adios");
        }
        

        
    }
    
        
}