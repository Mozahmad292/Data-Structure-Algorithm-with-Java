// here matrix is mathematics matrix so all indexing start from 1 onwards
import java.util.Scanner;

public class main_test145_to_test155{
  
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter dimention of matrix");
    int n=sc.nextInt();
    System.out.println();
    
    //test145_Diagonal_matrix obj= new test145_Diagonal_matrix(n);// sc.int=10= dimensions...dia is a square mat.
    //test147_lower_triangular obj=new test147_lower_triangular(n);
    //test148_lower_triangular obj=new test148_lower_triangular(n);
    //test151_upper_tri_row obj=new test151_upper_tri_row(n);
    //test152_upper_tri_col obj=new test152_upper_tri_col(n);
    //text_154 obj=new text_154(n);
    test_155 obj=new test_155(n);
      
    //inserting all values(forming mathematics matrix : indexing from zero but eventually from zero handled by set method later)
    for(int i=1;i<=n;i++){
      
      for(int j=1;j<=n;j++){
        obj.set(i,j,sc.nextInt());
      }
      
      System.out.println();
    }
    
    
    obj.display();
    System.out.println();
//    obj.tmp();
//    System.out.println();
    System.out.println("get :"+obj.get(3,3)); // enter index(i,j) from 1 onwards as mathmatics matrix input
    System.out.println("get :"+obj.get(5,1));
    System.out.println("get :"+obj.get(4,5));
    System.out.println("get :"+obj.get(2,4));
    System.out.println("get :"+obj.get(2,2));
  }
  
}