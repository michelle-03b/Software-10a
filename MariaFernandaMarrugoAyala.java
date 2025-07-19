import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        // 1) Nombre y edad
        String nombre = "MARIA FERNANDA MARRUGO AYALA";
        byte edad     = 16;                   // byte
        System.out.println("1) Nombre: " + nombre + " | Edad: " + edad);

        /*------------------------------------------------------------------*/
        int num1 = 11, num2 = 11, num3= 10;             // int
        float celsius = 11f;                  // float
        long kilometros = 11L;                // long
        double radio = 11.0;                  // double

        // 2) Suma
        System.out.println("2) 11 + 11 = " + (num1 + num2));

        // 3) Resta
        System.out.println("3) 11 - 11 = " + (num1 - num2));

        // 4) Multiplicación
        System.out.println("4) 11 * 11 = " + (num1 * num2));

        // 5) División
        System.out.println("5) 11 / 11 = " + ((double) num1 / num2));

        // 6) Cuadrado de 11
        System.out.println("6) 11² = " + (num1 * num1));

        // 7) Conversión °C → °F
        float fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("7) 11 °C = " + fahrenheit + " °F");

        // 8) Perímetro de rectángulo de 11 x 10
        int perRect = 2 * (num1 + num3);
        System.out.println("8) Perímetro rectángulo 2*(11 + 10) = " + perRect);

        // 9) Área de círculo (radio 11)
        double areaCirc = Math.PI * radio * radio;
        System.out.println("9) Área círculo r=11 = " + areaCirc);

        // 10) 11 años → días
        System.out.println("10) 11 años = " + (num1 * 365) + " días");

        // 11) Doble y triple de 11
        System.out.println("11) Doble: " + (num1 * 2) + " | Triple: " + (num1 * 3));

        // 12) 11 km → metros y centímetros
        long metros = kilometros * 1_000;
        long centimetros = kilometros * 100_000;
        System.out.println("12) 11 km = " + metros + " m = " + centimetros + " cm");

        // 13) Área y perímetro de cuadrado lado 11
        int perCuad  = 4 * num1;
        int areaCuad = num1 * num1;
        System.out.println("13) Cuadrado lado 11 → Perímetro: " + perCuad + ", Área: " + areaCuad);

        // 14) Volumen de cubo lado 11
        double volCubo = Math.pow(num1, 3);
        System.out.println("14) Volumen cubo lado 11 = " + volCubo);

        // 15) Volumen de esfera radio 11
        double volEsfera = 4.0 / 3.0 * Math.PI * Math.pow(radio, 3);
        System.out.println("15) Volumen esfera r=11 = " + volEsfera);

        // 16) Suma de 1 + 2 + 3
        System.out.println("16) 1 + 2 + 3 = " + (1 + 2 + 3));

        // 17) Descuento 11 % sobre $11
        double precio = 11.0, descPct = 11.0;
        double descuento = precio * descPct / 100.0;
        System.out.println("17) Descuento 11 % a $11 → Ahorras $" + descuento +
                           " | Pagas $" + (precio - descuento));

        // 18) Propina 11 % sobre $11
        double totalCuenta = 11.0, tipPct = 11.0;
        double propina = totalCuenta * tipPct / 100.0;
        System.out.println("18) Propina 11 % de $11 = $" + propina);
   
    
    }
}