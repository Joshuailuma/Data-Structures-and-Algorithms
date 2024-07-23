public class BST {
    Node root;

    class Node {
        int value;
        Node left;
        Node right;

        private Node(int value){
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return  true;
        }
        Node temp = root;

        while (true){
            if (root.value == newNode.value) return false;
            //== LEFT==
            if (newNode.value < root.value){
                // Insert the node if left is free
                if(temp.left == null){
                    temp.left = newNode;
                    return true;
                }
                // move pointer forward.
                temp = temp.left;

            } else {
                // == INSERT IN RIGHT ==
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                // Move pointer
                temp = temp.right;
            }
        }
    }
    public boolean contains(int value){
        Node temp = root;
        while(temp !=null){
            if(value < temp.value){
                temp = temp.left;
            }else if(value > temp.value ){
                temp = temp.right;
            }else {
                return true; // Here temp equals value
            }
        }
        return false;
    }
}
