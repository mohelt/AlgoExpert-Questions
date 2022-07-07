import java.util.*;

class Program {
  public static int minNumberOfCoinsForChange(int n, int[] denoms) {
    int coinCount = 0;
    int start=0;
    Arrays.sort(denoms);
    for(int i =0;i<denoms.length-1;i++){
      if(denoms[i]<n && denoms[i+1]>n){
        start =i;
      }
      if(denoms[denoms.length-1]<=n){
        start=denoms.length-1;
      } 
      }
    while(n>=denoms[start]){
      n-= denoms[start];
      coinCount++;
      while(n<denoms[start] && n>0 && start>=0){
        start-=1;
      }
    }
    if(n==0){
        return coinCount;
    }
    return -1;
  }
}
