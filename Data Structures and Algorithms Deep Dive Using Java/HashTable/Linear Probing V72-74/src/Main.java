import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // throughout the process , considering employee last name as unique, so used that as key

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);
        Employee harryPt = new Employee("Harry", "Pt", 79);
        Employee abdullahJahangir = new Employee("Abdullah", "Jahangir", 345);
        Employee abdullahAhmadMoz = new Employee("Abdullah", "Moz", 780);
        Employee sadikAbdullah = new Employee("Sadik", "Abdullah", 7899);
        Employee saifKhan = new Employee("Saif", "Khan", 7840);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of Hashtable");

        HashTable ht= new HashTable(sc.nextInt());

        ht.put("Jones", janeJones); // we are considering lastname as key
        ht.put("Doe", johnDoe);
        ht.put("Smith", marySmith);
        ht.put("Wilson", mikeWilson);
        ht.put("End", billEnd);
        ht.put("Pt", harryPt);
        ht.put("Jahangir",abdullahJahangir );
        ht.put("Moz", abdullahAhmadMoz);

        System.out.println("After Adding : ");
        ht.printHashTable();
        System.out.println();

//        System.out.println("Retrieved: ");
//        System.out.println(ht.get("Jones"));
//        System.out.println(ht.get("Doe"));
//        System.out.println(ht.get("Pt"));
//        System.out.println(ht.get("End"));
//        System.out.println();

        System.out.println("Removed Employee: ");
        System.out.println(ht.remove("End"));
        System.out.println(ht.remove("Pt"));
        System.out.println(ht.remove("smith")); // will not found, small s instead S
        System.out.println(ht.remove("Smith"));
        System.out.println();

        System.out.println("After Removing, the hashTable : ");
        ht.printHashTable();

        ht.put("Abdullah",sadikAbdullah );
        ht.put("Khan", saifKhan );
        System.out.println("After 2nd time addtion of new Employee, the hashTable : ");
        ht.printHashTable();

    }
}
