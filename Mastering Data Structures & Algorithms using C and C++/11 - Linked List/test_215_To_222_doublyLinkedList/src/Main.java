import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        doublyLinkedList list = new doublyLinkedList();

        //forming the list
        System.out.println("Enter elements for list  :");
        list.addToFront(sc.nextInt());
        list.addToFront(sc.nextInt());
        list.addToFront(sc.nextInt());
        list.addToFront(sc.nextInt());
        list.addToFront(sc.nextInt());
        list.setTail();

        System.out.println("after creating the list : ");
        list.printList();
        System.out.println("size = " + list.getSize());
        System.out.println();


//        //217 : insert new element in any position
//        //NB : enter size as position to add at the end
//        System.out.println("enter insert position and element : ");
//        list.insert(sc.nextInt(),sc.nextInt()); //(position,element)
//        list.printList();
//        System.out.println("size : "+list.getSize());


//        //219 : deleting element from front
//        list.removeFront();
//        list.printList();
//        System.out.println("size : "+list.getSize());

//        //delete element from end side
//        list.removeFromEnd();
//        list.printList();
//        System.out.println("size : "+list.getSize());

//        //219 : deleting element from specified position
//        // virtual indexing starts from 0 to size-1 like array
//        System.out.println("enter element position to remove");
//        list.remove(sc.nextInt());
//        list.printList();
//        System.out.println("size : "+list.getSize());
//
//        list.remove(sc.nextInt());
//        list.printList();
//        System.out.println("size : "+list.getSize());

//        // 221 - Reverse a Doubly Linked List
//        System.out.println("after reversing, the list : ");
////        list.reverse();
////        list.printList();
//        //2nd way : m
//        list.reverse_2nd();
//        list.printList();


    }
}