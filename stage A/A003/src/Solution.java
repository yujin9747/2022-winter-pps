import java.util.*;
public class Solution {
    public int[] carryOut(int[] digits, int i){
        if(digits[i] == 10){                    // carry out 발생!
            digits[i] = 0;
            if(i == 0) return digits;           // base : most significant digit 인 경우
            digits[i-1]++;
            digits = carryOut(digits, i-1);  // recursive call : digit[i-1]+1로 인한 carry out 이 발생했는지 확인
        }
        return digits;
    }
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        digits[length-1]++; // 1의 자리 숫자 + 1
        digits = carryOut(digits, length-1);    // carry out 이 발생하는지 recursive function을 통해 확인
        if(digits[0] == 0) {                       // most significant digit 에서도 carry out 이 발생했는지 최종 확인
            int[] newDigits = new int[length+1];
            newDigits[0] = 1;
            for(int i=1; i<length; i++) newDigits[i] = digits[i-1];
            return newDigits;
        }
        return digits;
    }
}
