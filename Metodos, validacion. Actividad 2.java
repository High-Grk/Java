/* Actividad 2. Programa que calcula el área de un cuadrado que no permite ingresar números negativos 
ni datos no numéricos. 
*/

// Ingresa el lado del cuadrado.
// Usa métodos para calcular el area y para verificar si la entrada es válida.
// Muestra el área.

package cuadrado;

import java.util.Scanner;


public class Cuadrado {
    
    public static double areaCuadrado(int lado){
        double area = (lado*lado);
        return area;
    }
    
    public static void main(String[] args) {
        int lado;
        double area = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un lado para el cuadrado: ");
        try{
            lado = teclado.nextInt();
            area = areaCuadrado(lado);
            System.out.println("El area es: "+area);
        }catch(Exception e){
            System.out.println("Entrada no valida");
            teclado.reset();
        }
    }
}
