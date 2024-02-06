//dia is a square matrix(n by n : n*n)
//-the whole purpose of this class is to use/manipulate a diagonal matrix as a 1d array and save processing.
// -benefit : as most of the elements of a diagonal matrix is zero, why use a 2d array and waste time/space
//to process on those 0s! 
//-use 1d array to save the diagonal values only and process on those

class test145_Diagonal_matrix{
  
  private int n; // matrix dimentions n*n(dia. mat. is a square matrix)  //private emni
  private int[] A;  //1d array to represent/store the diagonal values(non-zero values
  
  test145_Diagonal_matrix(int tmp){ //constructor 
    this.n=tmp;  //this ="to the current object"
    A=new int[n];
  }
  
  //insert/update diagonal value [i][j]
  void set(int i, int j, int x){
    if(i==j){ //just making sure its a diagonal position of matrix
      A[i-1]=x; //in mathematics matrix indexing starts from 1 but here from 0 thats why i-1 
    }
  }
  
  
  //get value at [i][j]
  int get(int i, int j){
    if(i==j){ //just making sure if its a diagonal position
      return A[i-1];
    }else{
      return 0; //all non-diagonal positions are 0
    }
  }
  
  
  //print current status of matrix using 1d array off course  
  void display(){
    for(int i=0;i<A.length;i++){
      
      for(int j=0;j<A.length;j++){
        
        if(i==j){
          System.out.print(A[i]+" ");
        }else{
          System.out.print("0 ");
        }
        
      }
      
      System.out.println();
    }
  }
  
  
}