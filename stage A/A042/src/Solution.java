public class Solution {
    public boolean backspaceCompare(String s, String t) {
        String S = "";
        String T = ""; 
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '#') {
                if(S.length() != 0) S = S.substring(0, S.length()-1);
            }
            else S += s.charAt(i);
        }
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i) == '#') {
                if(T.length() != 0) T = T.substring(0, T.length()-1);
            }
            else T += t.charAt(i);
        }

        if(S.compareTo(T) != 0) return false;
        return true;
    }
}
