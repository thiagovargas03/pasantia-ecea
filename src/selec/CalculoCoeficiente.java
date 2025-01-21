
package selec;

import java.util.Scanner;


public class CalculoCoeficiente {
    public static int indice;
    public static double divide;
      public static boolean dividir(double lx, double ly) {
        
        
        boolean posicion=false;

        
        if (lx > ly) {
            divide = ly / lx;
            
            //Desde Abajo
            posicion=false; 
        } else {
            divide = lx / ly;
            //Desde Arriba
            posicion=true;
        }

        if (divide < 0.50) {
            System.out.println("ERROR: LOSA NO APTA PARA MEDICION");
        } else if (divide > 1) {
            System.out.println("ERROR: LOSA NO APTA PARA MEDICION");
        } else if (divide>0.50 && divide<0.55) {
            divide= 0.55;
        } else if (divide>0.55 && divide<0.60) {
            divide= 0.60;
        } else if (divide>0.60 && divide<0.65) {
            divide= 0.65;
        } else if (divide>0.65 && divide<0.70) {
            divide= 0.70;
        } else if (divide>0.75 && divide<0.80) {
            divide= 0.75;
        } else if (divide>0.80 && divide<0.85) {
            divide= 0.80;
        } else if (divide>0.80 && divide<0.85) {
            divide= 0.85;
        }  else if (divide>0.85 && divide<0.90) {
            divide= 0.90;
        } else if (divide>0.90 && divide<0.95) {
            divide= 0.95;
        }  else if (divide>0.95 && divide<1) {
            divide= 1;
        }
        
        
        
         
return posicion;
    }
      
     public static void Buscal1(double coef, boolean pos) {
        for(int i = 0 ; i < LosaLxLy.Losa1Arr.size();i++) {
            if(LosaLxLy.Losa1Arr.get(i).coeficiente == coef && LosaLxLy.Losa1Arr.get(i).posicion==pos) {
                indice=i;
            } else {
                System.out.println("Este perfil es privado");    
            }
        }
    }
}
