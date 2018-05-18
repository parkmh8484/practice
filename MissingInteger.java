// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        if(N < 1 || N > 100000) return -1;
        
        int[] arr = new int[1000001];
        
        for(int i =0; i<N;i++){
            if(A[i]>= 0){
                arr[A[i]]++;
            }
        }
        int result = 1;
        for(int i =1; i< arr.length;i++){
            if(arr[i] ==0){
                result = i;
                break;
            }
        }
        return result;       
      
    }
}
