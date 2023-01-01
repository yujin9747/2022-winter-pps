/**
 * 검증수
 * https://www.acmicpc.net/problem/2475
 *
 * 검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.
 * **/
public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();
        int result = s.solution();
        System.out.println(result);
    }
}