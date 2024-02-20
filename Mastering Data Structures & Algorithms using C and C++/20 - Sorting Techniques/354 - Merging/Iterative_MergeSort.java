class Iterative_MergeSort{
  public static void main(String[] args){
    int[]aa={10,-12,0,178,-1,89,7,23,2};//{8,3,7,4,9,2,6,5,1};  //
    int array_size=aa.length;
    iterative_mergesort(aa,array_size);
    //printing after sorting done
    for(int i=0;i<aa.length;i++){
      System.out.println(aa[i]);
    }
  }
  
  static void iterative_mergesort(int[] a,int n){
    int p,i,l,mid,h;
    for(p=2;p<=n;p=p*2){   //
      for(i=0;i+p-1<n;i=i+p){    //* i+p-1==h   * i=i+p > as 2-way merge sort : merging 2 lists(virtual) at a time
        l=i;
        h=i+p-1;
        mid=(l+h)/2;
        merging(a,l,mid,h);
      }
    }
    //only if the number of elements in array is odd, the if statement will be executed
    if(p/2<n){
    merging(a,0,(p/2)-1,n-1);// n-1~h
    }
  }
  
  
  static void merging(int[] a,int l, int mid, int h){ // method taken from "merging_method_for_mergeSort" class
    int i=l, j=mid+1, k=l;//
    int[] b=new int[a.length];//
    while(i<=mid && j<=h){
      if(a[i]<a[j]){
        b[k++]=a[i++];
      }else{
        b[k++]=a[j++];
      }
    }
    
    for(;i<=mid;i++){
      b[k++]=a[i];
    }
    for(;j<=h;j++){
      b[k++]=a[j];
    }
    //done
    //just copying back to []a and return []a
    for(int x=l;x<=h;x++){// like : for(x=0; x<b.length;x++)
      a[x]=b[x];
    }
  }
  
}