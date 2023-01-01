/**
 * 문자열 다루기 기본
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12918
 * **/
public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();
        String str = "1234";
        boolean result = s.solution(str);
        System.out.println(result);

    }
}