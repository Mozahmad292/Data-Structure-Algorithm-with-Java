import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee harryPotter = new Employee("Harry","Potter",3789);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the HashTable(array)");
        ChainedHashtable ht= new ChainedHashtable(sc.nextInt());

        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);
        ht.put("Potter", harryPotter);

        ht.printHashTable();
        System.out.println();

//        System.out.println(ht.get("Doe"));
//        System.out.println(ht.get("Wilson"));
//        System.out.println(ht.get("Potter"));

        System.out.println("removed : ");
        System.out.println(ht.remove("Doe"));
        System.out.println(ht.remove("Potter"));
        System.out.println(ht.remove("Wilson"));
        System.out.println();

        ht.printHashTable();
    }
}
