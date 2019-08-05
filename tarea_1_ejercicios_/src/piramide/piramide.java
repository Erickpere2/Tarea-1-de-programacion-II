
package piramide;


public class piramide {

   
    public static void main(String[] args)  { 
int tamano = 5; 
for(int i = 1; i <= tamano; i++){ 
int i2; 
for(i2 = 0; i2 < tamano - i; i2++) 
{ 
System.out.print(' '); //imprime los espacios 
} 
for( ; i2 < tamano+i; i2++) 
{ 
System.out.print('*'); //imprime los asteriscos 
} 
System.out.print('\n'); //cambio de lienea 
} 
} 
}