class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String lc = s.toLowerCase();    // 소문자로 변경
        int p = 0;
        int y = 0;
        for(int i=0; i<lc.length(); i++){
            if(Character.compare(lc.charAt(i), 'p') == 0) p++;  // Character.compare() 메소드 통해 문자('') 비교
            else if(Character.compare(lc.charAt(i), 'y') == 0) y++;
        }
        if(p != y) answer = false;
        return answer;
    }
}
