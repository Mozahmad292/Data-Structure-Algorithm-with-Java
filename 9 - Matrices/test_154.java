//Tridiagonal Matrix
//a square matrix

class test_154{
  
  int n;
  int[] A;
  int indx;
  
  test_154(int tmp){
    this.n= tmp;  //dimension
    A=new int[(3*n)-2];
  }
  
  
  void set(int i, int j, int x){
    
    if(Math.abs(i-j)>1){} // zero elements index
    
    else if(i-j==1){
      indx=i-2;
      A[indx]=x;
    }
    else if(i-j==0){
      indx= n+i-2;
      A[indx]=x;
    }
    else if(i-j==-1){
      indx=(2*n)+i-2;
      A[indx]=x;
    }
    
    return;
  }
  
  
  int get(int i, int j){
    
    if(Math.abs(i-j)>1){  // zero elements 
    return 0;
    }
    
    else if(i-j==1){
      indx=i-2;
    }
    else if(i-j==0){
      indx= n+i-2;
    }
    else if(i-j==-1){
      indx=(2*n)+i-2;
    }
    return A[indx];
  }
  
  
  void display(){
    
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        
        if(Math.abs(i-j)>1){  // zero elements 
          System.out.print("0"+ " ");
        }
        
        else{     //non-zero elements
          
          if(i-j==1){
            indx=i-2;
          }
          else if(i-j==0){
            indx= n+i-2;
          }
          else if(i-j==-1){
            indx=(2*n)+i-2;
          }
          
          System.out.print(A[indx]+" ");
        }
      }
      
      System.out.println();
    }
  }
  
//    //print A[],, just observe
//  void tmp(){
//    for(int i=0;i<A.length;i++){
//      System.out.print(A[i]+" ");
//    }
//  }
  
  
}