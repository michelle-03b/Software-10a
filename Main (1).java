import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
    System.out.println("TABLA DEL " + a + ":");

    for (int c = 1; c <= 12; c++) {
        System.out.println(a + " x " + c + " = " + (a * c));
    }

    System.out.println(); 
}
     System.out.println("Como saber si un año bisiesto");
                 System.out.print("2008: ");
        int año = 1992;

        if (año % 4 == 0) {
            if (año % 100 != 0) {
                System.out.println("El año " + año + " es bisiesto.");
            } else if (año % 400 == 0) {
                System.out.println("El año " + año + " es bisiesto.");
            } else {
                System.out.println("El año " + año + " no es bisiesto.");
            }
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
        
          System.out.print("2010: ");
        int Año = 2010;

        if (Año % 4 == 0) {
            if (Año % 100 != 0) {
                System.out.println("El año " + Año + " es bisiesto.");
            } else if (Año % 400 == 0) {
                System.out.println("El año " + Año + " es bisiesto.");
            } else {
                System.out.println("El año " + Año + " no es bisiesto.");
            }
        } else {
            System.out.println("El año " + Año + " no es bisiesto.");
        }
  
        System.out.println("FIGONACHI");

        int y = 20; 
        int e = 0;
        int r = 1;

        
        for (int i = 1; i <= y; i++) {
            System.out.print(e + " ");

            // siguiente número es la suma de los dos anteriores
            int siguiente = e + r;
            e  = r;
            r = siguiente;
        }
        
          System.out.print("número inicial:1"+ "/");
        int inicio = 1;

        System.out.print("número final:67"+ "/");
        int fin = 67;

        int contadorImpares = 0;

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 != 0) { // Si el número es impar
                contadorImpares++;
            }
        }

        System.out.println("Cantidad de números impares que hay entre " + inicio + " y " + fin + ": " + contadorImpares);
 
    }
        int nmr = 2;
        int lim = 50;

        System.out.println("Múltiplos de " + nmr + " hasta " + lim+ ":");

        for (int i = nmr; i <= lim; i += nmr) {
            System.out.println(i);
        }
    
}
    
}