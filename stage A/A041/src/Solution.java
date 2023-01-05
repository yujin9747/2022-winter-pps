public class Solution {
    public String solution(String s) {
        String answer = "";
        boolean prevBlank=true;    // 이전 문자가 공백이었는지. 첫문자는 대문자여야 하니 true로 시작
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ') {
                prevBlank=true;
                answer += ' ';
                continue;
            }
            if(prevBlank){
                prevBlank = false;
                char c = s.charAt(i);
                if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
                    String temp = c + "";
                    answer += temp.toUpperCase();
                }
                else answer += c;
            }
            else{
                char c = s.charAt(i);
                if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
                    String temp = c + "";
                    answer += temp.toLowerCase();
                }
                else answer += c;
            }
        }
        return answer;
    }
}
