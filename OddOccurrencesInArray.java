// you can also use imports, for example:
import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
       
        int N = A.length; //A의 길이
        
        if(N<1 || N > 1000000) return -1;
        if(N %2 ==0) return -1;
        
        Arrays.sort(A);
       
        int result =0;
        int cnt =0;
        int tmp = 0;
        for(int i =0; i< N; i++){
            if(tmp != A[i]) {
                if(cnt%2==1) {
                    break;
                }
                tmp = A[i];
                cnt=1;
            }else{
                cnt++;
            }
            result = A[i];
            
        }
        return result;
    }
}
