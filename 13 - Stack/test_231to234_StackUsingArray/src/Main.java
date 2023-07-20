import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of Stack");
        StackUsingArray<Integer> obj= new StackUsingArray<>(sc.nextInt()); //Used generics

        //inserting elements
        System.out.println("enter elements");
        obj.push(sc.nextInt());
        obj.push(sc.nextInt());
        obj.push(sc.nextInt());
        obj.push(sc.nextInt());
        obj.print();
        System.out.println("top index "+obj.top);
        System.out.println();

        //deleting elements
        obj.pop();
        obj.print();
        System.out.println("top index "+obj.top);

        //peek an element
        System.out.println("first position : "+obj.peek(1));
        System.out.println("third position : "+obj.peek(3));
        System.out.println();

        //retrieve top element
        System.out.println("Stack top element : "+obj.stackTop());

        System.out.println("Stack empty? "+obj.isEmpty()); //true means empty
        System.out.println("full? "+obj.isFull());
    }
}
