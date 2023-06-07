//all about different set operations : union,intersection etc

// unioin of unsorted : easy : may later : O(n^2)
// union_of_sorted_sets() : make union of 2 sorted sets(nothing but merging(test114) with a bit modification)

//intersection_over_unsorted_sets() :intersection operation over two unsorted sets(normal sets)
//intersection_over_sorted_sets() : intersection operation over two sorted sets : like merging(test114)

//difference_unsorted()/difference_sorted() : set operation A-B("a bad b") : those elements present in set 
//a but not present in set b



class test116_math_set_operations{
  public static void main(String[] args){
    //every sorted or not sorted array can't have duplicate values
//    int [] a= {3,4,5,6,10,12}; //sorted
//    int [] b={2,4,5,7,12,}; //sorted
    int [] a= {-1,33,34,99,100}; //unsorted   
    int [] b={-122,22,45,67,89,99,333};//unsorted
    
    int [] c= new int[a.length+b.length];
    
    //union_of_sorted_sets(a,b,c);
    
    //intersection_over_unsorted_sets(a,b,c);
    //intersection_over_sorted_sets(a,b,c);
    
    //difference_unsorted(a,b,c);
    difference_sorted(a,b,c);
    
    //printing just // last zeros are default int. value of int array c// as unused
    for(int i=0;i<c.length;i++){
      System.out.print(c[i]+" ");
    }
  }
  
  //TC : O(m+n)
  static void union_of_sorted_sets(int []a, int[] b, int[] c){
    int m=a.length , n=b.length;
    int i=0, j=0, k=0;   //a~m~i   b~n~j
    
    while(i<m && j<n){
      if(a[i]<b[j]){
        c[k++]=a[i++];
      }else if(b[j]<a[i]){
        c[k++]=b[j++];
      }else{  //equal; same element
        c[k++]=a[i];  //or c[k++]=b[j]; same thing
        i++;j++;
      }
    }
    
    for(;i<m;i++){
      c[k++]=a[i];
    }
    for(;j<n;j++){
      c[k++]=b[j];
    }
  }
  
  //TC. = O(m*n) ~O(n^2)
  static void intersection_over_unsorted_sets(int[] a, int[] b,int[] c){
    int k=0;
    for(int i=0;i<a.length;i++){
      for(int j=0;j<b.length;j++){
        if(a[i]==b[j]){
          c[k++]=a[i]; // or c[k++]=b[j]; same thing
        }
      }
    }
  }
  
  // O(m+n)
  static void intersection_over_sorted_sets(int[] a, int[] b,int[] c){
    int m=a.length , n=b.length;
    int i=0, j=0, k=0;   //a~m~i   b~n~j
    
    while(i<m && j<n){
      if(a[i]<b[j] || b[j]<a[i]){
        i++;
        j++;
      }
      else{  //equal; common element
        c[k++]=a[i];  //or c[k++]=b[j]; same thing
        i++;j++;
      }
    }
    
    for(;i<m;i++){
      c[k++]=a[i];
    }
    for(;j<n;j++){
      c[k++]=b[j];
    }
    
  }
  
  // O(m*n) ~O(n^2)
  static void difference_unsorted(int[] a, int[] b, int[] c){
    int k=0;
    int j;
    for(int i=0;i<a.length;i++){
      for(j=0;j<b.length;j++){
        if(a[i]==b[j]){
          break;
        }
      }
      if(j==b.length){ //didn't break
        c[k++]=a[i];
      }
    } 
  }
  
  
  //O(m)
  static void difference_sorted(int[] a, int[] b, int[] c){
    int m=a.length;
    int i=0, j=0, k=0;
    
    while(i<m){
      if(a[i]<b[j]){
        c[k++]=a[i++];
      }else if(a[i]==b[j]){
        i++;
        j++;
      }else{
        j++;
      }
    }
    
  }
  
}
