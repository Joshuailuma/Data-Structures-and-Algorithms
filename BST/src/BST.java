import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BST {
    Node root;

    static class Node {
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

    // Breadth first search. We would use an array
     public ArrayList<Integer> BFS(){
        // Add node to a queue
        // Remove node from queue, add the value to an array,
         // Check if node has a left and right child,
         // add them to the queue
        Node currentNode = root;
         Queue<Node> queue = new LinkedList<>();
         ArrayList<Integer> results = new ArrayList<>();
         queue.add(currentNode);

         while (queue.size() > 0){
             currentNode = queue.remove();
             results.add(currentNode.value);
             if (currentNode.left != null){
                 queue.add(currentNode.left);
             }
             if (currentNode.right != null){
                 queue.add(currentNode.right);
             }
         }
         return results;
     }

     ArrayList<Integer> DFSPreOrder(){
        ArrayList<Integer> results = new ArrayList<>();

        class Transverse{
            Transverse(Node currentNode){
                results.add(currentNode.value);
                if(currentNode.left != null){
                    new Transverse(currentNode.left);
                }
                if(currentNode.right != null){
                    new Transverse(currentNode.right);
                }
            }
        }
        new  Transverse(root);
        return results;
    }

    ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();
        class Transverse {
            Transverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Transverse(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Transverse(currentNode.right);
                }
                results.add(currentNode.value);
            }
        }
        new Transverse(root);
        return results;
    }

    ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> results = new ArrayList<>();
        class Transverse {
            Transverse(Node currentNode) {
                if (currentNode.left != null) {
                    new Transverse(currentNode.left);
                }
                results.add(currentNode.value);
                if (currentNode.right != null) {
                    new Transverse(currentNode.right);
                }
            }
        }
        new Transverse(root);
        return results;
    }
    // Java Program for Lowest Common Ancestor
// in a Binary Tree
// A O(n) solution to find LCA of
// two given values n1 and n2


}
