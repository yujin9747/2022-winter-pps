public class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result="";
        int i=0;
        if(strs[0].length() == 0) return result;
        if(strs.length == 1) return strs[0];
        while(true) {
            // 가장 짧은 문자열 기준으로 검사하고 검사 중단
            for(int j=0; j<strs.length; j++) {
                if(strs[j].length() == i) {
                    return result;
                }
            }
            // i번째 문자가 같은지 확인
            for(int j=0; j<strs.length-1; j++) {
                // 같지 않으면 i번째 문자는 더하지 않은 채로 반환
                if(strs[j].charAt(i) != strs[j+1].charAt(i)) return result;
            }
            // 같으니 i번째 문자 더해주기
            result += strs[0].charAt(i);
            i++;
        }
    }
}
