package academy.learnprogramming.stackschallenge;

import sun.rmi.transport.proxy.CGIHandler;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // should return true
       checkForPalindrome("abccba");
        // should return true
       checkForPalindrome("Was it a car or a cat I saw?");
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        //should return false
        System.out.println(checkForPalindrome("hello"));
        //should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }



//    public static void checkForPalindrome(String string) {
//
//        Stack<Character> stack= new Stack();
//        //StringBuilder st= new StringBuilder(string.length()); // will be used to store new string without space and punctuation marks
//        String st="";
//
//        string=string.toLowerCase();
//
//        for(int i=0;i<string.length();i++){
//            if(string.charAt(i)>='a' && string.charAt(i)<='z'){
//                st=st+string.charAt(i);
//            }
//        }
//
//        System.out.println(st);
//
//    }

       // OR my implementation : works fine

    public static boolean checkForPalindrome(String string) {

        Stack<Character> stack= new Stack();
        char[] a = new char[string.length()];
        string=string.toLowerCase();

        int i=0; int j=0; // i> iterate over string, j> a
        while( i<string.length() ){
            if(string.charAt(i)>='a' && string.charAt(i)<='z') {// string.charAt(i)>='a' && string.charAt(i)<='z'  doesn't consider spaces & punctuation marks in the string
                a[j++] = string.charAt(i); //storing the non punct. & space free, lower cased string here
                stack.push(string.charAt(i));
            }
            i++;
        }

        j=0;
        while( !stack.isEmpty() ){
            if(stack.pop()==a[j++]){}
            else {
                return false;
            }
        }
        return  true;
    }
}
