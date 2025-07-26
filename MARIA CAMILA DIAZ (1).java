import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        String nombre= "Maria Camila Diaz Betancourt";
         String edad="15 años";
        int a = 13;
        int b = 22;
        int c = 77;
        int d = 7;
        int celcius = 19;
        int lado1 = 88;
        int lado2 = 19;
        int radio = 14;
        double pi = 3.14159265358979323846;
        double div = 4.0/3;
        double descuento = 0.6;
        double propina = 18.0;
        int años = 3;
        int dias = 365;
        int km = 54;
        
        System.out.println("Punto uno: Edad y Nombre");
        System.out.println("Me llamo " + nombre);
        System.out.println("y tengo " + edad);
System.out.println("            ");
        
        System.out.println("Punto dos: La suma de 13 + 22");
        System.out.println("La suma es " + (a + b));
System.out.println("            ");
        
       System.out.println("Punto tres: La resta de 77 - 7");
       System.out.println("La resta es " + (c - d));
System.out.println("            "); 
        
       System.out.println("Punto Cuatro: La multiplicaciòn de 13 * 7");
       System.out.println("La multiplicaciòn es " + (a * d));
System.out.println("            ");   
        
       System.out.println("Punto Cinco: La divisiòn de 77 entre 7");
       System.out.println("La divisiòn es: " + (c / d));
System.out.println("            ");
        
       System.out.println("Punto Seis: El cuadrado de 7");
       System.out.println("El cuadrado de 7: " + d*d);
System.out.println("            ");    
        
       System.out.println("Punto Siete: Convertir grados Celcius a Fahrenheit");
       System.out.println("19 grados celcius a Fahrenheit son: " + ((celcius * 9/5) + 32));
System.out.println("            ");   
        
       System.out.println("Punto Ocho: Perimetro de un rectàngulo");
       System.out.println("El perimetro de un rectàngulo de " + lado1 + "cm de altura"+ lado2 + "cm");
       System.out.println(lado1 + lado1 + lado2 + lado2);
System.out.println("            "); 
        
       System.out.println("Punto Nueve: Calcular el àrea de un cìrculo");
       System.out.println("Radio = " + radio);
       System.out.println("La àrea del circulo es " + pi * (radio * radio));
System.out.println("            ");  
        
       System.out.println("Punto Diez: Convertir  3 años a Dìas");
       System.out.println((años * dias) +  " dias");
System.out.println("            ");  
        
       System.out.println("Punto Once: Calcular el doble y el triple de un nùmero ingresado: 7");
       System.out.println("El doble de 7 es " + (7*2) + " y el triple de 7 es " + (7*3) );
System.out.println("            ");
        
       System.out.println("Punto Doce: Convertir kilómetros a metros y centímetros: " + km + " kilómetros");
       System.out.println(km  + "Kilómetros a metros son: " + (km * 1000) + " metros ");
       System.out.println(km  + "kilómetros a centímetros son: " + (km * 100000) + " centímetros ");
System.out.println("            ");
        
       System.out.println("Punto Trece: Calcular el área y el perimetro de un cuadrado que sus lados midan " + lado2 + " metros.");
       System.out.println("El área de este cuadrado mide: " + (lado2 * lado2) + " metros cuadrados");
       System.out.println("El perimetro de este cuadrado mide " + (lado2 + lado2 + lado2 + lado2) + " metros");
System.out.println("            ");
        
       System.out.println("Punto catorce: Calcular el volumen de un cubo donde sus lados midan: " + lado2 + "centímetros.");
       System.out.println("El volumen del cubo es igual a: " + (lado2 * lado2 * lado2 ) + " centímetros cubicos.");
System.out.println("            ");
        
       System.out.println("Punto Quince: Calcular el volumen de una esfera, donde su radio mida: " + lado1 + " centímetros: ");
       System.out.println("El volumen de esta esfera es igual a: " + (div * pi * lado1 * lado1 * lado1  ) +  " centímetros cubicos. ");
System.out.println("            ");
        
       System.out.println("Punto Dieciseis: Sumar los primeros 3 números naturales: ");
       System.out.println("El resultado es igual a: " + ( 1 + 2 + 3));
System.out.println("            ");
        
       System.out.println("Punto Diecisiete: Calcular el 0.5 % descuento aplicado a una compra de 179 mil pesos");
       System.out.println("El descuento a aplicado a la compra es igual a una reducción de precio de: " + (179000 * descuento) + " mil pesos.");
       System.out.println("Es decir la compra es igual a: " + (179000 - (179000 * descuento) + " mil pesos."));
System.out.println("            ");
        
       System.out.println("Punto Dieciocho: Calcular la propina a dejar en un restaurante (total y % deseado)");
    System.out.println("supongamos que la cuenta en un restaurante hay que pagar 180 mil pesos, y se quiere dejar una propina del 18 %" );
      System.out.println("Se dejaria como propina: " + (180.0 * propina) + " mil pesos");
        
 
    }
}