// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
       // write your code in Java SE 8
        int maxCnt = 0;
        int cnt =0;
        String binary = "";
        while(N > 0){
            binary = N%2 + binary;
            N = N/2;
        }
        
        for(int i =0; i<binary.length(); i++){
            if(binary.charAt(i)=='1') {
            	if(maxCnt < cnt) maxCnt = cnt;
            	cnt = 0;
            }
            else {
            	cnt++;
            }
        }
        
        return maxCnt;
    }
}
