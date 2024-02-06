//asc.
//my implementation
public class Selection_Sort{
  public static void main(String[] args){
    int [] a={20,35,-15,7,55,1,-22}; //{2,89,0,-122,10,-10};
    selection_Sort(a);
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
  
  static int[] selection_Sort(int[] a){
    int last_unsorted_index=a.length-1;
    int largest_index;
    int temp=-1;
    
    for(int i=0;i<a.length;i++){
      largest_index=0;
      for(int j=1;j<=last_unsorted_index;j++){
        if(a[j]>a[largest_index]){
          largest_index=j;
        }
      }
      temp=a[last_unsorted_index];
      a[last_unsorted_index]=a[largest_index];
      a[largest_index]=temp;
      last_unsorted_index--;
    }
    return a;
  } 
}