//prints all the permutations of a string 
// ex : abc  : abc,acb,bac,bca,cab,cba  :total n! strings =3! =6 strings
//method 2 easy/prefarable
class test141_permutation{
  //for method 1
  static int[] a;
  static char[] res;
  
  public static void main(String[] args){
    
    String ST= "abc";
    char[] s=ST.toCharArray();
    
//    for method 1
//    a=new int[s.length];
//    res=new char[s.length];
//    int k=0;
//    perm1(s,k);
    
    //for method 2
    int l=0; // 1st indx
    int h=s.length-1; //last indx
    perm2(s,l,h);
    
  }
  
  //method 1
  static void perm1(char[] s,int k){
    int i;
    
    if(k==res.length){
      String result = new String(res);//making res(char array) to a String
      System.out.println(result);// result=string : abc, acb,bac etc
    }
    else{
      for(i=0;i<a.length;i++){
        if(a[i]==0){
          res[k]=s[i];
          a[i]=1;
          perm1(s,k+1);
          a[i]=0;
        }
      }
      
    }
    
  }
  
  
  static void perm2(char[] s, int l, int h){
    
    if(l==h){
      String ST =new String(s); // convert from char[] s to String ST for printing
      System.out.println(ST);
    }
    else{
      for(int i=l;i<=h;i++){
        swap(s,l,i);
        perm2(s,l+1,h);
        swap(s,l,i); // swapping back to prev. positions
      }
    }
    
  }
  
  static void swap(char[] s, int l, int i){
    char tmp=s[l];
    s[l]=s[i];
    s[i]=tmp;
  }
  
}