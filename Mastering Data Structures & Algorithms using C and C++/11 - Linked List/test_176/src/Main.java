// didn't work
import java.util.LinkedList;
import java.util.Iterator;
public class Main {
    static Iterator iter;
    static LinkedList<Integer> list;
    public static void main(String[] args) {

        list= new LinkedList<>();
        iter= list.iterator();

        list.addFirst(89);
        list.addFirst(56);
        list.addFirst(78);
        list.addFirst(34);
        list.addFirst(12);
        list.addFirst(100);
        recursiveDisplay();

    }

    static void recursiveDisplay(){

        if(iter.hasNext()) {
            System.out.println(iter.next());
            recursiveDisplay();
        }

    }

}