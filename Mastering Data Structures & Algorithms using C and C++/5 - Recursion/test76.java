//76 - Tower of Hanoi Problem
class test76{

  public static void main(String[]args){
  hanoi(9,1,3,2);
  }
  
  static void hanoi(int n, int a,int b,int c){
    if(n>0){
    hanoi(n-1,a,c,b);
    System.out.println("from "+a+" to "+c);
    hanoi(n-1,b,a,c);
    }
  }
  
}