package javatrees;

/**
 *
 * @author 12983639690
 */
public class Node< T extends Comparable> { // T indica um tipo genérico de dado
    
    T dado;
    Node<T> esquerda;
    Node<T> direita;
    
    public Node(T novoDado){ // Contrutor que recebe um dado a ser inserido na árvore
        this.dado = novoDado;
        this.esquerda = null;
        this.direita = null;
    }
    
}
