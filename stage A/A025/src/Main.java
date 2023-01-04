/**
 * Power of Four
 * https://leetcode.com/problems/power-of-four/
 * 4의 x승 으로 n을 나타낼 수 있으면 true 반환
 * loop, recursion을 사용하지 않고 Math의 log함수를 이용해 밑이 4인 로그 값을 구해서 풀었음.
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        boolean result = s.isPowerOfFour(1);
        System.out.println(result);
    }
}