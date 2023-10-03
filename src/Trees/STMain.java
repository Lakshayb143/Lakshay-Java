package Trees;

public class STMain
{
    public static void main(String[] args)
    {
        int[] arr = {3,8,7,6,-2,-8,4,9};
        int [] array = {5,4,9,10,4};
        SegmentTree segmentTree = new SegmentTree(arr);
        System.out.println(segmentTree.getRootValue());
//        System.out.println(segmentTree.getRoot());
//        segmentTree.display();


        int ans = segmentTree.sum(1,6);
        System.out.println(ans);

//        segmentTree.update(0,13);
//        System.out.println(segmentTree.getRootValue());

    }
}
