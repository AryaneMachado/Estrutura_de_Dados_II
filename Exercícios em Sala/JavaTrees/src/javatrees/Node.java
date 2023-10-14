package javatrees;

<<<<<<< HEAD
public class Node<T extends Comparable<T>> {

    T data;
    Node<T> left, right;

    public Node(T newData) {
        this.data = newData;

        /* java já faz isso sozinho
        this.left = null;
        this.right = null;
         */
    }
=======
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
    
>>>>>>> 4dc3eb2057f136fd9e309ab4997253c7b032630f
}
