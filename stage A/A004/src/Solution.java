import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr, int divisor) {
        List temp = new ArrayList();        // 요소 갯수 변경이 자유로운 list에 임시로 작업
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0) {
                temp.add(arr[i]);           // 나누어 떨어지는 수 모두 add
            }
        }
        int answer[];
        if(temp.size() == 0) {              // result 1 : 나누어 떨어지는 수가 없는 경우
            answer = new int[1];
            answer[0] = -1;
        }
        else {                              // result 2 : 나누어 떨어지는 수가 있는 경우
            answer = new int[temp.size()];
            for(int i=0; i<temp.size(); i++){
                answer[i] = (int) temp.get(i);
            }
        }
        Arrays.sort(answer);                // 오름 차순 정렬
        return answer;
    }
}
