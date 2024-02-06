import java.util.Scanner;
public class Main {
    static char [] A; //stack
    static int top=-1; //stack top element index no. ; initially -1
    //static char [] charArray;
    static  String str;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        str=sc.next();
        A= new char[str.length()]; // at max this size
        //System.out.println(isBalance());
        System.out.println(isBalanceMulti());
    }

    //240 : check if parenthesis are ok(1 type of parenthesis)
    static boolean isBalance(){

        for(int i = 0; i< str.length(); i++){
            if( str.charAt(i)=='(' ){
                push(str.charAt(i));
            }else if( str.charAt(i)==')' ){
                if(isEmpty()){
                    return false;
                }
                pop();
            }
        }
        return isEmpty()? true : false;
    }


    //242 :check if parenthesis are ok(multiple types of parenthesis)
    static boolean isBalanceMulti(){

        for(int i = 0; i< str.length(); i++){

            if( str.charAt(i) == '(' || str.charAt(i) == '{'|| str.charAt(i) =='[' ){
                push(str.charAt(i));
            }else if( str.charAt(i)==')' || str.charAt(i)=='}' || str.charAt(i)==']'){
                if(isEmpty()){
                    return false;
                }
                if( (int)A[top]==40 && (int)str.charAt(i) ==41 || (int)A[top]==91 && (int)str.charAt(i)==93 || (int)A[top]==123 && (int)str.charAt(i)==125 ) {
                    pop();
                }
            }

        }
        return isEmpty()? true : false;
    }

    static void push(char element){
        A[++top]=element;
    }

    //delete element
    static char pop(){
        char x=' ';
        if(top==-1){}
        else{
            x= A[top--];
        }
        return x;
    }


    //check if stack is empty or not
    static boolean isEmpty(){
        boolean x=false;

        if(top==-1){
            x=true;
        }
        return x;
    }

}
