import java.util.Scanner;

public class Main {
    static int m, n;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //forming matrix A
        System.out.println("enter dimensions of matrix A: row,column");
        m = sc.nextInt();
        n = sc.nextInt();
        linkedList[] A = new linkedList[m];
        A=createPolyLink(A,m, n);
        display(A);


        //forming matrix B
        System.out.println("enter dimensions of matrix B: row,column");
        m = sc.nextInt();
        n = sc.nextInt();
        linkedList[] B = new linkedList[m];
        B=createPolyLink(B,m, n);
        display(B);

        //add matrix A,B
        linkedList[] added=add(A,B,m);
        System.out.println("after adding, the list : ");
        display(added);

    }


    static linkedList[] createPolyLink(linkedList[] AA,int m, int n) {

        System.out.println("enter values row-wise : ");
        for (int i = 0; i < m; i++) {
            linkedList a = new linkedList();
            AA[i]=a;

            for (int j = 0; j < n; j++) {
                int element = sc.nextInt();
                if (element != 0) {
                    a.addToEnd(element, j);
                }
            }
            a.setTail();
            System.out.println();
        }

        return  AA;
    }


    //add 2 sparse matrices
    static  linkedList[] add(linkedList[] A, linkedList[] B, int m) {

        linkedList[] added= new linkedList[m];
        for (int i = 0; i < A.length; i++) { // array iterator  , or B.length; same

            NODE current_A = A[i].getHead();  NODE current_B = B[i].getHead();
            linkedList a=new linkedList(); added[i]=a; //create a linkedlist in added[i]; now empty linkedlist;to be filled later

            while(current_A!=null && current_B!=null){

                if(current_A.getColumn()==current_B.getColumn()){
                    added[i].addToEnd(current_A.getElement()+ current_B.getElement(), current_A.getColumn() );
                    current_A=current_A.getNext();
                    current_B=current_B.getNext();
                } else if (current_A.getColumn()<current_B.getColumn()) {
                    added[i].addToEnd(current_A.getElement(),current_A.getColumn());
                    current_A=current_A.getNext();
                }else{ //current_A.getColumn() < current_B.getColumn()
                    added[i].addToEnd(current_B.getElement(), current_B.getColumn());
                    current_B=current_B.getNext();
                }

            }

            //leftover : either A/B left
            while(current_A!=null){
                added[i].addToEnd(current_A.getElement(),current_A.getColumn());
                current_A=current_A.getNext();
            }
            while(current_B!=null){
                added[i].addToEnd(current_B.getElement(), current_B.getColumn());
                current_B=current_B.getNext();
            }

            added[i].setTail(); //setting tail for every linked list for added[i]
        }

        return added;
    }


    //print the polynomial
    static void display(linkedList[] AA) {

        for (int i = 0; i < AA.length; i++) {

            int count = 0;
            NODE current = AA[i].getHead();

            while (count < n) {
                if (current != null && count == current.getColumn()) {
                    System.out.print(current.getElement() + " ");
                    current = current.getNext();
                } else {
                    System.out.print("0" + " ");
                }
                count++;
            }

            System.out.println();
        }

        System.out.println();
    }

}//class