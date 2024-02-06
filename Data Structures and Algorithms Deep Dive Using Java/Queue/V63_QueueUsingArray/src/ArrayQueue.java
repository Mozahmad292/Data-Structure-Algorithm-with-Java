import java.util.NoSuchElementException;

public class ArrayQueue {
    private int front;
    private int back;
    private Employee[] Queue;

    public ArrayQueue(int capacity){
        Queue= new Employee[capacity];
    }

    public void add(Employee employee){

        if(back== Queue.length){
            Employee[] newArray = new Employee[Queue.length*2];
            System.arraycopy(Queue, 0, newArray, 0,Queue.length);
            Queue=newArray;
        }

        Queue[back]=employee;
        back++; //
    }

    public Employee remove(){
        if(size()==0){
            throw new NoSuchElementException();
        }

        Employee removedEmployee= Queue[front];
        Queue[front]=null;
        front++;

        if(size()==0){ // like new, from beginning
            front=back=0;
        }

        return removedEmployee;
    }

    public int size(){ //how many elements are now in queue
        return back-front;
    }

    public Employee peek(){
        if(size()==0){
            throw new NoSuchElementException();
        }
        return Queue[front];
    }

    public void printQueue(){
        for (int i=front; i<back;i++){
            System.out.println(Queue[i]);
        }
    }

}
