package academy.learnprogramming.challenge2;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    //my imple ok
    public void insertSorted(Integer value) {

        IntegerNode newNode=new IntegerNode(value);

        if(head==null || value<=head.getValue()){ // no elements in the list
            addToFront(value);
        }

        else{
            for(IntegerNode current=head; current!=null;current=current.getNext()){

                if(value > current.getValue()) {

                    if (current.getNext() == null) { // current is the last node of the list, so value is placed at the end
                        current.setNext(newNode);
                        size++;
                    }

                    else if (value < current.getNext().getValue()) { // value is placed in between 2 nodes
                        newNode.setNext(current.getNext());
                        current.setNext(newNode);
                        size++;
                    }
                }

            }

        }

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
