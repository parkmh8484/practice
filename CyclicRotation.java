// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if(K<0 || K>100) return A;
        if(A.length <= 1) return A;
        if(K >= A.length) K = K % A.length;
        int[] rotateArr = new int[A.length];
        for(int i =0; i< A.length; i++){
            if(A[i] <-1000 || A[i] >1000) return A;
            if(i + K > A.length-1){
                rotateArr[(i+K)-A.length] = A[i];
            }else{
                rotateArr[i+K] = A[i];
            }
        }
        
        return rotateArr;
    }
}
