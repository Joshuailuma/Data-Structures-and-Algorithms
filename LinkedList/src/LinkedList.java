public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

   public class Node {
        public int value;
        public Node next;
        Node(int value){
            this.value = value;
        }
    }
    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this. length = 1;
    }

    public Node getHead() {
        return head;

    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }
    public void printList(){
       Node temp = head;
       while (temp != null){
           System.out.println(temp.value);
           temp = temp.next;
       }
    }

    public void append(int value){
        Node node = new Node(value);
        if (length == 0){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        length ++;
    }

    public Node removeLast(){
        Node temp = head;
        Node theNext = temp.next;
        if(length == 1 || length == 0){
            head = null;
            tail = null;
            return null;
        } else {
            while (theNext.next != null){
                temp = theNext;
                theNext = theNext.next;

            }
            tail = temp;
            tail.next = null;
            length --;
            return theNext;
        }
    }

    public Node prepend(int value){
        Node newNode = new Node(value);
        if(length ==0){
            head = newNode;
            tail = newNode;
            length++;
            return head;
        }else {
            newNode.next = head;
            head = newNode;
            length++;
            return head;
        }
    }

    public Node removeFirst(){
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length --;
        if (length == 0){
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        Node temp = head;
        if (index < 0 || index >= length) return null;
        for (int i =0; i < length; i++){
            if(i ==0){
                temp = head;
            }

            if (i == index){
                return temp;
            }
            temp = temp.next;
        }
        return  temp;
    }

    // Or use this. And seems to be better
    public Node gett(int index){
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i =0; i < index; i++){
            temp = temp.next;
        }
        return  temp;
    }

    public boolean set(int index, int value){
        Node temp = gett(index);
        if(temp !=null){
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value){
        if(index <0 || index > length) return false;
        if(index == 0) {
            prepend(value);
            return true;
        }

        if(index == length-1){
            append(value);
            return true;
        }

            Node temp = gett(index-1);
            Node newNode =  new Node(value);
            newNode.next = temp.next;
        temp.next = newNode;
            length++;
        return true;
    }
    public Node remove(int index){
        if(index < 0 || index > length) return null;
        if(index == 0) return removeFirst();

        if (index == length) return removeLast();
        Node prev = gett(index-1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length --;
        return temp;
    }
    public void reverse(){
        Node before = null;
        Node temp = head;
        Node after = null;
        head = tail;
        tail = temp;

        for (int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before; //Flip pointer backward
            before= temp;
            temp = after;
        }
    }

    public Node findMiddleNode(){
        Node fast = head;
        Node slow =head;

        while (fast!= null &&fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean hasLoop(){
        Node fast = head;
        Node slow =head;

        while (fast!= null &&fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    public Node findKthNodeFromEnd(int index){
       reverse();
       return gett(index-1);
    }
}
