import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        System.out.println("Tablas del 1 al 10, punto 1");
        for(int a = 1 ; a<11 ; a++){
      
            System.out.println("La tabla del "+a);
            
            for(int x = 1 ; x<13 ; x++){
                        System.out.println(x+"x"+a+"="+a*x);

    } }
            System.out.print("Año bisiesto, punto 2");
        int año=2000;
        if(año%4==0){

           
            if(año%100==0)



   if(año%400==0)
   System.out.println("El año "+año+" si es biciesto");
              
            
            
  } else{
          System.out.println("Elaño "+año+" no es bisiesto");
         
     }
        System.out.println("Codigo fiborachi, punto 3");
        int s = 0;
        int f = 1;
        
        for (int e=1; e <= 20; e++){
            int siguiente = s + f;
            s = f;            
            f = siguiente;
                   
        System.out.println(s);
}  
                System.out.println("Multiplos de un numero, punto 4");
        int x = 5;
        int y= 100;
 
         for (int i = 0 ; i <= y; i+=x) { 
            System.out.println(i);
            }
                        System.out.println("Cantidad de nuemros impares, punto 5");

    int primernumero = 1;
        int finalnumero = 30;
             for (int i = primernumero; i <= finalnumero; i++) {
          if (i % 2 != 0) {
           System.out.println(i);
          }
}
    }}