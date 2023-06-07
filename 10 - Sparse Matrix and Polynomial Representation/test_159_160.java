import java.util.ArrayList;
import java.util.Arrays;

class test_159_160{
  int count_element=0;
  ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
  
  test_159_160(int m, int n){ // ocnstructor
  a.add(new ArrayList<Integer>(Arrays.asList(m,n)));
  }
  
  void set(int i, int j, int x){
    if(x!=0){
    a.add(new ArrayList<Integer>(Arrays.asList(i,j,x)));
    count_element++;
    }
  }
  
  void set_total_elements(){
  a.get(0).add(count_element);
  }
  
  //just print the array list
  void tmp(){
  System.out.println(a);
  }
  
}