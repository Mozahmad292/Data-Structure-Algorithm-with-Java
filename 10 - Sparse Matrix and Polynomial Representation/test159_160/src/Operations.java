//addition operation is implemented

import java.util.ArrayList;
import java.util.Arrays;
public class Operations {

    ArrayList<ArrayList<Integer>> sum = new ArrayList<>();
    ArrayList<ArrayList<Integer>> a;
    ArrayList<ArrayList<Integer>> b;

    Operations(int m, int n) {

        sum.add(new ArrayList<Integer>(Arrays.asList(m,n,0))); // forming first column of sum (0 just a placeholder: we yet don't-
        // know how many elements(columns) will be in sum, after addition we get to know that by :  sum.size-2
    }


    void addition(ArrayList<ArrayList<Integer>> a, ArrayList<ArrayList<Integer>> b){
        this.a=a;
        this.b=b;

        int i=1,j=1;
        while( i<a.size() && j<b.size() ){

            //row not same
            if( a.get(i).get(0)<b.get(j).get(0) ){
                sum.add(a.get(i));
                i++;
            }else if( b.get(j).get(0)<a.get(i).get(0) ){
                sum.add(b.get(j));
                j++;
            }


            else if( a.get(i).get(0)==b.get(j).get(0) ){ // row same

                if(a.get(i).get(1)<b.get(j).get(1)){ //column different
                    sum.add(a.get(i));
                    i++;
                }else if(b.get(j).get(1)<a.get(i).get(1)){ //column different
                    sum.add(b.get(j));
                    j++;
                }else{ //column same,so do addition
                    sum.add(new ArrayList<Integer>(Arrays.asList(a.get(i).get(0), a.get(i).get(1), a.get(i).get(2)+b.get(j).get(2) ) ) );
                    i++; j++;
                }

            }


        }//while end


        while(i<a.size()){
            sum.add(a.get(i));
            i++;
        }
        while(j<b.size()){
            sum.add(b.get(j));
            j++;
        }

    }

    void  set_total_elements(){
        sum.get(0).set(2,sum.size()-1); //at first column index 2 of sum(initially placed as 0 placeholder
    }



}
