/**
 * 실패율
 * https://school.programmers.co.kr/learn/courses/30/lessons/42889
 *
 * 게임 스테이지 N
 * 실패율 : N번재 스테이지에 도달했지만 통과하지 못한 사람 수 / N번째 스테이지에 도달한 사람 수
 * **/
public class Main {
    public static void main(String[] args) {

        Solution s = new Solution();
        int N = 4;
        int[] stages ={4,4,4,4,4};
        int[] result = s.solution(N, stages);
        for(int i=0; i<result.length; i++) System.out.print(result[i] + " ");
    }
}