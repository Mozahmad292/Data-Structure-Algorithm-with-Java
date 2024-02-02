import java.util.Scanner;

public class main_test_159_160{
  
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter dimentions of matrix : row,column");
    int m=sc.nextInt();
    int n=sc.nextInt();
    System.out.println();
    
    test_159_160 obj= new test_159_160(m,n);
    test_159_160 obj1= new test_159_160(m,n);
      
    int count=0;
    while(count==0){
    for(int i=1;i<=m;i++){
      
      for(int j=1;j<=n;j++){
        obj.set(i,j,sc.nextInt());
      }
      
      System.out.println();
    }
    }
    
    obj.set_total_elements();
    obj.tmp();
    
  }
  
}
