import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        System.out.println("PUNTO N.1 = Tablas de multiplicar del 1 al 10");
        System.out.println(" ");
      for(int a=1; a<11; a++){
        System.out.println("TABLA DEL "+a);
      for(int b=1; b<13; b++){
        System.out.println(a+" x "+b+" = "+(a*b));   
       }
        }
        System.out.println(" ");

        System.out.println("PUNTO N.2 = Algoritmo para calcular años  bisiestos");
        System.out.println(" ");
        System.out.println("El año 2000 es =");
        int z=2000;
        if((z%4==0)&&(z%100==0)&&(z%400==0)){
        System.out.println("Es biciesto");
        }else{System.out.println("No es biciesto");}

        System.out.println(" ");
        System.out.println("PUNTO N.3 = Realizar la serie de fibonacci de los primeros 20 numeros ");
        System.out.println(" ");
         int a=0;
         int b=1;
         int c=a+b;
         int d=b+c;
         int e=c+d;
         int f=d+e;
         int g=e+f;
         int h=f+g;
         int i=g+h;
         int j=h+i;
         int k=i+j;
         int l=j+k;
         int m=k+l;
         int n=l+m;
         int ñ=m+n;
         int o=n+ñ;
         int p=ñ+o;
         int q=o+p;
         int r=p+q;
         int s=q+r;        
         System.out.println(a+","+b+","+c+","+d+","+e+","+f+","+g+","+h+","+i+","+j+","+k+","+l+","+m+","+n+","+ñ+","+o+","+p+","+q+","+r+","+s);
 
        System.out.println(" ");
        System.out.println("PUNTO N.4 = Dado un numero X imprima todos los multiplos de dicho hasta el limite Y");
        System.out.println(" ");
        int numero=4;
        int limite=32;
        while(numero<=limite){
   System.out.println(numero);
        numero+=numero;           
        }
    
        System.out.println(" ");
              System.out.println("PUNTO N.5 = Mostrar los numeros impares dentro de un rango");
       int comienzo=1;
        int fin=64;
         for (int num=comienzo;num<=fin;num++) {
          if (num%2==0){
           System.out.println(num);
    }
             
    }
    
    }

    }

