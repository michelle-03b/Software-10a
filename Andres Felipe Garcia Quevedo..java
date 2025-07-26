import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        


     System.out.println("-----------------------------------------------");
     System.out.println("Primer punto-Tablas de multiplicar");
     for (int a= 1; a < 11 ; a++){
        System.out.println("tabla del " + a);
            for (int z= 1; z < 13 ; z++){
                    System.out.println(z + "x" + a + "=" + (a*z));
                  
          }
     }

        
        System.out.println("-----------------------------------------------");
        System.out.println("Segundo Punto-Año bisiesto");
        
       int año = 4000;
        if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0) {
                    System.out.println("El año " + año + " es bisiesto.");
                } else {
                    System.out.println("El año " + año + " no es bisiesto.");
                }
            } else {
                System.out.println("El año " + año + " es bisiesto.");
            }
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }

    System.out.println("-----------------------------------------------");
    System.out.println("Tercer Punto-Numero 20 Fibonacci");

        int AN = 0;
        int DR = 1;
        
        for (int RE=1; RE <= 20; RE++){
            int siguiente = AN + DR;
            AN = DR;            
            DR = siguiente;
                   
        System.out.println(AN);
                }

        
    System.out.println("-----------------------------------------------");
    System.out.println("Cuarto Punto-Multiplos de 3 de cualquier numero");

    int numeromultiplo = 3;
        int numerolimite= 100;
 
         for (int i = 0 ; i <= numerolimite; i+=numeromultiplo) { 
            System.out.println(i);
         }

        
    System.out.println("-----------------------------------------------");
    System.out.println("Quinto Punto-Mostrar los numeros impares dentro de un rango");
       int inicio = 1;
        int fin = 46;
         for (int i = inicio; i <= fin; i++) {
          if (i % 2 != 0) {
           System.out.println(i);
    }
}
   System.out.println("-----------------------------------------------");
        
                }
}
