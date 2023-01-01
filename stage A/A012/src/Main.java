/**
 * Count Primes
 * https://leetcode.com/problems/count-primes/
 * 주어지는 값 n보다 작은 prime number의 개수 반환
 *
 * n이 소수임을 판정하기 위해선 루트 n 까지의 수 중 1을 제외하고 그 자연수의 약수가 있는지 확인하면 된다.
 * **/
public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();
        System.out.println(s.countPrimes(10));
    }
}