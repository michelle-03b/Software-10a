import java.util.*;

class Main {
    public static void main(String[] args) {
        System.out.println("PRIMER PUNTO");
        System.out.println("Ingresar el nombre y edad");
        String name = "Juan Esteban";
        int edad = 15;
        System.out.println(name);
        System.out.println(edad);

        System.out.println("SEGUNDO PUNTO");
        System.out.println("Calcular la suma de dos números");
        int numero1 = 5;
        int numero2 = 7;
        System.out.println(numero1 + numero2);

        System.out.println("TERCER PUNTO");
        System.out.println("Calcular la resta de dos números");
        int numero3 = 20;
        int numero4 = 8;
        System.out.println(numero3 - numero4);

        System.out.println("CUARTO PUNTO");
        System.out.println("Calcular la multiplicación de dos números");
        int numero5 = 6;
        int numero6 = 11;
        System.out.println(numero5 * numero6);

        System.out.println("QUINTO PUNTO");
        System.out.println("Calcular la división de dos números");
        double numero7 = 25;
        double numero8 = 4;
        System.out.println(numero7 / numero8);

        System.out.println("SEXTO PUNTO");
        System.out.println("Calcular el cuadrado de un número");
        int numero9 = 9;
        System.out.println(numero9 * numero9);

        System.out.println("SÉPTIMO PUNTO");
        System.out.println("Convertir grados Celsius a Fahrenheit");
        double n1 = 30;
        System.out.println(n1 * 9 / 5 + 32);

        System.out.println("OCTAVO PUNTO");
        System.out.println("Calcular el perímetro de un rectángulo");
        int largo = 10;
        int ancho = 4;
        System.out.println(2 * (largo + ancho));

        System.out.println("NOVENO PUNTO");
        System.out.println("Calcular el área de un círculo");
        double pi = 3.1416;
        int radioCirculo = 12;
        System.out.println(pi * radioCirculo * radioCirculo);

        System.out.println("DÉCIMO PUNTO");
        System.out.println("Convertir años a días");
        int años = 20;
        System.out.println((años * 365) + " días");

        System.out.println("UNDÉCIMO PUNTO");
        System.out.println("Calcular el doble y el triple de un número");
        int numero = 7;
        System.out.println("doble = " + (numero * 2));
        System.out.println("triple = " + (numero * 3));

        System.out.println("DUODÉCIMO PUNTO");
        System.out.println("Convertir kilómetros a metros y a centímetros");
        int km = 9;
        System.out.println("km a m = " + (km * 1000));
        System.out.println("km a cm = " + (km * 100000));

        System.out.println("DECIMOTERCER PUNTO");
        System.out.println("Calcular el área y el perímetro de un cuadrado");
        int lado = 5;
        System.out.println("área = " + (lado * lado));
        System.out.println("perímetro = " + (4 * lado));

        System.out.println("DECIMOCUARTO PUNTO");
        System.out.println("Calcular el volumen de un cubo");
        int l = 4;
        System.out.println(l * l * l);

        System.out.println("DECIMOQUINTO PUNTO");
        System.out.println("Calcular el volumen de una esfera");
        double radioEsfera = 6;
        double volumenEsfera = (4.0 / 3) * pi * Math.pow(radioEsfera, 3);
        System.out.println(String.format("%.2f", volumenEsfera));

        System.out.println("DECIMOSEXTO PUNTO");
        System.out.println("Sumar los tres primeros números naturales");
        System.out.println(1 + 2 + 3);

        System.out.println("DECIMOSÉPTIMO PUNTO");
        System.out.println("Calcular el descuento aplicado a una compra (precio y % de descuento)");
        int precioCompra = 500_000;
        int porcentajeDescuento = 15;
        double descuento = precioCompra * (porcentajeDescuento / 100.0);
        double precioFinal = precioCompra - descuento;
        System.out.println("Descuento: $" + String.format("%,.0f", descuento));
        System.out.println("Precio Final: $" + String.format("%,.0f", precioFinal));

        System.out.println("DECIMOOCTAVO PUNTO");
        System.out.println("Calcular la propina a dejar en un restaurante (total y % deseado)");
        int cuenta = 120_000;
        double porcentajePropina = 10.0;
        double valorPropina = cuenta * (porcentajePropina / 100);
        double totalPagar = cuenta + valorPropina;
        System.out.println("Valor de la cuenta: $" + String.format("%,d", cuenta));
        System.out.println("Propina: $" + String.format("%,.0f", valorPropina));
        System.out.println("Total a pagar: $" + String.format("%,.0f", totalPagar));
    }
}