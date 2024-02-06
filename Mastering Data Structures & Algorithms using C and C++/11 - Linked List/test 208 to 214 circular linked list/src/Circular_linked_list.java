public class Circular_linked_list {

    private NODE head;
    private NODE tail;
    private int size;
    private static NODE current;
    static int flag=0;


    //getters and setters :
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    //end  of setters and getters


    //add element to the front( at head position
    void addToFront(Integer newElement){

        NODE newNode= new NODE(newElement);

        if(size==0){
            head=newNode;
            tail=head;
            tail.setNext(head);
            size++;
        }
        else{
            newNode.setNext(head);
            head=newNode;
            tail.setNext(head);
            size++;
        }

    }

    //add element at the end of the list
    void addToEnd(int ele){
        NODE newNode= new NODE(ele);
        tail.setNext(newNode);
        tail=newNode;
        tail.setNext(head);
        size++;
    }


    //211 : insert a new element/node at a given position
    void insert(int pos, Integer ele){
        NODE newNode= new NODE(ele);

        if (pos>size && size!=0){ // we consider indexing(virtual) like array ; starts from 0
        //do nothing return
        }

        else if (pos==size){ // insert at end of the list; after tail
            addToEnd(ele);
        }

        else if(size==0){
            System.out.println("as list is empty, inserted in 0 position");
            head=newNode;
            tail=head;
            tail.setNext(head);
            size++;
        }

        else if (pos == 0) { // below for loop won't handle if position = 0 (pos=0 && size!=0
            newNode.setNext(head);
            head = newNode;
            tail.setNext(head);
            size++;
        }

        else {
                int count = -1;
                for (NODE current = head; current.getNext() != head; current = current.getNext()) {
                    count++;
                    if (count == pos - 1) {
                        newNode.setNext(current.getNext());
                        current.setNext(newNode);
                        size++;
                    }
                }
        }

    }


    //213 - Deleting From Circular Linked List
    void delete(int pos){

        if(pos>=size || pos<0){
            System.out.println("invalid index");
        }
        else if(pos==0){
            deleteFromHead();
        }
        else {
            int count=0;
            for(NODE current=head;current.getNext()!=head;current=current.getNext()){
                if(count==pos-1){
                    current.setNext(current.getNext().getNext());

                    if(current.getNext().getNext()==head){ //when deleting last node; set tail
                        tail=current;
                    }
                    size--; return;
                }
                count++;
            }
        }
    }

    void deleteFromHead(){
        tail.setNext(head.getNext());
        head=head.getNext();
        size--;
    }

    void deleteFromTail() {

        NODE current;
        for (current = head.getNext(); current.getNext().getNext() != head; current = current.getNext()) {
        }
        current.setNext(head);
        tail=current;
        size--;
    }

    //209 : print the circular list
    void printList(){
        NODE current= head;

        do{
            System.out.print(current.getElement()+" ");
            current=current.getNext();
        }while(current!=head);
        System.out.println();

    }


    //209 : print the circular list recursive way

    void print_recursive(){
        // flag set value 0 static

        if(flag==0){ // this loop enters for the first time only
            current=head; //current static
        }
        if( current!=head || flag==0 ){
            System.out.print(current.getElement()+ " ");
            current=current.getNext();
            flag=1;
            print_recursive();
        }
    }

}
