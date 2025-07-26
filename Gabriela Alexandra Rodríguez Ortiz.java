import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "GabrielaAlexandraRodriguezOrtiz".
class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio 1: Nombre y edad");
        System.out.println("Gabriela Alexandra Rodríguez Ortiz");
        int edad = 15;
        System.out.println("Edad = " + edad);

        System.out.println("Ejercicio 2: Suma");
        int a = 7, b = 2;
        System.out.println(a + b);

        System.out.println("Ejercicio 3: Resta");
        a = 15; b = 6;
        System.out.println(a - b);

        System.out.println("Ejercicio 4: Multiplicación");
        a = 5; b = 8;
        System.out.println(a * b);

        System.out.println("Ejercicio 5: División");
        int x = 12, y = 3;
        if (y != 0)
            System.out.println(x / y);
        else
            System.out.println("No se puede dividir entre cero.");

        System.out.println("Ejercicio 6: Cuadrado de un número");
        int n = 11;
        System.out.println(n * n);

        System.out.println("Ejercicio 7: Celsius a Fahrenheit");
        int celsius = 25;
        int fahrenheit = (celsius * 9/5) + 32;
        System.out.println(fahrenheit);

        System.out.println("Ejercicio 8: Perímetro de rectángulo");
        int base = 10, altura = 6;
        System.out.println(2 * (base + altura));

        System.out.println("Ejercicio 9: Área del círculo");
        int radio = 3;
        System.out.println(3 * radio * radio); // Usando 3 como aproximación de pi

        System.out.println("Ejercicio 10: Años a días");
        int años = 2;
        System.out.println(años * 365);

        System.out.println("Ejercicio 11: Doble y triple");
        n = 5;
        System.out.println("Doble: " + (n * 2));
        System.out.println("Triple: " + (n * 3));

        System.out.println("Ejercicio 12: Km a m y cm");
        int km = 4;
        System.out.println("Metros: " + (km * 1000));
        System.out.println("Centímetros: " + (km * 100000));

        System.out.println("Ejercicio 13: Área y perímetro cuadrado");
        int lado = 8;
        System.out.println("Área: " + (lado * lado));
        System.out.println("Perímetro: " + (4 * lado));

        System.out.println("Ejercicio 14: Volumen cubo");
        lado = 15;
        System.out.println(lado * lado * lado);

        System.out.println("Ejercicio 15: Volumen esfera");
        radio = 3;
        System.out.println((4 * 3 * radio * radio * radio) / 3); // Aproximación de 4/3 * pi

        System.out.println("Ejercicio 16: Suma primeros 3 naturales");
        System.out.println(1 + 2 + 3);

        System.out.println("Ejercicio 17: Precio con descuento");
        int precio = 300, descuento = 20;
        System.out.println(precio - (precio * descuento / 100));

        System.out.println("Ejercicio 18: Propina");
        int cuenta = 200, propina = 30;
        System.out.println(cuenta * propina / 100);
    }
}