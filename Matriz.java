package tarea;
import java.util.Random;
import java.util.Scanner;

public class Tarea {
    public static Random rnum = new Random();
    public static Scanner teclado = new Scanner(System.in);
    
    public static void imprimirArreglo(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[ " + arr[i] + " ]");
        }
    }

    public static void ordenarArreglo(int[] arr) {
        int contador = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                    contador++;
                }
            }
        }
        System.out.println(contador+" comparaciones");
    }

    public static void llenarSinRepetir(int[] arr, int rango) {
        if (rango < arr.length) {
            rango = arr.length;
        }
        boolean bandera = false;
        for (int i = 0; i < arr.length; i++) {
            do {
                bandera = false;
                int random = rnum.nextInt(rango);
                for (int j = 0; j <= i; j++) {
                    if (arr[j] == random) {
                        bandera = true;
                    }
                }
                arr[i] = random;
            } while (bandera);
        }
    }
    
    public static void imprimirMatriz(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[ "+arr[i]+"\t]");
        }
        System.out.println("");
    }
    
    public static void llenarMatriz(int[][] mat, int rango){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j]=rnum.nextInt(rango);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arreglo1 = new int[15];
        llenarSinRepetir(arreglo1, 100);
        ordenarArreglo(arreglo1);
        imprimirArreglo(arreglo1);
        System.out.println("========");
        
        int[][] matriz = new int[5][3];
        int rango;
        int contador=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=arreglo1[contador];   
                contador++;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            imprimirMatriz(matriz[i]);
        }
    }
}
