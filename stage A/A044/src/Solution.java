// 3일 연속 늦으면 false
// 결석 2회 이상이면 false
public class Solution {
    public boolean checkRecord(String s) {
        int absent=0;
        int consecutiveLate=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'L') {
                if(++consecutiveLate >= 3) return false;
            }
            else{
                consecutiveLate=0;
                if(s.charAt(i) == 'A'){
                    if(++absent >= 2) return false;
                }
            }
        }
        return true;
    }
}
