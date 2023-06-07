//binary search in an array(not BST)
//my imple : ok
//time com(for both iterative & recursive) : height of a tree :
//best case= O(1) , worst case =log base 2 n(log2n) ;n=no.of elements


class test103_binary_search{
  static int [] a={12,900,34,56,89,1,90,13};
  static int mid;// for recursive
  
  public static void main(String[]args){
    //just sorting & printing sorted array
    selection_Sort(a);
    System.out.println("after sorting ");
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
    System.out.println();
    
    System.out.println(BS_iterative(12,a));
    //System.out.println(BS_recursive(11,0,a.length-1)); //a.length-1= last index
  }
  
  
  static String BS_iterative(int k, int[] a){ // k is the element searching for
    int l,mid,h;
    l=0; h=a.length-1;//last index
    mid=(l+h)/2;
    
    if(k>a[h] || k<a[l]){ //
    return "not here";
    }
    
    while(l<=h){
      if(k==a[mid]){
        return "its here in sorted array index : "+mid;
      }
      if(k>a[mid]){
        l=mid+1;
      }else{
        h=mid-1;
      }
      mid=(l+h)/2;
    }
    return "not heree";
  }
  
  
  static String BS_recursive(int k, int l, int h){
    if(l>h){
      return "not here";
    }
    
    if(k==a[mid]){
      return "its in sotrted array index "+mid;
    }
    
    if(k>a[mid]){
      l=mid+1;
    }else{
      h=mid-1;
    }
    mid=(l+h)/2;
    return BS_recursive(k,l,h);
  }
  
     
    //sorting algorithm; taken from "F:\tutorial\Data Structures and Algorithms Deep Dive Using Java\coding"
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