
package javasorts;

import java.util.Random;
import java.util.Scanner;
public class JavaSorts {

   
    public static void main(String[] args) {
    
            Scanner scanner = new Scanner (System.in);
            Random rand = new Random();
            int tamanho;
            System.out.println("Tamanho do vetor:");
            tamanho = scanner.nextInt();
            int[] vetor = new int[tamanho];
            System.out.println("Dados do vetor:");
            for(int i=0;i<vetor.length;i++)
                vetor[i] = scanner.nextInt();
            System.out.println("\nVetor original:");// mostra o vetor
            printArray(vetor);
            //BubbleSort.bSort(vetor);
            BubbleSort.bSortComentado(vetor);
            System.out.println("\nVetor ordenado"); // ordenar
            printArray(vetor);// mostrar ordenado 
            
    }
    
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+"| ");
        
        System.out.println("\n");
        
    } // fim printArray
            
            
    }
    

