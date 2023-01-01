import java.util.Arrays;

/**
 * 생각 정리
 *
 * 제일 무거운 사람과 제일 가벼운 사람중에 조합을 찾아야 하지 않을까?
 * 그렇지 않으면 무거운 사람만을 위해 하나의 보트를 사용해야 하니까.
 * 만약 제일 무거운 사람과 제일 가벼운 사람이 같이 탈 수 없다면 그 사람은 혼자 타고, 그 다음으로 무거운 사람과 같이 타도록.
 *
 * **/
public class Solution {

    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);

        // 무거운 사람 index -> 배열을 끝 부터 시작
        int f=people.length-1;
        // 가벼운 사람 index -> 배열을 처음부터 시작
        int l=0;

        for(; l != f && l < f;) {
            if(people[l] + people[f] <= limit){
                // 무거운 사람, 가벼운 사람 한 명씩 보트 하나 사용
                answer++;
                l++;
                f--;
            }
            else{
                // 무거운 사람 1명을 위한 보트 사용
                answer++;
                f--;
            }
        }

        if(l == f) answer++;

        return answer;
    }
}
