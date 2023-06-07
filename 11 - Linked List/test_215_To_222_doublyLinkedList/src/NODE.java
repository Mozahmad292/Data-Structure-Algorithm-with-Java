public class NODE {
    private Integer element=null;
    private NODE next=null;
    private NODE prev=null; //previous node

    public NODE(Integer element) {
        this.element = element;
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

    public NODE getPrev() {
        return prev;
    }

    public void setPrev(NODE prev) {
        this.prev = prev;
    }
}
