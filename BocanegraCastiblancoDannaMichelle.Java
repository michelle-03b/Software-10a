/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.michellebocanegra;

/**
 *
 * @author usuario
 */
public class MichelleBocanegra {

    public static void main(String[] args) {
        System.out.println("primer punto");
        System.out.println("Ingresar el nombre y edad");
        String name= "michelle";
        int edad= 15;
        System.out.println(name);
        System.out.println(edad);

      
        System.out.println("segundo punto");
        System.out.println("Calcular la suma de dos numeros");
        int numero1= 8;
        int numero2= 4;
        System.out.println(numero1+numero2);
        
        
        System.out.println("tercer punto");
        System.out.println("Calcular la resta de dos numeros");
        int numero3=10;
        int numero4= 7;
        System.out.println(numero3-numero4);
        
        
        System.out.println("cuarto punto");
        System.out.println("Calcular la multiplicación de dos numeros");
        int numero5= 13;
        int numero6= 15;
        System.out.println(numero5*numero6);
        
        
        System.out.println("quinto punto");
        System.out.println("Calcular la división de dos numeros");
        double numero7= 14;
        double numero8= 5;
        System.out.println(numero7/numero8);
        
        
        System.out.println("sexto punto");
        System.out.println("Calcular el cuadrado de un numero");
        int numero9= 18;
        System.out.println(numero9*numero9);
        
        System.out.println("septimo punto");
        System.out.println("Convertir grados Celsius a Fahrenheit");
        double n1= 21;
        double n2= 9;
        double n3= 5;
        double n4= 32;
        System.out.println(n1* n2/ n3+ n4);
        
        
        System.out.println("octavo punto");
        System.out.println("Calcular el perimetro de un rectangulo");
        int ladolargo= 3;
        int ladoancho= 9;
        System.out.println(ladolargo +ladoancho+ ladolargo + ladoancho);
        
        
        System.out.println("noveno punto");
        System.out.println("Calcular el area de un circulo");
        double ma= 3.1416;
        int r= 34;
        System.out.println(ma * r * r);
        
        
        System.out.println("decimo punto");
        System.out.println("Convertir años a días");
        int a= 19;
        int d= 365;
        int m= a*d;
        System.out.println(m+ "dias");
        
        
        System.out.println("undecimo punto");
        System.out.println("Calcular el doble y el triple de un numero");
        int p= 8;
        int v= 3;
        int da= p*p;
        int t= v*v*v;
        System.out.println("doble=" +da);
        System.out.println("triple=" +t);
        
        
        System.out.println("decimosegundo punto");
        System.out.println("Convertir kilometros a metros y a centimetros");
        int k= 16;
        int me= k*1000;
        int c= k*100000;
        System.out.println("km a m=" +me);
        System.out.println("km a cm=" +c);
        
        
        System.out.println("decimotercer punto");
        System.out.println("Calcular el área y el perímetro de un cuadrado");
        int N= 20;
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
        int L= 21;
        int vo= L*L*L;
        System.out.println(vo);
        
        
        System.out.println("decimoquinto punto");
        System.out.println("Calcular el volumen de una esfera");
        int na= 4;
        int no= 3;
        int radio= 5;
        double j= 3.14;
        System.out.println((na/no)*j*radio*radio*radio);
        
        
        System.out.println("decimosexto punto");
        System.out.println("Sumar los tres primeros números naturales.");
        int x= 1;
        int y= 2;
        int z= 3;
        System.out.println(x + y + z);
        
        
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
}
