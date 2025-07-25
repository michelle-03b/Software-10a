public class KAROLJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         for(int i=1; i < 11; i++ ) {
        
        System.out.println("TABLA DEL" + i + ":") ;
        for(int y=1; y<13; y++) {
            System.out.println(i+"*"+y+"="+i*y);
        }
      }   
        
    System.out.println("SEGUNDO PUNTO");
    System.out.println("algoritmo para saber si x año es bisiesto");
    
double año1=2004.0;
double año2=100.0;
int multiplo=4;
int divisor1=100;
int divisor2=400;
System.out.println("Para saber si el año es bisiesto, las divisones deben dar en numeros enteros, NO DECIMALES");
System.out.println("PRIMER CASO=" +año1/multiplo);
//El resultado da=
System.out.println("SEGUNDO CASO=" +año1/divisor1);
//El resultado da=
System.out.println("TERCER CASO=" +año1/divisor2);
//El resultado da=
System.out.println("SEGUN LOS CALCULOS, ESTE AÑO ES BISIESTO");

System.out.println("PRIMER CASO=" +año2/multiplo);
//El resultado da=
System.out.println("SEGUNDO CASO=" +año2/divisor1);
//El resultado da=
System.out.println("TERCER CASO=" +año2/divisor2);
//El resultado da=
System.out.println("SEGUN LOS CALCULOS, ESTE AÑO NO ES BISIESTO");


System.out.println("TERCER PUNTO");
    System.out.println("Serie de Fibonacci");
    int n=20;
    int a=0 ,b=1 ;
    for(int i=0; i<n; i++){
    System.out.printf("%-6d",a);
    if((i+1)%6==0){
    System.out.println();
             } 
    int siguiente= a+b;
    a=b;
    b=siguiente;
         }
    
    System.out.println("CUARTO PUNTO");
  System.out.println("Dado un número X, imprima todos los múltiplos de dicho número hasta el eje Y");
        
        // Definir valores de X y Y
        int x = 6;
        int y = 45;
        System.out.println("X es igual a: " + x);
        System.out.println("Y es igual a: " + y);
        System.out.println("Múltiplos de " + x + " hasta " + y + ":");  
        for (int i = x; i <= y; i++) {
            if (i % x == 0) {  // Verifica si el número i es múltiplo de x
                System.out.println(i);
            }
        }
        
    System.out.println("QUINTO PUNTO");
    System.out.println("La cantidad de numeros impares que hay dentro de un rango");
     int inicio = 1;
        int fin = 32;
        int contadorImpares = 0; // Contar y mostrar los números impares dentro del rango
        System.out.print("Números impares en el rango: ");
        for (int i = inicio; i <= fin; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                contadorImpares++;   
                }  
            }  

    
    
        }

          }       
        
          }
      }

            }

    }
}