import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        System.out.println(“TABLA DEL” + i + “:”) ;
        for(int y=1; y<13; y++) {
            System.out.println(i+”*”+y+”=“+i*y);
        }
   
    System.out.println(“Segundo punto”);
    System.out.println(“Algoritmo para calcular si x año es bisiesto”);
    
    long año=2012;
    if(año%4==0){
        if(año%100==0){
       if(año%400==0){ 
           System.out.println(“es un año bisiesto”);
       }
    }
       }else{
        System.out.println(“NO es un año bisiesto”);
    }
    
    System.out.println(“TERCER punto”);
    int n=20; //VALOR DE TERMINOS A GENERAR 
    int a=0 , b=1;
    System.out.println(“SERIE DE FIBONACCI”);
    for(int i=0; i< n; i++) {
        System.out.print(a+””);
        int siguiente= a+b;
        a=b;
        b=siguiente;
    }
    }
}