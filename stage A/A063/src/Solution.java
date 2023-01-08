public class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        int length = (a.length() > b.length()) ? a.length() : b.length();
        int carry=0;
        int i=1;

        for(; i<=length; i++){
            if(a.length()-i < 0 || b.length()-i < 0) break; // 더 짧은 binary string에 맞춰서 종료
            if(a.charAt(a.length()-i) == b.charAt(b.length()-i)){   // 두 숫자가 같은 경우
                if(a.charAt(a.length()-i) == '1') { // 두 숫자가 1인 경우
                    if(carry == 1) result = "1" + result;
                    else {
                        result = "0" + result;
                        carry = 1;
                    }
                }
                else {  // 두 숫자가 0인 경우
                    if(carry == 1) {    // carry out이 1인 경우
                        result = "1" + result;
                        carry = 0;
                    }   // carry out이 0인 경우, carry는 그대로 1.
                    else result = "0" + result;
                }

            }
            else {  // 두 숫자가 다른 경우
                if(carry == 1) result = "0" + result;
                else result = "1" + result;
            }
        }

        // a가 더 긴 경우
        if(a.length()-i >= 0){
            if(carry == 1){
                while(true){
                    if(a.charAt(a.length()-i) == '1'){  // carry 1 + a의 1 둘이 만나 carry out=1, 몫=0
                        result = "0" + result;
                        if(a.length()-i == 0) {
                            result = "1" + result;
                            break;
                        }
                        i++;
                    }
                    else{
                        // carry가 0인 경우, a의 앞부분 string은 그대로 붙이고, 몫 1 붙이기
                        result = a.substring(0, a.length()-i) + "1" + result;
                        break;
                    }
                }
            }
            else{   // carry가 0인 경우, 남은 binary string 그대로 붙이기
                result = a.substring(0, a.length()-i+1) + result;
            }
        } // b가 더 긴 경우
        else if(b.length()-i >= 0){
            if(carry == 1){
                while(true){
                    if(b.charAt(b.length()-i) == '1'){
                        result = "0" + result;
                        if(b.length()-i == 0) {
                            result = "1" + result;
                            break;
                        }
                        i++;
                    }
                    else{
                        result = b.substring(0, b.length()-i) + "1" + result;
                        break;
                    }
                }
            }
            else{
                result = b.substring(0, b.length()-i+1) + result;
            }
        } // 길이가 같은 경우
        else if(carry == 1) result = "1" + result;

        return result;
    }
}
