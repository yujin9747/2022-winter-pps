/**
 * unique morse code words
 * https://leetcode.com/problems/unique-morse-code-words/
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] words = {"gin","zen","gig","msg"};
        System.out.println(s.uniqueMorseRepresentations(words));
    }
}