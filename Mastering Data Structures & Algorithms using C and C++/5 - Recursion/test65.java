// calculating power(exponent) 2^3=8
class test65{
  public static void main(String[] args){
    System.out.println(pow(2,3)); // 2^3
  }
  
  //1.typical way
  static int pow(int x,int y){
    if(y==0){
    return 1;
    }else{
    return pow(x,y-1)*x;
    }
  }
  
//  //2.reduction of number of multiplications : faster
//  static int pow(int x,int y){
//    if(y==0){
//      return 1;
//    }else if(y%2==0){
//      return pow(x*x,y/2);
//    }else{
//      return x*pow(x*x,y/2);
//    }
//  }
  
}