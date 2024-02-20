import java.util.Scanner;

public class Main {

    private static Scanner sc;
    private static char[] A_postfix;
    private static char[] A_infix;
    public static void main(String[] args){

        sc=new Scanner(System.in);

        //infix to postfix conversion
        System.out.println("Enter the infix expression");
        String st_infix=sc.next();
        A_infix= st_infix.toCharArray();
        String st_postfix=convertToPostfix();
        System.out.println("postfix form : "+st_postfix);

        //evaluation of converted postfix expression; nb. enter any numeric infix expression during conversion
        int eval=evaluation();
        System.out.println("Evaluation on postfix : "+eval);
    }

    //249
    static String convertToPostfix(){

        StackUsingArray<Character> stack= new StackUsingArray<>(A_infix.length+1);  // for #( next line
        stack.push('#'); // to avoid error in line 29 ; stack top becomes null and can't compare
        A_postfix=new char[A_infix.length+1]; // for '|' :  see line 53

        int i=0,j=0;
        while(i<A_infix.length) {

            if ( isOperand(A_infix[i]) ) {
                A_postfix[j++]=A_infix[i++];
            }
            else {
                if (outStackPrecedence(A_infix[i]) > inStackPrecedence(stack.stackTopElement())) {
                    stack.push(A_infix[i++]);
                } else if (outStackPrecedence(A_infix[i]) == inStackPrecedence(stack.stackTopElement())) {
                    stack.pop();
                    i++;
                } else {
                    A_postfix[j++] = stack.pop();
                }
            }
        }

        // leftover in stack
        while (stack.stackTopElement()!='#'){
            A_postfix[j++]= stack.pop();
        }
        A_postfix[j]='|';

        // from char array to String
        String st_postfix="";
        int ii=0;
        while (A_postfix[ii]!='|'){
            st_postfix=st_postfix+A_postfix[ii];
            ii++;
        }

        return st_postfix;
    }
    // method ends



    //check if the char is operand or not(operator)
    static boolean isOperand(char a){

        if(a=='+' || a=='-' || a=='*' || a=='/' || a=='^' || a=='(' || a==')'){
            return  false;
        }else{
            return true;
        }

    }


    //
    static int inStackPrecedence(char a){

        if(a=='+' || a=='-'){
            return 2;
        } else if (a=='*' || a=='/') {
            return 4;
        } else if (a=='^') {
            return 5;
        } else if (a=='(') {
            return 0;
        }
        return -1;
    }


    //
    static int outStackPrecedence(char a){

        if(a=='+' || a=='-'){
            return 1;
        } else if (a=='*' || a=='/') {
            return 3;
        } else if (a=='^') {
            return 6;
        } else if (a=='(') {
            return 7;
        } else {
            return 0;  // for a == ')'
        }
    }



    //250,51 : evaluation of postfix expression
    static int evaluation(){

        StackUsingArray<Integer> evalStack = new StackUsingArray<>(A_postfix.length);
        int i,x1,x2,result=0;

        for(i=0;i<A_postfix.length-1;i++){ // -1 to exclude '|' : line 54

            if( isOperand(A_postfix[i]) ){
                evalStack.push( A_postfix[i]-'0');
            }else{
                x1=evalStack.pop(); x2=evalStack.pop();
                switch (A_postfix[i]){
                    case '+' :  result = x2+x1; break;
                    case '-' :  result = x2-x1; break;
                    case '*' :  result = x2*x1; break;
                    case '/' :  result = x2/x1; break;
                }
                evalStack.push(result);
            }

        }

        return evalStack.pop();
    }

}
