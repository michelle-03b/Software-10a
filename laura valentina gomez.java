/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laurag;

/**
 *
 * @author fredy
 */
public class LauraG {
      
        public void nombreEdad(){
        int edad=15;
        System.out.print("1. IMPRIMIR TU NOMBRE Y TU EDAD\n");
        String nombre="laura valentina gomez riano";
        System.out.print("nombre ="+ nombre+"\n");   
        System.out.print("edad=" + edad+"\n");
        }       
        
        public void suma(){
        int a=18;
        int b= 6;
        System.out.print("2. CALCULAR LA SUMA DE DOS NUMEROS: \n");
        System.out.print("la respuesta es: ");
        System.out.print(a+b +"\n");
        }
        
        public void resta(){
        int a=18;
        int b= 6;
        System.out.print("3. RESTAR DOS NUMEROS INGRASDOS: \n");
        System.out.print("la respuesta es: ");
        System.out.print(a-b +"\n");
        }
        
        public void multiplicar(){
        int a=18;
        int b= 6;
        System.out.print("4. MULTIPLICAR DOS NUMEROS: \n");
        System.out.print("la respuesta es: ");
        System.out.print(a*b +"\n");
                }
        public void dividr(){
        int a=18;
        int b= 6;
        
        System.out.print("5. DIVIDIR DOS NUMEROS: \n");
        System.out.print("la respuesta es: ");
        System.out.print(a/b +"\n");
        }
        
      public void calcularCuadrado(){
         int a=18;
         int c=(a*a) ;  
          System.out.print("6. CALCULAR EL CUADRADO DE UN NUMERO: \n");
          System.out.print("la respuesta es: ");
          System.out.print(c +"\n");
      }
      public void convercion(){
         int a=18;
         int d=9;
         int e=5;
         int f=32;
         int j=(a*d/e+f);
         System.out.print("7. CONVERTIR GRADOS CELSIUS A FAHRENHEIT: \n");
         System.out.print("la respuesta es: ");
         System.out.print(j+"\n");
                  
}
                  
      public void calcular(){
        int a=18;
        int b= 6;
        int k=((a+b)*2);
              
        System.out.print("8. CALCULAR EL PERIMETRO DE UN RECTANGULO: \n");
        System.out.print("la respuesta es: ");
        System.out.print(k+"\n");
        }
         
        public void calcularArea(){
        int a=18;
        double l=3.1416;
        double m=((a*a)*l);
        System.out.print("9. CALCULAR EL AREA DE UN CIRCULO: \n");
        System.out.print("la respuesta es: ");
        System.out.print( m +"\n");
        }
        
        public void convercionAños(){
        int b= 6;
        int n=365;
        System.out.print("10. CONVERTIR AÑOS A DIAS: \n");
        System.out.print("la respuesta es: ");
        System.out.print(b*n+"\n");
}

        public void calcularDoble(){
        int a=18;
        int o=(a+a);
        int p=(a+a+a);
        System.out.print("11. CALCULAR EL DOBLE Y EL TRIPLE DE UN NUMERO: \n");
        System.out.print("1 la respuesta es: ");
        System.out.print(o+"\n");
        System.out.print("2 la respuesta es: ");
        System.out.print(p+"\n");
}
        public void convercionKilometros(){
         int a=18;
        int kilometros=a;
        int metros=(kilometros*1000);
        int centimetros= (kilometros * 100000);
        System.out.print("12. CONVERTIR KILOMETROS A METROS Y CENTIMENTROS: \n ");
        System.out.print("1. "+ kilometros+" kilometros en metros es: "+ metros +" mts"+"\n");
                  
        System.out.print("2. "+ kilometros+" kilometros en centimetros es: "+ centimetros +" cm"+"\n");
}
        public void calcularPerimetro(){                       
        int b= 6;                  
        int lado=b;
        int area=(b*b);
        System.out.print("13. CALCULAR EL AREA Y EL PERIMETRO DE UN CUADRADO \n ");
        System.out.print("el lado es:" +b+"\n ");
        System.out.print("el area del cuadrado es: " + area+"\n");
        System.out.print("el perimetro del cuadrdo:"+ lado* 4 +"\n");
}
         public void calcularVolumen(){      
        int b= 6;
        System.out.print("14. CALCULAR EL VOLUMEN DE UN CUBO\n");           
        System.out.print("el lado del cubo es: "+ b +"\n");
        System.out.print("el volumen es:" + Math.pow(b,3)+"\n");
}
                    
         public void calculaEsfera(){           
        double radio= 5;
        System.out.print("15. CALCULAR EL VOLUMEN DE UNA ESFERA\n");
        String volumen= ((Math.pow(radio,3)*3.1416)*(4/3)+"\n");
        System.out.print("el radio de la esfera es: " + radio +"\n");
        System.out.print("el volumen es: "+ volumen);
}
        public void sumarNumerosnaturales(){
        int v=(1+2+3);
        System.out.print("16. SUMAR LOS TRES PRIMEROS NUMEROS NATURALES: \n");
        System.out.print("el resultado es: ");
        System.out.print(v+"\n");
}
        public void calcularDescuento(){        
        double R=100;
        double porcentaje= 20;
        System.out.print("17. CALCULAR EL DESCUENYO APLICADO EN UNA COMPRA(PRECIO Y EL PORCENTAJE DE DESCUENTO): \n");                        
        System.out.print("valor del articulo:"+ R +"\n");
        System.out.print("el decuento del articulo es: "+ porcentaje +"\n");
                
        System.out.print("DESCUENTO APLICADO:"+(R-(R*(porcentaje/100)))+"\n");
}
      
        public void propina() {
                
        double valor_Total=500;
        double porcentaje_Propina= 5;
        System.out.print("18. CALCULAR LA PROPINA A DEJAR EN UN RESTAURANTE(TOTAL Y PORCENTAJE DESEADO): \n");
        System.out.print("valor Total:"+ valor_Total +" pesos \n");
        System.out.print("El porcentaje de la propina es: "+ porcentaje_Propina +" %\n");
        System.out.print("Valor de la Propina:"+(valor_Total*(porcentaje_Propina/100))+" pesos\n");
        }
        
        public static void main(String[] args) {
        
                   
    {
        int edad=15;
        System.out.print("1. IMPRIMIR TU NOMBRE Y TU EDAD\n");
        String nombre="laura valentina gomez riano";
        System.out.print("nombre ="+ nombre+"\n");   
        System.out.print("edad=" + edad+"\n");
    
        
    }
        {
        int a=18;
        int b= 6;
        System.out.print("2. CALCULAR LA SUMA DE DOS NUMEROS: \n");
        System.out.print("la respuesta es: ");
        System.out.print(a+b +"\n");
        }
        
        {
        int a=18;
        int b= 6;
        System.out.print("3. RESTAR DOS NUMEROS INGRASDOS: \n");
        System.out.print("la respuesta es: ");
        System.out.print(a-b +"\n");
        }
        
        {
        int a=18;
        int b= 6;
        System.out.print("4. MULTIPLICAR DOS NUMEROS: \n");
        System.out.print("la respuesta es: ");
        System.out.print(a*b +"\n");
                }
        {
        int a=18;
        int b= 6;
        
        System.out.print("5. DIVIDIR DOS NUMEROS: \n");
        System.out.print("la respuesta es: ");
        System.out.print(a/b +"\n");
        }
        
      {
         int a=18;
         int c=(a*a) ;  
          System.out.print("6. CALCULAR EL CUADRADO DE UN NUMERO: \n");
          System.out.print("la respuesta es: ");
          System.out.print(c +"\n");
      }
      {
         int a=18;
         int d=9;
         int e=5;
         int f=32;
         int j=(a*d/e+f);
         System.out.print("7. CONVERTIR GRADOS CELSIUS A FAHRENHEIT: \n");
         System.out.print("la respuesta es: ");
         System.out.print(j+"\n");
                  
}
                  
      {
        int a=18;
        int b= 6;
        int k=((a+b)*2);
              
        System.out.print("8. CALCULAR EL PERIMETRO DE UN RECTANGULO: \n");
        System.out.print("la respuesta es: ");
        System.out.print(k+"\n");
        }
         
{
        int a=18;
        double l=3.1416;
        double m=((a*a)*l);
        System.out.print("9. CALCULAR EL AREA DE UN CIRCULO: \n");
        System.out.print("la respuesta es: ");
        System.out.print( m +"\n");
        }
        
        {
        int b= 6;
        int n=365;
        System.out.print("10. CONVERTIR AÑOS A DIAS: \n");
        System.out.print("la respuesta es: ");
        System.out.print(b*n+"\n");
}

        {
        int a=18;
        int o=(a+a);
        int p=(a+a+a);
        System.out.print("11. CALCULAR EL DOBLE Y EL TRIPLE DE UN NUMERO: \n");
        System.out.print("1 la respuesta es: ");
        System.out.print(o+"\n");
        System.out.print("2 la respuesta es: ");
        System.out.print(p+"\n");
}
 {
         int a=18;
        int kilometros=a;
        int metros=(kilometros*1000);
        int centimetros= (kilometros * 100000);
        System.out.print("12. CONVERTIR KILOMETROS A METROS Y CENTIMENTROS: \n ");
        System.out.print("1. "+ kilometros+" kilometros en metros es: "+ metros +" mts"+"\n");
                  
        System.out.print("2. "+ kilometros+" kilometros en centimetros es: "+ centimetros +" cm"+"\n");
}
       {                       
        int b= 6;                  
        int lado=b;
        int area=(b*b);
        System.out.print("13. CALCULAR EL AREA Y EL PERIMETRO DE UN CUADRADO \n ");
        System.out.print("el lado es:" +b+"\n ");
        System.out.print("el area del cuadrado es: " + area+"\n");
        System.out.print("el perimetro del cuadrdo:"+ lado* 4 +"\n");

            
       
        System.out.print("14. CALCULAR EL VOLUMEN DE UN CUBO\n");           
        System.out.print("el lado del cubo es: "+ b +"\n");
        System.out.print("el volumen es:" +b*b*b +"\n");
}
                    
       {           
        double radio= 5;
        System.out.print("15. CALCULAR EL VOLUMEN DE UNA ESFERA\n");
        double volumen=((4.0/3.0)*3.1416*(radio*radio*radio));
        System.out.print("el radio de la esfera es: " + radio +"\n");
        System.out.print("el volumen es: "+ volumen);
}
      {
        int v=(1+2+3);
        System.out.print("16. SUMAR LOS TRES PRIMEROS NUMEROS NATURALES: \n");
        System.out.print("el resultado es: ");
        System.out.print(v+"\n");
}
       {        
        double R=100;
        double porcentaje= 20;
        System.out.print("17. CALCULAR EL DESCUENYO APLICADO EN UNA COMPRA(PRECIO Y EL PORCENTAJE DE DESCUENTO): \n");                        
        System.out.print("valor del articulo:"+ R +"\n");
        System.out.print("el decuento del articulo es: "+ porcentaje +"\n");
                
        System.out.print("DESCUENTO APLICADO:"+(R-(R*(porcentaje/100)))+"\n");
}
      
     
        
       {
        double valor_Total=500;
        double porcentaje_Propina= 5;
        System.out.print("18. CALCULAR LA PROPINA A DEJAR EN UN RESTAURANTE(TOTAL Y PORCENTAJE DESEADO): \n");
        System.out.print("valor Total:"+ valor_Total +" pesos \n");
        System.out.print("El porcentaje de la propina es: "+ porcentaje_Propina +" %\n");
        System.out.print("Valor de la Propina:"+(valor_Total*(porcentaje_Propina/100))+" pesos\n");
         }
       
    }
        

        }
