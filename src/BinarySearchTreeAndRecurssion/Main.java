package BinarySearchTreeAndRecurssion;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(52);
//        myBST.insert(82);
//
//        myBST.insert(27);
//
//        System.out.println(myBST.root.left.right.value);
//
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(27);
//        myBST.insert(52);
//        myBST.insert(82);

//        System.out.println(myBST.contains(27));
//        System.out.println(myBST.contains(83));

//        System.out.println(myBST.rContains(83));

//        myBST.rInsert(2);
//        myBST.rInsert(1);
//        myBST.rInsert(3);
//
//        System.out.println(myBST.root.value);
//        System.out.println(myBST.root.left.value);
//        System.out.println(myBST.root.right.value);

            myBST.insert(47);
            myBST.insert(21);
            myBST.insert(76);
            myBST.insert(18);
            myBST.insert(27);
            myBST.insert(52);
            myBST.insert(82);

        System.out.println(myBST.BFS());

    }
}
