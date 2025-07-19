import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {camilarojas}
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    System.out.println("primer punto");
        System.out.println("Ingresar el nombre y edad");
        String name= "camila rojas";
        int edad= 16;
        System.out.println(name);
        System.out.println(edad);


        System.out.println("segundo punto");
        System.out.println("Calcular la suma de dos numeros");
        int numero1= 10;
        int numero2= 6;
        System.out.println(numero1+numero2);


        System.out.println("tercer punto");
        System.out.println("Calcular la resta de dos numeros");
        int numero3=19;
        int numero4= 4;
        System.out.println(numero3-numero4);


        System.out.println("cuarto punto");
        System.out.println("Calcular la multiplicación de dos numeros");
        int numero5= 12;
        int numero6= 22;
        System.out.println(numero5*numero6);


        System.out.println("quinto punto");
        System.out.println("Calcular la división de dos numeros");
        double numero7= 14;
        double numero8= 7;
        System.out.println(numero7/numero8);


        System.out.println("sexto punto");
        System.out.println("Calcular el cuadrado de un numero");
        int numero9= 20;
        System.out.println(numero9*numero9);

        System.out.println("septimo punto");
        System.out.println("Convertir grados Celsius a Fahrenheit");
        double n1= 27;
        double n2= 3;
        double n3= 42;
        double n4= 36;
        System.out.println(n1* n2/ n3+ n4);


        System.out.println("octavo punto");
        System.out.println("Calcular el perimetro de un rectangulo");
        int ladolargo= 8;
        int ladoancho= 10;
        System.out.println(ladolargo +ladoancho+ ladolargo + ladoancho);


        System.out.println("noveno punto");
        System.out.println("Calcular el area de un circulo");
        double am= 3.1445;
        int r= 36;
        System.out.println(am * r * r);


        System.out.println("decimo punto");
        System.out.println("Convertir años a días");
        int a= 10;
        int c= 365;
        int t= a*d;
        System.out.println(t+ "dias");


        System.out.println("undecimo punto");
        System.out.println("Calcular el doble y el triple de un numero");
        int o= 7;
        int p= 4;
        int da= p*p;
        int t= v*v*v;
        System.out.println("doble=" +da);
        System.out.println("triple=" +t);


        System.out.println("decimosegundo punto");
        System.out.println("Convertir kilometros a metros y a centimetros");
        int k= 19;
        int me= k*1000;
        int c= k*100000;
        System.out.println("km a m=" +me);
        System.out.println("km a cm=" +c);


        System.out.println("decimotercer punto");
        System.out.println("Calcular el área y el perímetro de un cuadrado");
        int N= 23;
        //Calcular el area
        int ar= N*N;
        //Calcular el perimetro
        int pe= N*N*N*N;
        System.out.println("area=");
        System.out.println(ar);
        System.out.println("perimetro=");
        System.out.println(pe);


        System.out.println("decimocuarto punto");
        System.out.println("Calcular el volumen de un cubo");
        int L= 45;
        int vo= L*L*L;
        System.out.println(vo);


        System.out.println("decimoquinto punto");
        System.out.println("Calcular el volumen de una esfera");
        int pa= 4;
        int po= 3;
        int radio= 5;
        double j= 3.14;
        System.out.println((pa/po)*j*radio*radio*radio);


        System.out.println("decimosexto punto");
        System.out.println("Sumar los tres primeros números naturales.");
        int m= 1;
        int c= 2;
        int z= 3;
        System.out.println(m + c + z);


        System.out.println("decimoseptimo");
        System.out.println("Calcular el descuento aplicado a una compra (precio y % de descuento)");

        //Calcular descuento
        int mc= 15000; //Precio original
        int lw= 28;    //Porcentaje de descuento
        double descuento = mc * (lw/100.0);

        //Calcular el valor final
        double vf= mc-descuento;

        System.out.println("Descuento: $" + descuento);
        System.err.println("Precio Final: $" +vf);


        System.out.println("decimooctavo punto");
        System.out.println("Calcular la propina a dejar en un restaurante (total y % deseado)");
        int cu= 35;   //Valor de la cuenta
        double pp= 20.0;      //Porcentaje de la propina

        //Calcular la propina  NOTA:el resultado es en double porque el porcentaje es decimal
        double propina= cu*(pp/100);

        //Calcular el total a pagar
        double total= cu+propina;

        System.out.println("Valor de la cuenta: $" +cu);
        System.out.println("Propina: $" + propina);
        System.out.println("Total a pagar: $" +total);
}