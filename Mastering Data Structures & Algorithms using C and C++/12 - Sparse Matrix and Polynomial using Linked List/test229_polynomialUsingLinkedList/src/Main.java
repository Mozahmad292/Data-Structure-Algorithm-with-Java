// evaluate() & add() not working !
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static Scanner sc;

    public static void main(String[]args) {

        sc=new Scanner(System.in);

        //1st list
        LinkedList<NODE> list1= createPoly();
        printList(list1);
        //evaluation : incomplete
//        System.out.println("Enter value of x");  double x= sc.nextDouble();
//        double value= evaluate(list1,x);
//        System.out.println("value of the polynomial over x : "+x+" = "+value);

        //2nd list
        LinkedList<NODE> list2= createPoly();
        printList(list2);

        //add 2 lists
        LinkedList<NODE> added = add(list1,list2);
        System.out.println("after adding the lists : ");
        printList(added);
    }

    static LinkedList<NODE> createPoly() {

        LinkedList<NODE> list = new LinkedList<>();
        System.out.println("lets creat a polynomial : ");
        System.out.println("how many terms are there?");
        int m = sc.nextInt();

        System.out.println("Enter coff and exp of the terms ");
        for (int i = 1; i <= m; i++) {

            list.addLast(new NODE(sc.nextDouble(), sc.nextDouble()));
            System.out.println();
        }
        return list;
    }


    //not working properly
    //calculate value of the polynomial equation
    static double evaluate(LinkedList<NODE> list, double x){

        NODE current=list.getFirst();
        double sum=0.0;

        while (current!=null) {
            sum = sum + ( current.getCoff() * Math.pow(x,current.getExp()) );
            current=current.getNext();
        }
        return sum;
    }

    static void printList(LinkedList<NODE> list) {
        //printing the list
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " --> ");
        }
        System.out.print("null"); //just ornament
        System.out.println();
    }

    //not working !!
    //add 2 polynomials
    static LinkedList<NODE> add(LinkedList<NODE> list1, LinkedList<NODE> list2){

        LinkedList<NODE> added=new LinkedList<>();

        NODE current1= list1.getFirst(); NODE current2 =list2.getFirst();

        while(current1!=null && current2!=null){

            if(current1.getExp()==current2.getExp()){
                added.add(new NODE(current1.getCoff()+ current2.getCoff() , current1.getExp()));
                current1=current1.getNext(); current2= current2.getNext();
            } else if (current1.getExp() > current2.getExp()) {
                added.add( new NODE(current1.getCoff(), current1.getExp()) );
                current1=current1.getNext();
            }else{
                added.add( new NODE(current2.getCoff(), current2.getExp()) );
                current2=current2.getNext();
            }
        }

        //list1 doesn't finish but list2 does
        while (current1!=null){
            added.add( new NODE(current1.getCoff(), current1.getExp()) );
            current1=current1.getNext();
        }

        //list2 doesn't finish but list2 does
        while (current2!=null){
            added.add( new NODE(current2.getCoff(), current2.getExp()) );
            current2=current2.getNext();
        }

        return added;
    }

}