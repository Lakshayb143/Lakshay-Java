package Trees;

import org.w3c.dom.ls.LSOutput;

public class SegmentTree
{
    private static class Node
    {
        int value;
        int startInterval;
        int endInterval;

        Node left;
        Node right;

        public Node(int startInterval  , int endInterval){
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

        @Override
        public String toString(){
            return "Value of the node -> " + this.value+ " & Interval -> " + "[" +this.startInterval+ ","+this.endInterval+"]";
        }

    }


    private Node root;

    public SegmentTree(int[] arr)
    {
        // Now we got a array, we have to create a tree;
        // My approach
//        root = new Node(0,arr.length-1);
//        createTree(root,arr);

        // Another appraoch
        this.root = constructTree(arr,0,arr.length -1);
    }


    // My approach
    private int createTree(Node node , int[] arr)
    {
        if(node.startInterval == node.endInterval) {
            return arr[node.startInterval];
        }
        // Initialising Left and Right Nodes.
        int mid = (node.startInterval + node.endInterval) /2;
        node.left = new Node(node.startInterval,mid);
        node.right = new Node(mid+1,node.endInterval);


        node.value = (createTree(node.left,arr) + createTree(node.right,arr));
        return node.value;
    }

    // another approach
    private Node constructTree(int[] arr , int start , int end)
    {
        if(start == end){
            Node leaf = new Node(start,end);
            leaf.value = arr[start];
            return leaf;
        }

        // Creating a node with given start and end
        Node node = new Node(start , end);

        int mid = (start+end)/2;
        node.left = this.constructTree(arr,start,mid);
        node.right = this.constructTree(arr,mid+1,end);

        node.value = node.left.value + node.right.value;

        return node;
    }


    // Basic Functions
    public int getRootValue(){
        return root.value;
    }

    public Node getRoot(){
        return this.root;
    }

    public Node getNode(Node node){
        return node;
    }

    // Queries
    public int sum(int qStart , int qEnd)
    {
        return sum(this.root,qStart,qEnd);
    }

    private int sum(Node node, int qStart , int qEnd)
    {
        if(node.startInterval >= qStart && node.endInterval <= qEnd){
            // we know node is completely inside the query
            return node.value;
        }
        else if(node.startInterval > qEnd || node.endInterval < qStart){
            // completely outside the interval;
            return 0;
        }
        else{
            return sum(node.left,qStart,qEnd) + sum(node.right,qStart,qEnd);
        }

    }


    // Updating the values in the array
    public void update(int index , int value)
    {
        this.root.value = update(root,index,value);
    }
    private int update(Node node,int index,int newValue)
    {
        if(index >= node.startInterval && index <= node.endInterval){
            if(index == node.startInterval && index==node.endInterval){
                node.value = newValue;
                return node.value;
            }else{
                int leftAns = update(node.left,index,newValue);
                int rightAns = update(node.right,index,newValue);

                node.value = leftAns + rightAns;
                return node.value;
            }
        }
        return node.value;



    }


    // Displaying the tree
    public void display()
    {
        display(this.root);
    }
    private void display(Node node)
    {
        String str = "";
        if(node.left!=null){
            str = str + "Interval = [" + node.left.startInterval +","+node.left.endInterval+"] and data : "+node.left.value +" -> ";
        }else{
            str = str + " No Left child ";
        }

        // For current Node
        str = str + "Interval = [" + node.startInterval +","+node.endInterval+"] and data : "+node.value +" -> ";
        if(node.right != null){
            str = str + "Interval = [" + node.right.startInterval +","+node.right.endInterval+"] and data : "+node.right.value ;
        }else{
            str = str + " No Right child ";
        }

        System.out.println(str+"\n");

        // Calling recursion
        if(node.left != null){
            display(node.left);
        }
        if(node.right != null){
            display(node.right);
        }
    }


}
