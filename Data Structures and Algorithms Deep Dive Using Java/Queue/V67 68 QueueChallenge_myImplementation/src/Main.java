//100% ok
// Easy

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // should return true
        System.out.println(checkPalindrome("abccba"));
        // should return true
        System.out.println(checkPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkPalindrome("hello"));
        // should return true
        System.out.println(checkPalindrome("Don't nod"));

    }


    static boolean checkPalindrome(String st) {

        Stack<Character> stack = new Stack();
        ArrayDeque<Character> queue = new ArrayDeque(); // Queue is an interface in java, not a class, so we
        // cannot create object of Queue; so using a class which implements Queue Interface, e.g. ArrayDeque,
        //Linked list etc.(these classes have same methods of ADT Queue)

        //**** OR ****(Instructor)
//        LinkedList<Character> stack = new LinkedList<Character>();
//        LinkedList<Character> queue = new LinkedList<Character>();

        String new_st = st.replaceAll("[^a-zA-Z]+", "").toLowerCase(); // 2 methods applied
        //replaceAll() explained:
        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        // https://stackoverflow.com/questions/21946042/remove-all-spaces-and-punctuation-anything-not-a-letter-from-a-string

        for (int i = 0; i < new_st.length(); i++) {
            char c = new_st.charAt(i);
            stack.push(c); //adding
            queue.addLast(c); //adding

        }

        for (int i = 0; i < queue.size(); i++) { // or i<stack.size()
            if (queue.removeFirst() != stack.pop()) {
                return false;
            }
        }
        return true;
    }

}
