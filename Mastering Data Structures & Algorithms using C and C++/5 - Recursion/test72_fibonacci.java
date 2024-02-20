// fibonacci
class test72_fibonacci{
  
  public static void main(String[]args){ 
    int n=7;// for all approach using this n
    
    System.out.println("iterative implementation : ");
    fib_iterative(n);//returns from oth to nth term
    
    System.out.println();
    System.out.println("recursive implementation : "); 
    for(int i=0;i<=n;i++){ //this method only returns nth fibonacci term, not from 0 to nth term like iterative; thats why using a loop to call the method n times to get upto n fibonacci term
      System.out.print(recursive(i)+ " ");//recursive implementation
    }
    
    System.out.println();
    System.out.println("recursive implementation with memoization(optimization) : ");
    F=new int[n+1];// just initializing the array with value -1
    for(int i=0;i<F.length;i++){
      F[i]=-1;
    }
    for(int i=0;i<=n;i++){ //this method only returns nth fibonacci term, not from 0 to nth term like iterative; thats why using a loop to call the method n times to get upto n fibonacci term
      System.out.print(recursive_memoi(i)+ " ");
    }
    
  }
  
  //iterative way
  //my imple.
  //method returns from oth to nth fibonacci term
  static void fib_iterative(int n){
    int [] a=new int[n+1];
    a[0]=0; a[1]=1; //known 1st 2 terms
    for(int i=2;i<=n;i++){
      a[i]=a[i-2]+a[i-1];
    }
    //just print
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+" ");
    }
  }
  
  //recursive way : Abdul Bari imple.
  // this method only returns nth(one) fibonacci term, not from 0 to nth term like iterative; my from main call all upto nth
  static int i;
  static int recursive(int n){
    if(n<=1){
      return n;
    }
    return recursive(n-2)+recursive(n-1);
  }
  
  //recursive with memoization(optimization
  static int[] F;// for saving the values: fibonacci values
  static int recursive_memoi(int n){
    if(n<=1){
      F[n]=n;
      return F[n];
    }
    else{
      if(F[n-2]==-1){
        F[n-2]=recursive_memoi(n-2);
      }
      if(F[n-1]==-1){
        F[n-1]=recursive_memoi(n-1);
      }
      return F[n-2]+F[n-1];
    }
  }
  
}