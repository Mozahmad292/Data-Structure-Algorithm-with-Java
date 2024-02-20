//lower triangular : square matrix : n by n
//1st method : using row-major indexing
//in mathematics indes starts from 1 onwards  : this got handled/coped up : see vdo
class test151_upper_tri_row{
  
  private int n; // matrix dimentions n*n//private emni
  private int[] A;  //1d array to store the upper triangular non 0 values
  
  test151_upper_tri_row(int tmp){ //constructor 
    this.n=tmp;  //this ="to the current object"
    A=new int[(n*(n+1))/2]; //
  }
  
  //inserting
  void set(int i, int j, int x){
    if(j>=i){
      
      int index=0; int nn=n; 
      for(int z=1;z<i;z++){  //mapping/getting index for 1d []A
        index+=nn;
        nn--;
      }
      
      index+=(j-i); //mapping/getting index for 1d []A
      A[index]=x;
    }
  }
  
  
  //get value
  int get(int i, int j){
    if(j>=i){
      
      int index=0; int nn=n;
      for(int z=1;z<i;z++){  //mapping/getting index for 1d []A
        index+=nn;
        nn--;
      }
      
      index+=(j-i); //mapping/getting index for 1d []A
      return A[index];
    }
    else{
      return 0;
    }
  }
  
  
  //print current status of matrix(using 1d array  
  void display(){
    for(int i=1;i<=n;i++){
      
      for(int j=1;j<=n;j++){
        
        if(j>=i){
          
          int index=0; int nn=n;
          for(int z=1;z<i;z++){  //mapping/getting index for 1d []A
            index+=nn;
            nn--;
          }
          
          index+=(j-i); //mapping/getting index for 1d []A
          System.out.print(A[index]+" ");
        }
        else{
          System.out.print("0 "); //manual printing 0 elements
        }
        
      }
      System.out.println();
      
    }
  }
  
  //just to see []A state
//  void tmp(){
//    for(int i=0;i<A.length;i++){
//      System.out.print(A[i]+" ");
//    }
//  }
  
}