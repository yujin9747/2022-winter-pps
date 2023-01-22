public class Solution {
    public boolean rotateString(String s, String goal) {
        String rotated = "";
        if(s.length() != goal.length()) return false;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == goal.charAt(0)){  // goal의 시작과 같은 곳을 만남

                rotated = s.substring(i, s.length());
                rotated += s.substring(0, i);
                int flag=0;
                for(int j=0; j<goal.length(); j++){
                    if(rotated.charAt(j) != goal.charAt(j)) {
                        flag=1;
                        break;
                    }
                }
                if(flag==0)return true;
            }
        }
        return false;
    }
}
