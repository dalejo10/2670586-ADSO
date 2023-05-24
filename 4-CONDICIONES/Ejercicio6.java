import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int numero;
        int opcion;
        int numero_1;
        int numero_2;
        int numero_3;
        int numero_4;
        int numero_5;
        int numero_6;
        

        System.out.print("Ingrese numero de seis digitos: ");
        numero = entrada.nextInt();

        if(numero >= 100000 & numero <=999999){

            System.out.println("//---------------------------------------------------------//");
            System.out.println("     Menù:                                                   ");
            System.out.println("     1.Primer Digito.   2.Segundo Digito   3.Tercer Digito.  ");
            System.out.println("     4.Cuarto Digito.   5.Quinto Digito    6.Sexto Digito.   ");
            System.out.println("//---------------------------------------------------------//");


            System.out.print("Ingrese una opcion: ");
            opcion = entrada.nextInt();

            if(opcion==1){
                numero_1 = numero % 10;
                System.out.print("El primer digito es: "+numero_1);

            }else{
                if(opcion==2){
                    numero_2 = (numero % 100) / 10;
                    System.out.print("El segundo digito es: "+numero_2);

                }else{
                    if(opcion==3){
                        numero_3 = (numero % 1000) / 100;
                        System.out.print("El tercer digito es: "+numero_3);

                    }else{
                        if(opcion==4){
                            numero_4 = (numero % 10000) / 1000;
                            System.out.print("El cuarto digito es: "+numero_4);
                            

                        }else{
                            if(opcion==5){
                                numero_5 = (numero % 100000) / 10000;
                                System.out.print("El quinto digito es: "+numero_5);
                                

                            }else{
                                if(opcion==6){
                                    numero_6 = numero / 100000;
                                    System.out.print("El Primer sexto es: "+numero_6);
                                    

                                }
                            }
                        }
                    }
                }
            }

        }else{
            System.out.print("El numero no es de 6 digitos");
        }
        
        
    }
}