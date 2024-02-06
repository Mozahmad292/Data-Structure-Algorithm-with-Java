import java.util.LinkedList;
import java.util.ListIterator;

//key : Employee last name
// hashedkey : hashtable index(mapped from key)
public class ChainedHashtable {
    private LinkedList<Node>[] hashtable; //hashtable is always an array(m probs)

    //constructor
    public ChainedHashtable(int size){
        hashtable= new LinkedList[size];
        for(int i=0;i<hashtable.length;i++){
            hashtable[i]= new LinkedList<Node>();
        }
    }

    //key : Employee last name
    // hashedkey : hashtable index(mapped from key)
    public void put(String key, Employee employee){
        int hashedKey= hashKey(key);
        hashtable[hashedKey].add( new Node(key, employee) );
    }

    private int hashKey(String key){
        //return key.length() % hashtable.length;
        //OR
        return Math.abs(key.hashCode() % hashtable.length); // commonly used //
    }

    public Employee get(String key){
        int hashedKey= hashKey(key);
        ListIterator<Node> iter = hashtable[hashedKey].listIterator();

        Employee employee=null;
        while (iter.hasNext()){
            Node node =iter.next();
            if(node.key.equals(key)){ //comparing if equals
                return node.employee;
            }
        }
        return null; // not present in hashtable
    }

    public  Employee remove(String key) {
        int hashedKey = hashKey(key);
        ListIterator<Node> iter = hashtable[hashedKey].listIterator();

        if (hashtable[hashedKey].isEmpty()) { // the key is wrong, no ele. at that position, as list is empty
            return null;
        }
        else {
            Employee employee=null;
            while (iter.hasNext()){ // 1st traversal
                Node node =iter.next();
                if(node.key.equals(key)){ //comparing if equals
                    hashtable[hashedKey].remove(node); //2nd traversal : remove(node) method
                    return node.employee;
                }
            }
        }
        return null;
    }

//    //OR (a bit better performance) in the 2nd traversal now it won't need to compare with each object in the list
//    public  Employee remove(String key) {
//        int hashedKey = hashKey(key);
//        ListIterator<Node> iter = hashtable[hashedKey].listIterator();
//
//        if (hashtable[hashedKey].isEmpty()) { // the key is wrong, no ele. at that position, as list is empty
//            return null;
//        }
//        else {
//            Employee employee=null;
//            int index=-1;
//            while (iter.hasNext()){ // 1st traversal
//                Node node =iter.next();
//                index++;
//                if(node.key.equals(key)){ //comparing if equals
//                    hashtable[hashedKey].remove(index);  //2nd traversal : remove(index) method
//                    return node.employee;
//                }
//            }
//        }
//        return null;
//    }

    public void printHashTable(){
        for(int i=0; i<hashtable.length;i++){

            if (hashtable[i].isEmpty()) { //linkedlist at this position of the hashtable is empty; having no elements
                System.out.print("position " +i+ ": empty" );
            }
            else{
                System.out.print("position " +i+ ": " );
                ListIterator<Node> iter= hashtable[i].listIterator();
                while (iter.hasNext()) {
                    System.out.print(iter.next().employee+" -> ");
                }
                System.out.print("null"); //as end of list
            }
            System.out.println();
        }
    }

}
