public class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int length;

   public class Node {
         int value;
         Node next;
         Node prev;
        Node(int value){
          this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public DoublyLinkedList (int value){
        Node newNode = new Node(value);
        head = newNode;
        tail =newNode;
        length = 1;
    }

    public Node getTail() {
        return tail;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public int printList() {
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        return length;
    }

    public Node append(int value){
        Node newNode = new Node(value);
        if (length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev =tail;
            tail = newNode;
            tail.next = null;
            length++;
        }
        return newNode;
    }

    public Node removeLast(){
        Node temp =tail;
        if (length == 0){
            return null;
        }else if(length ==1){
            head = null;
            tail = null;
        }else  {
            tail = tail.prev;
            tail.next = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        Node temp = head;
        if (length == 0) return null;
        if (length ==1){
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }
    public Node get(int index){
       if(index < 0 || index >= length) return null;
       Node temp = head;
       if(index < length/2){
       for (int i = 0; i < index; i++){
           temp = temp.next;
       }
    }else {

       temp = tail;
       for (int i = length -1; i > index; i--){
           temp = temp.prev;
       }
       }
       return temp;
    }

    public boolean set(int index, int value){

       Node temp = get(index);
       if(temp != null){

           temp.value = value;
           return true;
       }
           return false;
    }
    public boolean insert(int index, int value){
       if (index ==0){
           prepend(value);
           return true;
       }
        if (index ==length){
            append(value);
            return true;
        }
        Node temp = new Node(value);
        Node before = get(index -1);
        if(before != null){
            Node after = before.next;
            before.next = temp;
            temp.prev = before;
            temp.next = after;
            after.prev = temp;
            length++;
            return true;
        }
        return false;
    }

    public Node remove(int index){
        if (index == 0) return removeFirst();

        if (index == length-1) return removeLast();

        Node temp = get(index);
        if(temp != null){
            Node before = temp.prev;
            Node after = temp.next;
            before.next = after;
            temp.prev = null;
            temp.next = null;
            after.prev = before;
            length--;
            return temp;
        }
        return null;
    }

    public boolean swapFirstLast(){
       if (length < 2) return false;
       int headValue = head.value;
       int tailValue = tail.value;
       head.value = tailValue;
       tail.value = headValue;
       return true;

    }

    public void reverse(){
       Node temp = head;
       Node before = null;
       Node after = null;
       head = tail;
       tail = temp;
       for (int i =0; i < length; i++){
           after = temp.next;
           temp.next = before;
           before = temp;
           temp=after;
       }
    }
    public boolean isPalindrome() {
       Node begining = head;
       Node end = tail;
       int accum = 0;
       boolean result = false;
       for(int i = 0; i < length/2; i++){
           if(begining.value == end.value){
               accum = accum+1;
           }
           begining =begining.next;
           end = end.prev;
       }
       if (accum == length/2) {
           result =  true;
       }
        System.out.println(accum);
       return result;
    }
    }
