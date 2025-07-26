import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        
//TABLAS        
        for (int j = 1; j <= 12; j++) {
            System.out.println("TABLA DEL " + j + ":");
            
            // Tabla interna: del 1 al 10
            for (int s = 1; s <= 10; s++) {
                System.out.println(s + " x " + s + " = " + (j * s));
            }

//BICIESTO            
            }
            System.out.println("BISIESTO");
                 System.out.print("2008: ");
        int año = 2008;

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
        
          System.out.print("2007: ");
        int AÑO = 2007;

        if (AÑO % 4 == 0) {
            if (AÑO % 100 != 0) {
                System.out.println("El año " + AÑO + " es bisiesto.");
            } else if (AÑO % 400 == 0) {
                System.out.println("El año " + AÑO + " es bisiesto.");
            } else {
                System.out.println("El año " + AÑO + " no es bisiesto.");
            }
        } else {
            System.out.println("El año " + AÑO + " no es bisiesto.");
        }
        
        
     
//SERIE DE FIGONACHI
          System.out.println("FIGONACHI");

        int s = 20; // cantidad de números a generar
        int j = 0;
        int f = 1;

        for (int i = 1; i <= s; i++) {
            System.out.print(j + " ");

            // siguiente número es la suma de los dos anteriores
            int siguiente = j + f;
            j  = f;
            f = siguiente;
        }
        
//MULTIPLOS    
            System.out.println("MULTIPLOS");
        int numero = 7;
        int limite = 30;

        System.out.println("Múltiplos de " + numero + " hasta " + limite + ":");

        for (int i = numero; i <= limite; i += numero) {
            System.out.println(i);
        }
    
//IMPARES    

        System.out.print("número inicial:1"+ "/");
        int inicio = 1;

        System.out.print("número final:28"+ "/");
        int fin = 28;

        int contadorImpares = 0;

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 != 0) { // Si el número es impar
                contadorImpares++;
            }
        }

        System.out.println("Cantidad de números impares entre " + inicio + " y " + fin + ": " + contadorImpares);
    }
}

    
    


    


            
        
        

        
    
