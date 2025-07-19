import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        System.out.println("PUNTO 1");
        String name= "Alisson Andrea Bucuru Contreras";
        String age= "15";
             System.out.println("mi nombre es:" + name);
             System.out.println("mi edad es:" + age);

        int a= 15;
        int b= 18;
        int c= 2;
        int d= 4;
        int KM= 12;
        double y= 3.14;
        double g= 1.333;
        double valor = 500;
        double descuento = 0.40;
        double precioDescuento = valor * descuento;
        double precioFinal = valor - precioDescuento;
        double Cuenta = 60000;
        double Propina = 0.15;
        double valorPropina = Cuenta * Propina;
        double totalFinal = Cuenta + valorPropina;

        
        System.out.println("PUNTO 2");
        System.out.println("la suma es:" + (a+b));
        System.out.println("PUNTO 3");
        System.out.println("la resta es:" + (a-b));
        System.out.println("PUNTO 4");
        System.out.println("la multiplicación es:" + (a*b));
        System.out.println("PUNTO 5");
        System.out.println("la división es:" + (b/c));
        System.out.println("PUNTO 6");
        System.out.println("el cuadrado de 15 es:" + (a*a));
        System.out.println("PUNTO 7");
        System.out.println("18 grados celcius a Fahrenheit son: " + ((b * 9/5) + 32) + "°");
        System.out.println("PUNTO 8");
        System.out.println("el perimetro de un rectangulo de 15cm x 18cm es:" + (a + b + a + b) + "cm");
        System.out.println("PUNTO 9");
        System.out.println("el área de un circulo de 15cm de radio:" + (3.14*c*c) + "cm"); 
        System.out.println("PUNTO 10");
        System.out.println("5 años son:" + (365*d + 366) + "días");
        System.out.println("PUNTO 11");
        System.out.println("doble de 18:" + (c*b));
        System.out.println("triple de 18:" + (3*b));
        System.out.println("PUNTO 12");
        System.out.println("12 kilometros a metros son:" + (KM*1000) + "m");
        System.out.println("12 kilometros a centimetros" + (KM*100000) + "cm");
        System.out.println("PUNTO 13");
        System.out.println("el perimetro de un cuadrado de 4cm x 4cm es:" + (d + d + d + d) + "cm");
        System.out.println("el área de un cuadrado de 4cm x 4cm es:" + (d *d) + "cm²");
        System.out.println("PUNTO 14");
        System.out.println("el volumen de un cubo de 2cm es: " + (c * c * c) + "cm³");
        System.out.println("PUNTO 15");
        System.out.println("el volumen de una esfera de 4cm de radio:" + (g*y*d*d*d) + "cm³");
        System.out.println("PUNTO 16");
        System.out.println("la suma de naturales es:" + (1+2+3));
        System.out.println("PUNTO 17");
        System.out.println("descuento aplicado a una compra:");
        System.out.println("Descuento: " + precioDescuento);
        System.out.println("Precio final: " + precioFinal);
        System.out.println("PUNTO 18");
        System.out.println("Calcular la propina a dejar en un restaurante:");
        System.out.println("Propina: " + valorPropina);
        System.out.println("Total con propina: " + totalFinal);
    }
}