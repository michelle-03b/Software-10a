import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.println("__Ejercicio 1, NOMBRE__");
        String name="Sebastian Gil Moreno";
                int edad=15;
                
      System.out.println(name);
      System.out.println(edad);
            System.out.println("__Ejercicio 2, SUMA____");

      int a=777;
      int b=222;
       System.out.println("777 + 222 =");
            System.out.println(a + b);
            System.out.println("__Ejercicio 3, RESTA___");
int k=500;
int g=200;
 System.out.println("500 - 200 =");
      System.out.println(k - g);
      System.out.println("__Ejercicio 4, MULTIPLICACION__");
      int l=8;
      int m=5;
       System.out.println("8 x 5 =");
            System.out.println(l * m);
            System.out.println("__Ejercicio 5, DIVISION__");
            
            int p=100;
            int t=4;
             System.out.println("100 / 4 =");
                   
            System.out.println(p / t);
            System.out.println("__Ejercicio 6,CUADRADO___");
            System.out.println("2^ =");
            int r=2;
                    System.out.println(r * r);
                
                  
                  System.out.println("__Ejercicio 7,GRADOS___");  
                  System.out.println("(10 °C × 9/5) + 32 =");
                  int cv=10;
                  int cb=9;
                  int cm=5;
                  int cn=32;
                  System.out.println(cv * 9 / 5 + 32 +" Farenheit");
                   System.out.println("__Ejercicio 8,RECTANGULO___"); 
                    System.out.println("ALTURA = 2"); 
                    System.out.println("BASE = 5"); 
                    int qw=2;
                    int qe=5;
         System.out.println("Lado + lado + lado + lado"); 
         System.out.println(qw + qw + qe + qe); 
                            System.out.println("__Ejercicio 9,CIRCULO__"); 
                             System.out.println("Radio= 15cm"); 
                              System.out.println("3.14 x 15cm^2 ="); 
                              double op=3.14;
                              int po=15;
                            
                               System.out.println(op * po * po +" Area total"); 
    System.out.println("__Ejercicio 10,AÑOS EN DIAS__"); 
    int años=6;
    int dias=365;
                                System.out.println("6 años x 365 dias ="); 

    System.out.println(años * dias); 
       System.out.println("__Ejercicio 11,DOBLE TRIPLE__"); 
    System.out.println("El doble y triple del numero 5"); 
    int we=5;
    int wr=2;
            int wt=3;
                                         System.out.println("Doble ="); 

                                         System.out.println(we * wr); 
     System.out.println("Triple ="); 

     System.out.println(we * wt); 
        
     System.out.println("_Ejercicio 12,  Convertir kilómetros a metros y centímetros__");
        int sa=10;
    System.out.println(sa+"km a m");   
        System.out.println(sa*1000+"m");
        System.out.println(sa+"km a cm");
        System.out.println(sa*100000+"cm");
        
 System.out.println("_Ejercicio 13,   Calcular el área y el perímetro de un cuadrado.__");
    System.out.println("b x h = a");   
        int perro=5;
    System.out.println("b= " + perro);   
    System.out.println("h= " + perro);   
    System.out.println(perro * perro);   
    System.out.println("b + b + h + h");   

 System.out.println(perro + perro + perro + perro); 
        
                      System.out.println("_Ejercicio 14, Calcular el volumen de un cubo_");
        int equisde=8;
                              System.out.println("L= "+ equisde);

 System.out.println("V= LxLxL");
                      System.out.println(equisde*equisde*equisde);
        
                                 System.out.println("_Ejercicio 15, Calcular el volumen de una esfera._");
        int olo=7;
            System.out.println("V= 4/3 x π x r x r x r " );  
                    System.out.println("r= "+  olo + "m" );  
                           

                    System.out.println("V= "+ 4 / 3 * 3.14 * olo * olo * olo);  
                System.out.println("_Ejercicio 16,  Sumar los tres primeros números naturales_");
        int pap=1;
        int pep=2;
        int pip=3;
                            System.out.println(pap + "+" + pep + "+" + pip );  
                            System.out.println(pap + pep + pip );  
System.out.println("_Ejercicio 17,  Calcular el descuento aplicado a una compra (precio y % de descuento)_");
                                    System.out.println("Camisa= 70000$" );  

       
        double numero = 70000;
        double porcentaje = 25;

        // Calcular el porcentaje
        double resultado = (porcentaje / 100) * numero;

        // Mostrar el resultado
        System.out.println(porcentaje + "% de " + numero + " es = " + resultado);
                                    System.out.println("70000 - 17500 =" );  

                            System.out.println(numero - 17500 );  
System.out.println("_Ejercicio 18,  Calcular la propina a dejar en un restaurante (total y % deseado)._");
                                    System.out.println("Cuenta total= 250000$" );  
                                            System.out.println("Propina= 8%" );  

                                     double cuenta = 250000;
                                     double propina = 8;
                double propinas = (propina / 100) * cuenta;
                System.out.println(propina + "% de " + cuenta + " es = " + propinas);

    }
}
