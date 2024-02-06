import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Circular_linked_list list = new Circular_linked_list();

        //211 :inserting element in circular list :  forming the circular list
        System.out.println("Enter elements for the list  :");
        list.addToFront(sc.nextInt());
        list.addToFront(sc.nextInt());
        list.addToFront(sc.nextInt());
        list.addToFront(sc.nextInt());
        list.addToFront(sc.nextInt());

        System.out.println("after creating the list : ");
        list.printList();  //209 : print the circular list
        System.out.println("size = " + list.getSize());
        System.out.println();


//        //209 : print the circular list in recursive way
//        System.out.println("printing in recursive way :");
//        list.print_recursive();


//        //211 : insert a new element/node at a given position (indexing(virtual) starts from zero like arrays
//        System.out.println("enter insert position and element : ");
//        list.insert(sc.nextInt(),sc.nextInt()); //(position,element)
//        System.out.println("after inserting the element, the list : ");
//        list.printList();
//        System.out.println();
//        System.out.println("size : "+list.getSize());


//        list.deleteFromHead();
//        list.printList();
//        System.out.println("size : " + list.getSize());

//        list.deleteFromTail();
//        list.printList();
//        System.out.println("size : "+list.getSize());

//        //213 - Deleting From Circular Linked List(delete by position)
//        System.out.println("enter delete position : "); //position starts(assumes) from zero
//        list.delete(sc.nextInt());
//        list.delete(sc.nextInt());
//        System.out.println("after deleting, the list : ");
//        list.printList();
//        System.out.println("size : "+list.getSize());





    }
}