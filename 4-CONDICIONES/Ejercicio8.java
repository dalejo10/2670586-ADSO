import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

            
            long numero = 0;

            String num1 = "UNO ";
            String num2 = "DOS ";
            String num3 = "TRES ";
            String num4 = "CUATRO ";
            String num5 = "CINCO ";
            String num6 = "SEIS ";
            String num7 = "SIETE ";
            String num8 = "OCHO";
            String num9 = "NUEVE ";
            String num10 = "DIEZ ";
            String num11 = "ONCE ";
            String num12 = "DOCE ";
            String num13 = "TRECE ";
            String num14 = "CATORCE ";
            String num15 = "QUINCE ";
            String num16 = "DIECISEIS ";
            String num17 = "DIECISIETE ";
            String num18 = "DIECIOCHO ";
            String num19 = "DIECINUEVE";
            String num20 = "VEINTE ";
            String num21 = "VENTIUNO ";
            String num22 = "VENTIDOS ";
            String num23 = "VENTITRES ";
            String num24 = "VENTICUATRO ";
            String num25 = "VENTICINCO ";
            String num26 = "VENTISEIS ";
            String num27 = "VENTISIETE ";
            String num28 = "VENTIOCHO ";
            String num29 = "VENTINUEVE ";
            String num30 = "TREINTA ";
            String num40 = "CUARENTA ";
            String num50 = "CINCUENTA ";
            String num60 = "SESENTA ";
            String num70 = "SETENTA ";
            String num80 = "OCHENTA ";
            String num90 = "NOVENTA ";
            String num100 = "CIEN ";
            String ciento = "CIENTO ";
            String num200 = "DOSCIENTOS ";
            String num300 = "TRESCIENTOS ";
            String num400 = "CUATROCIENTOS ";
            String num500 = "QUINIENTOS ";
            String num600 = "SEISCIENTOS ";
            String num700 = "SETECIENTOS ";
            String num800 = "OCHOCIENTOS ";
            String num900 = "NOVECIENTOS ";
            String mil = "MIL ";
            String millon = "MILLON ";
            String millones = "MILLONES ";
            String y = "Y ";
            String un = "UN ";
            
            

            System.out.print("Ingrese un numero no mayor a nueve digitos: ");
            numero = entrada.nextLong();

            long d1 = numero / 100000000;
            long d2 = (numero % 100000000) / 10000000;
            long d3 = (numero % 10000000) / 1000000;
            long d4 = (numero % 1000000) / 100000;
            long d5 = (numero % 100000) / 10000;
            long d6 = (numero % 10000) / 1000;
            long d7 = (numero % 1000) / 100;
            long d8 = (numero % 100) / 10;
            long d9 = numero % 10;

            
            

            if(numero>999999999){

                 System.out.print("El numero es mayor a nueve digitos");
                
            }else{
                if(d1 == 1 & d2 > 0 & d3 > 0){
                                                        
                  System.out.print(ciento);
                }else{
                    if (d1 == 1 ){
                        System.out.print(num100);
                    }else{
                        if(d1 == 2){
                           System.out.print(num200);
                        }else{
                            if(d1 == 3){
                               System.out.print(num300);
                            }else{
                                if(d1 == 4){
                                   System.out.print(num400);
                                }else{
                                    if(d1 == 5){
                                      System.out.print(num500);
                                    }else{
                                       if(d1 == 6){
                                          System.out.print(num600);
                                        }else{
                                            if(d1 == 7){
                                              System.out.print(num700); 
                                            }else{
                                                if(d1 == 8){
                                                  System.out.print(num800);
                                                }else{
                                                    if(d1 == 9){
                                                       System.out.print(num900);
                                                    }                                                                                                         
                                                } 
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } 
                 
            }
            if(d2 == 1){
                if(d3 == 0){
            System.out.print(num10);
            }else if (d3 == 1){
                System.out.print(num11);
            }else if (d3 == 2){
                System.out.print(num12);
            }else if (d3 == 3){
                System.out.print(num13);
            }else if (d3 == 4){
                System.out.print(num14);
            }else if (d3 == 5){
                System.out.print(num15);
            }else if (d3 == 6){
                System.out.print(num16);
            }else if (d3 == 7){
                System.out.print(num17);
            }else if (d3 == 8){
                System.out.print(num18);
            }else if (d3 == 9){
                System.out.print(num19);
            }
            }




            if(d2 == 2){
                 if(d3 == 0){
            System.out.print(num20);
            }else if (d3 == 1){
                System.out.print(num21);
            }else if (d3 == 2){
                System.out.print(num22);
            }else if (d3 == 3){
                System.out.print(num23);
            }else if (d3 == 4){
                System.out.print(num24);
            }else if (d3 == 5){
                System.out.print(num25);
            }else if (d3 == 6){
                System.out.print(num26);
            }else if (d3 == 7){
                System.out.print(num27);
            }else if (d3 == 8){
                System.out.print(num28);
            }else if (d3 == 9){
                System.out.print(num29);
            }
            }




            if(d2 == 3){
                if(d3 == 0){
                System.out.print(num30);
            }else if (d3 !=0){
                System.out.print(num30 + y);
            } 
            }

            if(d2 == 4){
                if(d3 == 0){
                System.out.print(num40);
            }else if (d3 !=0){
                System.out.print(num40 + y);
            } 
            }

            if(d2 == 5){
                if(d3 == 0){
                System.out.print(num50);
            }else if (d3 !=0){
                System.out.print(num50 + y);
            } 
            }

            if(d2 == 6){
                if(d3 == 0){
                System.out.print(num60);
            }else if (d3 !=0){
                System.out.print(num60 + y);
            } 
            }

            if(d2 == 7){
                if(d3 == 0){
                System.out.print(num70);
            }else if (d3 !=0){
                System.out.print(num70 + y);
            } 
            }

            if(d2 == 8){
                if(d3 == 0){
                System.out.print(num80);
            }else if (d3 !=0){
                System.out.print(num80 + y);
            } 
            }

            if(d2 == 9){
                if(d3 == 0){
                System.out.print(num90);
            }else if (d3 !=0){
                System.out.print(num90 + y);
            } 
            }




            if(d2 !=1 & d2 !=2 ){
            if (d3 == 1) {
            System.out.print(un);
            } else if (d3 == 2) {
            System.out.print(num2);
            } else if (d3 == 3) {
            System.out.print(num3);
            } else if (d3 == 4) {
            System.out.print(num4);
            } else if (d3 == 5) {
            System.out.print(num5);
            } else if (d3 == 6) {
            System.out.print(num6);
            } else if (d3 == 7) {
            System.out.print(num7);
            } else if (d3 == 8) {
            System.out.print(num8);
            } else if (d3 == 9) {
            System.out.print(num9);
            }
            }



            if(numero > 1000000){
            System.out.print(millones);
            }else if (numero == 1000000){
            System.out.print(millon);   
            }



            if (d4 == 1) {
            if (d5 != 0 & d6 != 0) {
            System.out.print(ciento);
            }
            }else if (d4 == 1 ){
            System.out.print(num100);
            }else if (d4 == 2 ){
            System.out.print(num200);
            }else if (d4 == 3 ){
            System.out.print(num300);
            }else if (d4 == 4 ){
            System.out.print(num400);
            }else if (d4 == 5 ){
            System.out.print(num500);
            }else if (d4 == 6 ){
            System.out.print(num600);
            }else if (d4 == 7 ){
            System.out.print(num700);
            }else if (d4 == 8 ){
            System.out.print(num800);
            }else if (d4 == 9 ){
            System.out.print(num900);
            }



            if(d5 == 1){
                if(d6 == 0){
            System.out.print(num10);
            }else if (d6 == 1){
                System.out.print(num11);
            }else if (d6 == 2){
                System.out.print(num12);
            }else if (d6 == 3){
                System.out.print(num13);
            }else if (d6 == 4){
                System.out.print(num14);
            }else if (d6 == 5){
                System.out.print(num15);
            }else if (d6 == 6){
                System.out.print(num16);
            }else if (d6 == 7){
                System.out.print(num17);
            }else if (d6 == 8){
                System.out.print(num18);
            }else if (d6 == 9){
                System.out.print(num19);
            }
            }



            if(d5 == 2){
                 if(d6 == 0){
            System.out.print(num20);
            }else if (d6 == 1){
                System.out.print(num21);
            }else if (d6 == 2){
                System.out.print(num22);
            }else if (d6 == 3){
                System.out.print(num23);
            }else if (d6 == 4){
                System.out.print(num24);
            }else if (d6 == 5){
                System.out.print(num25);
            }else if (d6 == 6){
                System.out.print(num26);
            }else if (d6 == 7){
                System.out.print(num27);
            }else if (d6 == 8){
                System.out.print(num28);
            }else if (d6 == 9){
                System.out.print(num29);
            }
            }




            if(d5 == 3){
                if(d6 == 0){
                System.out.print(num30);
            }else if (d6 !=0){
                System.out.print(num30 + y);
            } 
            }

            if(d5 == 4){
                if(d6 == 0){
                System.out.print(num40);
            }else if (d6 !=0){
                System.out.print(num40 + y);
            } 
            }

            if(d5 == 5){
                if(d6 == 0){
                System.out.print(num50);
            }else if (d6 !=0){
                System.out.print(num50 + y);
            } 
            }

            if(d5 == 6){
                if(d6 == 0){
                System.out.print(num60);
            }else if (d6 !=0){
                System.out.print(num60 + y);
            } 
            }

            if(d5 == 7){
                if(d6 == 0){
                System.out.print(num70);
            }else if (d6 !=0){
                System.out.print(num70 + y);
            } 
            }

            if(d5 == 8){
                if(d6 == 0){
                System.out.print(num80);
            }else if (d6 !=0){
                System.out.print(num80 + y);
            } 
            }

            if(d5 == 9){
                if(d6 == 0){
                System.out.print(num90);
            }else if (d6 !=0){
                System.out.print(num90 + y);
            } 
            }



            if(d5 !=1 & d5 !=2 ){
            if (d6 == 1) 
            if (d5 == 0 & d4 == 0) {
            System.out.print(mil);
            }else{
            System.out.print(un);
            } else if (d6 == 2) {
            System.out.print(num2);
            } else if (d6 == 3) {
            System.out.print(num3);
            } else if (d6 == 4) {
            System.out.print(num4);
            } else if (d6 == 5) {
            System.out.print(num5);
            } else if (d6 == 6) {
            System.out.print(num6);
            } else if (d6 == 7) {
            System.out.print(num7);
            } else if (d6 == 8) {
            System.out.print(num8);
            } else if (d6 == 9) {
            System.out.print(num9);
            }
            }


            if(d4 !=0 & d5 !=0 & d6 !=0){
            if (numero != 1000) {
            System.out.print(mil);
            }
            }



            if (d7 == 1) {
            if (d8 != 0 & d9 != 0) {
            System.out.print(ciento);
            }
            }else if (d7 == 1 ){
            System.out.print(num100);
            }else if (d7 == 2 ){
            System.out.print(num200);
            }else if (d7 == 3 ){
            System.out.print(num300);
            }else if (d7 == 4 ){
            System.out.print(num400);
            }else if (d7 == 5 ){
            System.out.print(num500);
            }else if (d7 == 6 ){
            System.out.print(num600);
            }else if (d7 == 7 ){
            System.out.print(num700);
            }else if (d7 == 8 ){
            System.out.print(num800);
            }else if (d7 == 9 ){
            System.out.print(num900);
            }



            if(d8 == 1){
                if(d9 == 0){
            System.out.print(num10);
            }else if (d9 == 1){
                System.out.print(num11);
            }else if (d9 == 2){
                System.out.print(num12);
            }else if (d9 == 3){
                System.out.print(num13);
            }else if (d9 == 4){
                System.out.print(num14);
            }else if (d9 == 5){
                System.out.print(num15);
            }else if (d9 == 6){
                System.out.print(num16);
            }else if (d9 == 7){
                System.out.print(num17);
            }else if (d9 == 8){
                System.out.print(num18);
            }else if (d9 == 9){
                System.out.print(num19);
            }
            }



            if(d8 == 2){
                 if(d9 == 0){
            System.out.print(num20);
            }else if (d9 == 1){
                System.out.print(num21);
            }else if (d9 == 2){
                System.out.print(num22);
            }else if (d9 == 3){
                System.out.print(num23);
            }else if (d9 == 4){
                System.out.print(num24);
            }else if (d9 == 5){
                System.out.print(num25);
            }else if (d9 == 6){
                System.out.print(num26);
            }else if (d9 == 7){
                System.out.print(num27);
            }else if (d9 == 8){
                System.out.print(num28);
            }else if (d9 == 9){
                System.out.print(num29);
            }
            }



            if(d8 == 3){
                if(d9 == 0){
                System.out.print(num30);
            }else if (d9 !=0){
                System.out.print(num30 + y);
            } 
            }

            if(d8 == 4){
                if(d9 == 0){
                System.out.print(num40);
            }else if (d9 !=0){
                System.out.print(num40 + y);
            } 
            }

            if(d8 == 5){
                if(d9 == 0){
                System.out.print(num50);
            }else if (d9 !=0){
                System.out.print(num50 + y);
            } 
            }

            if(d8 == 6){
                if(d9 == 0){
                System.out.print(num60);
            }else if (d9 !=0){
                System.out.print(num60 + y);
            } 
            }

            if(d8 == 7){
                if(d9 == 0){
                System.out.print(num70);
            }else if (d9 !=0){
                System.out.print(num70 + y);
            } 
            }

            if(d8 == 8){
                if(d9 == 0){
                System.out.print(num80);
            }else if (d9 !=0){
                System.out.print(num80 + y);
            } 
            }

            if(d8 == 9){
                if(d9 == 0){
                System.out.print(num90);
            }else if (d9 !=0){
                System.out.print(num90 + y);
            } 
            }



            if(d8 !=1 & d8 !=2 ){ 
            if (d9 == 1){ 
            System.out.print(num1);   
            } else if (d9 == 2) {
            System.out.print(num2);
            } else if (d9 == 3) {
            System.out.print(num3);
            } else if (d9 == 4) {
            System.out.print(num4);
            } else if (d9 == 5) {
            System.out.print(num5);
            } else if (d9 == 6) {
            System.out.print(num6);
            } else if (d9 == 7) {
            System.out.print(num7);
            } else if (d9 == 8) {
            System.out.print(num8);
            } else if (d9 == 9) {
            System.out.print(num9);
            }
            }


            System.out.print("---ES EL NUMERO EN PALABRAS---");
























        
    }
}