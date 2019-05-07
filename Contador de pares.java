/*
 * Entrada: largo del arreglo
 * Proceso: contar los numeros pares 
 * Salida: mostrar la cantidad de numeros pares
 */
package contador.de.pares;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Fernando
 */
public class ContadorDePares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rnum = new Random();
        
        System.out.println("Ingrese el largo del arreglo: ");
        int largo = teclado.nextInt();
        int[] arreglo = new int[largo];
        
        
        // Proceso de contar los numeros
        int pares=0;
        
        for(int i=0; i<arreglo.length; i++){
            arreglo[i] = rnum.nextInt(100);
            System.out.println(arreglo[i]);
            if(arreglo[i]%2==0){
                pares++;
            }
                
        }
        System.out.println("Pares: "+pares);
        System.out.println("Impares: "+(largo-pares));
    }
    
}
