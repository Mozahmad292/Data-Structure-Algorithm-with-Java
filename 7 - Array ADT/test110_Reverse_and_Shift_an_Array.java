// time com. for all the methods(4) = O(n) ; n= no. of elements

class test110_Reverse_and_Shift_an_Array{
  
  public static void main(String[]args){
    int [] a={1,2,3,4,5,6};
    //reverse_aux(a);
    //reverse(a);
    //left_rotate(a);
    right_rotate(a);
    
    //just printing the array after method operation
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
  }
  
  //using an auxialiary array
  static void reverse_aux(int []a){
    int[] b=new int[a.length]; //auxialiary array
    
    //copying to b from a in reverse order
    for(int i=0, j=a.length-1; i<a.length; i++, j--){
      b[i]=a[j];
    }
    
    //copying back to a from b
    for(int i=0; i<a.length; i++){
      a[i]=b[i];
    }
    
  }
  
  //swaping within the array
  static void reverse(int [] a){
    int i=0; 
    int j=a.length-1;   // a.length-1=last index
    int tmp;
    
    while(i<j){
      tmp=a[i];
      a[i]=a[j];
      a[j]=tmp;
      i++; j--;
    }
    
  }
  
  //left rotate
  static void left_rotate(int [] a){
    int tmp=a[0];
    int i=0;
    while(i<a.length-1){
      a[i]=a[i+1];
      i++;
    }
    a[i]=tmp;
  }
  
  //right rotate
  static void right_rotate(int [] a){
    int tmp=a[a.length-1];
    int i=a.length-1;
    while(i>0){
      a[i]=a[i-1];
      i--;
    }
    a[i]=tmp;
  }
  
}