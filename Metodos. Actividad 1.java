/*
 Actividad 1. Programa que determina las socluciones de una ecuación cuadrática.
 */

package funciones;
import java.util.Scanner;

/**
 *
 * @author dci
 */
public class Funciones {
    
    public static double discriminante(int a, int b, int c){
        double discriminante = (b*b)-(4*a*c);
        return discriminante;
    }
    
    public static int solucion(int num1, int num2, int num3){
        int sol =0;
        double d = discriminante(num1, num2, num3);
        if(d==0){
            System.err.println("Tiene una solución");
            sol =1;
        } else if(d>0){
            System.out.println("Tiene dos soluciones");
            sol =2;
        } else {
            System.out.println("No tiene solucion");
        }
        return sol;
        
    }
    
    public static void calculo(int n1, int n2, int n3){
        int s = solucion(n1, n2, n3);
        double x1, x2;
        switch(s){
            case 0: 
                System.out.println("La ecuación no tiene solución");
            break;
            case 1: 
                x1 = -(n2)/(2*n1);
                System.out.println("La ecuación tiene una única solución: "+ x1);
            break;
            case 2:  
                x1 = (-(n2)-Math.sqrt(discriminante(n1, n2, n3)))/(2*n1);
                x2 = (-(n2)+Math.sqrt(discriminante(n1, n2, n3)))/(2*n1);
                System.out.println("La ecuación tiene una primera solución: "+ x1);
                System.out.println("La ecuación tiene una segunda solución: "+ x2);
            break;
        }
    }
    
    public static void main(String[] args) {
        /*
        double d = discriminante(3, 1, 6);
        System.out.println("Discriminante: "+ d);
        */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int a = teclado.nextInt();
        
        System.out.println("Ingresa un número");
        int b = teclado.nextInt();
        
        System.out.println("Ingresa un número");
        int c = teclado.nextInt();
        
        calculo(a, b, c);
        
    }
    
}
