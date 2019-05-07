/*
 * Entrada: largo del arreglo
 * Proceso: contar los numeros primos
 * Salida: mostrar la cantidad de numeros primos
 */
package contadordeprimos;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Fernando
 */
public class Contadordeprimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random rnum = new Random();
        
        System.out.println("Ingrese el largo del arreglo: ");
        int largo = teclado.nextInt();
        int[] arreglo = new int[largo];
        
        
        // Proceso de contar los primos
        int primos=0;
        for(int i=0; i<arreglo.length; i++){
            int div=0;
            
            arreglo[i] = rnum.nextInt(100);
            System.out.println(arreglo[i]); 
            for(int j=0; j<arreglo[i]; j++){
                if(arreglo[i]%j==0){
                    div++;
                }
            }
            if(div==2){
            primos++;
            }
        }

        System.out.println("Cantidad de primos: "+ primos);
    }
    
}
