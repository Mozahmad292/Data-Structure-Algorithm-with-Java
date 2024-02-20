import java.util.LinkedList;
import java.util.ListIterator;

public class HashTable {

    private Node[] hashtable;
    private int volume = 0; // no. of elements currently present in hashtable

    public HashTable(int size) { //hashtable size
        hashtable = new Node[size];
    }

    //my imple: works fine
    //put= add()
    public void put(String key, Employee employee) {
        //checking if table is full or not
        if (volume == hashtable.length) {
            System.out.println("Sorry! Hashtable is full, can't add " + employee);
            return;
        }
        //table not full, so adding:
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null) { //

            hashedKey = (hashedKey + 1) % hashtable.length; // 1st probing(probing: the increment)
            while (hashtable[hashedKey] != null) {
                hashedKey = (hashedKey + 1) % hashtable.length; // probing
            }
            hashtable[hashedKey] = new Node(key, employee);
            volume++;

        } else {
            hashtable[hashedKey] = new Node(key, employee);
            volume++;
        }
    }

    //get(..) : retrieve an item from htable
    public Employee get(String key) {

        int hashedKey = hashKey(key);

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) { // for checking 2nd condition, 1st con. needs to be checked, otherwise : exception may occur(no such thing exp.)
            return hashtable[hashedKey].employee; //directly found in exact key position
        } else { // not found so need to probe(increment)

            hashedKey = findKey(key, hashedKey);
            if (hashedKey == -1) {
                return null; //item not in ht
            } else {
                return hashtable[hashedKey].employee;
            }

        }

    }

    //used inside get(..)
    private int findKey(String key, int hashedKey) {

        int stopIndex = hashedKey; // where to stop; avoid infinite loop
        hashedKey = (hashedKey + 1) % hashtable.length; //1st prove/increment

        while (hashedKey != stopIndex &&
                hashtable[hashedKey] != null &&
                !hashtable[hashedKey].key.equals(key)) { // 3rd condition, there's a !(not) sign
            hashedKey = (hashedKey + 1) % hashtable.length; //Linear probing
        }

        if (hashedKey == stopIndex || hashtable[hashedKey] == null) {
            return -1; //item not in hashtable
        } else {
            return hashedKey; // found
        }

    }

    // remove(..) same as get(..) : just made the array cell null/removed
    public Employee remove(String key) {

        Employee removedEmployee = null;
        int hashedKey = hashKey(key);

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) { // for checking 2nd condition, 1st con. needs to be checked, otherwise : exception may occur(no such thing exp.)
            removedEmployee = hashtable[hashedKey].employee;
            hashtable[hashedKey] = null;
            volume--;
        }
        else { // not found so need to probe(increment)

            hashedKey = findKey(key, hashedKey);
            if (hashedKey == -1) {
                //System.out.print("(Employee not found) ");
                return null; //item not in ht
            } else {
                removedEmployee = hashtable[hashedKey].employee;
                hashtable[hashedKey] = null;
                volume--;
            }

        }
        //removing done, now rehashing part
        volume=0;// will be incremented inside put(..) method
        Node[] oldHashTable = hashtable;
        hashtable= new Node[oldHashTable.length];
        for(int i=0; i< oldHashTable.length; i++){
            if (oldHashTable[i] != null) {
                put(oldHashTable[i].key, oldHashTable[i].employee);
            }
        }

        return removedEmployee;
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void printHashTable() {
        for (int i = 0; i < hashtable.length; i++) {

            if (hashtable[i] == null) { //this position of the hashtable is empty; no elements in this index
                System.out.println("position " + i + ": empty");
            } else {
                System.out.print("position " + i + ": ");
                System.out.println(hashtable[i].employee);
            }
        }
        System.out.println();
    }

}
