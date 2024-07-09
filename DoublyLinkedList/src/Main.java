public class Main {
    /**
     * Please uncomment the titles you want to try
    * */
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
//        doublyLinkedList.append(2);
//        doublyLinkedList.append(3);
//        doublyLinkedList.append(4);
//        doublyLinkedList.printList();

        //====REMOVE LAST =====
//        doublyLinkedList.printList();
//        System.out.println("Removing last");
//        var yu = doublyLinkedList.removeLast();
//        System.out.println(doublyLinkedList.removeLast());
//        doublyLinkedList.printList();

        //==== PREPEND =====
//        doublyLinkedList.printList();
//        System.out.println("Prepending");
//        doublyLinkedList.prepend(3);
//        doublyLinkedList.printList();

        //==== REMOVE FIRST =====
//        doublyLinkedList.printList();
//        System.out.println("Removing first");
//        System.out.println(doublyLinkedList.removeFirst().value);

        //==== GET ITEM =====
//        doublyLinkedList.printList();
//        System.out.println("Getting item");
//        System.out.println(doublyLinkedList.get(2).value);

        //==== SET ITEM =====
//        doublyLinkedList.printList();
//        System.out.println("Setting item");
//        System.out.println(doublyLinkedList.set(9, 8));
//        doublyLinkedList.printList();

        //==== INSERT ITEM =====
//        doublyLinkedList.printList();
//        System.out.println("Inserting item");
//        System.out.println(doublyLinkedList.insert(9, 8));
//        doublyLinkedList.printList();

        //==== REMOVE ITEM =====
//        doublyLinkedList.printList();
//        System.out.println("Removing item");
//        System.out.println("Removed "+doublyLinkedList.remove(2).value);
//
//        doublyLinkedList.printList();

        //==== SWAP 1ST AND LAST =====
//        doublyLinkedList.printList();
//        System.out.println("Swapping items");
//        System.out.println(doublyLinkedList.swapFirstLast());
//
//        doublyLinkedList.printList();

        //==== SWAP 1ST AND LAST =====
//        doublyLinkedList.printList();
//        System.out.println("Reversing items");
//        doublyLinkedList.reverse();
//
//        doublyLinkedList.printList();

        //==== CHECK IF IT IS PALINDROME =====
        doublyLinkedList.append(2);
        doublyLinkedList.append(4);
        doublyLinkedList.append(4);
        doublyLinkedList.append(4);
        doublyLinkedList.append(2);
        doublyLinkedList.append(1);
        doublyLinkedList.printList();
        System.out.println("Checking Palindrome");
        System.out.println(doublyLinkedList.isPalindrome());
    }
}