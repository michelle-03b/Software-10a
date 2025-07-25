class Main {
public static void main(String[] args) {
        System.out.println("                            Taller de practica     ");
        System.out.println("Realizado por: Daniel Santiago Caviedes Muñoz");
        System.out.println("Curso: 10 °A (Decimo A)");
        System.out.println(" EJERCICIO 1:"+ "Nombre"+" y edad");
        System.out.println("Nombre Completo :Daniel Santiago Caviedes Muñoz");
        System.out.println("Edad: 15 años");
        System.out.println("EJERCICIO 2:"+" Suma de 1000+500:");
        int a = 1000;
        int b = 500;
        System.out.println( a+b );
        
        System.out.println(" EJERCICIO 3:"+" Resta de 3000-1500:");
        int c = 3000;
        int d = 1500;
        System.out.println( c-d );
        
        System.out.println("EJERCICIO 4:"+" Multiplicacion de 12*3:");
        int e = 12;
        int f = 3;
        System.out.println( e*f );
        
        System.out.println("EJERCICIO 5:" + " Divicion de 2000/5:");
        int g = 2000;
        int h = 5;
        System.out.println( g/h );
        
        System.out.println("EJERCICIO 6:" + " Cuadrado del numero 5:");
        int i = 5;
        System.out.println( i*i);
        
        System.out.println("EJERCICIO 7:" + " Conversien de Celsius a FAHRENHEIT:");
        int j = 5;
        System.out.println((j*9/5)+32 );
        
        System.out.println("EJERCICIO 8:" + " Perimetro de un angulo:");
        int lado1 = 8;
        int lado2 = 8;
        int lado3 = 14;
        int lado4 =14;
        System.out.println("Perimetros: lado 1 : 8 ,lado 2 : 8 , lado 3 :14 lado 4 : 14");
        System.out.println( lado1+lado2+lado3+lado4 );
        
        System.out.println("EJERCICIO 9:" + " Area de un circulo:");
        double π=3.14;
        int k = 7;
        System.out.println(π*(k*k));
        
        System.out.println("EJERCICIO 10:" + " Convercion de años a dias:");
        int l = 1;
        int m = 365;
        System.out.println(l*m);
        
        System.out.println("EJERCICIO 11:" + " Calculacion de doble y triple del numero 3:");
        int n = 3;
        System.out.println("El doble del numero 3:");
        System.out.println(n*2);
        int o = 3;
        System.out.println("El triple del numero 3:");
        System.out.println(o*3);
        
        System.out.println("EJERCICIO 12:" + " Convertir kilómetros a metros y centímetros:");
        int km = 2;
        System.out.println("Metros: " + (km * 1000));
        System.out.println("Centímetros: " + (km * 100000));

        System.out.println("EJERCICIO 13:" + " Calcular el área y el perímetro de un cuadrado:");
        int lado = 4;
        System.out.println("Área del cuadrado: " + (lado * lado));
        System.out.println("Perímetro del cuadrado: " + (lado * 4));

        System.out.println("EJERCICIO 14:" + " Calcular el volumen de un cubo:");
        int ladoCubo = 3;
        System.out.println("Volumen del cubo: " + (ladoCubo * ladoCubo * ladoCubo));

        System.out.println("EJERCICIO 15:" + " Calcular el volumen de una esfera:");
        double radio = 6;
        double pi = 3.14;
        System.out.println("Volumen de la esfera: " + ((4.0 / 3.0) * pi * radio * radio * radio));

        System.out.println("EJERCICIO 16:" + " Sumar los tres primeros números naturales:");
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        System.out.println("Suma: " + (num1 + num2 + num3));

        System.out.println("EJERCICIO 17:" + " Calcular el descuento aplicado a una compra (precio y % de descuento):");
        int precio = 100000;
        int descuento = 20;
        System.out.println("Precio con descuento: " + (precio - (precio * descuento / 100)));

        System.out.println("EJERCICIO 18:" + " Calcular la propina a dejar en un restaurante (total y % deseado):");
        int totalCuenta = 85000;
        int porcentajePropina = 10;
        System.out.println("Propina a dejar: " + (totalCuenta * porcentajePropina / 100));
       
    }
}
