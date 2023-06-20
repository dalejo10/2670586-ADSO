import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("La fecha generada es: ");

            int dia = (int)(Math.random() * 31);
            if(dia>=1 && dia <=9){
                 System.out.print("0"+dia);
            }if(dia>9 && dia <=31){
                System.out.print(dia);
            }

            int mes =  (int)(Math.random() * 12);
            if(mes>=1 && mes <=9){
                 System.out.print("0"+mes);
            }if(mes>9 && mes <=12){
                System.out.print(mes);
            }

            int year =  (int)(Math.random() * 9999);
            if(year>=1000 && year <=9999){
                 System.out.print(year);
            }

             
    }   
}
            