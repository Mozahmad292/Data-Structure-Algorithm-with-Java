//My imple.(not smart/real dev.)
import java.util.LinkedList;
import java.util.ListIterator;

public class ChainHash <T>{  // used generic myself
    LinkedList[] array; // an array of type LinkedList

    public ChainHash(int size) {
        array = new LinkedList[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new LinkedList<T>();
        }
    }

    public void insert(T element){
        int index=hashfunction(element);
        array[index].add(element);
    }

    public boolean search(T element) {

        int index=hashfunction(element);
        if(array[index].indexOf(element)!=-1){  //LinkedList.indexOf(Object) method returns index of the specified object(first occurrence index), if not found returns -1
            return true;
        }
        return false;
    }



    public T remove(T element){

        int index=hashfunction(element);
        //int innerIndex=array[index].indexOf(element);

        ListIterator<T> iter= array[index].listIterator();

        while (iter.hasNext()){
            if(iter.next()==element){
                array[index].remove(element);
               return element;
            }
        }
        return null;
    }
    public int hashfunction(T element){
        return (Integer) element % array.length;  //(Integer) : as return type is int
    }
}
