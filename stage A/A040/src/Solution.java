
public class Solution {
    public int counting(String str, int vowels){
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels++;
        }
        return vowels;
    }
    public boolean halvesAreAlike(String s) {
        int length = s.length();
        String a = s.substring(0, length/2).toLowerCase();
        String b = s.substring(length/2, length).toLowerCase();

        int vowelA = 0;
        int vowelB = 0;

        vowelA = counting(a, vowelA);
        vowelB = counting(b, vowelB);
        if(vowelA != vowelB) return false;
        return true;
    }
}
