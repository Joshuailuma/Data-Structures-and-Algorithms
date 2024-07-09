public class Main {
    /**
     * Please uncomment the titles you want to try
    * */
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(0);

        //=========APPEND VALUES============
//        System.out.println(linkedList.getTail());
//        linkedList.append(2); // Append a value
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);


        //========= REMOVE LAST============

//        linkedList.printList();
//        System.out.println("Removing last");
//        linkedList.removeLast();
//        linkedList.printList();
//        System.out.println(linkedList.getLength());
//        System.out.println("Done");


        //======== PREPEND VALUES ===============
//        linkedList.printList();
//        System.out.println("Prepending values");
//
//        linkedList.prepend(5);
//        linkedList.printList();



        //======== REMOVE FIRST ===============
//        linkedList.printList();
//        System.out.println("Removing first");
//        linkedList.removeFirst();

        //======== GET AT INDEX ===============
//        linkedList.printList();
//        System.out.println("Getting at index");
//        System.out.println(linkedList.gett(0).value);



        //======== SET AT INDEX ===============
//        linkedList.printList();
//        System.out.println("Setting at index");
//        System.out.println(linkedList.set(0,0));
//        linkedList.printList();



        //======== Add AT INDEX ===============
//        linkedList.printList();
//        System.out.println("Inserting at index");
//        linkedList.insert(1,9);
//        linkedList.printList();

        //======== Remove AT INDEX ===============
//        linkedList.printList();
//        System.out.println("Removing at index");
//        System.out.println("Removed "+linkedList.remove(2).value);
//        linkedList.printList();



        //======== REVERSE ===============
//        linkedList.printList();
//        System.out.println("Reversing");
//        linkedList.reverse();
//        linkedList.printList();



        //======== FIND MIDDLE NODE===============
      /**
       * mplement a method called findMiddleNode that returns the middle node of the linked list.
       *
       * If the list has an even number of nodes, the method should return the second middle node.
       *
       *
       * Method signature:
       *
       * public Node findMiddleNode()
       *
       *
       *
       *
       * Example:
       *
       * LinkedList myList = new LinkedList(1);
       * myList.append(2);
       * myList.append(3);
       * myList.append(4);
       * myList.append(5);
       * Node middleNode = myList.findMiddleNode();
       * System.out.println(middleNode.value); // Output: 3
       *
       * myList.append(6);
       * middleNode = myList.findMiddleNode();
       * System.out.println(middleNode.value); // Output: 4
       *
       *
       * When the linked list has an odd number of nodes, like 1 -> 2 -> 3 -> 4 -> 5, the function will find the exact middle node. In this case, it will return the node containing the value 3.
       *
       * When the linked list has an even number of nodes, there will be two middle nodes. The findMiddleNode function will return the second of these two middle nodes.
       *
       * For example, if the linked list is 1 -> 2 -> 3 -> 4 -> 5 -> 6, the two middle nodes are 3 and 4. The function will return the node containing the value 4.
       *
       *
       *
       * Note:
       *
       * In this problem, you should use the slow and fast pointer technique (also known as Floyd's Tortoise and Hare algorithm) to find the middle element of the linked list efficiently.
       *
       * The key idea is to have two pointers, one that moves twice as fast as the other. By the time the fast pointer reaches the end of the linked list, the slow pointer will be at the middle.
       *
       *
       *
       * DO NOT use the length attribute in your solution.
       * */
//        linkedList.printList();
//        System.out.println("Getting middle");
//        System.out.println("The middle node is "+linkedList.findMiddleNode().value);



        //======== HAS A LOOP ===============
        /**
         * Write a method called hasLoop that is part of the linked list class.
         *
         * The method should be able to detect if there is a cycle or loop present in the linked list.
         *
         * The method should utilize Floyd's cycle-finding algorithm, also known as the "tortoise and hare" algorithm, to determine the presence of a loop efficiently.
         *
         * The method should follow these guidelines:
         *
         *
         *
         * Create two pointers, slow and fast, both initially pointing to the head of the linked list.
         *
         * Traverse the list with the slow pointer moving one step at a time, while the fast pointer moves two steps at a time.
         *
         * If there is a loop in the list, the fast pointer will eventually meet the slow pointer. If this occurs, the method should return true.
         *
         * If the fast pointer reaches the end of the list or encounters a null value, it means there is no loop in the list. In this case, the method should return false.
         *
         *
         *
         * Output:
         *
         * Return true if the linked list has a loop.
         *
         * Return false if the linked list does not have a loop.
         *
         *
         *
         * Constraints:
         *
         * You are not allowed to use any additional data structures (such as arrays) or modify the existing data structure.
         *
         * You can only traverse the linked list once.
         * */
        // create a loop by connecting the tail to the second node

//        linkedList.getTail().next = linkedList.getHead().next;
//
//        System.out.println("Checking if there is a loop");
//        System.out.println( linkedList.hasLoop());


        //======== FIND KTH NODE===============

        /**
         * Implement a method called findKthFromEnd that returns the k-th node from the end of the list.
         *
         * If the list has fewer than k nodes, the method should return null.
         *
         * Note: This implementation of the Linked List class does not have the length attribute.
         *
         * Method signature:
         *
         * public Node findKthFromEnd(int k)
         *
         *
         * Example:
         *
         * LinkedList myList = new LinkedList(1);
         * myList.append(2);
         * myList.append(3);
         * myList.append(4);
         * myList.append(5);
         *
         * Node result = myList.findKthFromEnd(2); // Output: Node with value 4
         *
         * result = myList.findKthFromEnd(5); // Output: Node with value 1
         *
         * result = myList.findKthFromEnd(6); // Output: null
         * */

             linkedList.printList();
        System.out.println("Finding kth node");
        System.out.println(linkedList.findKthNodeFromEnd(1).value);

    }
}