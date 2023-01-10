public class Solution {
    public String removeDuplicates(String s) {
        UniqueLetter uniqueLetter = new UniqueLetter();
        String result = uniqueLetter.getUniqueLetter(s);
        return result;
    }
}
