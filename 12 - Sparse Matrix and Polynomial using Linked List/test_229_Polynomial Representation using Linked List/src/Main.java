//my imple. fine

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //creating 1 polynomial list representation & getting its value
        create_polynomial_representation obj=new create_polynomial_representation();
        create_a_polynomial(sc,obj);
        System.out.println("the poly is : "+ obj.a);
        System.out.println("enter value of x");//get value of the polynomial created in obj (calculation of sum)
        obj.get_polynimial_value(sc.nextInt());// value of x > the variable of the polynomial
        System.out.println("Value of the polynomial = "+ obj.sum);// just print poly value(sum

        //creating another polynomial list representation & getting its value
        create_polynomial_representation obj1=new create_polynomial_representation();
        create_a_polynomial(sc,obj1);
        System.out.println("the poly is : "+ obj1.a);
        System.out.println("enter value of x");//get value of the polynomial created in obj (calculation of sum)
        obj1.get_polynimial_value(sc.nextInt());// value of x > the variable of the polynomial
        System.out.println("Value of the polynomial = "+ obj1.sum);// just print poly value(sum


        //now operations
        operations objope= new operations();
        ArrayList<ArrayList<Integer>> sum = objope.adding_2_poly(obj.a, obj1.a); //sum = added list
        System.out.println();
        System.out.println("finally added polynomial = "+objope.sum);
    }

    static void  create_a_polynomial(Scanner sc, create_polynomial_representation object){

        //creating polynomial(list
        System.out.println("lets creat a polynomial : ");
        System.out.println("how many terms are there?");
        int m = sc.nextInt();

        System.out.println("Enter coff and exp of the terms ");
        for(int i=0;i<m;i++){
            object.set( sc.nextInt(),sc.nextInt() );
            System.out.println();
        }
    }

}