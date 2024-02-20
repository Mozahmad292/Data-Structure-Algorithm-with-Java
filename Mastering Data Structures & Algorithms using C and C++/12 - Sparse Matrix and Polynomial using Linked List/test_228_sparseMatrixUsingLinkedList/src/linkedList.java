//typical singly linked list

public class linkedList {
    private NODE head;
    private NODE tail;
    private int size;
    private int COUNT;
    private NODE current;
    private int a = 0;


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
    void addToEnd(Integer ele, Integer column) {
        NODE newNode = new NODE(ele, column);

        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

}

