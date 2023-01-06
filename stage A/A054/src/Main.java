/**
 * 크레인 인형뽑기 게임
 * https://school.programmers.co.kr/learn/courses/30/lessons/64061
 *
 * 인형이 없는 곳에서 크레인을 작동시키면 아무 일도 일어나지 않는다.
 *
 * board : 인형이 담긴 N*N 공간
 * moves : 크레인 작동 위치
 * 반환값 : 터트려서 없앤 인형 개 (짝수) -> 같은 종류 인형 2개가 바구니에 쌓이면 두 개가 터트려짐
 * **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(s.solution(board, moves));
    }
}