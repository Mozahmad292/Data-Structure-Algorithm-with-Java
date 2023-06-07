import java.util.ArrayList;
import java.util.Arrays;

public class operations {

    ArrayList<ArrayList<Integer>> sum= new ArrayList<>();
    ArrayList<ArrayList<Integer>> a;
    ArrayList<ArrayList<Integer>> b;

    operations(){}

    //getting added poly representation in list sum (the list representation)
    ArrayList<ArrayList<Integer>> adding_2_poly( ArrayList<ArrayList<Integer>> a, ArrayList<ArrayList<Integer>> b ){
        this.a=a;  this.b=b;

        int i=0;  int j=0;
        while(i<a.size() && j<b.size()){

            if(a.get(i).get(1)> b.get(j).get(1)){
                sum.add(a.get(i));
                i++;
            }else if(b.get(j).get(1) > a.get(i).get(1)){
                sum.add(b.get(j));
                j++;
            }else{
                sum.add(new ArrayList<>(Arrays.asList( a.get(i).get(0)+ b.get(j).get(0) , a.get(i).get(1) )));
                i++; j++;
            }

        } //while ends

        while(i<a.size()){
            sum.add(a.get(i));
            i++;
        }
        while(j<b.size()){
            sum.add(b.get(j));
            j++;
        }

        return sum;
    }


}
