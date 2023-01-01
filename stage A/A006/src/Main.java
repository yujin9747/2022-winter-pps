/*
* https://school.programmers.co.kr/learn/courses/30/lessons/12916
* 문자열 내 p와 y의 개수
*
* 문자열은 대문자와 소문자 영어로만 이루어져 있고, counting을 할 때 대문자, 소문자 상관 없음.
* 개수가 같은 경우 true 반환, 아니면 else 반환
* */
public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();
        String str = "pPoooyY";
        boolean result = s.solution(str);
        System.out.println(result);
    }
}