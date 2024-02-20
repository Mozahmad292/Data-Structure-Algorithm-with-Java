import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] input = {54, 46, 83, 66, 95, 92, 43, -2, 100,-1};
        bucketSort(input);

        //printing sorted[]
        for (int i : input) {
            System.out.print(i + " ");
        }
    }

    public static void bucketSort(int[] input) {
        //m: finding max element to form the size of buckets/hashTable
        int size= Arrays.stream(input).max().getAsInt() ; // https://www.geeksforgeeks.org/java-program-for-program-to-find-largest-element-in-an-array/

        // buckets==the hashtable
        List<Integer>[] buckets = new LinkedList[size]; // not linked list size 10, the array size is 10
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList();
        }

        //inserting in buckets[] (hashtable)
        for (int i = 0; i < input.length; i++) {
            int value = input[i];
            buckets[hash(value)].add(value);
        }

        //sorting the linkedlists
        for (List bucket : buckets) {
            Collections.sort(bucket);
        }
        //sorting done just returning the sorted elements back to input[]
        int z=0;
        for (int i = 0; i <buckets.length;i++) {

            for(int j=0;j<buckets[i].size();j++){
                input[z++]= buckets[i].get(j);
            }

        }

    }

    //hash() == hashkey() in hashing technique
    private static int hash(int value) {
        return value / 10;
    }
}
