//missing_ele() : prints missing elements (sequencial elements) : works for both sorted and unsorted set 
// in :{3,5,6,9,2}  out : 4 7 8
//in : {1,2,3,6}   out : 4,5

class test123_missing_ele2{
  public static void main(String[]args){
    int[] a={1,2,3,6};
    //int[] a={3,7,4,9,12,6,1,11,2,10};
    int starting=1, ending=6;  // starting and ending element
    
    missing_ele_un(a,starting,ending);
  }
  
  //O(n+n)=2n= O(n)
  static void missing_ele_un(int []a,int s, int e){
    int[] b=new int[e+1]; // last index=9
    
    for(int i=0;i<a.length;i++){
      b[a[i]]= -1; // these elements are there=not missing elements
    }
    
    for(int i=s;i<b.length;i++){
      if(b[i]==0){
        System.out.print(i+" ");
      }
    }
  }
  
}