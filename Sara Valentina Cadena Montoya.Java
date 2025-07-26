import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
  public class Main {
    public static void main(String[] args) {
        // 1. Imprimir tu nombre y edad
        String name = "Sara";
        int edad = 15;
        System.out.println("/n1. Imprimir tu nombre y edad.");
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + edad);

        // 2. Calcular la suma de dos números
        int numero1 = 25;
        int numero2 = 9;
        int suma = numero1 + numero2;
        System.out.println("\n2. Calcular la suma de dos números.");
        System.out.println("Suma: " + suma);

        // 3. Restar dos números ingresados por el usuario
        int resta = numero1 - numero2;
        System.out.println("\n3. Restar dos números ingresados por el usuario.");
        System.out.println("Resta: " + resta);

        // 4. Multiplicar dos números y mostrar el resultado
        int multiplicacion = numero1 * numero2;
        System.out.println("\n4. Multiplicar dos números.");
        System.out.println("Multiplicación: " + multiplicacion);

        // 5. Dividir dos números y mostrar el cociente
        double division = (double) numero1 / numero2;
        System.out.println("\n5. Dividir dos números.");
        System.out.println("División: " + division);

        // 6. Calcular el cuadrado de un número
        int numero = 7;
        int cuadrado = numero * numero;
        System.out.println("\n6. Calcular el cuadrado de un número.");
        System.out.println("El cuadrado de " + numero + " es: " + cuadrado);

        // 7. Convertir grados Celsius a Fahrenheit
        double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("\n7. Convertir grados Celsius a Fahrenheit.");
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        // 8. Calcular el perímetro de un rectángulo
        int base = 10;
        int altura = 5;
        int perimetro = 2 * (base + altura);
        System.out.println("\n8. Calcular el perímetro de un rectángulo.");
        System.out.println("Perímetro: " + perimetro);

        // 9. Calcular el área de un círculo
        double radio = 4;
        double areaCirculo = 31416 * (radio * radio);
        System.out.println("\n9. Calcular el área de un círculo.");
        System.out.println("Área del círculo: " + areaCirculo);

        // 10. Convertir años a días
        int años = 3;
        int dias = años * 365;
        System.out.println("\n10. Convertir años a días.");
        System.out.println(años + " años son " + dias + " días.");

        // 11. Calcular el doble y el triple de un número ingresado
        int numero3 = 8;
        int doble = numero3 * 2;
        int triple = numero3 * 3;
        System.out.println("\n11. Calcular el doble y el triple de un número.");
        System.out.println("Número: " + numero3);
        System.out.println("Doble: " + doble);
        System.out.println("Triple: " + triple);

       
        // 12. Convertir kilómetros a metros y centímetros
        double kilometros = 2.5;
        double metros = kilometros * 1000;
        double centimetros = kilometros * 100000;
        System.out.println("\n12. Convertir kilómetros a metros y centímetros.");
        System.out.println( kilometros + " km = " + metros + " m = " + centimetros + " cm");

        // 13. Calcular el área y el perímetro de un cuadrado
        int lado = 6;
        int areaCuadrado = lado * lado;
        int perimetroCuadrado = 4 * lado;
        System.out.println("\n13. Calcular el área y el perímetro de un cuadrado.");
        System.out.println("Área del cuadrado: " + areaCuadrado);
        System.out.println("Perímetro del cuadrado: " + perimetroCuadrado);

        // 14. Calcular el volumen de un cubo
        double volumenCubo = lado * lado * lado;  
        System.out.println("\n14. Calcular el volumen de un cubo .");
        System.out.println("Volumen del cubo: " + volumenCubo);

        // 15. Calcular el volumen de una esfera
        double radioesfera = 4;
        double volumenEsfera = (4.0/3) * 31416 * radio * radio * radio;
        System.out.println("\n15. Calcular el volumen de una esfera .");
        System.out.println("Volumen de la esfera: " + volumenEsfera);

        // 16. Sumar los tres primeros números naturales
        int sumaNaturales = 1 + 2 + 3;
        System.out.println("\n16. Sumar los tres primeros números naturales .");
        System.out.println("Suma de los 3 primeros naturales: " + sumaNaturales);

         // 17. Calcular el descuento aplicado a una compra
        System.out.println("17. Calcular el descuento aplicado a una compra.");
        System.out.println("Precio final: " + (130000 - (130000 * 10 / 100)));
   
     // 18. Calcular la propina a dejar en un restaurante
    System.out.println("18. Calcular la propina a dejar en un restaurante");
    System.out.println("Total a pagar: " + (60000 + ( 60000 * 15 / 100)));
    }
}
