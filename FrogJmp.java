// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        
        if(X<1|| X>1000000000) return -1;
        if(Y<1|| Y>1000000000) return -1;
        if(D<1|| D>1000000000) return -1;
        
        if(X>Y) return -1;
        
        int cnt = 0;
        
        if((Y-X)%D ==0){
            cnt = (Y-X)/D;
        }
        else{
           cnt = (Y-X)/D + 1;
        }
      
        
        return cnt;        
    }
}
