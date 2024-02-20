//My imple.(not smart/real field dev. : following deep dive course)

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Hashtable size");

        ChainHash obj= new ChainHash(sc.nextInt());

        obj.insert(12);
        obj.insert(23);
        obj.insert(24);
        obj.insert(89);
        obj.insert(34);
        obj.insert(2);
        obj.insert(23);
        obj.insert(67);
        obj.insert(99);
        obj.insert(23);

        System.out.println(Arrays.toString(obj.array));

//        System.out.println(obj.search(12));
//        System.out.println(obj.search(99));
//        System.out.println(obj.search(89));
//        System.out.println(obj.search(11));
//        System.out.println(obj.search(2));

        System.out.println("removed : ");
        System.out.println(obj.remove(67));
        System.out.println(obj.remove(12));
        System.out.println(obj.remove(23));
        System.out.println(obj.remove(100));

        System.out.println(Arrays.toString(obj.array));


    }
}
