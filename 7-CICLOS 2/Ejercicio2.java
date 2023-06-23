public class Ejercicio2{
    public static void main(String[] args){
        

        int dia = (int)(Math.random() * 31)+1;
        int mes =  (int)(Math.random() * 12)+1;
        int year =  (int)(Math.random() * 3000)+1;

       
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            
            mes =  (int)(Math.random() * 12)+1;
             if (mes == 2) {
                dia = (int)(Math.random() * 29) + 1;
            }else{
                dia = (int)(Math.random() * 30) + 1;
            }if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                dia = (int)(Math.random() * 31) + 1;  
            }
            System.out.print("La fecha generada es: "+dia+"/"+mes+"/"+year);
            
        }else{
            mes = (int)(Math.random() * 12) + 1;
            
            if (mes == 2) {
                dia = (int)(Math.random() * 28) + 1;
            }else{
                dia = (int)(Math.random() * 30) + 1;
            }if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                dia = (int)(Math.random() * 31) + 1;
            }
            System.out.print("La fecha generada es: "+dia+"/"+mes+"/"+year);
        }
             
    }   
}
            