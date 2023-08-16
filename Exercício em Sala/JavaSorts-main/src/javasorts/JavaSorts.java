package javasorts;
import java.util.Random;
import java.util.Scanner;
public class JavaSorts {
    
    static int menuEntrada(){
        Scanner scanner = new Scanner(System.in);
        int op;
        System.out.println("1 - Gerar Dados"); // dados aleatórios
        System.out.println("2 - Entrar com Dados");
        op = scanner.nextInt();
        return op;
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int tamanho, op;
        System.out.println("Tamanho do vetor:");
        tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        op = menuEntrada();
        switch(op){
        case 1: for(int i=0;i<vetor.length;i++){
                    vetor[i] = rand.nextInt(100); // gerando valores aleatórios de limite 100
        } break;    
        case 2: System.out.println("Dados vetor:");
                    for(int i=0;i<vetor.length;i++)
                    vetor[i] = scanner.nextInt();
        break;
        }
        System.out.println("Vetor original:");
        printArray(vetor);
        //BubbleSort.bSortComentado(vetor);
        SelectionSort.sSortComentado(vetor);
        System.out.println("Vetor Comentado");
        printArray(vetor);
    }
    
    public static void printArray(int array[]){
          for(int i=0;i<array.length;i++)
              System.out.print(array[i]+"| ");
          
          System.out.println("\n");
    }// fim printArray
    
}
