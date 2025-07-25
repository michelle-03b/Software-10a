import java.util.*;

class Main {
    public static void main(String[] args) {
        // Variables para las tablas
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int g = 7;
        int h = 8;
        int i = 9;
        int j = 10;

        System.out.println("TABLA DEL 1");
        System.out.println("1x1=" + a * a);
        System.out.println("1x2=" + a * b);
        System.out.println("1x3=" + a * c);
        System.out.println("1x4=" + a * d);
        System.out.println("1x5=" + a * e);
        System.out.println("1x6=" + a * f);
        System.out.println("1x7=" + a * g);
        System.out.println("1x8=" + a * h);
        System.out.println("1x9=" + a * i);
        System.out.println("1x10=" + a * j);

        System.out.println("TABLA DEL 2");
        System.out.println("2x1=" + b * a);
        System.out.println("2x2=" + b * b);
        System.out.println("2x3=" + b * c);
        System.out.println("2x4=" + b * d);
        System.out.println("2x5=" + b * e);
        System.out.println("2x6=" + b * f);
        System.out.println("2x7=" + b * g);
        System.out.println("2x8=" + b * h);
        System.out.println("2x9=" + b * i);
        System.out.println("2x10=" + b * j);

        System.out.println("TABLA DEL 3");
        System.out.println("3x1=" + c * a);
        System.out.println("3x2=" + c * b);
        System.out.println("3x3=" + c * c);
        System.out.println("3x4=" + c * d);
        System.out.println("3x5=" + c * e);
        System.out.println("3x6=" + c * f);
        System.out.println("3x7=" + c * g);
        System.out.println("3x8=" + c * h);
        System.out.println("3x9=" + c * i);
        System.out.println("3x10=" + c * j);

        System.out.println("TABLA DEL 4");
        System.out.println("4x1=" + d * a);
        System.out.println("4x2=" + d * b);
        System.out.println("4x3=" + d * c);
        System.out.println("4x4=" + d * d);
        System.out.println("4x5=" + d * e);
        System.out.println("4x6=" + d * f);
        System.out.println("4x7=" + d * g);
        System.out.println("4x8=" + d * h);
        System.out.println("4x9=" + d * i);
        System.out.println("4x10=" + d * j);

        System.out.println("TABLA DEL 5");
        System.out.println("5x1=" + e * a);
        System.out.println("5x2=" + e * b);
        System.out.println("5x3=" + e * c);
        System.out.println("5x4=" + e * d);
        System.out.println("5x5=" + e * e);
        System.out.println("5x6=" + e * f);
        System.out.println("5x7=" + e * g);
        System.out.println("5x8=" + e * h);
        System.out.println("5x9=" + e * i);
        System.out.println("5x10=" + e * j);

        System.out.println("TABLA DEL 6");
        System.out.println("6x1=" + f * a);
        System.out.println("6x2=" + f * b);
        System.out.println("6x3=" + f * c);
        System.out.println("6x4=" + f * d);
        System.out.println("6x5=" + f * e);
        System.out.println("6x6=" + f * f);
        System.out.println("6x7=" + f * g);
        System.out.println("6x8=" + f * h);
        System.out.println("6x9=" + f * i);
        System.out.println("6x10=" + f * j);

        System.out.println("TABLA DEL 7");
        System.out.println("7x1=" + g * a);
        System.out.println("7x2=" + g * b);
        System.out.println("7x3=" + g * c);
        System.out.println("7x4=" + g * d);
        System.out.println("7x5=" + g * e);
        System.out.println("7x6=" + g * f);
        System.out.println("7x7=" + g * g);
        System.out.println("7x8=" + g * h);
        System.out.println("7x9=" + g * i);
        System.out.println("7x10=" + g * j);

        System.out.println("TABLA DEL 8");
        System.out.println("8x1=" + h * a);
        System.out.println("8x2=" + h * b);
        System.out.println("8x3=" + h * c);
        System.out.println("8x4=" + h * d);
        System.out.println("8x5=" + h * e);
        System.out.println("8x6=" + h * f);
        System.out.println("8x7=" + h * g);
        System.out.println("8x8=" + h * h);
        System.out.println("8x9=" + h * i);
        System.out.println("8x10=" + h * j);

        System.out.println("TABLA DEL 9");
        System.out.println("9x1=" + i * a);
        System.out.println("9x2=" + i * b);
        System.out.println("9x3=" + i * c);
        System.out.println("9x4=" + i * d);
        System.out.println("9x5=" + i * e);
        System.out.println("9x6=" + i * f);
        System.out.println("9x7=" + i * g);
        System.out.println("9x8=" + i * h);
        System.out.println("9x9=" + i * i);
        System.out.println("9x10=" + i * j);

        System.out.println("TABLA DEL 10");
        System.out.println("10x1=" + j * a);
        System.out.println("10x2=" + j * b);
        System.out.println("10x3=" + j * c);
        System.out.println("10x4=" + j * d);
        System.out.println("10x5=" + j * e);
        System.out.println("10x6=" + j * f);
        System.out.println("10x7=" + j * g);
        System.out.println("10x8=" + j * h);
        System.out.println("10x9=" + j * i);
        System.out.println("10x10=" + j * j);

        // Año bisiesto
        System.out.println("¿CÓMO SABER SI UN AÑO ES BISIESTO?");
        int año = 2024;
        String resultado = (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) ? "Es bisiesto" : "No es bisiesto";
        System.out.println("El año " + año + ": " + resultado);

        // Serie Fibonacci
        System.out.println("FIBONACCI SERIE");
        int f1 = 1;
        int f2 = 1;
        System.out.print(f1 + " " + f2 + " ");
        int siguiente;
        int contador = 2;
        while (contador < 20) {
            siguiente = f1 + f2;
            System.out.print(siguiente + " ");
            f1 = f2;
            f2 = siguiente;
            contador++;
        }
        System.out.println();

        // Imprimir números desde x hasta y
        System.out.println("DADO UN NÚMERO X IMPRIMA TODOS LOS NÚMEROS DE DICHO HASTA EL LIMITE Y");
        int x = 3;
        int y = 9;
        while (x <= y) {
            System.out.println(x);
            x++;
        }

        // Cantidad de números impares dentro de un rango
        System.out.println("LA CANTIDAD DE NÚMEROS IMPARES QUE HAY DENTRO DE UN RANGO");
        int inicio = 3;
        int fin = 15;
        int cantidadImpares = 0;

        while (inicio <= fin) {
            if (inicio % 2 != 0) {
                cantidadImpares++;
            }
            inicio++;
        }

        System.out.println("Cantidad de números impares: " + cantidadImpares);
    }
}
