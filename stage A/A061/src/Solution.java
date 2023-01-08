public class Solution {
    public String convertToTitle(int columnNumber) {
        String result="";

        while(true){
            if(columnNumber<=26) {  // most significant alphabet만 남은 경우(1~26)
                result = Character.toString((char) columnNumber + 64) + result;
                break;
            }
            else {
                if(columnNumber%26 == 0) {  // 현재 level column에서 마지막 column인 경우
                    result = "Z" + result;
                    columnNumber--;
                }
                else result = Character.toString((char)(columnNumber%26) + 64) + result;
            }
            columnNumber /= 26;
            if(columnNumber <= 0) break;
        }
        return result;
    }
}
