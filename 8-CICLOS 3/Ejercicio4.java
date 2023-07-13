import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        NumberFormat tipo_moneda = NumberFormat.getCurrencyInstance();
        DecimalFormat formato = new DecimalFormat("#.0");

        // El programa se realizo teniendo en cuenta que se va a utilizar camiòn. En lo que consulte, los camiones tipo furgon funcionan con dièsel el cual es de menor costo comparado con la gasolina. Tambien en lo que consulte se describe que normalmente el consumo de combustible en un furgon es de 22 litros por cada 100km de recorrido, 0,22 litros por km recorrido, de igual forma el programa funciona ingresando el precio de cualquier tipo de combustible pero siempre identificando su precio por litro y la cantidad de litros consumidos por el vehiculo por 1 kilometro recorrido.
        
        System.out.println("");
        System.out.println("||----------RUTA DEL RECORRIDO----------||");
        System.out.println("||                                      ||");
        System.out.println("||      1-Apìa                          ||");
        System.out.println("||      2-Balboa                        ||");
        System.out.println("||      3-Belèn de Umbrìa               ||");
        System.out.println("||      4-Dosquebradas                  ||");
        System.out.println("||      5-Guàtica                       ||");
        System.out.println("||      6-La Celia                      ||");
        System.out.println("||      7-La Virginia                   ||");
        System.out.println("||      8-Marsella                      ||");
        System.out.println("||      9-Mistratò                      ||");
        System.out.println("||     10-Pereira                       ||");
        System.out.println("||     11-Pueblo Rico                   ||");
        System.out.println("||     12-Quinchìa                      ||");
        System.out.println("||     13-Santa Rosa de Cabal           ||");
        System.out.println("||     14-Santuario                     ||");
        System.out.println("||--------------------------------------||");
        System.out.println("");

        System.out.print("Ingrese la ciudad de origen (numero): ");
        int ciudad_origen = entrada.nextInt();

        System.out.print("Ingrese la cantidad de paradas: ");
        int paradas = entrada.nextInt();

        int ciudad_parada = 0;
        double contador_kilometros = 0.0;

        if(ciudad_origen >=1 && ciudad_origen <=14){

            for (int i = 1; i <= paradas; i++) {

                System.out.print("Ingrese la ciudad " + i + " de parada(numero): ");
                ciudad_parada = entrada.nextInt();

                double kilometros_recorridos = 0.0;
                
                if (ciudad_origen == 1) {
                    if (ciudad_parada == 1) {
                        kilometros_recorridos = 5.0;
                    } else if (ciudad_parada == 2) {
                        kilometros_recorridos = 39.8;
                    } else if (ciudad_parada == 3) {
                        kilometros_recorridos = 39.5;
                    } else if (ciudad_parada == 4) {
                        kilometros_recorridos = 68.9;
                    } else if (ciudad_parada == 5) {
                        kilometros_recorridos = 58.7;
                    } else if (ciudad_parada == 6) {
                        kilometros_recorridos = 24.1;
                    } else if (ciudad_parada == 7) {
                        kilometros_recorridos = 34.9;
                    } else if (ciudad_parada == 8) {
                        kilometros_recorridos = 88.1;
                    } else if (ciudad_parada == 9) {
                        kilometros_recorridos = 55.6;
                    } else if (ciudad_parada == 10) {
                        kilometros_recorridos = 65.7;
                    } else if (ciudad_parada == 11) {
                        kilometros_recorridos = 26.4;
                    } else if (ciudad_parada == 12) {
                        kilometros_recorridos = 77.4;
                    } else if (ciudad_parada == 13) {
                        kilometros_recorridos = 77.8;
                    } else if (ciudad_parada == 14) {
                        kilometros_recorridos = 15.3;
                    }
                }
        
                if (ciudad_origen == 2) {
                    if (ciudad_parada == 1) {
                        kilometros_recorridos = 39.8;
                    } else if (ciudad_parada == 2) {
                        kilometros_recorridos = 5.0;
                    } else if (ciudad_parada == 3) {
                        kilometros_recorridos = 56.9;
                    } else if (ciudad_parada == 4) {
                        kilometros_recorridos = 52.9;
                    } else if (ciudad_parada == 5) {
                        kilometros_recorridos = 76.1;
                    } else if (ciudad_parada == 6) {
                        kilometros_recorridos = 13.7;
                    } else if (ciudad_parada == 7) {
                        kilometros_recorridos = 18.9;
                    } else if (ciudad_parada == 8) {
                        kilometros_recorridos = 72.1;
                    } else if (ciudad_parada == 9) {
                        kilometros_recorridos = 73.0;
                    } else if (ciudad_parada == 10) {
                        kilometros_recorridos = 49.7;
                    } else if (ciudad_parada == 11) {
                        kilometros_recorridos = 68.8;
                    } else if (ciudad_parada == 12) {
                        kilometros_recorridos = 94.8;
                    } else if (ciudad_parada == 13) {
                        kilometros_recorridos = 61.9;
                    } else if (ciudad_parada == 14) {
                        kilometros_recorridos = 38.3;
                    }
                }
        
                if (ciudad_origen == 3) {
                    if (ciudad_parada == 1) {
                        kilometros_recorridos = 39.5;
                    } else if (ciudad_parada == 2) {
                        kilometros_recorridos = 56.9;
                    } else if (ciudad_parada == 3) {
                        kilometros_recorridos = 5.0;
                    } else if (ciudad_parada == 4) {
                        kilometros_recorridos = 74.6;
                    } else if (ciudad_parada == 5) {
                        kilometros_recorridos = 25.1;
                    } else if (ciudad_parada == 6) {
                        kilometros_recorridos = 71.9;
                    } else if (ciudad_parada == 7) {
                        kilometros_recorridos = 40.8;
                    } else if (ciudad_parada == 8) {
                        kilometros_recorridos = 93.8;
                    } else if (ciudad_parada == 9) {
                        kilometros_recorridos = 16.3;
                    } else if (ciudad_parada == 10) {
                        kilometros_recorridos = 71.4;
                    } else if (ciudad_parada == 11) {
                        kilometros_recorridos = 65.4;
                    } else if (ciudad_parada == 12) {
                        kilometros_recorridos = 52.4;
                    } else if (ciudad_parada == 13) {
                        kilometros_recorridos = 83.6;
                    } else if (ciudad_parada == 14) {
                        kilometros_recorridos = 71.4;
                    }
                }
        
                if (ciudad_origen == 4) {
                    if (ciudad_parada == 1) {
                        kilometros_recorridos = 67.5;
                    } else if (ciudad_parada == 2) {
                        kilometros_recorridos = 51.5;
                    } else if (ciudad_parada == 3) {
                        kilometros_recorridos = 73.1;
                    } else if (ciudad_parada == 4) {
                        kilometros_recorridos = 5.0;
                    } else if (ciudad_parada == 5) {
                        kilometros_recorridos = 92.3;
                    } else if (ciudad_parada == 6) {
                        kilometros_recorridos = 66.6;
                    } else if (ciudad_parada == 7) {
                        kilometros_recorridos = 32.5;
                    } else if (ciudad_parada == 8) {
                        kilometros_recorridos = 34.4;
                    } else if (ciudad_parada == 9) {
                        kilometros_recorridos = 89.3;
                    } else if (ciudad_parada == 10) {
                        kilometros_recorridos = 2.4;
                    } else if (ciudad_parada == 11) {
                        kilometros_recorridos = 92.5;
                    } else if (ciudad_parada == 12) {
                        kilometros_recorridos = 93.9;
                    } else if (ciudad_parada == 13) {
                        kilometros_recorridos = 12.4;
                    } else if (ciudad_parada == 14) {
                        kilometros_recorridos = 66.0;
                    }
                }
        
                if (ciudad_origen == 5) {
                    if (ciudad_parada == 1) {
                        kilometros_recorridos = 58.7;
                    } else if (ciudad_parada == 2) {
                        kilometros_recorridos = 76.1;
                    } else if (ciudad_parada == 3) {
                        kilometros_recorridos = 25.1;
                    } else if (ciudad_parada == 4) {
                        kilometros_recorridos = 93.8;
                    } else if (ciudad_parada == 5) {
                        kilometros_recorridos = 5.0;
                    } else if (ciudad_parada == 6) {
                        kilometros_recorridos = 91.1;
                    } else if (ciudad_parada == 7) {
                        kilometros_recorridos = 60.0;
                    } else if (ciudad_parada == 8) {
                        kilometros_recorridos = 98.5;
                    } else if (ciudad_parada == 9) {
                        kilometros_recorridos = 25.1;
                    } else if (ciudad_parada == 10) {
                        kilometros_recorridos = 90.6;
                    } else if (ciudad_parada == 11) {
                        kilometros_recorridos = 84.8;
                    } else if (ciudad_parada == 12) {
                        kilometros_recorridos = 22.9;
                    } else if (ciudad_parada == 13) {
                        kilometros_recorridos = 85.5;
                    } else if (ciudad_parada == 14) {
                        kilometros_recorridos = 73.4;
                    }
                }
        
                if (ciudad_origen == 6) {
                    if (ciudad_parada == 1) {
                        kilometros_recorridos = 24.1;
                    } else if (ciudad_parada == 2) {
                        kilometros_recorridos = 13.7;
                    } else if (ciudad_parada == 3) {
                        kilometros_recorridos = 71.9;
                    } else if (ciudad_parada == 4) {
                        kilometros_recorridos = 67.9;
                    } else if (ciudad_parada == 5) {
                        kilometros_recorridos = 91.1;
                    } else if (ciudad_parada == 6) {
                        kilometros_recorridos = 5.0;
                    } else if (ciudad_parada == 7) {
                        kilometros_recorridos = 33.9;
                    } else if (ciudad_parada == 8) {
                        kilometros_recorridos = 87.2;
                    } else if (ciudad_parada == 9) {
                        kilometros_recorridos = 88.1;
                    } else if (ciudad_parada == 10) {
                        kilometros_recorridos = 64.7;
                    } else if (ciudad_parada == 11) {
                        kilometros_recorridos = 49.1;
                    } else if (ciudad_parada == 12) {
                        kilometros_recorridos = 110.0;
                    } else if (ciudad_parada == 13) {
                        kilometros_recorridos = 76.9;
                    } else if (ciudad_parada == 14) {
                        kilometros_recorridos = 22.6;
                    }
                }
        
                if (ciudad_origen == 7) {
                    if (ciudad_parada == 1) {
                        kilometros_recorridos = 35.0;
                    } else if (ciudad_parada == 2) {
                        kilometros_recorridos = 19.0;
                    } else if (ciudad_parada == 3) {
                        kilometros_recorridos = 40.8;
                    } else if (ciudad_parada == 4) {
                        kilometros_recorridos = 34.0;
                    } else if (ciudad_parada == 5) {
                        kilometros_recorridos = 60.0;
                    } else if (ciudad_parada == 6) {
                        kilometros_recorridos = 34.0;
                    } else if (ciudad_parada == 7) {
                        kilometros_recorridos = 5.0;
                    } else if (ciudad_parada == 8) {
                        kilometros_recorridos = 53.3;
                    } else if (ciudad_parada == 9) {
                        kilometros_recorridos = 56.9;
                    } else if (ciudad_parada == 10) {
                        kilometros_recorridos = 30.8;
                    } else if (ciudad_parada == 11) {
                        kilometros_recorridos = 60.0;
                    } else if (ciudad_parada == 12) {
                        kilometros_recorridos = 78.7;
                    } else if (ciudad_parada == 13) {
                        kilometros_recorridos = 43.0;
                    } else if (ciudad_parada == 14) {
                        kilometros_recorridos = 33.5;
                    }
                }
        
                if (ciudad_origen == 8) {
                    if (ciudad_parada == 1) {
                        kilometros_recorridos = 88.0;
                    } else if (ciudad_parada == 2) {
                        kilometros_recorridos = 72.0;
                    } else if (ciudad_parada == 3) {
                        kilometros_recorridos = 93.6;
                    } else if (ciudad_parada == 4) {
                        kilometros_recorridos = 35.8;
                    } else if (ciudad_parada == 5) {
                        kilometros_recorridos = 98.4;
                    } else if (ciudad_parada == 6) {
                        kilometros_recorridos = 87.0;
                    } else if (ciudad_parada == 7) {
                        kilometros_recorridos = 53.0;
                    } else if (ciudad_parada == 8) {
                        kilometros_recorridos = 5.0;
                    } else if (ciudad_parada == 9) {
                        kilometros_recorridos = 110.0;
                    } else if (ciudad_parada == 10) {
                        kilometros_recorridos = 32.9;
                    } else if (ciudad_parada == 11) {
                        kilometros_recorridos = 113.0;
                    } else if (ciudad_parada == 12) {
                        kilometros_recorridos = 96.6;
                    } else if (ciudad_parada == 13) {
                        kilometros_recorridos = 44.7;
                    } else if (ciudad_parada == 14) {
                        kilometros_recorridos = 86.5;
                    }
                }
        
                if (ciudad_origen == 9) {
                    if (ciudad_parada == 1) {
                        kilometros_recorridos = 55.7;
                    } else if (ciudad_parada == 2) {
                        kilometros_recorridos = 73.1;
                    } else if (ciudad_parada == 3) {
                        kilometros_recorridos = 16.3;
                    } else if (ciudad_parada == 4) {
                        kilometros_recorridos = 90.8;
                    } else if (ciudad_parada == 5) {
                        kilometros_recorridos = 25.1;
                    } else if (ciudad_parada == 6) {
                        kilometros_recorridos = 88.1;
                    } else if (ciudad_parada == 7) {
                        kilometros_recorridos = 57.0;
                    } else if (ciudad_parada == 8) {
                        kilometros_recorridos = 110.0;
                    } else if (ciudad_parada == 9) {
                        kilometros_recorridos = 5.0;
                    } else if (ciudad_parada == 10) {
                        kilometros_recorridos = 87.6;
                    } else if (ciudad_parada == 11) {
                        kilometros_recorridos = 81.7;
                    } else if (ciudad_parada == 12) {
                        kilometros_recorridos = 53.6;
                    } else if (ciudad_parada == 13) {
                        kilometros_recorridos = 99.8;
                    } else if (ciudad_parada == 14) {
                        kilometros_recorridos = 70.4;
                    }
                }
        
                if (ciudad_origen == 10) {
                    if (ciudad_parada == 1) {
                        kilometros_recorridos = 65.7;
                    } else if (ciudad_parada == 2) {
                        kilometros_recorridos = 49.8;
                    } else if (ciudad_parada == 3) {
                        kilometros_recorridos = 71.3;
                    } else if (ciudad_parada == 4) {
                        kilometros_recorridos = 2.4;
                    } else if (ciudad_parada == 5) {
                        kilometros_recorridos = 90.5;
                    } else if (ciudad_parada == 6) {
                        kilometros_recorridos = 64.8;
                    } else if (ciudad_parada == 7) {
                        kilometros_recorridos = 30.7;
                    } else if (ciudad_parada == 8) {
                        kilometros_recorridos = 33.0;
                    } else if (ciudad_parada == 9) {
                        kilometros_recorridos = 87.5;
                    } else if (ciudad_parada == 10) {
                        kilometros_recorridos = 5.0;
                    } else if (ciudad_parada == 11) {
                        kilometros_recorridos = 90.7;
                    } else if (ciudad_parada == 12) {
                        kilometros_recorridos = 95.8;
                    } else if (ciudad_parada == 13) {
                        kilometros_recorridos = 14.3;
                    } else if (ciudad_parada == 14) {
                        kilometros_recorridos = 64.2;
                    }
                }
        
                if (ciudad_origen == 11) {
                    if (ciudad_parada == 1) {
                        kilometros_recorridos = 26.2;
                    } else if (ciudad_parada == 2) {
                        kilometros_recorridos = 64.6;
                    } else if (ciudad_parada == 3) {
                        kilometros_recorridos = 65.5;
                    } else if (ciudad_parada == 4) {
                        kilometros_recorridos = 93.7;
                    } else if (ciudad_parada == 5) {
                        kilometros_recorridos = 84.5;
                    } else if (ciudad_parada == 6) {
                        kilometros_recorridos = 48.9;
                    } else if (ciudad_parada == 7) {
                        kilometros_recorridos = 59.7;
                    } else if (ciudad_parada == 8) {
                        kilometros_recorridos = 113.0;
                    } else if (ciudad_parada == 9) {
                        kilometros_recorridos = 81.5;
                    } else if (ciudad_parada == 10) {
                        kilometros_recorridos = 90.5;
                    } else if (ciudad_parada == 11) {
                        kilometros_recorridos = 5.0;
                    } else if (ciudad_parada == 12) {
                        kilometros_recorridos = 103.0;
                    } else if (ciudad_parada == 13) {
                        kilometros_recorridos = 103.0;
                    } else if (ciudad_parada == 14) {
                        kilometros_recorridos = 34.3;
                    }
                }
        
                if (ciudad_origen == 12) {
                    if (ciudad_parada == 1) {
                        kilometros_recorridos = 77.4;
                    } else if (ciudad_parada == 2) {
                        kilometros_recorridos = 94.7;
                    } else if (ciudad_parada == 3) {
                        kilometros_recorridos = 52.4;
                    } else if (ciudad_parada == 4) {
                        kilometros_recorridos = 91.9;
                    } else if (ciudad_parada == 5) {
                        kilometros_recorridos = 22.8;
                    } else if (ciudad_parada == 6) {
                        kilometros_recorridos = 110.0;
                    } else if (ciudad_parada == 7) {
                        kilometros_recorridos = 78.7;
                    } else if (ciudad_parada == 8) {
                        kilometros_recorridos = 96.2;
                    } else if (ciudad_parada == 9) {
                        kilometros_recorridos = 57.9;
                    } else if (ciudad_parada == 10) {
                        kilometros_recorridos = 93.8;
                    } else if (ciudad_parada == 11) {
                        kilometros_recorridos = 103.0;
                    } else if (ciudad_parada == 12) {
                        kilometros_recorridos = 5.0;
                    } else if (ciudad_parada == 13) {
                        kilometros_recorridos = 83.2;
                    } else if (ciudad_parada == 14) {
                        kilometros_recorridos = 109.0;
                    }
                }
        
                if (ciudad_origen == 13) {
                    if (ciudad_parada == 1) {
                        kilometros_recorridos = 76.7;
                    } else if (ciudad_parada == 2) {
                        kilometros_recorridos = 60.8;
                    } else if (ciudad_parada == 3) {
                        kilometros_recorridos = 82.6;
                    } else if (ciudad_parada == 4) {
                        kilometros_recorridos = 10.3;
                    } else if (ciudad_parada == 5) {
                        kilometros_recorridos = 85.4;
                    } else if (ciudad_parada == 6) {
                        kilometros_recorridos = 75.8;
                    } else if (ciudad_parada == 7) {
                        kilometros_recorridos = 41.7;
                    } else if (ciudad_parada == 8) {
                        kilometros_recorridos = 43.6;
                    } else if (ciudad_parada == 9) {
                        kilometros_recorridos = 98.5;
                    } else if (ciudad_parada == 10) {
                        kilometros_recorridos = 12.3;
                    } else if (ciudad_parada == 11) {
                        kilometros_recorridos = 102.0;
                    } else if (ciudad_parada == 12) {
                        kilometros_recorridos = 83.5;
                    } else if (ciudad_parada == 13) {
                        kilometros_recorridos = 5.0;
                    } else if (ciudad_parada == 14) {
                        kilometros_recorridos = 75.2;
                    }
                }
        
                if (ciudad_origen == 14) {
                    if (ciudad_parada == 1) {
                        kilometros_recorridos = 15.3;
                    } else if (ciudad_parada == 2) {
                        kilometros_recorridos = 38.3;
                    } else if (ciudad_parada == 3) {
                        kilometros_recorridos = 71.4;
                    } else if (ciudad_parada == 4) {
                        kilometros_recorridos = 67.4;
                    } else if (ciudad_parada == 5) {
                        kilometros_recorridos = 73.5;
                    } else if (ciudad_parada == 6) {
                        kilometros_recorridos = 22.6;
                    } else if (ciudad_parada == 7) {
                        kilometros_recorridos = 33.4;
                    } else if (ciudad_parada == 8) {
                        kilometros_recorridos = 86.6;
                    } else if (ciudad_parada == 9) {
                        kilometros_recorridos = 70.5;
                    } else if (ciudad_parada == 10) {
                        kilometros_recorridos = 64.2;
                    } else if (ciudad_parada == 11) {
                        kilometros_recorridos = 34.5;
                    } else if (ciudad_parada == 12) {
                        kilometros_recorridos = 109.0;
                    } else if (ciudad_parada == 13) {
                        kilometros_recorridos = 76.4;
                    } else if (ciudad_parada == 14) {
                        kilometros_recorridos = 5.0;
                    }
                }
                
                contador_kilometros = contador_kilometros + kilometros_recorridos; 
                ciudad_origen = ciudad_parada; 

            }
       
            System.out.print("Ingrese el precio actual del combustible por 1 litro: ");
            double precio_combustible = entrada.nextDouble();
            
            System.out.print("Ingrese el consumo de combustible(litros) del vehiculo por 1 kilometro de recorrido: ");
            double consumo_combustible = entrada.nextDouble();
            
            double combustible_consumido = contador_kilometros * consumo_combustible; 
            double precio_total = combustible_consumido * precio_combustible;

            System.out.println(""); 

            System.out.println("Esta sera la distancia aproximada de recorrido: "+formato.format(contador_kilometros)+" Kilometros");
            
            System.out.println("Esta es la cantidad aproximada de combustible que se consumira: "+formato.format(combustible_consumido)+" Litros / "+formato.format(combustible_consumido/3.79)+" Galones"); 

            System.out.println("El valor total en pesos de combustible que se consumira es: " + tipo_moneda.format(precio_total)); 

        }else{
            System.out.print("Ciudad de origen incorrecta");
        }

    }
}



