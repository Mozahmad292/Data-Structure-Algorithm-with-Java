// convertToPostfix: without bracket and only handled left to right associativity ( general complete method > see
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner sc;
    public static void main(String[] args){

        sc=new Scanner(System.in);
        System.out.println("Enter the infix expression");
        String st_infix=sc.next();
        char[] A_infix=st_infix.toCharArray();
        String st_postfix=convertToPostfix(A_infix);
        System.out.println(st_postfix);
    }

    static String convertToPostfix(char[] A_infix){

        StackUsingArray<Character> stack= new StackUsingArray<>(A_infix.length+1);  // for #( next line
        stack.push('#'); // to avoid error in line 29 ; stack top becomes null and can't compare
        char[] A_postfix=new char[A_infix.length];

        int i=0,j=0;
        while(i<A_infix.length) {

            if ( isOperand(A_infix[i]) ) {
                A_postfix[j++]=A_infix[i++];
            }
            else{
                if( Precedence(A_infix[i]) > Precedence(stack.stackTop()) ){
                    stack.push(A_infix[i++]);
                }else{
                    A_postfix[j++]= stack.pop();
                }
            }
        }

        // leftover in stack
        while (stack.stackTop()!='#'){
            A_postfix[j++]= stack.pop();
        }

        // from char array to String
        String st_postfix = new String(A_postfix);
        return st_postfix;
    }


    //check if the char is operand or not(operator)
    static boolean isOperand(char a){

        if(a=='+' || a=='-' || a=='*' || a=='/'){
            return  false;
        }else{
            return true;
        }

    }


    //returns precedence of the operators ; if char= null, returns 0
    static int Precedence(char a){

        if(a=='+' || a=='-'){
            return 1;
        } else if (a=='*' || a=='/') {
            return 2;
        }
        return 0;
    }


}
