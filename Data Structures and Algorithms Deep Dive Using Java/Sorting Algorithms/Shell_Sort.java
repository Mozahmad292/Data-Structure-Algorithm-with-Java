//NOT COMPLETE, GOT LENGTHY
//my implementation
public class Shell_Sort{
  public static void main(String[] args){
    int [] a={20,35,-15,7,55,1,-22,123};// 8
    shellSort(a);
    //printing sorted array
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
  
  
  static int[] shellSort(int[] a){
    if(a.length==1){ // no sorting needed as 1 element
      return a;
    }
    //generating intervals value
    int[] intervals= new int[10];//later
    int h=1, counter=0;  //h=intervals
    intervals[counter]=h;
    counter+=1;
    boolean tf=true;
    while(tf==true){
      h=3*h+1;
      if(h<a.length){
        //System.out.println(h);
        intervals[counter]=h;
        counter++;
      }else{
        tf=false;
      }
    }
    //now counter value=3  
    //
    
    counter-=1;
    int interval=intervals[counter];
    int x=0, y=x+interval, z=y+interval;  //interval indexes
    while(interval>=1){
      while(y<a.length){
        int tmp=-1;
        if(z<a.length){// 3 elements 
          if(a[y]<a[x] && a[y]<a[z]){
            tmp=a[x];
            a[x]=a[y];
            a[y]=tmp;
            if(a[z]<a[y]){ // new y,z
              tmp=a[y];
              a[y]=a[z];
              a[z]=tmp;
            }
          }else if(a[z]<a[x] && a[z]<a[y]){
            tmp=a[x];
            a[x]=a[z];
            a[z]=tmp;
            if(a[z]<a[y]){ // new y,z
              tmp=a[y];
              a[y]=a[z];
              a[z]=tmp;
            }
          }else if(a[x]<a[y] && a[x]<a[z] && a[z]<a[y]){
            tmp=a[y];
            a[y]=a[z];
            a[z]=tmp;
          }else if(a[y]==a[z] && a[y]<a[x]){   // OR a[z]<a[x] instead a[y]<a[x]  same thing as
            tmp=a[x];
            a[x]=a[z];
            a[z]=tmp;
          }
        }
        else{  //2 elements
          if(a[y]< a[x]){
            tmp=a[x];
            a[x]=a[y];
            a[y]=tmp;
          }
        }
        x+=1; y+=1; z+=1;
      }
      counter-=1;
      if(counter>=0){
        interval=intervals[counter];
        x=0; y=x+interval; z=y+interval;
      }else{
        break;
      }
    }
    return a;
  }
}