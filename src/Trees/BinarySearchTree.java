package Trees;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearchTree<E>
{
    public static class Node<E>
    {
        E value;
        Node<E> left;
        Node<E> right;
        int height;

        public Node(E value){
            this.value = value;
        }

        public Node(E value , Node<E> left , Node<E> right)
        {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        private int getHeight(){
            return this.height;
        }

        public E getValue()
        {
            return this.value;
        }

        @Override
        public String toString(){
            return ("Value : " + this.value);
        }

    }

    private Node<E> root;

    public BinarySearchTree(){

    }

    // Basic Functions

    public E getHeadValue(){
        return root.value;
    }
    public int getHeight(Node<E> node){
        if(node == null){
            return -1;
        }
        return node.getHeight();
    }

    public boolean isEmpty()
    {
        return root==null;
    }

    // Inserting into bst

    public void insert(E value)
    {
//        if(root == null){
//            root = new Node<>(value);
//            root.height = 0;
//            return;
//        }
//        insert(value,root);

        root = insert2(value,root);


    }
    private void insert(E value , Node<E> node)
    {
        if((Integer)(value) < (Integer)(node.value)){
            if(node.left == null){
                node.left = new Node<>(value);
//                node.height = Math.max(getHeight(node.left) ,getHeight(node.right)) + 1;
//                System.out.println(node.height);
            }else{
                insert(value,node.left);
            }

        }else{
            if(node.right==null){
                node.right = new Node<>(value);
//                node.height = Math.max(getHeight(node.left) ,getHeight(node.right)) + 1;
//                System.out.println(node.height);

            }else{
                insert(value,node.right);
            }
        }

    }
    // Another approach. Better appraoch because it calculates height;
    private Node<E> insert2(E value , Node<E> node)
    {
        if(node==null){
            node = new Node<>(value);
            return node;
        }
        if((Integer)(value) < (Integer)(node.value)){
            node.left = insert2(value,node.left);
        }
        if((Integer)(value) > (Integer)(node.value)){
            node.right = insert2(value,node.right);
        }

        node.height = Math.max(getHeight(node.left),getHeight(node.right)) + 1;
//        System.out.println(node.height);

        return node;


    }

    // Inserting multiple elements at once
    public void populate(E[] values)
    {
        for(E value : values){
            this.insert(value);
        }
        // But there is a problem in this , if array is sorted it will create a skewed bt.
    }

    public void populateSorted(E[] values)
    {
        populateSorted(values,0,values.length);
    }
    private void populateSorted(E[] values,int start,int end){
        if(start>=end){
            return;
        }
        int mid = (start) +(end -start)/2;
        this.insert(values[mid]);
        populateSorted(values,start,mid);
        populateSorted(values,mid+1,end);

    }

    // Height methods.
    public int rootHeight(){
        return height(root);
    }

    public int height(Node<E> node){
        if(node == null){
            return -1;
        }
        node.height = Math.max(getHeight(node.left),getHeight(node.right)) + 1;
        return node.height;
    }

    // Finding Nodes
    public Node<E> findNode(E value)
    {
        return findNode(value,root);
    }

    private Node<E> findNode(E value, Node<E> node){
        if((Integer)(value) == (Integer)node.value){
            return node;
        }
        if((Integer)(value) < (Integer)node.value){
           return  findNode(value,node.left);
        }
        if((Integer)(value) > (Integer)node.value){
            return findNode(value,node.right);
        }

        return null;
    }

    // Checking the bst in balanced or not.
    public boolean balanced(){
        return balanced(root);
    }

    private boolean balanced(Node<E> node)
    {
        if(node==null){
            return true;
        }

        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && balanced(node.left) && balanced(node.right)  ;
    }



    // Displaying the Binary Search Tree
    public void display(){
        display(root,"Root Node : ");
    }
    private void display(Node<E> node,String detail){
        if(node == null){
            return;
        }
        System.out.println(detail + node.value);

        display(node.left,"Left Child of " + node.value + " : ");
        display(node.right,"Right Child of " + node.value + " : ");
    }

    // Traversals
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node<E> node)
    {
        if(node==null){
            return;
        }
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);

    }

}
