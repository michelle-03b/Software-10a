System.out.println("punto uno");
        System.out.println("Ingresar el nombre y edad");
        String name= "Sara";
        int edad= 16;
        System.out.println(name);
        System.out.println(edad);

      
        System.out.println("punto dos");
        System.out.println("Calcular la suma de dos numeros");
        int numeroA= 4;
        int numeroB= 3;
        System.out.println(numeroA+numeroB);
        
        
        System.out.println("punto tres");
        System.out.println("Calcular la resta de dos numeros");
        int numeroC=13;
        int numeroD=6;
        System.out.println(numeroC-numeroD);
        
        
        System.out.println("punto cuatro");
        System.out.println("Calcular la multiplicación de dos numeros");
        int numeroE= 11;
        int numeroF= 19;
        System.out.println(numeroE*numeroF);
        
        
        System.out.println("punto cinco");
        System.out.println("Calcular la división de dos numeros");
        double numeroG= 12;
        double numeroH= 4;
        System.out.println(numeroG/numeroH);
        
        
        System.out.println("punto seis");
        System.out.println("Calcular el cuadrado de un numero");
        int numero9= 18;
        System.out.println(numero9*numero9);
        
        System.out.println("punto siete");
        System.out.println("Convertir grados Celsius a Fahrenheit");
        double nA= 12;
        double nC= 6;
        double nT= 4;
        double nP= 23;
        System.out.println(nA* nC/ nT+ nP);
        
        
        System.out.println("punto ocho");
        System.out.println("Calcular el perimetro de un rectangulo");
        int ladolargo= 3;
        int ladoancho= 9;
        System.out.println(ladolargo +ladoancho+ ladolargo + ladoancho);
        
        
        System.out.println("punto nueve");
        System.out.println("Calcular el area de un circulo");
        double r= 34;
        System.out.println(3.1416 * r * r);
        
        
        System.out.println("punto dies");
        System.out.println("Convertir años a días");
        int g= 19;
        int r= 365;
        int t= g*r;
        System.out.println(t+ "Days");
        
        
        System.out.println("punto once");
        System.out.println("Calcular el doble y el triple de un numero");
        int e= 6;
        int n= 7;
        int doble= e*e;
        int triple= n*n*n;
        System.out.println(doble);
        System.out.println(triple);
        
        
        System.out.println("punto doce");
        System.out.println("Convertir kilometros a metros y a centimetros");
        int y= 16;
        int ño= y*1000;
        int s= y*100000;
        System.out.println(ño);
        System.out.println(s);
        
        
        System.out.println("punto trece");
        System.out.println("Calcular el área y el perímetro de un cuadrado");
        int N= 20;
        //Calcular el area
        int ar= N*N;
        //Calcular el perimetro
        int pe= N*N*N*N;
        System.out.println("area=");
        System.out.println("perimetro=");
        System.out.println(ar);
        System.out.println(pe);
        
        
        System.out.println("punto catorce");
        System.out.println("Calcular el volumen de un cubo");
        int P= 31;
        int me= P*P*P;
        System.out.println(me);
        
        
        System.out.println("punto quince");
        System.out.println("Calcular el volumen de una esfera");
        int na= 4;
        int no= 3;
        int radio= 5;
        double j= 3.14;
        System.out.println((na/no)*j*radio*radio*radio);
        
        
        System.out.println("punto dieciséis");
        System.out.println("Sumar los tres primeros números naturales.");
        int x= 1;
        int y= 2;
        int z= 3;
        System.out.println(x + y + z);
        
        
               System.out.println("punto dieciocho");
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