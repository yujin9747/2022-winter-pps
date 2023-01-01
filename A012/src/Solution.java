/**
 * 에라토스테네스의 체 방식 이용하기 -> 매우 큰 수가 들어왔을 경우 time limit을 방지하기 위해서
 * https://ko.wikipedia.org/wiki/에라토스테네스의_체
 * **/
class Solution {
    public int countPrimes(int n) {
        int count=0;
        // 2부터 n-1까지 숫자의 소수를 반별하는 true/false 공간 할당.
        // index 0, 1은 사용하지 않음.
        boolean[] primes = new boolean[n];

        // 처음엔 모두 true로 할당
        for(int i=2; i<n; i++) primes[i] = true;

        for(int i=2; i<n; i++) {
            if(primes[i]){
                count++;
                for(int j=i*2; j<n; j+=i) primes[j] = false;
            }
        }

        return count;
    }
}
