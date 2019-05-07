/*
 * Entrada: ngresa tamaño, tipo y extras.
 * Proceso: calcula el costo del tamaño y los extras.
 * Salida: uestra el valor total y pregunta si desea otra pizza.
 */
package pizzeria;
import java.util.Scanner;

public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, p;
        
        do{
        int size, type, extra, total;
        int tamaño=0;
        int ext=0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el numero del tamaño de su pizza:");
        System.out.println("1. Pequeña $1000");
        System.out.println("2. Mediana $1500");
        System.out.println("3. Grande $5000");
        size=teclado.nextInt();       
        switch(size){
            case 1: tamaño=1000; 
            break;
            case 2: tamaño=1500;
            break;
            case 3: tamaño=5000;
            break;
        }
        
        System.out.println("Ingrese el numero del tipo de su pizza:");
        System.out.println("1. Mediterranea");
        System.out.println("2. Vegetariana");
        System.out.println("3. Americana");
        System.out.println("4. Texana");
        type=teclado.nextInt();
        switch(type){
            case 1: type=1; 
            break;
            case 2: type=2;
            break;
            case 3: type=3;
            break;
            case 4: type=4;
            break;
        }
        
        for(int i=1; i<100; i++){
        System.out.println("Ingrese el numero de los ingredientes extra:");
        System.out.println("1. Extra queso $500");
        System.out.println("2. Peperoni $450");
        System.out.println("3. Aceituna $1000");
        System.out.println("4. Piña $100");    
        System.out.println("5. Sardina $1100"); 
        extra=teclado.nextInt();
        switch(extra){
            case 1: ext=ext+500;
            break;
            case 2: ext=ext+450;
            break;
            case 3: ext=ext+1000;
            break;
            case 4: ext=ext+100;
            break;
            case 5: ext=ext+1100;
            break; 
        }
       
        System.out.println("¿Desea agregar otro extra?");
        System.out.println("1. Si");
        System.out.println("2. No");
        p=teclado.nextInt();
        if(p==2){
            i=100;
        }
        }
        
             
        // Boleta
        System.out.println("Detalle de su compra: ");
        
        // Tamaño
        if(tamaño>900){
        System.out.println("Pizza pequeña");
        }
        else if(tamaño>1400){
        System.out.println("Pizza mediana");
        }
        else if(tamaño>4900){
        System.out.println("Pizza grande");
        }
        
        // Tipo
       
        switch(type){
            case 1: System.out.println("Pizza Mediterranea");
            break;
            case 2: System.out.println("Pizza Vegetariana");
            break;
            case 3: System.out.println("Pizza Americana");     
            break;
            case 4: System.out.println("Pizza Texana");
            break;
        }
        
        // Extras
        
        System.out.println("$"+ext+" en extras");
        switch(ext){
            case 500: System.out.println("Extra queso");
            break;
            case 450: System.out.println("Extra peperoni");
            break;
            case 1000: System.out.println("Extra aceituna");     
            break;
            case 100: System.out.println("Pizza piña");
            break;
            case 1100: System.out.println("Pizza sardina");
            break;
        }
        
        // Calcula el total
        total=tamaño+ext;
        // Imprime el total
        System.out.println("Valor total: "+total);
        // Loop
        System.out.println("¿Desea pedir otra pizza?");
        System.out.println("1. Si");
        System.out.println("2. No");
        n=teclado.nextInt();
        }while(n==1);
    }
      
}



