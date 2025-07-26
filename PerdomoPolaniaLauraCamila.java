/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.perdomopolanialauracamila;

/**
 *
 * @author Camila
 */
public class PerdomoPolaniaLauraCamila {

    public static void main(String[] args) {
        System.out.println("Actividad:");
              //1. Mostrar las tablas de multiplicar del 1 al 10.
        System.out.println("1. Mostrar las tablas de multiplicar del 1 al 10.");
        for (int mul=1; mul<11; mul++) { //MULTIPLICA 1-10
            System.out.println("Tabla del " + mul);
            for (int inc=1; inc<13; inc++) { //INCREMENTA 1-12
                System.out.println(inc+"*"+mul+"="+(mul*inc));//RTA
            }
        }

        // 2. Crear un algoritmo que determine si un año es biciesto o no.
        System.out.println("2. Crear un algoritmo que determine si un año es biciesto o no.");
        int ye = 2000;

        // CONDICIONES
        if(ye%4==0){ //CONDICION 1
            if(ye%100==0){ //CONDICION 2
                if(ye%400==0){ //CONDICION 3
                    System.out.println("El año es bisiesto");
                }else{
                    System.out.println("El año no es bisiesto");
                }
            }else{
                System.out.println("El año es bisiesto");
            }
        }else{
            System.out.println("El año no es bisiesto");
        }

        // 3. Crear un algoritmo que muestre los 20 primeros numeros de la serie Fibonacci.
        System.out.println("3. Crear un algoritmo que muestre los 20 primeros numeros de la serie Fibonacci.");
        int o = 0; 
        int u = 1; 

        for (int k=1; k<=20; k++){
            int suma = o+u; 
            o=u; // SERIE
            u=suma;

            System.out.println(o);//RTA
        }

        // 4. Hacer que un numero x llegue a un numero y con multiplos del x.
        System.out.println("4. Hacer que un numero x llegue a un numero y con multiplos del x.");

        int mul2=4;
        int lim=40;

        for (int j=0; j<=lim; j+=mul2) {
            System.out.println(j);//RTA
        }

        // 5. Hacer un algoritmo que muestre los numeros impares en un rango.
        System.out.println("5. Hacer un algoritmo que muestre los numeros impares en un rango.");
        int hola = 1; //TOMAR EN CUENTA QUE LOS NÚMEROS IMPARES SON LOS QUE NO SON MULTIPLOS DE 2
        int adios = 40;
for (int c=hola; c<=adios; c++) {
            if (c%2!=0) {
                System.out.println(c);//RTA
            }
        }
    }
}     
        
    

