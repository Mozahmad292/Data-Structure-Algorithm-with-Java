//used generics
public class StackUsingArray <T> {
    T [] A;
    int size; //array size
    int top; //stack top element index no.

    public StackUsingArray(int size){
        this.size=size;
        A=(T[]) new Object[size];
        top=-1;
    }


    //insert element
    void push(T element){

        if(top==size-1){
            System.out.println("Stack Overflow!!");
        }else{
            A[++top]=element;
        }
    }


    //delete element
    T pop(){
        T x=null;
        if(top==-1){
            System.out.println("Stack underflow"); //no elements
        }else{
            x=A[top--];
        }
        return x;
    }

    //peek an element
    //position : see video
    T peek(int position){

        int index=top-position+1; //mapping from position to index
        T x=null;

        if(index<0){
            System.out.println(" invalid position ");
        }else{
            x= A[index];
        }

        return x;
    }


    //retrieve top element
    T stackTop(){
        T x= null;
        if(top==-1){
            System.out.println("empty");
        }else{
            x=A[top];
        }
        return x;
    }

    //check if stack is empty
    boolean isEmpty(){
        boolean x=false;

        if(top==-1){
            x=true;
        }
        return x;
    }

    boolean isFull(){
        boolean x=false;

        if(top==size-1){ //full
            x=true;
        }

        return x;
    }


    //print stack
    void print(){
        for(int i=0;i<=top;i++){
            System.out.println(A[i]);
        }
        //System.out.println();
    }
}