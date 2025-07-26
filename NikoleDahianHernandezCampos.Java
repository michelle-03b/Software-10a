public class Nikole {
    public static void main(String[] args) {

        System.out.println("Tablas de multiplicar del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
    
        }

        System.out.println("2. Saber si un año es bisiesto:");
        int año = 4000;
        if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0) {
                    System.out.println("Sí es bisiesto");
                } else {
                    System.out.println("No es bisiesto");
                }
            } else {
                System.out.println("Sí es bisiesto");
            }
        } else {
            System.out.println("No es bisiesto");
        }

        System.out.println("Serie Fibonacci de los primeros 20 números:");
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 20; i++) {
            int siguiente = a + b;
            System.out.print(siguiente + " ");
            a = b;
            b = siguiente;
        }
    

        System.out.println("Imprimir desde un número hasta un límite:");
        int x = 5;
        int limite = 15;
        for (int i = x; i <= limite; i++) {
            System.out.print(i + " ");
        }
      

        System.out.println("5. Contar números impares dentro de un rango:");
        int inicio = 1;
        int fin = 20;
        int cantidad = 0;
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 = 0) {
                cantidad++;
            }
        }
        System.out.println("Total impares: " + cantidad);
    }
}
