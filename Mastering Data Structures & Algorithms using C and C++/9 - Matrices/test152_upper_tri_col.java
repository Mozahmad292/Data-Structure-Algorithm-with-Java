//lower triangular : square matrix : n by n
//2nd method : using column-major indexing
//in mathematics indes starts from 1 onwards  : this got handled/coped up : vdo
class test152_upper_tri_col{
  
  private int n; // matrix dimentions n*n//private emni
  private int[] A;  //1d array to store the upper triangular non 0 values
  
  test152_upper_tri_col(int tmp){ //constructor 
    this.n=tmp;  //this ="to the current object"
    A=new int[(n*(n+1))/2];
  }
  
  //inserting
  void set(int i, int j, int x){
    if(i<=j){
      int index=((j*(j-1))/2)+(i-1);
      A[index]=x;
    }
  }
  
  
  //get value at [i][j]
  int get(int i, int j){
    if(i<=j){
      int index=((j*(j-1))/2)+(i-1);
      return A[index];
    }else{
      return 0; //others are 0s
    }
  }
  
  
  //print matrix (using 1d array off course  
  void display(){
    for(int i=1;i<=n;i++){
      
      for(int j=1;j<=n;j++){
        
        if(i<=j){
          int index=((j*(j-1))/2)+(i-1);
          System.out.print(A[index]+" ");
        }else{
          System.out.print("0 ");
        }
        
      }
      
      System.out.println();
    }
  } 
  
  //just to check
//  void tmp(){
//    for(int i=0;i<A.length;i++){
//      System.out.print(A[i]+" ");
//    }
//  }
  
}