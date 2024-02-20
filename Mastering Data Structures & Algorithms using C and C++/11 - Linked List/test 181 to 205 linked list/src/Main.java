import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        linkedList list= new linkedList();
        linkedList list2= new linkedList();

        //forming list
        System.out.println("Enter elements for list 1 :");
        list.addToFront(sc.nextInt());
        list.addToFront(sc.nextInt());
        list.addToFront(sc.nextInt());
        list.addToFront(sc.nextInt());
        list.addToFront(sc.nextInt());
        list.addToFront(sc.nextInt());
        list.setTail();

        System.out.println("after creating the list 1 : ");
        list.printList();
        System.out.println("size = "+list.getSize());
        System.out.println();

        //forming 2nd list list2
        System.out.println("Enter elements for list 2 :");
        list2.addToFront(sc.nextInt());
        list2.addToFront(sc.nextInt());
        list2.addToFront(sc.nextInt());
        list2.addToFront(sc.nextInt());
        list2.addToFront(sc.nextInt());
        list2.setTail();

        System.out.println("after creating the list 2 : ");
        list2.printList();
        System.out.println("size = "+list2.getSize());
        System.out.println();


//        System.out.print("tail :"+list.getTail().getElement());
//        System.out.println();

//        //finding max element
//        System.out.println("max : "+list.findMax());
//
//        //searching an element ; virtual indexing starts from zero
//        System.out.println("search for? ");
//        System.out.println(list.search(sc.nextInt()));
//        //list.recursive_search(sc.nextInt()); // doesn't work; bit problem
//
//        //vedio 184 : search for a node and place that node as head
//        System.out.println("enter node(element) to bring at the beginning : ");
//        list.bring_to_head(sc.nextInt());
//        list.printList();

//        //186 : insert a new element/node at a given position
//        System.out.println("enter insert position and element : ");
//        list.insert(sc.nextInt(),sc.nextInt()); //(position,element)
//        list.printList();


//        //189 : add new element/node to end
//        System.out.println("enter elemets to add at end ");
//        list.addToEnd(sc.nextInt()); //(element)
//        list.addToEnd(sc.nextInt()); //(element)
//        list.addToEnd(sc.nextInt()); //(element)
//        list.printList();
//        System.out.println();
//        System.out.println("head ="+list.getHead().getElement()+" tail ="+list.getTail().getElement()+" size =" +list.getSize());


//        // sort the list in asc. order
//        list.sortAsc();
//        System.out.println("after sorting the list :");
//        list.printList();
//        System.out.println();
//
//        //190 : insert at a sorted position( in a sorted list; sort the list first
//        System.out.println("enter element to be added at sorted position :");
//        list.insert_sorted_position(sc.nextInt());
//        list.printList();
//        System.out.println("size = "+list.getSize());

        //192 : delete element from front
//        System.out.println("after deleting from head, the list : ");
//        list.remove();// delete from head
//        list.printList();
//        System.out.println("size = "+list.getSize());

        //192 : delete element from end
//        System.out.println("after deleting from end/tail, the list : ");
//        list.removeFromEnd(); // delete from tail
//        list.printList();
//        System.out.println("size = "+list.getSize());
//        System.out.println(list.getTail().getElement());

//        //192 : delete specified element
//        System.out.println("which element to remove : ");
//        list.remove(sc.nextInt());// delete specified element
//        System.out.println("after deleting the element,the list : ");
//        list.printList();
//        System.out.println("size = "+list.getSize());

        //194 : Check if a Linked List is Sorted or not
        //skipped ;easy

//        //196 - Remove Duplicates from ascending Sorted Linked List (2 methods)
//        list.removeDupSort();
//        System.out.println("after removing duplicate elements(if any) from the sorted list, the list : ");
//        list.printList();
//        System.out.println("size = "+list.getSize());


//        //198 - Reversing a Linked List(1st way)
//        //reversing elements using auxiliary array
//        list.reverse_1();
//        System.out.println("after reversing , the list : ");
//        list.printList();
//        System.out.println();


//        //199 : reversing a Linked List(2nd way)
//        //reversing the links in opposite direction
//        list.reverse_2();
//        System.out.println("after reversing , the list : ");
//        list.printList();
//        System.out.println();


//        //199 : reversing a Linked List(3rd way)
//        //reversing the links in opposite direction (Abdul Bari algo.)
//        list.reverse_3();
//        System.out.println("after reversing , the list : ");
//        list.printList();
//        System.out.println();

        //200 : reversing a Linked List(4th way)
        // reversing using recursion
        //skipped easy later


//        // 203 : merging 2 sorted linked-list
//        list.sortAsc();
//        System.out.println("list 1 sorted : ");
//        list.printList(list);
//
//        list2.sortAsc();
//        System.out.println("list 2 sorted : ");
//        list2.printList(list2);
//
//        System.out.println("after merging the sorted lists - list 1 and list 2 : ");
//        linkedList mergedList= list.merging(list,list2);
//        mergedList.setTail();
//        mergedList.printList(mergedList);
//        System.out.println("size : "+ mergedList.getSize());
//        System.out.println();


        //205 - Check for LOOP in a Linked List : if any loop is there in the list
        list.getTail().setNext(list.getHead());
        list.anyLoop();





    }
}