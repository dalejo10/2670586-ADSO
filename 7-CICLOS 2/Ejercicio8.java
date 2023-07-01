import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args){
         Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un numero entero N par: ");
        int numero = entrada.nextInt();

        
        if(numero % 2 == 0){
            
            int contador = 2;
            for( int i=1 ; i<=numero; i++){
                for( int j=1 ; j<=numero; j++){
                    if(contador % 2 == 0){

                        int contador2 = 0; 
                        while(contador2 < 1){
                            int aleatorio = (int) (Math.random()*1000);
							int divisores = 0;
							for (int h=1; h<=aleatorio; h++) {
								if (aleatorio % h == 0) {
									divisores = divisores + 1;
								}
							}
							if (divisores==2) {
								System.out.print("|"+(((aleatorio<10)? "00":((aleatorio<100)? "0":""))+aleatorio)+"|");
								contador2 = contador2 + 1;
							}
                        }
                    }else{
                        int contador2 = 0; 
                        while(contador2 < 1){
                            int aleatorio = (int) (Math.random()*1000);
							int divisores = 0;
							for (int h=1; h<=aleatorio; h++) {
								if (aleatorio % h == 0) {
									divisores = divisores + 1;
								}
							}
							if (divisores > 2) {
								System.out.print("|"+(((aleatorio<10)? "00":((aleatorio<100)? "0":""))+aleatorio)+"|");
								contador2 = contador + 1;
							}
                        }
                    
                    }
                    contador = contador + 1;
                }
                System.out.println("");
            }

        }else{
            System.out.print("Numero no es par");
        }
    }
}