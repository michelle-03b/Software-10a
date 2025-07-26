import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        System.out.println("TABLAS DE MULTIPLICAR");
          System.out.println("                     ");
        for (int m = 1; m <= 10; m++) {
            System.out.println("Tabla del " + m + ":");
           
            // Tabla interna: del 1 al 10
            for (int c = 1; c <= 12; c++) {
                System.out.println(m + " x " + c + " = " + (m * c));
            }}
           
        System.out.println("AÑO BICIESTO");
        System.out.print("2020:");
        int año = 2020;
        if (año % 4 == 0) {
        if (año % 100 != 0) {
        System.out.println("El año " + año  + " es bisiesto.");
        } else if (año % 400 == 0) {
        System.out.println("El año " + año + " es bisiesto.");
        } else {
        System.out.println("El año " + año + " no es bisiesto.");
        }
        } else {
        System.out.println("El año " + año + " no es bisiesto.");
        }
        System.out.print("2005:");
        int year = 2005;
        if (year % 4 == 0) {
        if (year % 100 != 0) {
        System.out.println("El año " + year  + " es bisiesto.");
        } else if (año % 400 == 0) {
        System.out.println("El año " + year + " es bisiesto.");
        } else {
        System.out.println("El año " + year + " no es bisiesto.");
        }
        } else {
        System.out.println("El año " + year + " no es bisiesto.");
        }
       
        System.out.println("SERIE FIGONACCHI");
        int n = 20;
        int h = 0;
        int b = 1;
        System.out.println("posición 20:");
        for (int i = 1; i <= n; i++) {
            System.out.print(h + " ");
            int siguiente = h + b;
            h = b;
            b = siguiente;
            }

        System.out.println("MULTIPLOS DEL 6");
        int num = 6;
        int lim = 50;
        for (int r = num; r <= lim; r += num) {
            System.out.println(r);
        }

        System.out.print("IMPARES DENTRO DE UN RANGO: ");
        int inicio = 1;
        int fin = 45;
        int contadorImpares = 0;
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 != 0) { // Si el número es impar
                contadorImpares++;
            }
        }
    
        System.out.println(contadorImpares);
    }
}