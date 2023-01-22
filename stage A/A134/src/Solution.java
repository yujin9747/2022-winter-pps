public class Solution {
    public String reversePrefix(String word, char ch) {
        String result="";
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == ch) {
                for(int j=i; j>=0; j--) result += word.charAt(j);
                result += word.substring(i+1, word.length());
                return result;
            }
        }
        return word;
    }
}
