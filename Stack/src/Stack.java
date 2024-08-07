public class Stack {

    private Node top;
    private int height;

    public Stack(int value){
        this.top = new Node(value);
        this.height =1;
    }

    class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public void printList(){
        Node temp = top;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void push(int value){
        Node newNode = new Node(value);
        if (height == 0){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }
}
