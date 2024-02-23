import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("Jane", "Jones", 123));
        employees.forEach(e -> System.out.println(e)); //just printing


        //my imple; fine
        Map<Integer, Employee> hashtable = new HashMap<>(); //key =id
        ListIterator<Employee> iterator = employees.listIterator(0); //from zero index start

        while (iterator.hasNext()) {
            Employee employee = iterator.next();

            if (hashtable.get(employee.getId()) == null) {
                hashtable.put(employee.getId(), employee); //employee.getId()=key( will be hashed by jdk
            } else {
                iterator.remove(); // the iterator removes from the linkedlist > see jdk(se9) ListIterator<>.remove()

            }
        }

        // OR : instructors (lengthy,bit complex)
//        HashMap<Integer, Employee> employeeTable = new HashMap<>();
//        ListIterator<Employee> iterator = employees.listIterator();
//        List<Employee> remove = new ArrayList<>();
//
//        while (iterator.hasNext()) {
//            Employee employee = iterator.next();
//            if (employeeTable.containsKey(employee.getId())) {
//                remove.add(employee);
//            }
//            else {
//                employeeTable.put(employee.getId(), employee);
//            }
//        }
//
//        for (Employee employee: remove) {
//            employees.remove(employee);
//        }

        System.out.println("after deleting duplicates, the linkedlist : ");
        employees.forEach(e -> System.out.println(e));


    }

}