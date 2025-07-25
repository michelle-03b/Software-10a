public class Main {
    public static void main(String[] args) {

        System.out.println("1. TABLAS DE MULTIPLICAR DEL 1 AL 10");
        int a = 1;
        while (a <= 10) {
            int b = 1;
            while (b <= 12) {
                System.out.println(a + " * " + b + " = " + (a * b));
                b++;
            }
            a++;
        }

        System.out.println("2. AÑO BISIESTO");

        int c = 2016;
        if ((c % 4 == 0 && c % 100 != 0) || (c % 400 == 0)) {
            System.out.println(c + " es un año bisiesto.");
        } else {
            System.out.println(c + " no es un año bisiesto.");
        }

        System.out.println("3. SERIE DE FIBONACCI");

        int d = 20;
        int e = 0;
        int f = 1;
        int g = 0;
        int h = 2;
        while (h <= d) {
            g = e + f;
            e = f;
            f = g;
            h++;
        }
        System.out.println("Fibonacci en posición " + d + ": " + f);

        System.out.println("4. MÚLTIPLOS HASTA UN LÍMITE");

        int i = 12;
        int j = 98;
        int k = i;

        System.out.println("Múltiplos de " + i + " hasta " + j + ":");
        while (k <= j) {
            System.out.println(k);
            k += i;
        }

        System.out.println("5. NÚMEROS IMPARES ENTRE DOS VALORES");

        int l = 10;
        int m = 30;
        int n = l;
        int o = 0;

        while (n <= m) {
            if (n % 2 != 0) {
                o++;
            }
            n++;
        }

        System.out.println("Cantidad de números impares entre " + l + " y " + m + ": " + o);
    }
}
