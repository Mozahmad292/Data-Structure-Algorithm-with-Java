//taylor series : compute the value of e^x upto n terms.(the more terms you compute, the more accurate answer comes
//compute taylor series using loop:iterative method
//my implementation
class test71{
  public static void main(String[] args){
    System.out.println(e(1,10)); //e is just method name; e(1,10) means compute value of e^1 by considering first 10 terms of the series
  }
  
  static double e(int x,int n){
    double sum=1; double multiply=1;
    n-=1; // as manually add 1 to the sum/series
    for(int i=1;i<=n;i++){
      multiply*=i;
      sum+=Math.pow(x,i)/multiply;
    }
    return sum;
  }
}