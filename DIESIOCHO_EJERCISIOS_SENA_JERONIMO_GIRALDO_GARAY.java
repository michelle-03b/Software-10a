import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        System.out.println("EJERCISIOS SENA");
        System.out.println(" ");
        String a="Jeronimo";
        String b="Giraldo";        
        String c="Garay";
        int z=15;
        System.out.println("PRIMER EJERCICIO  -  "+"Nombre : "+a+" "+b+" "+c+" ------ Edad : "+z);
        int d=60;
        int e=40;
        System.out.println("SEGUNDO EJERCICIO -  "+"Suma dos numeros :  60 + 40  = "+(d+e));
        int f=140;
        int g=40;
        System.out.println("TERCER EJERCICIO  -  "+"Resta de dos numeros :  140 - 40  = "+(f-g));
        int h=20;
        int i=5;
        System.out.println("CUARTO EJERCICIO  -  "+"Multiplicacion de dos numeros :  20 x 5  = "+(h*i));
        int j=10;
        int k=1000;        
        System.out.println("QUINTO EJERCICIO  -  "+"Dividsion de dos numeros :  1000 / 10  = "+(k/j));
        System.out.println("SEXTO EJERCICIO   -  "+"Cuadrado de un numero :  10^2 = "+(j*j));
        System.out.println("SEPTIMO EJERCICIO -  "+"Grados Celsius a Farenheit :  ( 40°C x 9/5 ) + 32 "+" = "+((40*9/5)+32)+"°F");
        System.out.println("OCTAVO EJERCICIO  - "+"Perimetro de un rectacngulo : 40m + 40m + 60m + 60m = "+(40+40+60+60)+"m");
        double pi=3.14159265359;
        System.out.println("NOVENO EJERCICIO  - "+"Area de un circulo : (radio : 20m) π x 20m^2 = "+(pi*(20*20))+"m (aproximadamente)");  
        System.out.println("DECIMO EJERCICIO  - "+"Años a dias : 2 años / 365 dias = "+(2*365)+" dias");  
        System.out.println("ONCEAVO EJERCICIO  - "+"Doble y triple de un numero : Doble : 10 * 2 = "+(10*2)+"/ Triple : 10 * 3 = "+(10*3) );
  
        System.out.println("TRECEAVO EJERCISIO - Calcular el volumen de un cubo");
        double ladoX = 5.0;
        double volumenCubo = ladoX * ladoX * ladoX; 
        System.out.println("Si un cubo tiene por lado la longitud de = " + ladoX);
        System.out.println("El volumen del cubo es = " + volumenCubo);
        System.out.println(" ");

        System.out.println("CATORCEAVO EJERCISIO - Calcular el area de un cuadrado");
        int lado1=10;
        System.out.println("Si un cuadrado tiene un lado de = "+lado1);
        int areacuadrado=lado1+lado1+lado1+lado1;
        System.out.println("Y teniendo en cuenta que todos sus lados son iguales su area seria = "+areacuadrado);
        System.out.println(" ");
    
        System.out.println("QUINCEAVO EJERCISIO - Calcular el volumen de una esfera");
        double radioEsfera = 3.0;
        double Pi = 3.14159;
        double volumenEsfera = (4.0 / 3.0) * Pi * radioEsfera * radioEsfera * radioEsfera;
        System.out.println("El radio de la esfera es: " + radioEsfera);
        System.out.println("El volumen de la esfera es: " + volumenEsfera);
        System.out.println(" ");

        System.out.println("DIECISEISAVO EJERCISIO - Calcular la suma de los primeros 3 numeros naturales");
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int sumaNaturales = num1 + num2 + num3; // Cálculo directo
        System.out.println("Los primeros tres números naturales son = " + num1 + ", " + num2 + ", " + num3);
        System.out.println("La suma de los tres primeros números naturales es = " + sumaNaturales);
        System.out.println(" ");


        System.out.println("DIECIETEAVO EJERCISIO - Calcular descuento de una compra");
        double precioCompra = 150.0;
        double porcentajeDescuento = 10.0;
        double valorDescuento = precioCompra * (porcentajeDescuento / 100.0);
        double precioFinalCompra = precioCompra - valorDescuento;
        System.out.println("El precio original de la compra es = " + precioCompra);
        System.out.println("El porcentaje de descuento es = " + porcentajeDescuento + "%");
        System.out.println("El monto del descuento es =" + valorDescuento);
        System.out.println("El precio final con descuento es = " + precioFinalCompra);
        System.out.println(" ");

    
        System.out.println("DIECIOCHOAVO EJERCISIO - Calcular la propina en un restaurante");
            System.out.println(" ");
        double totalComida = 85.50;
        double porcentajePropina = 15.0;
        double montoPropina = totalComida * (porcentajePropina / 100.0);
        double totalAPagar = totalComida + montoPropina;
        System.out.println("El total de la cuenta del restaurante es de = " + totalComida);
        System.out.println("El porcentaje de propina deseado es = " + porcentajePropina + "%");
        System.out.println("El monto de la propina es = " + montoPropina);
        System.out.println("El total a pagar incluyendo la propina es = " + totalAPagar);

        
    }
}