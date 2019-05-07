/*
 * Entrada: nada
 * Proceso: ver si los numeros del arreglo son iguales
 * Salida: mostrar la cantidad de numeros 
 */
package generador;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Fernando
 */
public class Generador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rnum = new Random();
        int[] arreglo = new int[15];
        boolean bandera=false;
        
        for(int i=0; i<15; i++){
            arreglo[i] = rnum.nextInt(50);
            for(int j=0; j<50; j++){
                if(arreglo[i]==j){
                    bandera=true; 
                }
                if(bandera){
                
                }
            
            System.out.println(arreglo[i]); 
            }
        
        }
  
    }
    
}
    