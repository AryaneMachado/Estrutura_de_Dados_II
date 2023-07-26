
package javasorts;

import java.util.Scanner;

public class BubbleSort {
    
    public static void bSort(int array[]){
        
        for(int fase=1; fase<array.length;fase++){
            for(int comp=0;comp<array.length-fase;comp++)
                
                if(array[comp]>array[comp+1]){
                    int temp = array[comp];
                    array[comp] = array[comp+1];
                    array[comp+1] = temp;
                    
                } // fim if
                        
            
        } // fim for
    } // fim bSort
    
    public static void bSortComentado(int array[]){
        Scanner scanner = new Scanner(System.in);
        
        for(int fase=1; fase<array.length;fase++){ // começa fase
            
            System.out.println("\nFase "+fase); // verificando 
            JavaSorts.printArray(array); // vetor na fase emq ue se encontra
            scanner.nextLine(); // pausa
            
            for(int comp=0;comp<array.length-fase;comp++) {
            System.out.println("Comprarando "+array[comp] + " com " + array[comp+1]);    
                
                if(array[comp]>array[comp+1]){
                    int temp = array[comp];
                    array[comp] = array[comp+1];
                    array[comp+1] = temp;
        
    
                } // fim if
        } // fim for
    }
    
     
    }
    
}
