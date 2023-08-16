package javasorts;

import java.util.Scanner;


public class SelectionSort {
    // Função a partir de um indíce, encontrar o menor valor e retornar o indice
    //que contém esse menor valor
    
    private static int indexMinArray(int array[], int posAtual){
        
        // ACHANDO O MENOR VALOR:
        int k = posAtual; // k é o indice que contém menor valor
        for(int i=posAtual+1;i<array.length; i++) // partindo da posAtual até o tamanho do vetor (uso lenght)
            if(array[i]<array[k])
                k = i; // definindo a posição que está o menor valor 
            
            return k; 
        
    } //------------------------------------------------------------------------------
    
    // BASEANDO NO MENOR VALOR ACHADO, REALIZA AS TROCAS:
    public static void sSort(int array[]) {
        
        for(int i=0; i<array.length-1; i++){
            int k = indexMinArray(array, i);
            //trocando os valores de i com k
            int temp = array[i];
            array[i] = array[k];
            array[k] = temp;
        }
    } //--------------------------------------------------------------------------------
     public static void sSortComentado(int array[]) {
        
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<array.length-1; i++){
            int k = indexMinArray(array, i);
            System.out.println("Atual: "+array[i]+ " Trocando com menor valor: "+array[k]);
            scanner.nextLine(); // pausa
            //trocando os valores de i com k
            int temp = array[i];
            array[i] = array[k];
            array[k] = temp;
        } //-----------------------------------------------------------------------------
        
        JavaSorts.printArray(array);
        scanner.nextLine(); //
    }
    
    
}
