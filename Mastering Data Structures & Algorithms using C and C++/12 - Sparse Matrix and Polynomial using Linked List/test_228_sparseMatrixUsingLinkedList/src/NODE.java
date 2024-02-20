//singly linked list
public class NODE {
    private int column;
    private Integer element=null;
    private NODE next=null;

    public NODE(Integer element, Integer column) {
        this.element = element;
        this.column=column;
    }

    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public NODE getNext() {
        return next;
    }

    public void setNext(NODE next) {
        this.next = next;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
}
