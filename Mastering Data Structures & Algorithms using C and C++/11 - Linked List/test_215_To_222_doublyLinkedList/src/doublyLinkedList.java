//non-circular
public class doublyLinkedList {

    private int size;
    private NODE head;
    private NODE tail;


    //getters n setters
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public NODE getHead() {
        return head;
    }

    public void setHead(NODE head) {
        this.head = head;
    }

    public NODE getTail() {
        return tail;
    }

    public void setTail(NODE tail) {
        this.tail = tail;
    }

    //end getters n setters


    void addToFront(Integer newElement){

        NODE newNode= new NODE(newElement);

        if(size==0){
            head=newNode;
            size++;
        }
        else{
            newNode.setNext(head);
            head.setPrev(newNode);
            head=newNode;
            size++;
        }
    }


    boolean setTail() {
        if (size == 0) {
            return false;
        } else if (size == 1) {
            tail = head;
            return true;
        } else {
            for (NODE current = head; current != null; current = current.getNext()) {
                if (current.getNext() == null) {
                    tail = current;
                    return true;
                }
            }
        }
        return false; //won't reach here
    }


    //217 : insert new element in any position
    boolean insert(int pos, Integer ele){
        NODE newNode= new NODE(ele);

        if (pos>size){ // we consider indexing(virtual) like array starts from 0
            return false;
        }
        else if (size==0){
            head=tail=newNode;
            size++;
            return true;
        } else if (pos==size) {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail=newNode;
            size++;
        }

        else{
            if(pos==0){ // below for loop won't handle if position = 0 (pos=0 && size!=0
                newNode.setNext(head);
                head=newNode;
                size++;
                return true;
            }

            int count=-1;
            for(NODE current=head; current!=null; current=current.getNext()){
                count++;
                if(count==pos-1){
                    newNode.setNext(current.getNext());
                    newNode.setPrev(current);

                    current.getNext().setPrev(newNode);
                    current.setNext(newNode);
                    size++;
                    return true;
                }
            }
        }

        return false;
    }


    //219 : deleting element
    //remove from front; head
    void removeFront(){
        if(size==0){
            System.out.println("no elements to remove");
        }
        else if(size==1){
            head=tail=null;
        }
        else{
            head.getNext().setPrev(null);
            head=head.getNext();
        }
        size--;
    }


    //219 : deleting element
    //remove from any position specified

    void remove(int pos){

        if(pos>=size || pos<0){
            System.out.println("no such index");
            return;
        } else if (pos==0 && size==1) {
            head = tail = null;
            size--;
        } else if (pos==0 || size==1) {
            removeFront();
        }

        else if (pos==size-1) { //last element
            removeFromEnd();
        }

        else{
            int count=0;
            for(NODE current=head;current!=null;current=current.getNext()){
                if(count==pos-1){
                    current.setNext(current.getNext().getNext());
                    current.getNext().setPrev(current);
                    size--; return;
                }
                count++;
            }
        }
    }

    //delete from end/tail
    void removeFromEnd(){
        if(size==0){
            System.out.println("no elements to remove");
            return;
        }
        else if(size==1){
            head=tail=null;
        }
        else{
            for (NODE current = head; current != null; current = current.getNext()) {
                if (current.getNext().getNext() == null) {
                    current.setNext(null);
                    tail = current;
                }
            }
        }
        size--;
    }

    // 221 - Reverse a Doubly Linked List
    void reverse(){
        tail=head;
        NODE p=head;
        NODE tmp;
        int TMP=0;
        while(p!=null){

        tmp=p.getNext();
        p.setNext(p.getPrev());
        p.setPrev(tmp);

        p=p.getPrev(); //iterator ; as next node now indicated by prev

             if(TMP==0 && p.getNext()==null){
                head=p;
                TMP=1;
            }
        }
    }


    // 221 - Reverse a Doubly Linked List
    //2nd way
    void reverse_2nd(){
        int iterate=0;
        int tmp;

        NODE p=head;
        NODE q=tail;

         while(iterate<=size/2 ){
             tmp=p.getElement();
             p.setElement(q.getElement());
             q.setElement(tmp);

             p=p.getNext();
             q=q.getPrev();
             iterate++;

         }
    }

    void printList(){

        for(NODE current=head; current!=null; current=current.getNext()){
            System.out.print(current.getElement()+ " ");
        }
        System.out.println();
    }

    void printList(doublyLinkedList a){

        for(NODE current=a.getHead(); current!=null; current=current.getNext()){
            System.out.print(current.getElement()+ " ");
        }
        System.out.println();
    }


}
