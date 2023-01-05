/**
 * JadenCase 문자열 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12951
 *
 * JadenCase 문자열
 *  1. 모든 단어의 첫글자가 대문자
 *  2. 그외 알파멧은 소문자
 *  3. 첫 문자가 알파멧이 아닐 경우에는 이어지는 문자는 모두 소문자로
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("for the last week"));
    }
}