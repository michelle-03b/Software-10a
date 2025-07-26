/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tin;

/**
 *
 * @author Admin
 */
public class leoarias1{

    public static void main(String[] args) {
       System.out.println(" EJERCISIO 1 TABLAS");
       for(int x = 1; x < 13; x++){
          
          System.out.println("Tabla del " +x );
          
      for(int a = 1; a <= 12; a++)
          System.out.println(x + "x" + a + "=" + (x*a));
      }
          
          
          System.out.println("EJERCISIO 2 AÑOS");
    float año= 2000;
   if ((año%4==0)&&(año%100==0)&&(año%400==0)){
       System.out.println("año bisiesto");
   }else{   
   System.out.println("año no bisiesto");}
   
   
         System.out.println("EJERCISIO 3 , NUMEROS");
int P = 20;
        int b = 0;
        int c = 1;

        System.out.println("los primeros " + P + " valores de la serie fionacchi son:");

        for (int i = 1; i <= P; ++i) {
            System.out.print(b+",");

            int d = b + c;
            b = c;
            c = d;
        }
        System.out.println("EJERCISIO 4,NUMEROS HASTA EL LIMTE");
       long numero = 4;
        long limite = 37;
        
        System.out.println("Números generados (sumando consigo mismo):");

        while (numero <= limite) {
            System.out.println(numero);
            numero += numero;   
        }
        System.out.println("EJERCISIO 5,NUMEROS IMPARES");
                  int inicio = 1;
        int fin = 100;
        int cantidadImpares = 0;

        System.out.println("Números impares entre " + inicio + " y " + fin + ":");

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                cantidadImpares++;
            }
        }

        System.out.println("Cantidad total de números impares: " + cantidadImpares);


    }}

 
        
    

