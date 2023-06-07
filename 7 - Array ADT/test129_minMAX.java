// finding min & max value
class test129_minMAX{
  public static void main(String []args){
    int[] a={5,8,3,9,6,2,-1,100,-76};
    min_max(a);
  }
  
  //O(n)
  static void min_max(int []a){
    int min=a[0], max=a[0];
    
    for(int i=1;i<a.length;i++){
      if(a[i]<min){
        min=a[i];
      }else if(a[i]>max){
        max=a[i];
      }
    }
    System.out.println("min= "+min+" max= "+max);
  }
  
}