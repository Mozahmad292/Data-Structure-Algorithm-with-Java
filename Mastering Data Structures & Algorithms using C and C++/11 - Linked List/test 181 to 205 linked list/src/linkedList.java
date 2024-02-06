//recursive_search() doesn't work; bit problem
//typical singly linked list
public class linkedList {
    private NODE head;
    private NODE tail;
    private int size;
    private int COUNT;
    private NODE current;
    private int a=0;


    //getters and setters :
    public NODE getHead() {
        return head;
    }

    public void setHead(NODE head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCOUNT() {
        return COUNT;
    }

    public void setCOUNT(int COUNT) {
        this.COUNT = COUNT;
    }

    public NODE getTail() {
        return tail;
    }


    public NODE getCurrent() {
        return current;
    }

    public void setCurrent(NODE current) {
        this.current = current;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    //end  of setters and getters

    void addToFront(Integer newElement){

        NODE newNode= new NODE(newElement);

        if(size==0){
            head=newNode;
            size++;
        }
        else{
            newNode.setNext(head);
            head=newNode;
            size++;
        }
    }

    //set tail on current list; just make the last node as tail
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


    //189 : add a node to end( at tail
    void addToEnd(Integer ele){
        NODE newNode= new NODE(ele);

        if(size==0){
            head=newNode;
            tail=newNode;
        }else{
            tail.setNext(newNode);
            tail=newNode;
        }
        size++;
    }
    Integer findMax(){

        Integer max= head.getElement();
        for(NODE current=head.getNext() ; current!=null; current=current.getNext()){
            if(current.getElement() >max){
                max=current.getElement();
            }
        }
        return max;
    }

    //linear search using loop
    String search(Integer key){

        if(size==0){
            return "no elements";
        }
        int count=-1;
        for(NODE current=head ; current!=null; current=current.getNext()){
            count++;
            if(current.getElement()==key){
                return "key is in "+ current+ ".Node/cell no. "+count;
            }
        }
        return "not here";
    }

    //doesn't work, a bit problem
    String recursive_search(Integer key){
        if(a==0){
            current=head;
            a++;
        }
        //System.out.println("current "+current.getElement());
        if(current==null){
            return "";
        }
        COUNT++;

        if(current.getElement()==key){
            return key +" is in "+ current+ ".Node/cell no. "+COUNT;
        }
        System.out.println("current : "+current.getElement());
        current=current.getNext();
        recursive_search(key);

        return "";
    }


    //vedio 184; search and bring a node at the beginning : make it head
    boolean bring_to_head(Integer key){

        if(head==null){
            return false;
        }else if(key== head.getElement()){
            return true;
        }

        for(NODE current=head ; current!=null; current=current.getNext()){
            if(current.getNext()!=null && current.getNext().getElement()==key){
                NODE tmp= current.getNext();
                current.setNext(current.getNext().getNext());
                tmp.setNext(head);
                head=tmp;
            }else if(current.getNext()==null && current.getElement()==key){ // last element which won't be handled by the for loop below
                return true;
            }
        }
        return false;
    }

    //186 : insert new node at any position
    boolean insert(int pos, Integer ele){
        NODE newNode= new NODE(ele);

        if (size==0){
            head=newNode;
            size++;
            return true;
        }

        else if (pos>=size){ // we consider indexing(virtual) like array starts from 0
            return false;
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
                    current.setNext(newNode);
                    size++;
                    return true;
                }
            }
        }

        return false;
    }


    void sortAsc(){
        Integer tmp;
        for(NODE current=head; current!=null; current=current.getNext()) {

            for(NODE inner_current=current; inner_current!=null; inner_current=inner_current.getNext()) {

                if(inner_current.getElement() < current.getElement()){  ////swaping
                    tmp=current.getElement();
                    current.setElement(inner_current.getElement());
                    inner_current.setElement(tmp);
                }

            }
        }
    }

    //190 : insert at sorted position (in sorted list
    void insert_sorted_position(Integer element){

        NODE newNode= new NODE(element);

        if(size==0){
            head=tail=newNode;
            size++;
        }
        else if(element >= tail.getElement()){ // element is max., so place at tail position
            tail.setNext(newNode);
            tail=newNode;
            size++;
        }
        else if( element<=head.getElement() ) { //element is min. so place at head position
            newNode.setNext(head);
            head=newNode;
            size++;
        }
        else {

            for (NODE current = head; current.getNext() != null; current = current.getNext()) {

                if (element <= current.getNext().getElement()) {
                    newNode.setNext(current.getNext());
                    current.setNext(newNode);
                    size++; return;
                }
            }
        }

    }

    //192 : deleting element
    void remove(){  //remove from front; head
        if(size==0){
            System.out.println("no elements to remove");
        }
        else if(size==1){
            head=tail=null;
        }
        else{
            head=head.getNext();
        }
        size--;
    }

    //192 : deleting element/node
    void removeFromEnd(){
        if(size==0){
            System.out.println("no elements to remove");
        }
        else if(size==1){
            head=tail=null;
        }
        else{
            for (NODE current = head; current != null; current = current.getNext()) {
                if (current.getNext().getNext() == null) {
                    tail = current;
                    tail.setNext(null);
                }
            }
        }
        size--;
    }

    //192 : deleting first occurrence of specified element
    boolean remove(Integer element){
        if(size==0){
            return false;
        }

        else if(element==head.getElement()){
            head=head.getNext();
            size--; return true;
        }
        else if (element==tail.getElement()) {
            removeFromEnd();
            return true;
        }
        else if(size==1 && element==head.getElement()){
            head=tail=null;
            size--; return true;
        }
        else {
            for(NODE current=head; current.getNext()!=null; current=current.getNext()){
                if(current.getNext().getElement()==element){
                    current.setNext(current.getNext().getNext());
                    size--; return true;
                }
            }
        }
        return false;
    }


    //196 - Remove Duplicates from ascending Sorted Linked List
    //1st way
//    void removeDupSort(){
//
//        if(head==null || size==1){
//            return;
//        }
//
//        for(NODE current =head; current.getNext()!=null; current=current.getNext()){
//
//            if(current.getElement()==current.getNext().getElement()){
//
//                if(current.getNext().getNext()==null){ // current is the 2nd last element
//                    current.setNext(null); // OR  current.setNext(current.getNext().getNext());    same thing
//                    size--;
//                    break;
//                }
//                current.setNext(current.getNext().getNext());
//                size--;
//            }
//
//        }
//    }


    //196 - Remove Duplicates from ascending Sorted Linked List
    //2nd way
    void removeDupSort(){

        if(head==null || size==1){
            return;
        }

        NODE p=head;
        NODE q=head.getNext();
        while(q!=null) {
            if (p.getElement() == q.getElement()) {
                p.setNext(q.getNext());
                q = p.getNext();
                size--;
            } else { //just move on ; increment(++) part of the loop
                p = q;
                q = q.getNext();
            }
        }
        //while ends
    }


    //198 - Reversing a Linked List(1st way)
    //reversing elements using auxiliary array
    void reverse_1(){

        //copying the elements into an array
        int[] a=new int[size];
        int i=0;
        for(NODE current=head; current!=null; current=current.getNext()){
            a[i++]=current.getElement();
        }

        //from array back to the list into reverse order
        current=head;
        for(i=a.length-1; i>-1; i--){
            current.setElement(a[i]);
            current=current.getNext();
        }

    }

    //199 : reversing a Linked List(2nd way)
    //reversing the links in opposite direction (my imple. : bit lengthy!)
    void reverse_2(){
        NODE p=head.getNext();
        NODE pprev=head;// p's previous node
        NODE pnext=p.getNext(); //p's next node


        NODE PNEXTTMP;
        p.setNext(pprev);
        pprev.setNext(null); //current head becomes tail
        PNEXTTMP=pnext.getNext();
        pnext.setNext(p);

        //sliding/iterator
        pprev=p;
        p=pnext;
        pnext=PNEXTTMP;

        while(pnext!=null){
            PNEXTTMP=pnext.getNext();
            pnext.setNext(p);

            //sliding/iterator
            p=pnext;
            pnext=PNEXTTMP;

        }
        head=p; // now tail becomes head

    }

    //199 : reversing a Linked List(3rd way)
    //reversing the links in opposite direction (Abdul Bari algo.)
    void reverse_3(){
        NODE p=head;
        NODE q=null,r=null;

        while (p!=null){
            //sliding/iterator
            r=q;
            q=p;
            p=p.getNext();

            q.setNext(r);
        }
        head=q;
    }


    // 203 : merging 2 sorted linked-list
    linkedList merging(linkedList list1, linkedList list2){

        linkedList mergedList= new linkedList();
        NODE TAIL; // last node till now(like iterator

        NODE current1 =list1.getHead(); //iterator over list1
        NODE current2 =list2.getHead(); //iterator over list2

        //initially head, TAIL set
        if(current1.getElement() < current2.getElement()){
            mergedList.setHead(current1);
            TAIL= current1;
            current1=current1.getNext();
            TAIL.setNext(null);
            mergedList.size++;
        }
        else{
            mergedList.setHead(current2);
            TAIL= current2;
            current2=current2.getNext();
            TAIL.setNext(null);
            mergedList.size++;
        }


        while(current1!=null && current2!=null) {

            if (current1.getElement() < current2.getElement()) {
                TAIL.setNext(current1);
                TAIL = current1;
                current1 = current1.getNext(); //iterating over the list1
                TAIL.setNext(null);
                mergedList.size++;
            } else {
                TAIL.setNext(current2);
                TAIL = current2;
                current2 = current2.getNext(); //iterating over the list2
                TAIL.setNext(null);
                mergedList.size++;
            }
        }

        //if any nodes left from either lists ;one finishes
        while(current1!=null){
            TAIL.setNext(current1);
            TAIL = current1;
            current1 = current1.getNext(); //iterating over the list1
            TAIL.setNext(null);
            mergedList.size++;
        }
        while(current2!=null){
            TAIL.setNext(current2);
            TAIL = current2;
            current2 = current2.getNext(); //iterating over the list2
            TAIL.setNext(null);
            mergedList.size++;
        }
        return mergedList;
    }


    //205 - Check for LOOP in a Linked List : if any loop is there in the list
    void anyLoop(){
        NODE p,q;
        p=q=head;
        int tmp=0;

        if(size==0 || size==1 ){
            System.out.println("no loop");
        }

        else{
            while(p!=null && q!=null){
                if(tmp!=0 && p==q){
                    System.out.println("here's a loop");
                    return;
                }
                else{
                    p=p.getNext();
                    q=q.getNext().getNext();
                    tmp=1;
                }
            }
            System.out.println("no lopp");
        }

    }

    void printList(){

        for(NODE current=head; current!=null; current=current.getNext()){
            System.out.print(current.getElement()+ " ");
        }
        System.out.println();
    }

    void printList(linkedList a){

        for(NODE current=a.getHead(); current!=null; current=current.getNext()){
            System.out.print(current.getElement()+ " ");
        }
        System.out.println();
    }
}
