package Trees;
public class AVL_BST<E>
{
    // Constructor
    public AVL_BST(){

    }
    public Node<E> root;

    // Basic functions
    public boolean isEmpty(){
        return root == null;
    }
    public int height(){
        return height(root);
    }

    public int  height(Node<E> node){
        if(node == null){
            return -1;
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1;
        return node.height;
    }

    public Node<E> findNode(E value)
    {
        return findNode(value, root);
    }

    private Node<E> findNode(E value, Node<E> node)
    {
        if((Integer)(value) == (Integer)(node.value)){
            return node;
        }
        if((Integer)(value) > (Integer)(node.value)){
            return findNode(value,node.right);
        }if((Integer)(value) == (Integer)(node.value)){
            return findNode(value,node.left);
    }
        return null;
    }


    // Inserting a node
    public void insert(E value){
        root = insert(value,root);
    }

    public Node<E> insert(E value,Node<E> node){
        if(node == null){
            node = new Node<>(value);
            return node;
        }

        if((Integer)(value) > (Integer) (node.value)){
            node.right = insert(value,node.right);

        }
        if((Integer)(value) < (Integer)(node.value)){
            node.left = insert(value,node.left);
        }

        node.height = Math.max(height(node.left),height(node.right)) + 1;
        return rotate(node);
    }

    // Rotating the BST to make it balanced;
    private Node<E> rotate(Node<E> node)
    {
        if(height(node.left) - height(node.right) > 1){
            // now we know , tree is left heavy
            // So it's either left-left case or left-right case
            if(height(node.left.left) - height(node.left.right)>0){
                // We know it's left left case
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) <0){
                // we know it's left right casee
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left) - height(node.right) < -1){
            // RIGHT HEAVY
            if(height(node.right.left) - height(node.right.right) < 0){
                // Right Right Case
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) >0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;

    }

    // Left and Right Rotation code.
    private Node<E> leftRotate(Node<E> parent) {
        Node<E> child = parent.right;
        Node<E> t2 = child.left;

        child.left = parent;
        parent.right = t2;

        parent.height = Math.max(height(parent.left),height(parent.right)) + 1;
        child.height = Math.max(height(child.left),height(child.right)) + 1;

        return child;
    }



    private Node<E> rightRotate(Node<E> parent) {
        Node<E> child = parent.left;
        Node<E> t1 = child.right;

        child.right  = parent;
        parent.left = t1;

        parent.height = Math.max(height(parent.left),height(parent.right)) + 1;
        child.height = Math.max(height(child.left),height(child.right)) + 1;

        return child;
    }

    // Checking the tree is balanced or not.
    public boolean balanced(){
        return balanced(root);
    }

    public boolean balanced(Node<E> node)
    {
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);

    }

    public E getRootValue(){
        return root.value;
    }


    // displaying the tree
    public void display(){
        display(root,"Root Node : ");
    }

    public void display(Node<E> node , String detail){
        if(node==null){
            return;
        }
        System.out.println(detail + node.value);
        display(node.left,"Left child of " + node.value + " : ");
        display(node.right,"Right child of "+node.value + " : ");
    }

    // Defining the Node class
    public static class Node<E>
    {
        E value;
        Node<E> left;
        Node<E> right;
        int height;

        public Node(E value){
            this.value = value;
        }

        public Node(E value, Node<E> left, Node<E> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public E getValue(){
            return this.value;
        }
        @Override
        public String toString(){
            return "Value : " + this.value;
        }
    }
}
