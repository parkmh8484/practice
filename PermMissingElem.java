// you can also use imports, for example:
 import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        
        if(N > 100000) return -1;
        int[] cntArr = new int[N+2];
        
        
        int result = 0;
        for(int i =0; i<N; i++){
            cntArr[A[i]]++;
        }
        
        for(int i =1; i<cntArr.length; i++){
            if(cntArr[i] == 0){
                result = i;
                break;
            }
        }
        return result;
    }
}
