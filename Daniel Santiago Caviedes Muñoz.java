class Main {
    public static void main(String[] args) {

        // Primer Punto: Mostrar las tablas de multiplicar del 1 al 10
        System.out.println("Primer punto - Tablas de multiplicar");
        for (int a = 1; a < 11; a++) { // Recorre del 1 al 10
            System.out.println("Tabla del " + a);
            for (int z = 1; z < 13; z++) { // Multiplica del 1 al 12
                System.out.println(z + " x " + a + " = " + (a * z));
            }
        }

        // Segundo Punto: Ver si un año es bisiesto o no
        System.out.println("Segundo Punto - Comprobar si un año es bisiesto:");
        int año = 2024;

        // Reglas para saber si es bisiesto
        if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0) {
                    System.out.println("El año es bisiesto");
                } else {
                    System.out.println("El año no es bisiesto");
                }
            } else {
                System.out.println("El año es bisiesto");
            }
        } else {
            System.out.println("El año no es bisiesto");
        }

        // Tercer Punto: Mostrar los primeros 20 números de la serie Fibonacci
        System.out.println("Tercer Punto - Número en la posición 20 en la serie de Fibonacci:");
        int f1 = 0; // Primer número
        int f2 = 1; // Segundo número

        for (int k = 1; k <= 20; k++) {
            int siguiente = f1 + f2; // Suma los dos anteriores
            f1 = f2; // Avanza los valores
            f2 = siguiente;

            System.out.println(f1); // Imprime el número actual
        }

        // Cuarto Punto: Mostrar múltiplos del 6 hasta llegar al 200
        System.out.println("Cuarto Punto - Múltiplos de cualquier número (6) hasta un límite (200):");

        int numeromultiplo = 6;
        int numerolimite = 200;

        for (int i = 0; i <= numerolimite; i += numeromultiplo) { // De 6 en 6 hasta 200
            System.out.println(i);
        }

        // Quinto Punto: Mostrar los números impares entre 1 y 36
        System.out.println("Quinto Punto - Mostrar los números impares dentro de un rango");
        int inicio = 1;
        int fin = 36;

        for (int i = inicio; i <= fin; i++) {
            if (i % 2 != 0) { // Si no es divisible por 2, es impar
                System.out.println(i);
            }
        }
    }
}
