import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] sorted;
        for(int i=0; i<commands.length; i++){
            sorted = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(sorted);

            answer[i] = sorted[commands[i][2]-1];
        }
        return answer;
    }
}
