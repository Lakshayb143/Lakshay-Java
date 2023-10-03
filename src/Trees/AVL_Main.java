package Trees;

public class AVL_Main
{
    public static void main(String[] args){
        AVL_BST<Integer> bst = new AVL_BST<>();

        for(int i = 0 ; i < 1000 ; i++){
            bst.insert(i);
        }
        System.out.println(bst.height());

    }
}
