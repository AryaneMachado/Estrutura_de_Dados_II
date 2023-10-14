package javatrees;

<<<<<<< HEAD
public class BinarySearchTree<T extends Comparable<T>> {

    Node root;

    public void add(T newData) {
        Node<T> newNode = new Node<T>(newData);
        root = insert(root, newNode);
    }

    private Node<T> insert(Node<T> root, Node<T> newNode) {
        return null;
    }
=======
public class BinarySearchTree<T extends Comparable>{
    
    Node raiz=null;
    
    public void add(T novoDado){
        Node<T> novoNo = new Node<T>(novoDado);
        raiz = inserir(raiz, novoNo);
    }
    
    private Node<T> inserir(Node<T> raiz, Node<T> novoNo){ 
        
        return novoNo;
            
 
    }
    
    
>>>>>>> 4dc3eb2057f136fd9e309ab4997253c7b032630f
}
