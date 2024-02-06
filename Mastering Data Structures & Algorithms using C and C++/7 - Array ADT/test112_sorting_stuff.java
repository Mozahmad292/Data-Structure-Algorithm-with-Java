// insert() : inserts an element in sorted array in sorted position
//is_array_sorted() : checking if an array is sorted or not : T.C : O(1) - O(n)
//splitting_pos_neg_no() : have neg. numbers in left side and pos. numbers in right side of array : TC : O(n)
class test112_sorting_stuff{
  public static void main(String[]args){
    int [] a={45,1,11,-29,23,900,-12,45,0,0,0,0}; // zeros means no elements ; array must be sorted in asc. order for insert() method
    int array_size=8;  // no. of elements
    
//    int insert=7;
//    insert(insert,array_size,a);
//    array_size++;
    
    //System.out.println(is_array_sorted(array_size,a));
    
    splitting_pos_neg_no(a);
    
    //just printing the array after method operation
    for(int i=0;i<array_size;i++){
      System.out.print(a[i]+" ");
    }
  }
  
  static void insert(int k, int size, int[] a){
    int i=size-1; //last index
    while(i>-1 && a[i]>k){
      a[i+1]=a[i];
      i--;
    }
    a[i+1]=k;
  }
  
  static boolean is_array_sorted(int size, int[] a){ 
    for(int i=0;i<size-1;i++){
      if(a[i]>a[i+1]){  //asc. order checking
        return false;
      }
    }
    return true;
  }
  
  static void splitting_pos_neg_no(int[] a){
    int i=0;  //1st indx
    int j=a.length-1;// last index
    
    while(i<j){
      while(a[i]<0){
        i++;
      }
      while(a[j]>=0){
        j--;
      }
      if(i<j){
        swap(i, j, a);
      }
    }
  }
  
  static void swap(int i, int j, int[] a){
  int tmp=a[i];
  a[i]=a[j];
  a[j]=tmp;
  }
  
}