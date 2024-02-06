//Taylor series using Horners rule/optimization
//e is just method name; e(1,20) means compute value of e^1 by considering first 20 terms of the series
//iterative, recursive
//my imple :ok
class test69{
  static double n=20;
  static double i=1.0;
  public static void main(String[] args){
    System.out.println(e(1,20));  // value of 2nd parameter(20) must be equal to the value of static variable n(20); so if change, change both 
  }
  
  //iterative way: using loop
  
//  static double e(double x,double n){
//    n--;
//    double i=n;
//    double sum=1+(x/i); 
//    i--;
//    while(i>0){
//      sum=1+(x/i)*sum;
//      i--;
//    }
//    return sum;
//  }
  
//    OR(exact same but exclude variable i; no need; extra var.!
//    static double e(double x,double n){
//    n--;
//    double sum=1+(x/n); 
//    n--;
//    while(n>0){
//      sum=1+(x/n)*sum;
//      n--;
//    }
//    return sum;
//  }
  
  
  //recursive approach
  
  static double e(double x,double nn){
    if(i==n){
      return 1.0;
    }
    return 1+((x/i)*e(x,i++));
  }
  
  
}