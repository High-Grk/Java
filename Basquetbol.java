/*
 * Entrada: ingresar los nombres de los equipos y los puntos de los enfrentamientos.
 * Proceso: 
 * Salida: muestra quien pasa a la final y quien es el ganador.
 */
package basquetbol;

import java.util.Scanner;

public class Basquetbol {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int punt1, punt2, punt3, punt4;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
       
        String eq1, eq2, eq3, eq4;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del 1 equipo");
        eq1=teclado.next();
        System.out.println("Ingrese el nombre del 2 equipo");
        eq2=teclado.next();
        System.out.println("Ingrese el nombre del 3 equipo");
        eq3=teclado.next();
        System.out.println("Ingrese el nombre del 4 equipo");
        eq4=teclado.next(); 
        
        System.out.println("Ingrese los puntos de "+eq1);
        punt1=teclado.nextInt(); 
        System.out.println("Ingrese los puntos de "+eq2);
        punt2=teclado.nextInt(); 
        
        if(punt1>punt2){
            contador1++;
            System.out.println(eq1+" pasa a la final.");
        }
        else if(punt2>punt1){
            contador2++;
            System.out.println(eq2+" pasa a la final.");
        }
        
        System.out.println("Ingrese los puntos de "+eq3);
        punt3=teclado.nextInt(); 
        System.out.println("Ingrese los puntos de "+eq4);
        punt4=teclado.nextInt(); 
        
        if(punt3>punt4){
            contador3++;
            System.out.println(eq3+" pasa a la final.");
        }
        else if(punt4>punt3){
            contador4++;
            System.out.println(eq4+" pasa a la final.");
        }
        
        // Final
        
        if(contador1>0){
            System.out.println("Ingrese los puntos de "+eq1);
            punt1=teclado.nextInt(); 
            if(contador3>0){
                System.out.println("Ingrese los puntos de "+eq3);
                punt3=teclado.nextInt(); 
                if(punt1>punt3){
                System.out.println(eq1+" es el ganador.");
                System.out.println(eq3+" queda segundo lugar.");
                }
                else if(punt3>punt1){
                System.out.println(eq3+" es el ganador.");
                System.out.println(eq1+" queda en segundo lugar.");
                 }
            }
            else if(contador4>0){
                System.out.println("Ingrese los puntos de "+eq4);
                punt4=teclado.nextInt(); 
                if(punt1>punt4){
                System.out.println(eq1+" es el ganador.");
                System.out.println(eq4+" queda segundo lugar.");
                }
                else if(punt4>punt1){
                System.out.println(eq4+" es el ganador.");
                System.out.println(eq1+" queda en segundo lugar.");
                }
            }
  
        }
        
        else if(contador2>0){
            System.out.println("Ingrese los puntos de "+eq2);
            punt2=teclado.nextInt(); 
            if(contador3>0){
                System.out.println("Ingrese los puntos de "+eq3);
                punt3=teclado.nextInt(); 
                if(punt2>punt3){
                System.out.println(eq2+" es el ganador.");
                System.out.println(eq3+" queda en segundo lugar.");
                }
                else if(punt3>punt2){
                System.out.println(eq3+" es el ganador.");
                System.out.println(eq2+" queda en segundo lugar.");
                }
            }
            else if(contador4>0){
                System.out.println("Ingrese los puntos de "+eq4);
                punt4=teclado.nextInt(); 
                if(punt2>punt4){
                System.out.println(eq2+" es el ganador.");
                System.out.println(eq4+" queda en segundo lugar.");
                }
                else if(punt4>punt2){
                System.out.println(eq4+" es el ganador.");
                System.out.println(eq2+" queda en segundo lugar.");
                }
            }
            
            
            
             
        }
       
        
       
    }
}
