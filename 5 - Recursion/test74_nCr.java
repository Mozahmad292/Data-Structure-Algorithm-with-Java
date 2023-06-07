public class test74_nCr{

  public static void main(String[]args){
  int n=7; int r=5;
    System.out.println(nCr_iterative(n,r));//iterative : using formula of ncr // this method doesn't work for large value of n,r but recursive method works
    System.out.println(nCr_recur(n,r));//recursive
  }
  
  //iterative approach
  static int nCr_iterative(int n,int r){
  return factorial(n)/(factorial(r)*factorial(n-r));
  }
  
    static int factorial(int n){ //returns factorial of n; from file test63
    if(n==0){
      return 1;
    }else{
      return factorial(n-1)*n;
    }
  }
  
    //recursive apparoach(based on Pascal's triangle
    static int nCr_recur(int n,int r){
      if(r==0 || n==r){
      return 1;
      }
      else{
      return nCr_recur(n-1,r-1)+nCr_recur(n-1,r);
      }
    }
    
}