//my implementation
//compute taylor series using recursion
//taylor series : compute the value of e^x upto n terms.(the more terms you compute, the more accurate answer comes)
import java.util.Scanner;
class test67{
  static int i=0; 
  static double multiply;
  static int nn;
  
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter value of x(the power):");
    int x=sc.nextInt();
    System.out.println("enter value of n(n terms): ");
    int tmp=sc.nextInt(); 
    int n=nn=tmp; // value of n will change, so preserve it in nn
    System.out.println("ans : "+e(x,n));//e is just method name,e(1,20) means compute value of e^1 by considering first 20 terms of the series
  }
  
  static double e(int x, int n){ // value of n will change, but its preserved in nn
    if(i<nn){
      if(i==0){
        multiply=1;
      }else{
        multiply*=i;
      }
      return (Math.pow(x,i)/multiply) +e(x,i++);
    }
    return 0.0;
  } 
  
}