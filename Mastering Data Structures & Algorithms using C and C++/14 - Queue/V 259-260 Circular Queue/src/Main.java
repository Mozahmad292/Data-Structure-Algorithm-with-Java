import java.util.Queue;

//this class taken from deep dive java course
public class Main {

    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(10);

        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);
        queue.display();
        
        System.out.println();
        System.out.println(queue.peek());
        System.out.println(queue.size());

//        queue.remove();
//        queue.remove();
//        System.out.println(queue.peek());
//        System.out.println(queue.size());
//        //queue.display();

//        //System.out.println(queue.peek());
//        queue.remove();
//        queue.remove();
//        queue.remove();
//        //queue.display();
//        System.out.println(queue.peek());
//        //queue.remove();
//
//        queue.add(mikeWilson);
//
//
//        queue.display();

    }
}
