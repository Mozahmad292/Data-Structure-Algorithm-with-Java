// two words are said to be anagram if their length is same and letter set and frequency are also same
// ex :  earth=heart   race=care   medical=decimal etc etc

class test140_anagram{
  
  public static void main(String []args){
    String s1="heart";
    String s2="earth";
    System.out.println(check_anagram(s1,s2));
  }
  
  // O(n)
  static boolean check_anagram(String s1, String s2){
    
    if( s1.length() != s2.length() ){
      return false;
    }
    
    char[] a=s1.toCharArray();
    char[] b=s2.toCharArray();
    int[] h= new int[26]; //hash table array  // ASCCII code 97-122 =26 letters
    
    int indx;
    //scan over s1
    for(int i=0;i<a.length;i++){
      indx=(int)a[i]-97;
        h[indx]++; // letter frequency
    }
    
    
    //scan over s2
    for(int i=0;i<b.length;i++){
      indx=(int)b[i]-97;
      h[indx]--; // so ultimately all letters frequency be zero in hash tables corresponding index
    }
    
    
    //scan over hash table : h
    for(int i=0;i<h.length;i++){
      if(h[i]!=0){ //
        return false;
      }
    }
    return true;
  }
}