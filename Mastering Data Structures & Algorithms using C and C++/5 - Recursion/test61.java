//61 - Sum of Natural Number using Recursion
class test61{
  public static void main(String[] args){
    System.out.println(SUM(9)); 
  }
  
  static int SUM(int n){
    if(n>0){
      return SUM(n-1)+n;
    }
    return 0;
  }
}