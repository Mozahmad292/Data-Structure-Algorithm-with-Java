//merging 2 sorted array in a new array(with sorting)
class test114_Merging_arrays{
  public static void main(String[] args){
    int [] a= {3,4,5,6,10};
    int [] b={2,4,5,7,12};
    int [] cc=merging(a,b,a.length,b.length);
    //printing just
    for(int i=0;i<cc.length;i++){
      System.out.print(cc[i]+" ");
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