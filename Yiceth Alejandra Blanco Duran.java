public static void main(String[] args) {
        
      
        int edad=15;
        System.out.println("1. Imprimir nombre y edad");
        String nombre="Alejandra Blanco ";
        System.out.println("nombre = Alejandra Blanco" );   
        System.out.println("edad = 15");
        }       

        {
        int a=5;
        int b= 2;
        System.out.println("2. La suma de dos numeros ");
        String suma="5+2";
        System.out.println("la respuesta es: ");
        System.out.println("a+b");
        }
         

        public void resta(){
        int a=3;
        int b= 10;
        System.out.println("3. La resta de dos numeros ");
        System.out.println("la respuesta es: ");
        System.out.println("a-b");
        }

        public void multiplicar(){
        int a=15;
        int b= 18;
        System.out.println("4. La multiplicacion de dos numeros ");
        System.out.println("la respuesta es: ");
        System.out.println("a*b +");
                }
        public void dividir(){
        int a=7;
        int b= 8;

        System.out.println("5. La division de dos numeros ");
        System.out.println("la respuesta es: ");
        System.out.println("a/b +");
        }

      public void calcularCuadrado(){
         int a=15;
         int c=(a*a) ;  
          System.out.println("6. El cuadrado de un numero ");
          System.out.println("la respuesta es: ");
          System.out.println("c +");
      }
      public void convercion(){
         int a=20;
         int b=11;
         int c=7;
         int d=34;
         int f=(a*b/c+d);
         System.out.println("7. Grados celsius a fahrenheit  ");
         System.out.println("la respuesta es: ");
         System.out.println(f+"");

}

      public void calcular(){
        int a=15;
        int b= 3;
        int c=((a+b)*2);

        System.out.println("8.Perimetro de un rectangulo");
        System.out.println("la respuesta es: ");
        System.out.println("+a");
        }

        public void calcularArea(){
        int c=18;
        double l=3.1416;
        double m=((c*c)*l);
        System.out.println("9. Area de un circulo");
        System.out.println("la respuesta es: ");
        System.out.println( m +"");
        }

        public void convercionAños(){
        int a= 5;
        int b=365;
        System.out.println("10. Años a dias ");
        System.out.println("la respuesta es: ");
        System.out.println(a*b+"");
}

        public void calcularDoble(){
        int a=16;
        int b=(a+a);
        int c=(a+a+a);
        System.out.println("11. El doble y el triple de un numero ");
        System.out.println("1 la respuesta es: ");
        System.out.println(b+"");
        System.out.println("2 la respuesta es: ");
        System.out.println(c+"");
}
        public void convercionKilometros(){
         int a=16;
        int kilometros=a;
        int metros=(kilometros*1000);
        int centimetros= (kilometros * 100000);
        System.out.println("12. Kilometros a metros en centimetros  ");
        System.out.println("1. "+ kilometros+" kilometros en metros es: "+ metros +" mts"+"");

        System.out.println("2. "+ kilometros+" kilometros en centimetros es: "+ centimetros +" cm"+"");
}
        public void calcularPerimetro(){                       
        int a= 6;                  
        int lado=a;
        int area=(a*a);
        System.out.println("13. Area del perimetro de un cuadrado ");
        System.out.println("el lado es:" +a+"");
        System.out.println("el area del cuadrado es: " + area+"");
        System.out.println("el perimetro del cuadrdo:"+ lado* 4 +"");
}
         public void calcularVolumen(){      
        int a= 10;
        System.out.println("14. Volumen de un cubo");           
        System.out.println("el lado del cubo es: "+ a +"");
        System.out.println("el volumen es:" + Math.pow(a,3)+"");
}

         public void calculaEsfera(){           
        double radio= 5;
        System.out.println("15. Volumen de una esfera");
        String volumen= ("(radio,3)3.1416)(4/3)+");
        System.out.println("el radio de la esfera es: " + radio +"");
        System.out.println("el volumen es: "+ volumen);
}
        public void sumarNumerosnaturales(){
        int a=(1+2+3);
        System.out.println("16. Sumar los tres primeros numeros naturales ");
        System.out.println("el resultado es: ");
        System.out.println(a+"");
}
        public void calcularDescuento(){        
        double a=100;
        double porcentaje= 50;
        System.out.print("17. Descuento aplicado en una comida): ");                        
        System.out.println("valor del articulo:"+ a +"");
        System.out.println("el descuento del articulo es: "+ porcentaje +"");

        System.out.println("DESCUENTO APLICADO:+(a-(a*(porcentaje/100))+");
}

        public void propina() {

        double valor_Total=400;
        double porcentaje_Propina= 10;
        System.out.println("18.Propina a dejar en un restaurante: ");
        System.out.println("valor Total:"+ valor_Total +" pesos ");
        System.out.println("El porcentaje de la propina es: "+ porcentaje_Propina +" %");
        System.out.println("Valor de la Propina:"+(valor_Total*(porcentaje_Propina/100))+" pesos");
          
        // TODO code application logic here
    }
        }
