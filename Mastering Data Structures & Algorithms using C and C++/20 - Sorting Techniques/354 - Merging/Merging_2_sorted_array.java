//merging 2 sorted array in a new array(with sorting)
class Merging_2_sorted_array{
  public static void main(String[] args){
    int[]a= {2,10,18,20,23}; //    int[]a= {-233,0,2,14,90,166};
    int[]b={4,9,19,25};
    int [] cc=merging(a,b,a.length,b.length);
    //printing just
    for(int i=0;i<cc.length;i++){
      System.out.println(cc[i]);
    }
  }
  
  static int[] merging(int[] a, int[] b,int m,int n){
    int[] c=new int[m+n];// final merged array
    int i=0, j=0, k=0;   //a~m~i   b~n~j
    while(i<m && j<n){
      if(a[i]<b[j]){
        c[k++]=a[i++];
      }else{
        c[k++]=b[j++];
      }
    }
    for(;i<m;i++){
      c[k++]=a[i];
    }
    for(;j<n;j++){
      c[k++]=b[j];
    }
    return c;
  }
}