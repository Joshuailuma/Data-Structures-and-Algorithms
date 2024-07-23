public class Main {
    public static void main(String[] args) {
        BST binarySearchTree = new BST();
//        System.out.println("BST root is " +binarySearchTree.root);
        binarySearchTree.insert(7);
        binarySearchTree.insert(10);
        binarySearchTree.insert(6);
        binarySearchTree.insert(5);
        binarySearchTree.insert(4);
        binarySearchTree.insert(3);
        System.out.println(binarySearchTree.contains(8 ));
    }
}