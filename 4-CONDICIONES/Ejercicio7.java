import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        long n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
        long numero;

        System.out.print("Ingrese numero no mayor a diez digitos y menor a los dos mil millones: ");
        numero = entrada.nextLong();

      if(numero >= 2000000000){

        System.out.print("Numero superior a lo establecido o numero con mas de diez digitos");

      }  
      if(numero >= 1000000000 & numero <= 1999999999){

            System.out.println("------FORMATO DE MONEDA------");

            n1 = numero / 1000000000;
            n2 = (numero % 1000000000) / 100000000;
            n3 = (numero % 100000000) / 10000000;
            n4 = (numero % 10000000) / 1000000;  
            n5 = (numero % 1000000) / 100000;
            n6 = (numero % 100000) / 10000;
            n7 = (numero % 10000) / 1000;
            n8 = (numero % 1000) / 100;
            n9 = (numero % 100) / 10;
            n10=  numero % 10;

            System.out.print("Moneda: $ "+n1+"."+n2+n3+n4+"."+n5+n6+n7+"."+n8+n9+n10);


        }else{
            if(numero >= 100000000 & numero <= 999999999){

                System.out.println("------FORMATO DE MONEDA------");

             n1 = numero / 100000000;
             n2 = (numero % 100000000) / 10000000;
             n3 = (numero % 10000000) / 1000000;
             n4 = (numero % 1000000) / 100000;  
             n5 = (numero % 100000) / 10000;
             n6 = (numero % 10000) / 1000;
             n7 = (numero % 1000) / 100;
             n8 = (numero % 100) / 10;
             n9 = numero % 10; 

             System.out.print("Moneda: $ "+n1+n2+n3+"."+n4+n5+n6+"."+n7+n8+n9);

            }else{
                if(numero >= 10000000 & numero <= 99999999){

                    System.out.println("------FORMATO DE MONEDA------");

                  n1 = numero / 10000000;
                  n2 = (numero % 10000000) / 1000000;
                  n3 = (numero % 1000000) / 100000;
                  n4 = (numero % 100000) / 10000;  
                  n5 = (numero % 10000) / 1000;
                  n6 = (numero % 1000) / 100;
                  n7 = (numero % 100) / 10;
                  n8 = numero % 10;

                  System.out.print("Moneda: $ "+n1+n2+"."+n3+n4+n5+"."+n6+n7+n8);

                }else{
                    if(numero >= 1000000 & numero <= 9999999){

                        System.out.println("------FORMATO DE MONEDA------");

                     n1 = numero / 1000000;
                     n2 = (numero % 1000000) / 100000;
                     n3 = (numero % 100000) / 10000;
                     n4 = (numero % 10000) / 1000;  
                     n5 = (numero % 1000) / 100;
                     n6 = (numero % 100) / 10;
                     n7 = numero % 10;

                     System.out.print("Moneda: $ "+n1+"."+n2+n3+n4+"."+n5+n6+n7);
                     
                    }else{
                        if(numero >= 100000 & numero <= 999999){

                            System.out.println("------FORMATO DE MONEDA------");

                         n1 = numero / 100000;
                         n2 = (numero % 100000) / 10000;
                         n3 = (numero % 10000) / 1000;
                         n4 = (numero % 1000) / 100;  
                         n5 = (numero % 100) / 10;
                         n6 = numero % 10;

                         System.out.print("Moneda: $ "+n1+n2+n3+"."+n4+n5+n6);
                         
                        }else{
                            if(numero >= 10000 & numero <= 99999){

                                System.out.println("------FORMATO DE MONEDA------");

                             n1 = numero / 10000;
                             n2 = (numero % 10000) / 1000;
                             n3 = (numero % 1000) / 100;
                             n4 = (numero % 100) / 10;  
                             n5 = numero % 10;
                             
                             System.out.print("Moneda: $ "+n1+n2+"."+n3+n4+n5);

                            }else{
                                if(numero >= 1000 & numero <= 9999){

                                    System.out.println("------FORMATO DE MONEDA------");

                                 n1 = numero / 1000;
                                 n2 = (numero % 1000) / 100;
                                 n3 = (numero % 100) / 10;
                                 n4 = numero % 10;  

                                 System.out.print("Moneda: $ "+n1+"."+n2+n3+n4);
                                 
                                }
                            }
                        }
                    }
                }
            }

        }
        
    }
}
