import java.util.ArrayList;
import java.util.Arrays;

public class create_polynomial_representation {

    ArrayList<ArrayList<Integer>> a=new ArrayList<>();
    int sum=0;
    create_polynomial_representation(){}

    void set(int coff, int exp){

        a.add(new ArrayList<>(Arrays.asList(coff,exp)));

    }


    int get_polynimial_value(int x){ // sum of the terms =value of the polynomial

        for(int i=0;i<a.size();i++) {

            sum += ( a.get(i).get(0) * Math.pow(x,a.get(i).get(1)) );  //coff * x^exp
        }
        return sum;
    }

}
