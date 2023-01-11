public class Solution {
    String str;
    String removed;
    public boolean isPalindrome(String s) {
        this.str = s.toLowerCase();
        this.removed = "";

        removeNonAlphanumeric();

        int i=0;
        int j=removed.length()-1;
        for(; i<j; i++, j--){
            if(removed.charAt(i) != removed.charAt(j)) return false;
        }
        return true;
    }

    public void removeNonAlphanumeric(){
        char c;
        for(int i=0; i<str.length(); i++){
            c = str.charAt(i);
            if(c >= 'a' && c <= 'z' || c >= '0' && c <= '9') removed += c;
;        }
    }
}
