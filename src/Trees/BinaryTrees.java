package Trees;
import java.util.Scanner;

public class BinaryTrees<E>
{
    private Node<E> root;

    public BinaryTrees(){
        populate(new Scanner(System.in));
    }


    public void populate(Scanner scanner)
    {
        System.out.println("Enter the root node = ");
        E value = (E)(scanner.next());
        root = new Node<>(value);
        populate(scanner,root);

    }

    private void populate(Scanner scanner , Node<E> node){
        System.out.println("Do you want to enter to the left of " + node.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value for the left of " + node.value);
            E value = (E)(scanner.next());
            node.Left = new Node(value);
            populate(scanner,node.Left);
        }

        System.out.println("Do you want to enter to the right of " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value for the right of " + node.value);
            E value = (E)(scanner.next());
            node.Right = new Node<>(value);
            populate(scanner,node.Right);
        }
    }

    public void display()
    {
        display(root,"");
    }

    private void display(Node<E> node , String indent)
    {
        if(node==null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.Left,indent+"\t");
        display(node.Right,indent+"\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    private void prettyDisplay(Node<E> node,int level)
    {
        if(node == null){
            return;
        }

        prettyDisplay(node.Right,level+1);
        if(level!=0){
            for(int i = 0;i<level-1;i++){
                System.out.print("|\t\t");
            }
            System.out.println("|---------->"+node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.Left,level+1);
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
        preOrder(node.Left);
        preOrder(node.Right);

    }

    public void inOrder(){
        inOrder(root);
    }
    public void inOrder(Node<E> node)
    {
        if(node == null){
            return;
        }
        inOrder(node.Left);
        System.out.println(node.value);
        inOrder(node.Right);
    }

    public void postOrder(){
        postOrder(root);
    }
    public void postOrder(Node<E> node){
        if(node == null){
            return;
        }

        postOrder(node.Left);
        postOrder(node.Right);
        System.out.println(node.value);
    }


    private static class Node<E>{
        E value;
        Node<E> Left;
        Node<E> Right;

        public Node(E value){
            this.value = value;
        }
        public Node(E value,Node<E> Left){
            this.value = value;
            this.Left = Left;
        }
        public Node(E value,Node<E> Left,Node<E> Right){
            this.value = value;
            this.Left =Left;
            this.Right = Right;
        }
    }
}
