//Toeplitz Matrix

class test_155{
  
  private int n; // matrix dimentions n*n//private emni
  private int[] A;  //1d array to store the upper triangular non 0 values
  int index;
  
  test_155(int tmp){ //constructor 
    this.n=tmp;  //this ="to the current object"
    A=new int[(2*n)-1];
  }
  
  //inserting
  void set(int i, int j, int x){
    
    if(i<=j){
      index=j-i;
      A[index]=x;
    }
    else{
      index=n+i-j-1;
      A[index]=x;
    }
    
  }
  
  
  //get value at [i][j]
  int get(int i, int j){
    
    if(i<=j){
      index=j-i;
      return A[index];
    }
    else{
      index=n+i-j-1;
      return A[index];
    }
    
  }
  
  
  //print matrix (using 1d array off course  
  void display(){
    for(int i=1;i<=n;i++){
      
      for(int j=1;j<=n;j++){
        
        if(i<=j){
          index=j-i;
          System.out.print(A[index]+" ");
        }
        else if(i>1){
          index=n+i-j-1;
          System.out.print(A[index]+" ");
        }
        else{
          System.out.print("0 ");
        }
        
      }
      
      System.out.println();
    }
  } 
  
  //just to check
  void tmp(){
    for(int i=0;i<A.length;i++){
      System.out.print(A[i]+" ");
    }
  }
}