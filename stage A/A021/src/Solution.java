import java.util.Scanner;

/**
 * 플러그
 * https://www.acmicpc.net/problem/2010
 *
 * 각 멀티탭 당 다음 멀티탭을 꽂는 데에 필요한 1개의 플러그는 컴퓨터를 꽂는 데에 사용하지 못한다.
 * 플러그를 최대한 병렬로 꽂으면 안된다.
 * 마지막에 연결되는 멀티탭은 모든 플러그를 다 사용할 수 있다.
 * **/
public class Solution {
    public void solution() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();// 멀티탭 개수
        int result=0;   // 컴퓨터를 꽂는데 사용할 수 있는 플러그 최대 개수
        for(int i=0; i<n; i++){
            result += s.nextInt();
        }
        result -= n-1;
        System.out.print(result);
    }
}
