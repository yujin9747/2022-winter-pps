/**
 * Determine if String halves are alike
 * https://leetcode.com/problems/determine-if-string-halves-are-alike/
 *
 * 문자열 길이 : even
 * 문자얼 반으로 나누기
 * a, e, i, o, u, A, E, I, O, U 의 개수가 두 문자열에 같에 들어있으면 alike
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.halvesAreAlike("textbook"));
    }
}