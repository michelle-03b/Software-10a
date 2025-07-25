class Main {
    public static void main(String[] args) {
        // 1. Imprimir tu nombre y edad
        System.out.println("PUNTO 1:");
        String x = "Dayana";
        int y = 15;
        System.out.println("Nombre: " + x + ", Edad: " + y);

        // 2. Calcular la suma de dos números
        System.out.println("PUNTO 2:");
        int a = 14;
        int b = 27;
        int c = a + b;
        System.out.println("Suma: " + c);

        // 3. Restar dos números ingresados
        System.out.println("PUNTO 3:");
        int p = 50;
        int q = 18;
        int r = p - q;
        System.out.println("Resta: " + r);

        // 4. Multiplicar dos números
        System.out.println("PUNTO 4:");
        int m = 6;
        int n = 3;
        int o = m * n;
        System.out.println("Multiplicación: " + o);

        // 5. Dividir dos números
        System.out.println("PUNTO 5:");
        double u = 45.0;
        double v = 5.0;
        double w = u / v;
        System.out.println("Cociente: " + w);

        // 6. Calcular el cuadrado de un número
        System.out.println("PUNTO 6:");
        int t = 9;
        int z = t * t;
        System.out.println("Cuadrado: " + z);

        // 7. Convertir Celsius a Fahrenheit
        System.out.println("PUNTO 7:");
        double f = 30.0;
        double g = (f * 9 / 5) + 32;
        System.out.println("Fahrenheit: " + g);

        // 8. Perímetro de un rectángulo
        System.out.println("PUNTO 8:");
        int l = 8;
        int k = 12;
        int per = 2 * (l + k);
        System.out.println("Perímetro: " + per);

        // 9. Área de un círculo
        System.out.println("PUNTO 9:");
        double h = 5.0;
        double ac = 3.1416 * h * h;
        System.out.println("Área del círculo: " + ac);

        // 10. Convertir años a días
        System.out.println("PUNTO 10:");
        int años = 3;
        int dias = años * 365;
        System.out.println("Días: " + dias);

        // 11. Calcular doble y triple de un número
        System.out.println("PUNTO 11:");
        int j = 11;
        int doble = j * 2;
        int triple = j * 3;
        System.out.println("Doble: " + doble + ", Triple: " + triple);

        // 12. Convertir kilómetros a metros y centímetros
        System.out.println("PUNTO 12:");
        double km = 2.3;
        double mtrs = km * 1000;
        double cm = mtrs * 100;
        System.out.println(km + " km = " + mtrs + " m y " + cm + " cm");

        // 13. Área y perímetro de un cuadrado
        System.out.println("PUNTO 13:");
        int lado = 6;
        int areac = lado * lado;
        int pc = lado * 4;
        System.out.println("Área: " + areac + ", Perímetro: " + pc);

        // 14. Volumen de un cubo
        System.out.println("PUNTO 14:");
        int ar = 5;
        int vc = ar * ar * ar;
        System.out.println("Volumen del cubo: " + vc);

        // 15. Volumen de una esfera
        System.out.println("PUNTO 15:");
        double rad = 4.0;
        double ve = (4.0 / 3.0) * 3.1416 * rad * rad * rad;
        System.out.println("Volumen de la esfera: " + ve);

        // 16. Sumar los tres primeros números naturales
        System.out.println("PÙNTO 16:");
        int sn = 1 + 2 + 3;
        System.out.println("Suma: " + sn);

        // 17. Calcular descuento aplicado
        System.out.println("PUNTO 17:");
        double precio = 150.0;
        double desc = 15.0; // 15%
        double td = precio - (precio * desc / 100);
        System.out.println("Total con descuento: " + td);

        // 18. Calcular propina
        System.out.println("PUNTO 18:");
        double total = 200.0;
        double prop = 10.0; // 10%
        double tp = total * prop / 100;
        System.out.println("Propina: " + tp);
    }
}