import java.util.ArrayList;
import java.util.List;

/**
 * int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
 * int[] moves = {1,5,3,5,1,2,1,4};
 */

public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> basket = new ArrayList<>();   // 인형 담는 바구니
        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                int kakao = board[j][moves[i]-1];   // 인형 종류
                if(kakao > 0) { // 비어있지 않으면
                    board[j][moves[i]-1] = 0;   // board에서 제거 -> 크레인으로 끌어 올리기
                    if(basket.size() != 0 && kakao == basket.get(basket.size()-1)) {    // 바구니 맨 위의 인형과 같으면
                        answer += 2;    // 두 개 삭제
                        basket.remove(basket.size()-1); // 바구니 맨 위의 인형 삭제
                    }
                    else basket.add(kakao);
                    break;  // j번재 라인에 있던거 하나만 빼고 종료
                }
                // 비어있으면 아무 일도 X
            }
        }
        return answer;
    }
}
