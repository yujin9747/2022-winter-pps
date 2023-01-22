class Solution {
    public char findTheDifference(String s, String t) {
        int[] countT = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] countS = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for(int i=0; i<t.length(); i++){
            countT[t.charAt(i)-'a']++;
            if(i == t.length()-1) break;
            countS[s.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(countT[i] != countS[i]) {
                return (char)('a'+i);
            }
        }
        return ' ';
    }
}
