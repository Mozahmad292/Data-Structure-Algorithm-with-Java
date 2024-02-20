// Circular Queue
public class ArrayQueue {
    private int front;
    private int back; //=rear
    private int size; //no. of ele. presents in queue
    private Employee[] Queue;

    public ArrayQueue(int capacity) {
        Queue = new Employee[capacity];
    }

    // Abdul Bari concept and my imple.(bit changed from him)
    public void add(Employee newEmployee) {
        if (size == Queue.length) {
            System.out.println("Queue is full");
            //throw new StackOverflowError("Queue is full");
        } else {
            back = (back + 1) % Queue.length; //back increment
            Queue[back] = newEmployee;
            size++;
        }
    }

   // Abdul Bari concept and my imple.(bit changed from him)
    public Employee remove(){
        Employee removedEmployee=null;// null > just for initialization

        if(size==0){
            System.out.println("Queue is empty");
            // throw new Exception()
        }else{
            front=(front+1)% Queue.length; //front increment
            removedEmployee= Queue[front];
            Queue[front]=null;
            size--;
        }
        return removedEmployee;
    }

    //return variable size(no. of elements in queue)
    public int size(){
        return size;
    }

    public void display(){
        for(int i = (front+1)%Queue.length ; i<=back ; i = (i+1)%Queue.length ){
            System.out.print(Queue[i]+" < ");
        }
        System.out.println();
    }

    //get the front 1st/front element in queue
    public Employee peek() {
        if (size == 0) {
            return null;
        } else {
            return Queue[(front+1)%Queue.length];
        }
    }
}