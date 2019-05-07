/*
 Programa que determina si una cadena asci numérica o alfabetica es palíndroma. 
 */
package palabras;
import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Palabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        String palabra = "palabra";
        System.out.println(palabra); // Imprime palabra
        System.out.println(palabra.length()); // Muestra el largo del "arreglo" (string)
        System.out.println(palabra.charAt(0)); // Muestra la letra en el "arreglo" 0
        */ 
        /*
        for(int i=0; i<palabra.length(); i++){
            System.out.println(palabra.charAt(i));
        }
        //// Palabra inversa.
        // Método 1. 
        String b = "";
        for(int i=0; i<palabra.length(); i++){
            b = b + palabra.charAt(palabra.length()-1-i); // -1 ya que length()-i=0 excede el limite del largo
        }
        System.out.println(b);
        */ 
        /* Método 2. 
        String b = "";
        for(int i=palabra.length()-1; i>=0; i--){
            b = b + palabra.charAt(i);  
        }
        System.out.println(b);
       */ 
        
        //// Determinar si la cadena ingresada por el usuario es un palindromo.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una cadena ASCII o numérica: ");
        String a = teclado.next();
        String b = "";
        String c = "";
        
        for(int i=0; i<a.length(); i++){
            b = b + a.charAt(a.length()-1-i);
            c = c + a.charAt(i);
        }
        
        if(c.equals(b)){
            System.out.println("Es palindromo.");
        }
        else{
            System.out.println("No es palindromo.");
        }
    }
    
}
