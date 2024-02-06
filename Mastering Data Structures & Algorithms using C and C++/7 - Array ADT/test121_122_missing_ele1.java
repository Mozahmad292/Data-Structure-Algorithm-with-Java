//missing_ele() : prints missing elements in a sorted sequencial set : in :{2,3,5,6,9}  out : 4 7 8
//for unsorted(a typical set) check nxt java file

class test121_122_missing_ele1{
  public static void main(String[]args){
    int[] a={2,4,7,12};
    missing_ele(a);
  }
  
  // O(n) = 4 ?? > Abdul Bari ; how!! wrong?
  //O(max-min) : sets max value - min value : O(12-2)=10(10 iteration will occur by 2 loops)  > m 
  static void missing_ele(int[] a){
    int diff=a[0]-0;  // a[i]-i
      for(int i=1;i<a.length;i++){
      if(a[i]-i != diff){
        while(diff < a[i]-i){
        System.out.print(diff+i+" ");
        diff++;
        }
      }
    }
  }
  
}