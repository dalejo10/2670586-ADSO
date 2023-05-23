import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int cuadrante_x;
        int cuadrante_y;

        System.out.print("Ingrese la coordenada X: ");
        cuadrante_x = entrada.nextInt();

        System.out.print("Ingrese la coordenada Y: ");
        cuadrante_y = entrada.nextInt();

        if (cuadrante_x >0 & cuadrante_y >0){
            System.out.print("Numeros estan en el cuadrante 1 ");

        }else{

            if(cuadrante_x <0 & cuadrante_y >0 ){
                System.out.print("Numeros estan en el cuadrante 2 ");

            }else{

                if (cuadrante_x <0 & cuadrante_y <0){
                    System.out.print("Numeros estan en el cuadrante 3 ");

                }else{

                    if (cuadrante_x >0 & cuadrante_y <0){
                        System.out.print("Numeros estan en el cuadrante 4 ");

                    }else{

                        if (cuadrante_x ==0 & cuadrante_y==0){
                            System.out.print("Numeros estan en el origen ");

                        }else{
                            System.out.print("Numeros estan en medio de dos cuadrantes");
                        }

                    }
                    
                }

            }
                      
        }
            

    }
    
}
