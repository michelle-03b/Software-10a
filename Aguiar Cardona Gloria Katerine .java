System.out.println("Las tablas de multiplicar del 1 al 10");
        System.out.println("La tabla del 1 ");
       
        int b=1;
        int c=2;
        int d=3;     
        int e=4;
        int f=5;
        int g=6; 
        int h=7;
        int i=8;
        int j=9;
        int k=10;
        
        System.out.println("1x1="+b*b);
        System.out.println("1x2="+b*c);
        System.out.println("1x3="+b*d);
        System.out.println("1x4="+b*e);
        System.out.println("1x5="+b*f);
        System.out.println("1x6="+b*g);
        System.out.println("1x7="+b*h);
        System.out.println("1x8="+b*i);
        System.out.println("1x9="+b*j);
        System.out.println("1x10="+b*k);
        
        System.out.println(" ");
        
        System.out.println("La tabla del 2");
        
        
        System.out.println("2x1="+c*b); 
        System.out.println("2x2="+c*c);
        System.out.println("2x3="+c*d);
        System.out.println("2x4="+c*e);
        System.out.println("2x5="+c*f);
        System.out.println("2x6="+c*g);
        System.out.println("2x7="+c*h);
        System.out.println("2x8="+c*i);
        System.out.println("2x9="+c*j);
        System.out.println("2x10="+c*k);
         
            
        System.out.println(" ");
        System.out.println("Tabla del 3"); 
        
        
        System.out.println("3x1="+d*b);
        System.out.println("3x2="+d*c);
        System.out.println("3x3="+d*d);
        System.out.println("3x4="+d*e);
        System.out.println("3x5="+d*f);
        System.out.println("3x6="+d*g);
        System.out.println("3x7="+d*h);
        System.out.println("3x8="+d*i);
        System.out.println("3x9="+d*j);
        System.out.println("3x10="+d*k);
        
        System.out.println(" ");
        
        System.out.println("Tabla del 4");
        
        
        System.out.println("4x1="+e*b);
        System.out.println("4x2="+e*c);
        System.out.println("4x3="+e*d);
        System.out.println("4x4="+e*e);
        System.out.println("4x5="+e*f);
        System.out.println("4x6="+e*g);
        System.out.println("4x7="+e*h);
        System.out.println("4x8="+e*i);
        System.out.println("4x9="+e*j);
        System.out.println("4x10="+e*k);
        
        System.out.println(" ");
        
        System.out.println("Tabla del 5");
                
                       
        System.out.println("5x1="+f*b);
        System.out.println("5x2="+f*c);
        System.out.println("5x3="+f*d);
        System.out.println("5x4="+f*e);
        System.out.println("5x5="+f*f);
        System.out.println("5x6="+f*g);
        System.out.println("5x7="+f*h);
        System.out.println("5x8="+f*i);
        System.out.println("5x9="+f*j);
        System.out.println("5x10="+f*k);
        
        System.out.println(" ");  
        
        System.out.println("Tabla del 6");
        
                
        System.out.println("6x1="+g*b);
        System.out.println("6x2="+g*c);
        System.out.println("6x3="+g*d);
        System.out.println("6x4="+g*e);
        System.out.println("6x5="+g*f);
        System.out.println("6x6="+g*g);
        System.out.println("6x7="+g*h);
        System.out.println("6x8="+g*i);
        System.out.println("6x9="+g*j);
        System.out.println("6x10="+g*k);
        
        System.out.println(" ");
        
        System.out.println("Tabla del 8");
        
         
        System.out.println("8x1="+i*b);
        System.out.println("8x2="+i*c);
        System.out.println("8x3="+i*d);
        System.out.println("8x4="+i*e);
        System.out.println("8x5="+i*f);
        System.out.println("8x6="+i*g);
        System.out.println("8x7="+i*h);
        System.out.println("8x8="+i*i);
        System.out.println("8x9="+i*j);
        System.out.println("8x10="+i*k);
      
        System.out.println(" ");
        
        System.out.println("Tabla del 9");
        
            
        System.out.println("9x1="+j*b);
        System.out.println("9x2="+j*c);
        System.out.println("9x3="+j*d);
        System.out.println("9x4="+j*e);
        System.out.println("9x5="+j*f);
        System.out.println("9x6="+j*g);
        System.out.println("9x7="+j*h);
        System.out.println("9x8="+j*i);
        System.out.println("9x9="+j*j);
        System.out.println("9x10="+j*k);
       
        System.out.println(" ");
        
        System.out.println("Tabla del 10");
        
        
        System.out.println("10x1="+k*b);
        System.out.println("10x2="+k*c);
        System.out.println("10x3="+k*d);
        System.out.println("10x4="+k*e);
        System.out.println("10x5="+k*f);
        System.out.println("10x6="+k*g);
        System.out.println("10x7="+k*h);
        System.out.println("10x8="+k*i);
        System.out.println("10x9="+k*j);
        System.out.println("10x10="+k*k);
       
        
        System.out.println(" ");

        
        System.out.println("Calcular si un año es bisiesto");

        int año =2009;

        if (año % 4 == 0) {
        if (año % 100 == 0) {
        if (año % 400 == 0) {
            System.out.println("el año es bisiesto");
        } else {
            System.out.println("el año no es bisiesto");
        }
    } else {
        System.out.println("el año es bisiesto");
    }
} else {
    System.out.println("el año no es bisiesto");
}

    
    System.out.println(" ");
        System.out.println("La serie de fibonacci de los primeros 20 numeros ");
        System.out.println(" ");
         int pa=0;
         int pe=1;
         int pu=pa+pe;
         int da=pe+pu;
         int de=pu+da;
         int di=da+de;
         int du=de+di;
         int xa=di+du;
         int xe=du+xa;
         int xi=xa+xe;
         int xo=xe+xi;
         int xu=xi+xo;
         int ba=xo+xu;
         int bi=xu+ba;
         int bo=ba+bi;
         int bu=bi+bo;
         int ma=bo+bu;
         int me=bu+ma;
         int mi=ma+me;
         int mo=me+mi;        
         System.out.println(pa+","+pe+","+pu+","+da+","+de+","+di+","+du+","+xa+","+xe+","+xi+","+xo+","+xu+","+ba+","+bi+","+bo+","+bu+","+ma+","+me+","+mi+","+mo);
         
         System.out.println(" ");    
    
         System.out.println("Dado un numero x,imprima todos los numeros pares de dicho numero hasta el limite");


        int x = 4; // número inicial
        int y = 48; // número final

        while (x <= y) {
            System.out.println(x);
            x+=x;

    }
        
        System.out.println(" ");
        System.out.println("La cantidad de numero impares que hay dentro de un rango");
               
        int bb = 3;  // número inicial
        int gg = 67; // número final
        int contador = 0;

        while (bb <= gg) {
            if (bb % 2 != 0) {
                contador++;
            }
            bb++;
            }
        

        System.out.println("Cantidad de números impares: " + contador);
    }
}
    
        
        
        
        


