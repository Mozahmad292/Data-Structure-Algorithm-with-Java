//my implementation
public class Insertion_Sort {
  public static void main(String[] args) {
    int []a= {20,35,-15,7,55,1,-22,123}; //{2,89,0,-122,10,-10};
    insertion_sort(a);
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
  
  static int[] insertion_sort(int[] a){
    int sorted=0;
    
    for(int i=1;i<a.length;i++){
      int itemp=a[i];
      int jtemp=i;
      int tmp=i;
      
      for(int j=sorted;j>=0;j--){
        if(itemp<a[j]){
          a[tmp]=a[j];
          jtemp=j;
          tmp--;
        }
      }
      
      a[jtemp]=itemp;
      sorted++;
    }
    return a;
  }

}